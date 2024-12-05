// Define a classe CopyCommand que estende a classe Command.
// Esse comando específico realiza a ação de copiar o texto selecionado no editor.
public class CopyCommand extends Command {

    // Construtor da classe CopyCommand, que recebe um objeto Editor e o passa para o construtor da classe pai.
    public CopyCommand(Editor editor) {
        super(editor);
    }

    // Implementação do método execute, que realiza a ação de copiar o texto selecionado no editor.
    @Override
    public boolean execute() {
        // Copia o texto selecionado no editor para a área de transferência (clipboard).
        editor.clipboard = editor.textField.getSelectedText();
        
        // Retorna 'false' indicando que a execução do comando foi bem-sucedida (sem necessidade de desfazer).
        return false;
    }
}
