package cidades;

import java.util.ArrayList;
import java.util.List;

public class Cidades {
    public static void main(String[] args) {
        // cria uma lista para armazenar os nomes das cidades
        List<String> cidades = new ArrayList<>();
        cidades.add("Campinas");
        cidades.add("Americana");
        cidades.add("Ribeirão Preto");

        // exibe os nomes das cidades no console
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}
