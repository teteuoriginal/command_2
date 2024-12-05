// Define a classe CommandHistory, que gerencia o hist�rico de comandos executados.
import java.util.Stack;

public class CommandHistory {
    // Pilha (Stack) que armazena os comandos executados. A pilha garante que os comandos mais recentes
    // sejam acessados primeiro, �til para a funcionalidade de desfazer (undo).
    private Stack<Command> history = new Stack<>();

    // M�todo para adicionar um comando ao hist�rico (empurrar o comando para a pilha).
    public void push(Command c) {
        history.push(c);
    }

    // M�todo para remover e retornar o �ltimo comando adicionado ao hist�rico (tirar o comando do topo da pilha).
    // Isso permite desfazer a �ltima a��o.
    public Command pop() {
        return history.pop();
    }

    // M�todo que verifica se o hist�rico est� vazio. Retorna 'true' se n�o houver comandos no hist�rico,
    // caso contr�rio, retorna 'false'.
    public boolean isEmpty() { 
        return history.isEmpty(); 
    }
}
