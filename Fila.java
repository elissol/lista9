package fila;

import java.util.ArrayDeque;
import java.util.Deque;

public class Fila {
    public static void main(String[] args) {
        // criação da fila usando ArrayDeque
        Deque<String> fila = new ArrayDeque<>();
        
        // adicionando elementos na fila
        fila.add("Elemento 1");
        fila.add("Elemento 2");
        fila.add("Elemento 3");
        
        // remover e exibir o primeiro elemento inserido
        // o primeiro elemento inserido é o que será removido com o método removeFirst()
        String primeiroElemento = fila.removeFirst();
        
        // exibindo o primeiro elemento removido
        System.out.println("Primeiro elemento removido: " + primeiroElemento);
        
        // exibindo o estado atual da fila
        System.out.println("Estado atual da fila: " + fila);
    }
}
