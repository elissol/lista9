package minhacolecao;

import java.util.Iterator;
import java.util.NoSuchElementException;

// classe que representa uma coleção personalizada
public class MinhaColecao<T> implements Iterable<T> {
    private Node<T> head;
    private int size;

    // Nó interno para armazenar os elementos
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // construtor da coleção
    public MinhaColecao() {
        this.head = null;
        this.size = 0;
    }

    // método para adicionar elementos à coleção
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // implementação do método iterator() da interface iterable
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    // método mostrar o tamanho da coleção
    public int size() {
        return size;
    }

    // método testar coleção
    public static void main(String[] args) {
        MinhaColecao<String> colecao = new MinhaColecao<>();
        colecao.add("Elemento 1");
        colecao.add("Elemento 2");
        colecao.add("Elemento 3");

        // usar um loop for-each
        System.out.println("Conteúdo da coleção:");
        for (String elemento : colecao) {
            System.out.println(elemento);
        }
    }
}
