package linklist;

import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {
        // criação 
        LinkedList<String> lista = new LinkedList<>();
        
        // adicionando elementos na lista
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        
        // adicionando um elemento no início da lista
        lista.addFirst("Novo Elemento");
        
        // exibindo a lista completa
        System.out.println("Conteúdo da LinkedList:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
