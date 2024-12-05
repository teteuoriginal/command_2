// Define a classe PasteCommand que estende a classe Command.
// Esse comando específico realiza a ação de colar o texto da área de transferência no editor.
public class PasteCommand extends Command {

    // Construtor da classe PasteCommand, que recebe um objeto Editor e o passa para o construtor da classe pai.
    public PasteCommand(Editor editor) {
        super(editor);
    }

    // Implementação do método execute, que realiza a ação de colar o conteúdo da área de transferência no editor.
    @Override
    public boolean execute() {
        // Verifica se a área de transferência está vazia ou nula.
        // Se estiver, retorna 'false' indicando que a ação de colar não foi realizada.
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        // Faz backup do estado atual do texto no editor antes de modificar.
        backup();

        // Insere o conteúdo da área de transferência (clipboard) na posição do cursor no campo de texto (textField).
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());

        // Retorna 'true' indicando que o comando foi executado com sucesso.
        return true;
    }
}
