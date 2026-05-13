package com.compiladores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import com.compiladores.antlr.MiGramaticaLexer;
import com.compiladores.antlr.MiGramaticaParser;
import com.formdev.flatlaf.FlatDarculaLaf;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

public class GUICompilador extends JFrame {

    // ================= COLORES =================

    private final Color fondoPrincipal =
            new Color(24, 24, 36);

    private final Color fondoEditor =
            new Color(30, 30, 46);

    private final Color morado =
            new Color(140, 82, 255);

    private final Color texto =
            new Color(240, 240, 255);

    private final Color cyan =
            new Color(0, 220, 255);

    // ================= EDITOR =================

    private RSyntaxTextArea editorCodigo;

    // ================= TABLAS =================

    private JTable tablaTokens;

    private JTable tablaErrores;

    private JTable tablaSimbolos;

    private DefaultTableModel modeloTokens;

    private DefaultTableModel modeloErrores;

    private DefaultTableModel modeloSimbolos;

    // ================= ÁRBOL =================

    private JPanel panelArbol;

    public GUICompilador() {

        configurarVentana();

        inicializarComponentes();
    }

    private void configurarVentana() {

        setTitle("✨ Compilador Fantasía ✨");

        setSize(1500, 900);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(fondoPrincipal);

        setLayout(new BorderLayout());
    }

