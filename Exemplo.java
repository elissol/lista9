package exemplo;

import java.util.Arrays;

public class Exemplo {
    public static void main(String[] args) {
        // cria um array de strings
        String[] cidades = { "São Paulo", "Bahia", "Amazonas", "Rio de Janeiro", "Alagoas" };

        // ordena o array
        Arrays.sort(cidades);

        // exibe o array ordenado
        System.out.println("Array ordenado:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }

        // elemento a ser buscado
        String elementoParaBuscar = "Alagoas";

        // busca o elemento no array
        int resultado = Arrays.binarySearch(cidades, elementoParaBuscar);

        // verifica o resultado da busca
        if (resultado >= 0) {
            System.out.println("\nElemento encontrado na posição: " + resultado);
        } else {
            System.out.println("\nElemento não encontrado.");
        }
    }
}

