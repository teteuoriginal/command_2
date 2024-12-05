
// Define uma classe abstrata chamada Command, que servirá de base para comandos específicos.
public abstract class Command {
    // Referência ao editor no qual o comando será executado.
    public Editor editor;
    
    // Variável que armazena o estado anterior do texto para suportar o comando de desfazer (undo).
    private String backup;

    // Construtor da classe Command que recebe um objeto Editor e o associa ao comando.
    Command(Editor editor) {
        this.editor = editor;
    }

    // Método para criar um backup do estado atual do editor antes de executar um comando.
    void backup() {
        backup = editor.textField.getText();
    }

    // Método para desfazer a última ação, restaurando o texto ao estado salvo no backup.
    public void undo() {
        editor.textField.setText(backup);
    }

    // Método abstrato que deve ser implementado pelas subclasses de Command.
    // Retorna um booleano para indicar se a execução foi bem-sucedida.
    public abstract boolean execute();
}
