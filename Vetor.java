package vetor;

import java.util.Vector;

public class Vetor {
    public static void main(String[] args) {
        // criação vetor de inteiros
        Vector<Integer> vetor = new Vector<>();
        
        // adicionando quatro elementos no vetor
        vetor.add(10);
        vetor.add(15);
        vetor.add(20);
        vetor.add(25);
        
        // exibindo o conteúdo do vetor
        System.out.println("Conteúdo do Vector:");
        for (Integer elemento : vetor) {
            System.out.println(elemento);
        }
    }
}
