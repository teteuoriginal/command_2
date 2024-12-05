// Define a classe CommandHistory, que gerencia o histórico de comandos executados.
import java.util.Stack;

public class CommandHistory {
    // Pilha (Stack) que armazena os comandos executados. A pilha garante que os comandos mais recentes
    // sejam acessados primeiro, útil para a funcionalidade de desfazer (undo).
    private Stack<Command> history = new Stack<>();

    // Método para adicionar um comando ao histórico (empurrar o comando para a pilha).
    public void push(Command c) {
        history.push(c);
    }

    // Método para remover e retornar o último comando adicionado ao histórico (tirar o comando do topo da pilha).
    // Isso permite desfazer a última ação.
    public Command pop() {
        return history.pop();
    }

    // Método que verifica se o histórico está vazio. Retorna 'true' se não houver comandos no histórico,
    // caso contrário, retorna 'false'.
    public boolean isEmpty() { 
        return history.isEmpty(); 
    }
}
