import java.util.NoSuchElementException;

public class DinamicList<T> {
    private int cont;
    private No<T> first;
    private No<T> last;

    public DinamicList(){
        first = null;
        last = null;
        cont = 0;
    }
    public T get(int i) {
        if (i < 0 || i >= cont) {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista");
        }

        No<T> aux = first;
        for (int j = 0; j < i; j++) {
            aux = aux.next;
        }

        return aux.data;

    }

    public void add(T elemento){
        No<T> novo = new No<>(elemento);
        if (first == null){
            first = novo;
            last = novo;
            novo.next = null;

        }
        else {
            last.next = novo;
            last = novo;
        }
        cont++;
    }
    public void remove(int pos) {
        if (pos < 0 || pos >= size()) {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista");
        }

        No<T> aux = first;
        No<T> before = null;

        for (int i = 0; i < pos; i++) {
            before = aux;
            aux = aux.next;
        }

        if (before == null) {
            first = aux.next;
        } else if (aux == last) {
            last = before;
            last.next = null;
        } else {
            before.next = aux.next;
        }

        cont--;
    }

    public void set(int num, T elem) {
        if (num >= cont || num < 0) {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista");
        }

        No<T> novo = new No<>(elem);
        No<T> aux = first;

        for (int i = 0; i < num; i++){
            aux = aux.next;
        }
        aux.data = novo.data;
    }

    public void add(int pos, T elemento){
        No<T> novo = new No<>(elemento);
        No<T> aux = first;
        int i = 0;
        if (pos == 0){
            novo.next = aux;
            first = novo;
        }
        else {
            while (i < pos - 1) {
                aux = aux.next;
                i++;
            }
            novo.next = aux.next;
            aux.next = novo;
        }
        cont++;
    }
    public void clear(){
        cont = 0;
        first = null;
        last = null;
    }
    public int indexOf(T element){
        No<T> aux = first;
        for (int i = 0; i < cont; i++){
            if (aux.data.equals(element)){
                return i;
            }
            aux = aux.next;
        }
        return -1;
    }
    public int size(){
        return cont;
    }
    public boolean contains(T elemento){
        No<T> aux = first;
        for (int i = 0; i < cont; i++){
            if (aux.data.equals(elemento)){
                return true;
            }
            aux = aux.next;
        }
        return false;
    }
    public void addFirst(T element){
        No<T> novo = new No<>(element);
        if (first == null){
            first = novo;
            last = novo;
        }
        else {
            novo.next = first;
            first = novo;
        }
        cont++;
    }

    public void addLast(T element){
        No<T> novo = new No<>(element);
        if (first == null){
            first = novo;
            last = novo;
            novo.next = null;
        }
        else {
            last.next = novo;
            last = novo;
        }
        cont++;
    }
    public void removeFirst(){
        if (first == null) {
            throw new NoSuchElementException("A lista está vazia");
        }
        No<T> aux = first;
        first = aux.next;

        if (first == null) {
            last = null;
        }
        cont--;
    }

    public void removeLast(){
        if (first == null) {
            throw new NoSuchElementException("A lista está vazia");
        }

        if (first == last) {
            first = last = null;
        } else {
            No<T> aux = first;
            No<T> before = null;

            while (aux.next != null) {
                before = aux;
                aux = aux.next;
            }

            last = before;
            last.next = null;
        }

        cont--;
    }
    @Override
    public String toString() {
        No<T> aux = first;
        StringBuilder str = new StringBuilder();
        while (aux != null){
            str.append(aux.data).append(" ");
            aux = aux.next;
        }
        return str.toString();
    }
}