    private void inicializarComponentes() {

        // ================= TOOLBAR =================

        JToolBar toolbar = new JToolBar();

        toolbar.setFloatable(false);

        toolbar.setBackground(new Color(35, 35, 52));

        toolbar.setBorder(
                BorderFactory.createEmptyBorder(
                        10,
                        10,
                        10,
                        10
                )
        );

        JButton btnAbrir =
                crearBoton("📂 Abrir");

        JButton btnAnalizar =
                crearBoton("✨ Analizar");

        JButton btnLimpiar =
                crearBoton("🧹 Limpiar");

        JButton btnGuardar =
                crearBoton("💾 Guardar");

        toolbar.add(btnAbrir);

        toolbar.addSeparator();

        toolbar.add(btnAnalizar);

        toolbar.addSeparator();

        toolbar.add(btnLimpiar);

        toolbar.addSeparator();

        toolbar.add(btnGuardar);

        add(toolbar, BorderLayout.NORTH);

        // ================= EDITOR =================

        editorCodigo = new RSyntaxTextArea();

        editorCodigo.setSyntaxEditingStyle(
                SyntaxConstants.SYNTAX_STYLE_JAVA
        );

        editorCodigo.setCodeFoldingEnabled(true);

        editorCodigo.setAntiAliasingEnabled(true);

        editorCodigo.setBackground(fondoEditor);

        editorCodigo.setForeground(texto);

        editorCodigo.setCaretColor(cyan);

        editorCodigo.setCurrentLineHighlightColor(
                new Color(50, 50, 70)
        );

        editorCodigo.setSelectionColor(
                new Color(100, 80, 180)
        );

        editorCodigo.setFont(
                new Font(
                        "JetBrains Mono",
                        Font.PLAIN,
                        16
                )
        );

        editorCodigo.setBorder(
                BorderFactory.createEmptyBorder(
                        10,
                        10,
                        10,
                        10
                )
        );

        RTextScrollPane scrollEditor =
                new RTextScrollPane(editorCodigo);

        scrollEditor.setLineNumbersEnabled(true);

        // ================= TABLA TOKENS =================

        modeloTokens = new DefaultTableModel();

        modeloTokens.addColumn("TOKEN");

        modeloTokens.addColumn("LEXEMA");

        tablaTokens = new JTable(modeloTokens);

        estilizarTabla(tablaTokens);

        JScrollPane scrollTokens =
                new JScrollPane(tablaTokens);

        // ================= TABLA ERRORES =================

        modeloErrores = new DefaultTableModel();

        modeloErrores.addColumn("TIPO");

        modeloErrores.addColumn("LÍNEA");

        modeloErrores.addColumn("MENSAJE");

        tablaErrores = new JTable(modeloErrores);

        estilizarTabla(tablaErrores);

        JScrollPane scrollErrores =
                new JScrollPane(tablaErrores);

        // ================= TABLA SÍMBOLOS =================

        modeloSimbolos = new DefaultTableModel();

        modeloSimbolos.addColumn("VARIABLE");

        modeloSimbolos.addColumn("TIPO");

        modeloSimbolos.addColumn("VALOR");

        tablaSimbolos = new JTable(modeloSimbolos);

        estilizarTabla(tablaSimbolos);

        JScrollPane scrollSimbolos =
                new JScrollPane(tablaSimbolos);

        // ================= ÁRBOL =================

        panelArbol = new JPanel();

        panelArbol.setBackground(Color.WHITE);

        JScrollPane scrollArbol =
                new JScrollPane(panelArbol);

        // ================= TABS =================

        JTabbedPane tabs = new JTabbedPane();

        tabs.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        14
                )
        );

        tabs.addTab("✨ Tokens", scrollTokens);

        tabs.addTab("❌ Errores", scrollErrores);

        tabs.addTab("🧠 Símbolos", scrollSimbolos);

        tabs.addTab("🌳 Árbol", scrollArbol);

        // ================= SPLIT =================

        JSplitPane split =
                new JSplitPane(
                        JSplitPane.VERTICAL_SPLIT,
                        scrollEditor,
                        tabs
                );

        split.setDividerLocation(500);

        split.setBorder(null);

        add(split, BorderLayout.CENTER);

        // ================= FOOTER =================

        JLabel footer =
                new JLabel(
                        "✨ Compilador creado por Christopher López ✨"
                );

        footer.setForeground(texto);

        footer.setBackground(
                new Color(35, 35, 52)
        );

        footer.setOpaque(true);

        footer.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        14
                )
        );

        footer.setBorder(
                BorderFactory.createEmptyBorder(
                        8,
                        15,
                        8,
                        15
                )
        );

        add(footer, BorderLayout.SOUTH);

        // ================= EVENTOS =================

        btnAbrir.addActionListener(
                this::abrirArchivo
        );

        btnAnalizar.addActionListener(
                this::analizarCodigo
        );

        btnLimpiar.addActionListener(
                e -> limpiarTodo()
        );

        btnGuardar.addActionListener(
                this::guardarArchivo
        );
    }

    private JButton crearBoton(String texto) {

        JButton boton = new JButton(texto);

        boton.setFocusPainted(false);

        boton.setBackground(morado);

        boton.setForeground(Color.WHITE);

        boton.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        15
                )
        );

        boton.setBorderPainted(false);

        boton.setPreferredSize(
                new Dimension(150, 40)
        );

        return boton;
    }

    private void estilizarTabla(JTable tabla) {

        tabla.setRowHeight(35);

        tabla.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        14
                )
        );

        tabla.setBackground(
                new Color(35, 35, 52)
        );

        tabla.setForeground(Color.WHITE);

        tabla.setGridColor(
                new Color(70, 70, 90)
        );

        tabla.setSelectionBackground(
                new Color(140, 82, 255)
        );

        tabla.getTableHeader().setBackground(
                new Color(140, 82, 255)
        );

        tabla.getTableHeader().setForeground(
                Color.WHITE
        );

        tabla.getTableHeader().setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        14
                )
        );
    }

    private void abrirArchivo(ActionEvent e) {

        try {

            JFileChooser chooser =
                    new JFileChooser();

            int opcion =
                    chooser.showOpenDialog(this);

            if (opcion ==
                    JFileChooser.APPROVE_OPTION) {

                File archivo =
                        chooser.getSelectedFile();

                String contenido =
                        Files.readString(
                                archivo.toPath()
                        );

                editorCodigo.setText(contenido);
            }

        }

        catch (Exception ex) {

            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage()
            );
        }
    }

    private void guardarArchivo(ActionEvent e) {

        try {

            JFileChooser chooser =
                    new JFileChooser();

            int opcion =
                    chooser.showSaveDialog(this);

            if (opcion ==
                    JFileChooser.APPROVE_OPTION) {

                File archivo =
                        chooser.getSelectedFile();

                Files.writeString(
                        archivo.toPath(),
                        editorCodigo.getText()
                );

                JOptionPane.showMessageDialog(
                        this,
                        "✨ Archivo guardado ✨"
                );
            }

        }

        catch (Exception ex) {

            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage()
            );
        }
    }

    private void limpiarTodo() {

        editorCodigo.setText("");

        modeloTokens.setRowCount(0);

        modeloErrores.setRowCount(0);

        modeloSimbolos.setRowCount(0);

        panelArbol.removeAll();

        panelArbol.repaint();
    }

    private void analizarCodigo(ActionEvent e) {

        try {

            modeloTokens.setRowCount(0);

            modeloErrores.setRowCount(0);

            modeloSimbolos.setRowCount(0);

            panelArbol.removeAll();

            final boolean[] errores =
                    { false };

            String codigo =
                    editorCodigo.getText();

            CharStream input =
                    CharStreams.fromString(codigo);

            MiGramaticaLexer lexer =
                    new MiGramaticaLexer(input);

            CommonTokenStream tokens =
                    new CommonTokenStream(lexer);

            tokens.fill();

            // ================= TOKENS =================

            for (Token t : tokens.getTokens()) {

                int tipo = t.getType();

                if (tipo == Token.EOF) {
                    continue;
                }

                String nombreToken =
                        MiGramaticaLexer
                                .VOCABULARY
                                .getSymbolicName(tipo);

                modeloTokens.addRow(
                        new Object[] {
                                nombreToken,
                                t.getText()
                        }
                );
            }

            tokens.seek(0);

            // ================= PARSER =================

            MiGramaticaParser parser =
                    new MiGramaticaParser(tokens);

            parser.removeErrorListeners();

            parser.addErrorListener(
                    new BaseErrorListener() {

                @Override
                public void syntaxError(
                        Recognizer<?, ?> recognizer,
                        Object offendingSymbol,
                        int line,
                        int charPositionInLine,
                        String msg,
                        RecognitionException e
                ) {

                    errores[0] = true;

                    modeloErrores.addRow(
                            new Object[] {
                                    "Sintáctico",
                                    line,
                                    msg
                            }
                    );
                }
            });

            ParseTree tree = parser.programa();

            if (!errores[0]) {

                // ================= SEMÁNTICO =================

                TablaVisitor tablaVisitor =
                        new TablaVisitor();

                tablaVisitor.visit(tree);

                if (tablaVisitor.hasError()) {

                    modeloErrores.addRow(
                            new Object[] {
                                    "Semántico",
                                    "-",
                                    tablaVisitor
                                            .getErroresSemanticos()
                            }
                    );
                }

                else {

                    // ================= TRADUCTOR =================

                    Traductor traductor =
                            new Traductor();

                    traductor.visit(tree);

                    // ================= ÁRBOL =================

                    TreeViewer viewer =
                            new TreeViewer(
                                    Arrays.asList(
                                            parser.getRuleNames()
                                    ),
                                    tree
                            );

                    viewer.setScale(1.3);

                    panelArbol.setLayout(
                            new BorderLayout()
                    );

                    panelArbol.add(
                            viewer,
                            BorderLayout.CENTER
                    );

                    panelArbol.revalidate();

                    panelArbol.repaint();

                    // ================= TABLA SÍMBOLOS =================

                    for (
                            Map<String, Simbolo> scope :
                            tablaVisitor
                                    .getTabla()
                                    .getScopes()
                    ) {

                        for (
                                Simbolo simbolo :
                                scope.values()
                        ) {

                            modeloSimbolos.addRow(
                                    new Object[] {
                                            simbolo.nombre,
                                            simbolo.tipo,
                                            simbolo.valor
                                    }
                            );
                        }
                    }
                }
            }

        }

        catch (Exception ex) {

            modeloErrores.addRow(
                    new Object[] {
                            "General",
                            "-",
                            ex.getMessage()
                    }
            );

            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {

            FlatDarculaLaf.setup();

        }

        catch (Exception e) {

            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {

            new GUICompilador().setVisible(true);
        });
    }
}