package pilha;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        // criação da pilha 
        Stack<String> pilha = new Stack<>();
        
        // adicionando elementos na pilha
        pilha.push("Elemento 1");
        pilha.push("Elemento 2");
        pilha.push("Elemento 3");
        
        // remover o topo da pilha e exibir o elemento removido
             String elementoRemovido = pilha.pop();
        
        // exibindo o elemento removido
        System.out.println("Elemento removido: " + elementoRemovido);
        
        // exibindo o estado atual da pilha
        System.out.println("Estado atual da pilha: " + pilha);
    }
}
