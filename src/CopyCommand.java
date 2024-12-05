// Define a classe CopyCommand que estende a classe Command.
// Esse comando espec�fico realiza a a��o de copiar o texto selecionado no editor.
public class CopyCommand extends Command {

    // Construtor da classe CopyCommand, que recebe um objeto Editor e o passa para o construtor da classe pai.
    public CopyCommand(Editor editor) {
        super(editor);
    }

    // Implementa��o do m�todo execute, que realiza a a��o de copiar o texto selecionado no editor.
    @Override
    public boolean execute() {
        // Copia o texto selecionado no editor para a �rea de transfer�ncia (clipboard).
        editor.clipboard = editor.textField.getSelectedText();
        
        // Retorna 'false' indicando que a execu��o do comando foi bem-sucedida (sem necessidade de desfazer).
        return false;
    }
}
