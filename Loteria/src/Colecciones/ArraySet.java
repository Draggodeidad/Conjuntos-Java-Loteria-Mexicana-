package Colecciones;

import java.util.Iterator;
import java.util.Random;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class ArraySet<T> implements SetADT<T> {

    private static Random rand = new Random();
    private final int DEFAULT_CAPACITY = 50;
    private final int NOT_FOUND = -1;
    private int count;
    private T[] contents;

    public ArraySet() {
        count = 0;
        contents = (T[]) (new Object[DEFAULT_CAPACITY]);

    }

    public ArraySet(int inicialCapacity) {
        count = 0;
        contents = (T[]) (new Object[inicialCapacity]);
    }

    // Agregar un elemento al conjunto -Add
    public void add(T element) {
        if ((!contains(element))) {
            if (size() == contents.length) {
                expandCapacity();
            }
            contents[count] = element;
            count++;
        }
    }

    private void expandCapacity() {
        T[] large = (T[]) (new Object[contents.length * 2]);

        for (int index = 0; index < contents.length; index++) {
            large[index] = contents[index];
        }
        contents = large;
    }

    // addAll - anade elementos de un conjunto a otro
    public void addAll(SetADT<T> set) {
        Iterator<T> scan = set.iterator();
        while (scan.hasNext()) {
            add(scan.next());
        }
    }

    // removeRandom -eliminar elementos aleatorios del conjunto
    public T removeRandom() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int choice = rand.nextInt(count);
        T result = contents[choice];
        contents[choice] = contents[count - 1];
        contents[count - 1] = null;
        count--;
        return result;

    }

    // remove - elimina un elemento especifico
    public T remove(T element) throws EmptyStackException, NoSuchElementException {

        int search = NOT_FOUND;
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        for (int index = 0; index < count && search == NOT_FOUND; index++) {
            if (contents[index].equals(element)) {
                search = index;
            }
        }
        if (search == NOT_FOUND) {
            throw new NoSuchElementException();
        }

        T result = contents[search];
        contents[search] = contents[count - 1];
        contents[count - 1] = null;
        count--;
        return result;
    }

    // union - combina los elementos de dos conjuntos para crear un tercero
    public SetADT<T> union(SetADT<T> set) {
        ArraySet<T> botch = new ArraySet<>();
        for (int index = 0; index < count; index++) {
            botch.add(contents[index]);
        }
        Iterator<T> scan = set.iterator();
        while (scan.hasNext()) {
            botch.add(scan.next());
        }
        return botch;
    }

    // contains - determina si un elemento se encuentra dentro del conjunto
    public boolean contains(T target) {
        int search = NOT_FOUND;

        for (int i = 0; i < count && search == NOT_FOUND; i++) {
            if (contents[i].equals(target)) {
                search = i;

            }
        }

        return (search != NOT_FOUND); // true si se encuentra el elemento, false si no

    }

    // equals - determina si dos conjuntos contienen los mismos elementos
    public boolean equals(SetADT<T> set) {
        boolean result = false;

        ArraySet<T> temp1 = new ArraySet<>();
        ArraySet<T> temp2 = new ArraySet<>();
        T obj;

        if (size() == set.size()) {
            temp1.addAll(this);
            temp2.addAll(set);
            Iterator<T> scan = set.iterator();

            while (scan.hasNext()) {
                obj = scan.next();

                if (temp1.contains(obj)) {
                    temp1.remove(obj);
                    temp2.remove(obj);
                }
            }
            result = (temp1.isEmpty() && temp2.isEmpty());

        }
        return result;
    }

    // isEmpty - determina si el conjunto esta vacio
    public boolean isEmpty() {
        return count == 0;
    }

    // size - determina el numero de elementos en el conjuntos
    public int size() {
        return count;
    }

    // iterator -permite adquirir y usar por turnos cada elemento del conjunto
    /*
     * hasNext - determina si hay elementos de iteracions
     * next - devuelve el siguiente elemento de la iteracion
     */
    public Iterator<T> iterator() {
        return new ArrayIterator<T>(count, contents);
    }

    // toString - representa al conjunto en forma de caracteres
    public String toString() {
        String result = "";
        for (int index = 0; index < count; index++) {
            result = result + contents[index].toString() + "\n";
        }
        return result;
    }
}
