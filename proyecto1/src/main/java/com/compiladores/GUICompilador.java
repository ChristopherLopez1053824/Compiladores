package com.compiladores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
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
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

import com.compiladores.antlr.MiGramaticaLexer;
import com.compiladores.antlr.MiGramaticaParser;
import com.formdev.flatlaf.FlatDarculaLaf;

public class GUICompilador extends JFrame {

    // ================= COLORES =================

    private final Color fondoPrincipal = new Color(28, 24, 48);

    private final Color fondoPanel = new Color(35, 30, 60);

    private final Color fondoEditor = new Color(22, 22, 45);

    private final Color morado = new Color(145, 90, 255);

    private final Color azul = new Color(0, 170, 255);

    private final Color texto = new Color(245, 245, 255);

    private final Color borde = new Color(85, 65, 150);

    // ================= COMPONENTES =================

    private RSyntaxTextArea editorCodigo;

    private RSyntaxTextArea consola;

    private JTable tablaTokens;

    private JTable tablaErrores;

    private JTable tablaSimbolos;

    private DefaultTableModel modeloTokens;

    private DefaultTableModel modeloErrores;

    private DefaultTableModel modeloSimbolos;

    private JPanel panelArbol;

    private File archivoActual;

    public GUICompilador() {

        configurarVentana();

        inicializarComponentes();
    }

    private void configurarVentana() {

        setTitle("✨ Compilador Fantasía - Juan Estrada, Christopher Lopez, Nicolle West✨");

        setSize(1600, 900);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(fondoPrincipal);

        setLayout(new BorderLayout());
    }

