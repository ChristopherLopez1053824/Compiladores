import * as vscode from 'vscode';
import { exec } from 'child_process';

export function activate(context: vscode.ExtensionContext) {

    console.log('Encantia activo');

    let runCommand = vscode.commands.registerCommand(
        'encantia.run',
        () => {

            const editor = vscode.window.activeTextEditor;

            if (!editor) {

                vscode.window.showErrorMessage(
                    'No hay archivo abierto'
                );

                return;
            }

            const filePath =
                    editor.document.fileName;

            const jarPath =
                    '/home/christopher/Compiladores/Proyecto1Paraplugin/target/lab1-1.0-SNAPSHOT.jar';

            const terminal =
                    vscode.window.createTerminal(
                        'Encantia'
                    );

            terminal.show();

            terminal.sendText(
                `java -jar "${jarPath}" "${filePath}"`
            );
        }
    );

    context.subscriptions.push(runCommand);
}

export function deactivate() {}