// Define a classe CutCommand que estende a classe Command.
// Esse comando específico realiza a ação de cortar o texto selecionado no editor.
public class CutCommand extends Command {

    // Construtor da classe CutCommand, que recebe um objeto Editor e o passa para o construtor da classe pai.
    public CutCommand(Editor editor) {
        super(editor);
    }

    // Implementação do método execute, que realiza a ação de cortar o texto selecionado no editor.
    @Override
    public boolean execute() {
        // Verifica se há texto selecionado no editor.
        // Se não houver texto selecionado, retorna 'false' indicando que a ação de cortar não foi realizada.
        if (editor.textField.getSelectedText().isEmpty()) return false;

        // Faz backup do estado atual do texto no editor antes de modificar.
        backup();

        // Armazena o conteúdo completo do texto do editor.
        String source = editor.textField.getText();

        // Copia o texto selecionado para a área de transferência (clipboard).
        editor.clipboard = editor.textField.getSelectedText();

        // Atualiza o conteúdo do editor com o texto resultante do corte (removendo o texto selecionado).
        editor.textField.setText(cutString(source));

        // Retorna 'true' indicando que o comando foi executado com sucesso.
        return true;
    }

    // Método auxiliar que realiza a remoção do texto selecionado.
    // Retorna o texto original com a parte selecionada removida.
    private String cutString(String source) {
        // Divide o texto em duas partes: antes e depois da seleção.
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        
        // Retorna o texto concatenado sem a parte selecionada.
        return start + end;
    }
}
