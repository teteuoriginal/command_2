// Define a classe CutCommand que estende a classe Command.
// Esse comando espec�fico realiza a a��o de cortar o texto selecionado no editor.
public class CutCommand extends Command {

    // Construtor da classe CutCommand, que recebe um objeto Editor e o passa para o construtor da classe pai.
    public CutCommand(Editor editor) {
        super(editor);
    }

    // Implementa��o do m�todo execute, que realiza a a��o de cortar o texto selecionado no editor.
    @Override
    public boolean execute() {
        // Verifica se h� texto selecionado no editor.
        // Se n�o houver texto selecionado, retorna 'false' indicando que a a��o de cortar n�o foi realizada.
        if (editor.textField.getSelectedText().isEmpty()) return false;

        // Faz backup do estado atual do texto no editor antes de modificar.
        backup();

        // Armazena o conte�do completo do texto do editor.
        String source = editor.textField.getText();

        // Copia o texto selecionado para a �rea de transfer�ncia (clipboard).
        editor.clipboard = editor.textField.getSelectedText();

        // Atualiza o conte�do do editor com o texto resultante do corte (removendo o texto selecionado).
        editor.textField.setText(cutString(source));

        // Retorna 'true' indicando que o comando foi executado com sucesso.
        return true;
    }

    // M�todo auxiliar que realiza a remo��o do texto selecionado.
    // Retorna o texto original com a parte selecionada removida.
    private String cutString(String source) {
        // Divide o texto em duas partes: antes e depois da sele��o.
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        
        // Retorna o texto concatenado sem a parte selecionada.
        return start + end;
    }
}
