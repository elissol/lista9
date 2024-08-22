package ordenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenar {
    public static void main(String[] args) {
        // criação da lista 
        List<String> lista = new ArrayList<>();
        
        // adicionando elementos
        lista.add("melancia");
        lista.add("morango");
        lista.add("abacaxi");
        lista.add("manga");
        
        // exibindo a lista antes de ordenar
        System.out.println("Lista antes da ordenar:");
        for (String fruta : lista) {
            System.out.println(fruta);
        }
        
        // ordenar a lista em orden decrescente
        Collections.sort(lista, Collections.reverseOrder());
        
        // exibir a lista
        System.out.println("\nLista após colocar em ordem decrescente:");
        for (String fruta : lista) {
            System.out.println(fruta);
        }
    }
}
