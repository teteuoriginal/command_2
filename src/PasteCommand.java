// Define a classe PasteCommand que estende a classe Command.
// Esse comando espec�fico realiza a a��o de colar o texto da �rea de transfer�ncia no editor.
public class PasteCommand extends Command {

    // Construtor da classe PasteCommand, que recebe um objeto Editor e o passa para o construtor da classe pai.
    public PasteCommand(Editor editor) {
        super(editor);
    }

    // Implementa��o do m�todo execute, que realiza a a��o de colar o conte�do da �rea de transfer�ncia no editor.
    @Override
    public boolean execute() {
        // Verifica se a �rea de transfer�ncia est� vazia ou nula.
        // Se estiver, retorna 'false' indicando que a a��o de colar n�o foi realizada.
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        // Faz backup do estado atual do texto no editor antes de modificar.
        backup();

        // Insere o conte�do da �rea de transfer�ncia (clipboard) na posi��o do cursor no campo de texto (textField).
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());

        // Retorna 'true' indicando que o comando foi executado com sucesso.
        return true;
    }
}
