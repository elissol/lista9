package colecao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Colecao implements Collection<Integer> {
    private ArrayList<Integer> lista;

    // construtor
    public Colecao() {
        this.lista = new ArrayList<>();
    }

    // adicionar elementos
    @Override
    public boolean add(Integer elemento) {
        return lista.add(elemento);
    }

     @Override
    public int size() {
        return lista.size();
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return lista.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return lista.iterator();
    }

    @Override
    public Object[] toArray() {
        return lista.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return lista.toArray(a);
    }

    @Override
    public boolean remove(Object o) {
        return lista.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return lista.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return lista.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return lista.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return lista.retainAll(c);
    }

    @Override
    public void clear() {
        lista.clear();
    }

    // método principal para testar a coleção personalizada
    public static void main(String[] args) {
        Colecao colecao = new Colecao();

        // adicionando elementos
        colecao.add(10);
        colecao.add(11);
        colecao.add(12);
        colecao.add(13);
        colecao.add(14);

        // exibir o número total de elementos
        System.out.println("Número total de elementos na coleção: " + colecao.size());
    }
}
