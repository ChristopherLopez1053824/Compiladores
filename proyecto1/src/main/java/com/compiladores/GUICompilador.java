package com.compiladores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

import com.compiladores.antlr.MiGramaticaLexer;
import com.compiladores.antlr.MiGramaticaParser;
import com.formdev.flatlaf.FlatDarculaLaf;

public class GUICompilador extends JFrame {

    private final Color fondoPrincipal = new Color(24, 24, 36);
    private final Color fondoEditor = new Color(30, 30, 46);
    private final Color morado = new Color(140, 82, 255);
    private final Color texto = new Color(240, 240, 255);
    private final Color cyan = new Color(0, 220, 255);
    
    private RSyntaxTextArea editorCodigo;

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
        setTitle("✨ Compilador Fantasía ✨");
        setSize(1500, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(fondoPrincipal);
        setLayout(new BorderLayout());
    }

    private void inicializarComponentes() {

        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(false);
        toolbar.setBackground(new Color(35, 35, 52));
        toolbar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton btnAbrir = crearBoton("📂 Abrir");
        JButton btnAnalizar = crearBoton("✨ Analizar");
        JButton btnEjecutar = crearBoton("🚀 Ejecutar");
        JButton btnLimpiar = crearBoton("🧹 Limpiar");
        JButton btnGuardar = crearBoton("💾 Guardar");

        toolbar.add(btnAbrir);
        toolbar.addSeparator();
        toolbar.add(btnAnalizar);
        toolbar.addSeparator();
        toolbar.add(btnEjecutar);
        toolbar.addSeparator();
        toolbar.add(btnLimpiar);
        toolbar.addSeparator();
        toolbar.add(btnGuardar);

        add(toolbar, BorderLayout.NORTH);

        editorCodigo = new RSyntaxTextArea();
        editorCodigo.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        editorCodigo.setCodeFoldingEnabled(true);
        editorCodigo.setAntiAliasingEnabled(true);
        editorCodigo.setBackground(fondoEditor);
        editorCodigo.setForeground(texto);
        editorCodigo.setCaretColor(cyan);
        editorCodigo.setCurrentLineHighlightColor(new Color(50, 50, 70));
        editorCodigo.setSelectionColor(new Color(100, 80, 180));
        editorCodigo.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
        editorCodigo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        RTextScrollPane scrollEditor = new RTextScrollPane(editorCodigo);
        scrollEditor.setLineNumbersEnabled(true);

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

        JTabbedPane tabs = new JTabbedPane();
        tabs.setFont(new Font("Segoe UI", Font.BOLD, 14));

        tabs.addTab("✨ Tokens", scrollTokens);
        tabs.addTab("❌ Errores", scrollErrores);
        tabs.addTab("🧠 Símbolos", scrollSimbolos);
        tabs.addTab("🌳 Árbol", scrollArbol);

        JSplitPane split = new JSplitPane(
                JSplitPane.VERTICAL_SPLIT,
                scrollEditor,
                tabs);

        split.setDividerLocation(500);
        split.setBorder(null);

        add(split, BorderLayout.CENTER);

        JLabel footer = new JLabel("✨ Compilador creado por Christopher López ✨");
        footer.setForeground(texto);
        footer.setBackground(new Color(35, 35, 52));
        footer.setOpaque(true);
        footer.setFont(new Font("Segoe UI", Font.BOLD, 14));
        footer.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));

        add(footer, BorderLayout.SOUTH);

        btnAbrir.addActionListener(this::abrirArchivo);
        btnAnalizar.addActionListener(this::analizarCodigo);
        btnEjecutar.addActionListener(this::ejecutarPrograma);
        btnLimpiar.addActionListener(e -> limpiarTodo());
        btnGuardar.addActionListener(this::guardarArchivo);
    }

    private JButton crearBoton(String texto) {

        JButton boton = new JButton(texto);

        boton.setFocusPainted(false);
        boton.setBackground(morado);
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Segoe UI", Font.BOLD, 15));
        boton.setBorderPainted(false);
        boton.setPreferredSize(new Dimension(150, 40));

        return boton;
    }

    private void estilizarTabla(JTable tabla) {

        tabla.setRowHeight(35);
        tabla.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tabla.setBackground(new Color(35, 35, 52));
        tabla.setForeground(Color.WHITE);
        tabla.setGridColor(new Color(70, 70, 90));
        tabla.setSelectionBackground(new Color(140, 82, 255));

        tabla.getTableHeader().setBackground(new Color(140, 82, 255));
        tabla.getTableHeader().setForeground(Color.WHITE);
        tabla.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
    }

    private void abrirArchivo(ActionEvent e) {

        try {

            JFileChooser chooser = new JFileChooser();

            int opcion = chooser.showOpenDialog(this);

            if (opcion == JFileChooser.APPROVE_OPTION) {

                archivoActual = chooser.getSelectedFile();

                String contenido = Files.readString(archivoActual.toPath());

                editorCodigo.setText(contenido);
            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void guardarArchivo(ActionEvent e) {

        try {

            File archivoJava = new File("Programa.java");

            File archivoClass = new File("Programa.class");

            if (!archivoJava.exists()) {

                JOptionPane.showMessageDialog(
                        this,
                        "❌ Primero debes analizar un programa válido");

                return;
            }

            JFileChooser chooser = new JFileChooser();

            chooser.setDialogTitle(
                    "Selecciona carpeta para exportar");

            chooser.setFileSelectionMode(
                    JFileChooser.DIRECTORIES_ONLY);

            int opcion = chooser.showSaveDialog(this);

            if (opcion == JFileChooser.APPROVE_OPTION) {

                File carpetaDestino = chooser.getSelectedFile();

                // ================= COPIAR JAVA =================

                Files.copy(
                        archivoJava.toPath(),
                        carpetaDestino
                                .toPath()
                                .resolve("Programa.java"),
                        java.nio.file.StandardCopyOption.REPLACE_EXISTING);

                // ================= COPIAR CLASS =================

                if (archivoClass.exists()) {

                    Files.copy(
                            archivoClass.toPath(),
                            carpetaDestino
                                    .toPath()
                                    .resolve("Programa.class"),
                            java.nio.file.StandardCopyOption.REPLACE_EXISTING);
                }

                JOptionPane.showMessageDialog(
                        this,
                        "✨ Archivos exportados correctamente ✨");
            }

        }

        catch (Exception ex) {

            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage());
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
            Files.deleteIfExists(Path.of("Programa.java"));
            Files.deleteIfExists(Path.of("Programa.class"));
            modeloTokens.setRowCount(0);
            modeloErrores.setRowCount(0);
            modeloSimbolos.setRowCount(0);

            panelArbol.removeAll();
            panelArbol.repaint();

            final boolean[] errores = { false };

            String codigo;

            if (archivoActual != null) {

                codigo = cargarCodigoConImportsDesdeEditor(
                        editorCodigo.getText(),
                        archivoActual.toPath());

            } else {

                codigo = editorCodigo.getText();
            }

            CharStream input = CharStreams.fromString(codigo);

            MiGramaticaLexer lexer = new MiGramaticaLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            tokens.fill();

            for (Token t : tokens.getTokens()) {

                int tipo = t.getType();

                if (tipo == Token.EOF) {
                    continue;
                }

                if (tipo == MiGramaticaLexer.UNCLOSED_COMMENT) {

                    errores[0] = true;

                    modeloErrores.addRow(new Object[] {
                            "Léxico",
                            t.getLine(),
                            "Comentario sin cerrar"
                    });

                    continue;
                }

                if (tipo == MiGramaticaLexer.INVALID_FLOAT) {

                    errores[0] = true;

                    modeloErrores.addRow(new Object[] {
                            "Léxico",
                            t.getLine(),
                            "Número decimal mal formado -> " + t.getText()
                    });

                    continue;
                }

                if (tipo == MiGramaticaLexer.INVALID_ID) {

                    errores[0] = true;

                    modeloErrores.addRow(new Object[] {
                            "Léxico",
                            t.getLine(),
                            "Identificador inválido -> " + t.getText()
                    });

                    continue;
                }

                if (tipo == MiGramaticaLexer.UNCLOSED_CHAR) {

                    errores[0] = true;

                    modeloErrores.addRow(new Object[] {
                            "Léxico",
                            t.getLine(),
                            "Carácter sin cerrar -> " + t.getText()
                    });

                    continue;
                }

                if (tipo == MiGramaticaLexer.UNCLOSED_STRING) {

                    errores[0] = true;

                    modeloErrores.addRow(new Object[] {
                            "Léxico",
                            t.getLine(),
                            "Cadena sin cerrar -> " + t.getText()
                    });

                    continue;
                }

                if (tipo == MiGramaticaLexer.ERROR_CHAR) {

                    errores[0] = true;

                    modeloErrores.addRow(new Object[] {
                            "Léxico",
                            t.getLine(),
                            "Carácter inválido -> " + t.getText()
                    });

                    continue;
                }

                String nombreToken = MiGramaticaLexer.VOCABULARY.getSymbolicName(tipo);

                modeloTokens.addRow(new Object[] {
                        nombreToken,
                        t.getText()
                });
            }

            if (errores[0]) {
                return;
            }

            tokens.seek(0);

            MiGramaticaParser parser = new MiGramaticaParser(tokens);

            parser.removeErrorListeners();

            parser.addErrorListener(new BaseErrorListener() {

                @Override
                public void syntaxError(
                        Recognizer<?, ?> recognizer,
                        Object offendingSymbol,
                        int line,
                        int charPositionInLine,
                        String msg,
                        RecognitionException e) {

                    errores[0] = true;

                    String mensaje = msg;

                    mensaje = mensaje.replace("missing", "falta");
                    mensaje = mensaje.replace("at", "en");
                    mensaje = mensaje.replace("mismatched input", "entrada inesperada");
                    mensaje = mensaje.replace("mismenched input", "arreglo incorrecto");
                    mensaje = mensaje.replace("expecting", "se esperaba");

                    modeloErrores.addRow(new Object[] {
                            "Sintáctico",
                            line,
                            "Columna " + charPositionInLine + ": " + mensaje
                    });
                }
            });

            ParseTree tree = parser.programa();

            if (!errores[0]) {

                TablaVisitor tablaVisitor = new TablaVisitor();

                tablaVisitor.visit(tree);

                if (tablaVisitor.hasError()) {

                    modeloErrores.addRow(new Object[] {
                            "Semántico",
                            "-",
                            tablaVisitor.getErroresSemanticos()
                    });

                } else {

                    PrintWriter writer = new PrintWriter("Programa.java");

                    Traductor traductor = new Traductor(writer);

                    traductor.visit(tree);

                    writer.close();

                    TreeViewer viewer = new TreeViewer(
                            Arrays.asList(parser.getRuleNames()),
                            tree);

                    viewer.setScale(1.3);

                    panelArbol.setLayout(new BorderLayout());

                    panelArbol.add(viewer, BorderLayout.CENTER);

                    panelArbol.revalidate();

                    panelArbol.repaint();

                    for (Map<String, Simbolo> scope : tablaVisitor.getTabla().getScopes()) {

                        for (Simbolo simbolo : scope.values()) {

                            modeloSimbolos.addRow(new Object[] {
                                    simbolo.nombre,
                                    simbolo.tipo,
                                    simbolo.valor
                            });
                        }
                    }

                    JOptionPane.showMessageDialog(
                            this,
                            "✨ Análisis correcto y Programa.java generado ✨");
                }
            }

        } catch (Exception ex) {

            modeloErrores.addRow(new Object[] {
                    "General",
                    "-",
                    ex.getMessage()
            });

            ex.printStackTrace();
        }
    }

    private void ejecutarPrograma(ActionEvent e) {

        try {

            ProcessBuilder compilador = new ProcessBuilder(
                    "javac",
                    "Programa.java");

            compilador.redirectErrorStream(true);

            Process procesoCompilar = compilador.start();

            BufferedReader lectorCompilacion = new BufferedReader(
                    new InputStreamReader(
                            procesoCompilar.getInputStream()));

            StringBuilder erroresCompilacion = new StringBuilder();

            String lineaCompilacion;

            while ((lineaCompilacion = lectorCompilacion.readLine()) != null) {

                erroresCompilacion.append(lineaCompilacion).append("\n");
            }

            int resultadoCompilacion = procesoCompilar.waitFor();

            if (resultadoCompilacion != 0) {

                modeloErrores.addRow(new Object[] {
                        "Java",
                        "-",
                        erroresCompilacion.toString()
                });

                JOptionPane.showMessageDialog(
                        this,
                        erroresCompilacion.toString(),
                        "❌ Error al compilar Programa.java",
                        JOptionPane.ERROR_MESSAGE);

                return;
            }

            ProcessBuilder ejecutor = new ProcessBuilder(
                    "java",
                    "Programa");

            ejecutor.redirectErrorStream(true);

            Process procesoEjecutar = ejecutor.start();

            BufferedReader lectorEjecucion = new BufferedReader(
                    new InputStreamReader(
                            procesoEjecutar.getInputStream()));

            StringBuilder salida = new StringBuilder();

            String linea;

            while ((linea = lectorEjecucion.readLine()) != null) {

                salida.append(linea).append("\n");
            }

            procesoEjecutar.waitFor();

            JOptionPane.showMessageDialog(
                    this,
                    salida.length() == 0
                            ? "✨ El programa se ejecutó sin salida ✨"
                            : salida.toString(),
                    "✨ Resultado del Programa ✨",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {

            modeloErrores.addRow(new Object[] {
                    "Ejecución",
                    "-",
                    ex.getMessage()
            });

            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "❌ Error al ejecutar",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private String cargarCodigoConImportsDesdeEditor(
            String contenido,
            Path rutaArchivoPrincipal) throws Exception {

        Pattern pattern = Pattern.compile("convoca\\s+\"(.*?)\";");

        Matcher matcher = pattern.matcher(contenido);

        StringBuilder contenidoImports = new StringBuilder();

        while (matcher.find()) {

            String archivoImportado = matcher.group(1);

            Path carpetaBase = rutaArchivoPrincipal.getParent();

            Path rutaImportada = carpetaBase.resolve(archivoImportado);

            if (!Files.exists(rutaImportada)) {

                modeloErrores.addRow(
                        new Object[] {
                                "Importación",
                                "-",
                                "No se encontró el archivo importado -> " + archivoImportado
                        });

                return "";
            }

            String contenidoImportado = Files.readString(rutaImportada);

            contenidoImports.append("\n");
            contenidoImports.append(contenidoImportado);
            contenidoImports.append("\n");
        }

        contenido = contenido.replaceAll(
                "convoca\\s+\"(.*?)\";",
                "");

        return contenidoImports.toString() + "\n" + contenido;
    }

    public static void main(String[] args) {

        try {

            FlatDarculaLaf.setup();

        } catch (Exception e) {

            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {

            new GUICompilador().setVisible(true);
        });
    }
}