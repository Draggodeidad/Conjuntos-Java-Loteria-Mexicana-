package Colecciones;

import java.util.Iterator;

public interface SetADT<T> {
    // Agregar un elemento al conjunto -Add
    public void add(T element);

    // addAll - anade elementos de un conjunto a otro
    public void addAll(SetADT<T> set);

    // removeRandom -eliminar elementos aleatorios del conjunto
    public T removeRandom();

    // remove - elimina un elemento especifico
    public void remove(T element);

    // union - combina los elementos de dos conjuntos para crear un tercero
    public SetADT<T> union(SetADT<T> set);

    // contains - determina si un elemento se encuentra dentro del conjunto
    public boolean contains(T target);

    // equals - determina si dos conjuntos contienen los mismos elementos
    public boolean equals(SetADT<T> set);

    // isEmpty - determina si el conjunto esta vacio
    public boolean isEmpty();

    // size - determina el numero de elementos en el conjuntos
    public int size();

    // iterator -permite adquirir y usar por turnos cada elemento del conjunto
    /*
     * hasNext - determina si hay elementos de iteracions
     * next - devuelve el siguiente elemento de la iteracion
     */
    public Iterator<T> iterator();

    // toString - representa al conjunto en forma de caracteres
    public String toString();

}
