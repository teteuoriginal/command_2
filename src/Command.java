
// Define uma classe abstrata chamada Command, que servir� de base para comandos espec�ficos.
public abstract class Command {
    // Refer�ncia ao editor no qual o comando ser� executado.
    public Editor editor;
    
    // Vari�vel que armazena o estado anterior do texto para suportar o comando de desfazer (undo).
    private String backup;

    // Construtor da classe Command que recebe um objeto Editor e o associa ao comando.
    Command(Editor editor) {
        this.editor = editor;
    }

    // M�todo para criar um backup do estado atual do editor antes de executar um comando.
    void backup() {
        backup = editor.textField.getText();
    }

    // M�todo para desfazer a �ltima a��o, restaurando o texto ao estado salvo no backup.
    public void undo() {
        editor.textField.setText(backup);
    }

    // M�todo abstrato que deve ser implementado pelas subclasses de Command.
    // Retorna um booleano para indicar se a execu��o foi bem-sucedida.
    public abstract boolean execute();
}
