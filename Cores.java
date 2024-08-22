package cores;

import java.util.ArrayList;
import java.util.List;

public class Cores {
    public static void main(String[] args) {
        // criar a lista
        List<String> cores = new ArrayList<>();
        
        // adicionar cores
        cores.add("Verde claro");
        cores.add("vermelho");
        cores.add("branco");
        
        // exibir a cor armazenada no segundo índice (índice 1)
        String corNoSegundoIndice = cores.get(1);
        System.out.println("Cor armazenada no segundo índice: " + corNoSegundoIndice);
    }
}