    private void inicializarComponentes() {

        // ================= TOPBAR =================

        JPanel topbar = new JPanel(new BorderLayout());

        topbar.setBackground(fondoPrincipal);

        topbar.setBorder(
                new EmptyBorder(15, 20, 15, 20));

        JPanel izquierda = new JPanel(new FlowLayout(
                FlowLayout.LEFT,
                15,
                0));

        izquierda.setOpaque(false);

        JLabel titulo = new JLabel("✨ Compilador Fantasía ✨");

        titulo.setForeground(Color.WHITE);

        titulo.setFont(
                new Font("Segoe UI Emoji",
                        Font.BOLD,
                        26));

        JButton btnAbrir = crearBoton("📂 Abrir");

        JButton btnAnalizar = crearBoton("🔎 Analizar");

        JButton btnEjecutar = crearBoton("▶ Ejecutar");

        JButton btnLimpiar = crearBoton("🧹 Limpiar");

        JButton btnGuardar = crearBoton("💾 Guardar");

        izquierda.add(titulo);

        izquierda.add(Box.createHorizontalStrut(20));

        izquierda.add(btnAbrir);

        izquierda.add(btnAnalizar);

        izquierda.add(btnEjecutar);

        izquierda.add(btnLimpiar);

        izquierda.add(btnGuardar);

        topbar.add(izquierda, BorderLayout.WEST);

        add(topbar, BorderLayout.NORTH);

        // ================= SIDEBAR =================

        JPanel sidebar = new JPanel();

        sidebar.setBackground(fondoPanel);

        sidebar.setPreferredSize(
                new Dimension(220, 0));

        sidebar.setLayout(
                new BoxLayout(
                        sidebar,
                        BoxLayout.Y_AXIS));

        sidebar.setBorder(
                new EmptyBorder(
                        25,
                        15,
                        25,
                        15));

        JButton btnCodigo = crearBotonSidebar("💻 Código");

        JButton btnTokens = crearBotonSidebar("📄 Tokens");

        JButton btnErrores = crearBotonSidebar("❌ Errores");

        JButton btnSimbolos = crearBotonSidebar("📚 Símbolos");

        JButton btnArbol = crearBotonSidebar("🌳 Árbol");

        sidebar.add(btnCodigo);

        sidebar.add(Box.createVerticalStrut(15));

        sidebar.add(btnTokens);

        sidebar.add(Box.createVerticalStrut(15));

        sidebar.add(btnErrores);

        sidebar.add(Box.createVerticalStrut(15));

        sidebar.add(btnSimbolos);

        sidebar.add(Box.createVerticalStrut(15));

        sidebar.add(btnArbol);

        sidebar.add(Box.createVerticalGlue());

        // ================= IMAGEN LOGO =================

        ImageIcon logoIcon = new ImageIcon(
                GUICompilador.class.getResource("/Icon/encantia.png"));

        Image imagenEscalada = logoIcon.getImage().getScaledInstance(
                150,
                150,
                Image.SCALE_SMOOTH);

        JLabel logo = new JLabel(
                new ImageIcon(imagenEscalada));

        logo.setAlignmentX(
                Component.CENTER_ALIGNMENT);

        sidebar.add(logo);

        add(sidebar, BorderLayout.WEST);

        // ================= EDITOR =================

        editorCodigo = new RSyntaxTextArea();

        editorCodigo.setSyntaxEditingStyle(
                SyntaxConstants.SYNTAX_STYLE_JAVA);

        editorCodigo.setCodeFoldingEnabled(true);

        editorCodigo.setAntiAliasingEnabled(true);

        editorCodigo.setBackground(fondoEditor);

        editorCodigo.setForeground(texto);

        editorCodigo.setCaretColor(Color.WHITE);

        editorCodigo.setCurrentLineHighlightColor(
                new Color(40, 40, 70));

        editorCodigo.setSelectionColor(
                new Color(100, 80, 200));

        editorCodigo.setFont(
                new Font("JetBrains Mono",
                        Font.PLAIN,
                        18));

        editorCodigo.setBorder(
                new EmptyBorder(
                        15,
                        15,
                        15,
                        15));

        RTextScrollPane scrollEditor = new RTextScrollPane(editorCodigo);

        scrollEditor.setLineNumbersEnabled(true);

        scrollEditor.getGutter().setBackground(
                new Color(24, 24, 50));

        scrollEditor.getGutter().setLineNumberColor(
                new Color(170, 170, 220));

        scrollEditor.setBorder(
                BorderFactory.createLineBorder(
                        borde,
                        1));

        // ================= TABLAS =================

        modeloTokens = new DefaultTableModel();

        modeloTokens.addColumn("TOKEN");

        modeloTokens.addColumn("LEXEMA");

        tablaTokens = new JTable(modeloTokens);

        estilizarTabla(tablaTokens);

        JScrollPane scrollTokens = new JScrollPane(tablaTokens);

        modeloErrores = new DefaultTableModel();

        modeloErrores.addColumn("TIPO");

        modeloErrores.addColumn("LÍNEA");

        modeloErrores.addColumn("MENSAJE");

        tablaErrores = new JTable(modeloErrores);

        estilizarTabla(tablaErrores);

        JScrollPane scrollErrores = new JScrollPane(tablaErrores);

        modeloSimbolos = new DefaultTableModel();

        modeloSimbolos.addColumn("VARIABLE");

        modeloSimbolos.addColumn("TIPO");

        modeloSimbolos.addColumn("VALOR");

        tablaSimbolos = new JTable(modeloSimbolos);

        estilizarTabla(tablaSimbolos);

        JScrollPane scrollSimbolos = new JScrollPane(tablaSimbolos);

        panelArbol = new JPanel();

        panelArbol.setBackground(Color.WHITE);

        JScrollPane scrollArbol = new JScrollPane(panelArbol);

        // ================= TABS =================

        JTabbedPane tabs = new JTabbedPane();

        tabs.setBackground(fondoPanel);

        tabs.setForeground(Color.WHITE);

        tabs.setFont(
                new Font("Segoe UI",
                        Font.BOLD,
                        15));

        tabs.addTab("Tokens", scrollTokens);

        tabs.addTab("Errores", scrollErrores);

        tabs.addTab("Símbolos", scrollSimbolos);

        tabs.addTab("Árbol", scrollArbol);

        // ================= CONSOLA =================

        consola = new RSyntaxTextArea();

        consola.setEditable(false);

        consola.setBackground(
                new Color(12, 12, 28));

        consola.setForeground(
                new Color(0, 255, 190));

        consola.setFont(
                new Font("JetBrains Mono",
                        Font.PLAIN,
                        15));

        consola.setBorder(
                new EmptyBorder(
                        10,
                        10,
                        10,
                        10));

        RTextScrollPane scrollConsola = new RTextScrollPane(consola);

        scrollConsola.setBorder(
                BorderFactory.createTitledBorder(
                        BorderFactory.createLineBorder(
                                borde),
                        " Consola de Ejecución ",
                        0,
                        0,
                        new Font(
                                "Segoe UI",
                                Font.BOLD,
                                14),
                        Color.WHITE));

        // ================= PANEL EDITOR =================

        JPanel panelEditor = new JPanel(new BorderLayout());

        panelEditor.setBackground(fondoPrincipal);

        panelEditor.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(
                                borde,
                                1),
                        new EmptyBorder(
                                5,
                                5,
                                5,
                                5)));

        panelEditor.add(
                scrollEditor,
                BorderLayout.CENTER);

        // ================= PANEL RESULTADOS =================

        JPanel panelResultados = new JPanel(new BorderLayout());

        panelResultados.setBackground(fondoPrincipal);

        panelResultados.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(
                                borde,
                                1),
                        new EmptyBorder(
                                5,
                                5,
                                5,
                                5)));

        panelResultados.add(
                tabs,
                BorderLayout.CENTER);

        // ================= PANEL CONSOLA =================

        JPanel panelConsola = new JPanel(new BorderLayout());

        panelConsola.setBackground(fondoPrincipal);

        panelConsola.setPreferredSize(
                new Dimension(0, 240));

        panelConsola.setBorder(
                new EmptyBorder(
                        10,
                        0,
                        0,
                        0));

        panelConsola.add(
                scrollConsola,
                BorderLayout.CENTER);

        // ================= PANEL SUPERIOR =================

        JPanel panelSuperior = new JPanel(new BorderLayout());

        panelSuperior.setBackground(fondoPrincipal);

        panelSuperior.add(
                panelEditor,
                BorderLayout.CENTER);

        // ================= PANEL PRINCIPAL =================

        JPanel panelPrincipal = new JPanel(new BorderLayout(
                0,
                10));

        panelPrincipal.setBackground(fondoPrincipal);

        panelPrincipal.setBorder(
                new EmptyBorder(
                        10,
                        10,
                        10,
                        10));

        panelPrincipal.add(
                panelSuperior,
                BorderLayout.CENTER);

        panelPrincipal.add(
                panelConsola,
                BorderLayout.SOUTH);

        add(panelPrincipal, BorderLayout.CENTER);

        // ================= EVENTOS =================

        btnAbrir.addActionListener(this::abrirArchivo);

        btnAnalizar.addActionListener(this::analizarCodigo);

        btnEjecutar.addActionListener(this::ejecutarPrograma);

        btnLimpiar.addActionListener(e -> limpiarTodo());

        btnGuardar.addActionListener(this::guardarArchivo);

        // ================= SIDEBAR =================

        btnCodigo.addActionListener(e -> {

            panelSuperior.removeAll();

            panelSuperior.add(
                    panelEditor,
                    BorderLayout.CENTER);

            panelSuperior.revalidate();

            panelSuperior.repaint();
        });

        btnTokens.addActionListener(e -> {

            tabs.setSelectedIndex(0);

            panelSuperior.removeAll();

            panelSuperior.add(
                    panelResultados,
                    BorderLayout.CENTER);

            panelSuperior.revalidate();

            panelSuperior.repaint();
        });

        btnErrores.addActionListener(e -> {

            tabs.setSelectedIndex(1);

            panelSuperior.removeAll();

            panelSuperior.add(
                    panelResultados,
                    BorderLayout.CENTER);

            panelSuperior.revalidate();

            panelSuperior.repaint();
        });

        btnSimbolos.addActionListener(e -> {

            tabs.setSelectedIndex(2);

            panelSuperior.removeAll();

            panelSuperior.add(
                    panelResultados,
                    BorderLayout.CENTER);

            panelSuperior.revalidate();

            panelSuperior.repaint();
        });

        btnArbol.addActionListener(e -> {

            tabs.setSelectedIndex(3);

            panelSuperior.removeAll();

            panelSuperior.add(
                    panelResultados,
                    BorderLayout.CENTER);

            panelSuperior.revalidate();

            panelSuperior.repaint();
        });
    }

    // ================= BOTONES =================

    private JButton crearBoton(String texto) {

        JButton boton = new JButton(texto);

        boton.setFocusPainted(false);

        boton.setBackground(morado);

        boton.setForeground(Color.WHITE);

        boton.setFont(
                new Font("Segoe UI Emoji",
                        Font.BOLD,
                        15));

        boton.setBorder(
                new EmptyBorder(
                        14,
                        24,
                        14,
                        24));

        boton.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        boton.setOpaque(true);

        boton.addMouseListener(
                new java.awt.event.MouseAdapter() {

                    @Override
                    public void mouseEntered(
                            java.awt.event.MouseEvent evt) {

                        boton.setBackground(azul);
                    }

                    @Override
                    public void mouseExited(
                            java.awt.event.MouseEvent evt) {

                        boton.setBackground(morado);
                    }
                });

        return boton;
    }

    private JButton crearBotonSidebar(String texto) {

        JButton boton = new JButton(texto);

        boton.setMaximumSize(
                new Dimension(250, 55));

        boton.setHorizontalAlignment(
                SwingConstants.LEFT);

        boton.setFocusPainted(false);

        boton.setBackground(fondoPanel);

        boton.setForeground(Color.WHITE);

        boton.setFont(
                new Font("Segoe UI Emoji",
                        Font.BOLD,
                        17));

        boton.setBorder(
                new EmptyBorder(
                        14,
                        18,
                        14,
                        18));

        boton.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        boton.setOpaque(true);

        return boton;
    }

    // ================= TABLAS =================

    private void estilizarTabla(JTable tabla) {

        tabla.setRowHeight(35);

        tabla.setFont(
                new Font("Segoe UI",
                        Font.PLAIN,
                        14));

        tabla.setBackground(fondoEditor);

        tabla.setForeground(Color.WHITE);

        tabla.setGridColor(
                new Color(55, 55, 90));

        tabla.setSelectionBackground(morado);

        tabla.getTableHeader().setBackground(morado);

        tabla.getTableHeader().setForeground(Color.WHITE);

        tabla.getTableHeader().setFont(
                new Font("Segoe UI",
                        Font.BOLD,
                        14));
    }

    // ================= FUNCIONES =================

    private void abrirArchivo(ActionEvent e) {

        try {

            JFileChooser chooser = new JFileChooser();

            int opcion = chooser.showOpenDialog(this);

            if (opcion == JFileChooser.APPROVE_OPTION) {

                archivoActual = chooser.getSelectedFile();

                String contenido = Files.readString(
                        archivoActual.toPath());

                editorCodigo.setText(contenido);

                consola.append(
                        "📂 Archivo cargado correctamente\n");
            }

        } catch (Exception ex) {

            consola.append(
                    "❌ Error al abrir archivo\n");
        }
    }

    private void guardarArchivo(ActionEvent e) {

        try {

            JFileChooser chooser = new JFileChooser();

            chooser.setDialogTitle(
                    "Guardar archivos");

            int opcion = chooser.showSaveDialog(this);

            if (opcion == JFileChooser.APPROVE_OPTION) {

                File archivoBase = chooser.getSelectedFile();

                String nombre = archivoBase.getAbsolutePath();

                // ================= GUARDAR JAVA =================

                File archivoJava = new File(nombre + ".encantia");

                PrintWriter writerJava = new PrintWriter(archivoJava);

                writerJava.print(editorCodigo.getText());

                writerJava.close();

                // ================= COMPILAR =================

                ProcessBuilder compilador = new ProcessBuilder(
                        "javac",
                        archivoJava.getAbsolutePath());

                compilador.redirectErrorStream(true);

                Process proceso = compilador.start();

                proceso.waitFor();

                // ================= MOVER CLASS =================

                File archivoClass = new File(
                        archivoJava
                                .getParent(),
                        archivoJava
                                .getName()
                                .replace(".java",
                                        ".class"));

                consola.append(
                        "💾 Archivo .java guardado en:\n"
                                + archivoJava.getAbsolutePath()
                                + "\n\n");

                if (archivoClass.exists()) {

                    consola.append(
                            "⚙️ Archivo .class generado en:\n"
                                    + archivoClass.getAbsolutePath()
                                    + "\n\n");

                } else {

                    consola.append(
                            "❌ No se pudo generar el .class\n");
                }
            }

        } catch (Exception ex) {

            consola.append(
                    "❌ Error al guardar archivos\n");

            consola.append(
                    ex.getMessage() + "\n");
        }
    }

    private void limpiarTodo() {

        try {

            Files.deleteIfExists(
                    Path.of("Programa.java"));

            Files.deleteIfExists(
                    Path.of("Programa.class"));

        } catch (Exception ex) {

        }

        editorCodigo.setText("");

        consola.setText("");

        modeloTokens.setRowCount(0);

        modeloErrores.setRowCount(0);

        modeloSimbolos.setRowCount(0);

        panelArbol.removeAll();

        panelArbol.repaint();
    }

    private void analizarCodigo(ActionEvent e) {

        try {

            Files.deleteIfExists(
                    Path.of("Programa.java"));

            Files.deleteIfExists(
                    Path.of("Programa.class"));

            consola.setText("");

            modeloTokens.setRowCount(0);

            modeloErrores.setRowCount(0);

            modeloSimbolos.setRowCount(0);

            panelArbol.removeAll();

            panelArbol.repaint();

            consola.append(
                    "Archivos se leyo bien\n\n");

            String codigo = editorCodigo.getText();

            CharStream input = CharStreams.fromString(codigo);

            MiGramaticaLexer lexer = new MiGramaticaLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            tokens.fill();

            for (Token t : tokens.getTokens()) {

                if (t.getType() == Token.EOF) {
                    continue;
                }

                modeloTokens.addRow(
                        new Object[] {
                                MiGramaticaLexer.VOCABULARY
                                        .getSymbolicName(
                                                t.getType()),
                                t.getText()
                        });
            }

            tokens.seek(0);

            MiGramaticaParser parser = new MiGramaticaParser(tokens);

            
            // ================= LISTENERS DE ERRORES =================

            lexer.removeErrorListeners();
            parser.removeErrorListeners();

            lexer.addErrorListener(new BaseErrorListener() {

                @Override
                public void syntaxError(
                        Recognizer<?, ?> recognizer,
                        Object offendingSymbol,
                        int line,
                        int charPositionInLine,
                        String msg,
                        RecognitionException e) {

                    consola.append(
                            "❌ Error léxico en línea "
                                    + line
                                    + ", columna "
                                    + charPositionInLine
                                    + "\n");

                    consola.append(msg + "\n\n");

                    modeloErrores.addRow(
                            new Object[] {
                                    "Léxico",
                                    line,
                                    msg
                            });
                }
            });

            parser.addErrorListener(new BaseErrorListener() {

                @Override
                public void syntaxError(
                        Recognizer<?, ?> recognizer,
                        Object offendingSymbol,
                        int line,
                        int charPositionInLine,
                        String msg,
                        RecognitionException e) {

                    consola.append(
                            "❌ Error sintáctico en línea "
                                    + line
                                    + ", columna "
                                    + charPositionInLine
                                    + "\n");

                    consola.append(msg + "\n\n");

                    modeloErrores.addRow(
                            new Object[] {
                                    "Sintáctico",
                                    line,
                                    msg
                            });
                }
            });

            ParseTree tree = null;

            try {

                tree = parser.programa();

            } catch (Exception ex) {

                consola.append(
                        "❌ Análisis cancelado por errores sintácticos\n");

                return;
            }

            if (parser.getNumberOfSyntaxErrors() > 0) {

                consola.append(
                        "❌ No se puede generar código porque existen errores\n");

                return;
            }

            // ================= TABLA DE SÍMBOLOS =================

TablaVisitor tablaVisitor = new TablaVisitor();

tablaVisitor.visit(tree);

if (tablaVisitor.hasError()) {

    consola.append("❌ Errores semánticos:\n");
    consola.append(tablaVisitor.getErroresSemanticos());

    modeloErrores.addRow(
            new Object[] {
                    "Semántico",
                    "-",
                    tablaVisitor.getErroresSemanticos()
            });

    return;
}

for (Simbolo simbolo : tablaVisitor.getTabla().getTabla().values()) {

    modeloSimbolos.addRow(
            new Object[] {
                    simbolo.getNombre(),
                    simbolo.getTipo(),
                    simbolo.getValor()
            });
}
            TreeViewer viewer = new TreeViewer(
                    Arrays.asList(
                            parser.getRuleNames()),
                    tree);

            viewer.setScale(1.2);

            panelArbol.removeAll();

            panelArbol.setLayout(
                    new BorderLayout());

            panelArbol.add(
                    viewer,
                    BorderLayout.CENTER);

            panelArbol.revalidate();

            panelArbol.repaint();



            // ================= GENERAR NUEVO JAVA =================

            PrintWriter writer = new PrintWriter("Programa.java");

            Traductor traductor = new Traductor(writer);

            traductor.visit(tree);

            writer.close();

            consola.append(
                    "Se genero todo correctamente\n");

        } catch (Exception ex) {

            consola.append(
                    "❌ Error durante análisis\n\n");

            consola.append(
                    ex.getMessage() + "\n");

            modeloErrores.addRow(
                    new Object[] {
                            "General",
                            "-",
                            ex.getMessage()
                    });
        }
    }

    private void ejecutarPrograma(ActionEvent e) {

        try {

            consola.append(
                    "\nEjecutando programa...\n\n");

            ProcessBuilder compilador = new ProcessBuilder(
                    "javac",
                    "Programa.java");

            compilador.redirectErrorStream(true);

            Process procesoCompilar = compilador.start();

            BufferedReader lectorCompilacion = new BufferedReader(
                    new InputStreamReader(
                            procesoCompilar.getInputStream()));

            String lineaCompilacion;

            StringBuilder erroresCompilacion = new StringBuilder();

            while ((lineaCompilacion = lectorCompilacion.readLine()) != null) {

                erroresCompilacion
                        .append(lineaCompilacion)
                        .append("\n");
            }

            int resultadoCompilacion = procesoCompilar.waitFor();

            if (resultadoCompilacion != 0) {

                consola.append(
                        "❌ ERROR DE COMPILACIÓN\n\n");

                consola.append(
                        erroresCompilacion.toString());

                return;
            }

            ProcessBuilder ejecutor = new ProcessBuilder(
                    "java",
                    "Programa");

            ejecutor.redirectErrorStream(true);

            Process procesoEjecutar = ejecutor.start();

            BufferedReader lector = new BufferedReader(
                    new InputStreamReader(
                            procesoEjecutar
                                    .getInputStream()));

            String linea;

            StringBuilder salida = new StringBuilder();

            while ((linea = lector.readLine()) != null) {

                salida.append(linea)
                        .append("\n");
            }

            procesoEjecutar.waitFor();

            consola.append(
                    "=========================\n\n");

            consola.append(
                    salida.toString());

            consola.append(
                    "\n============================\n");

        } catch (Exception ex) {

            consola.append(
                    "\n❌ Error de ejecución\n");

            consola.append(
                    ex.getMessage() + "\n");
        }
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        try {

            System.setProperty(
                    "flatlaf.useWindowDecorations",
                    "true");

            UIManager.put(
                    "TitlePane.unifiedBackground",
                    false);

            FlatDarculaLaf.setup();

        } catch (Exception e) {

            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {

            new GUICompilador()
                    .setVisible(true);
        });
    }
}