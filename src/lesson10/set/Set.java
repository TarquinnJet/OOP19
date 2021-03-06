package lesson10.set;

public interface Set<E> {

 /**
     * Возвращает количество элементов в этом множестве.
     * @return количество элементов в этом множестве
     */
 int size();
 
 /**
     * Возвращает true</tt> если множество пустое.
     * @return true</tt> если множество пустое.
     */
    boolean isEmpty();
    
    /**
     * Возвращает true если множество содержит искомый элемент.
     * @param o искомый элемент(не может быть null)
     * @return true если множество содержит искомый элемент
     * @throws NullPointerException если искомый элемент null
     */
    boolean contains(E o);
    
    /**
     * Добавляет элемент в множество если такого элемента в множестве нет.
     * Если элемент в множестве есть - вызов оставляет множество в том же состоянии
     * и возвращает false.  
     *
     * @param e добавляемый элемент
     * @return true если элемент был добавлен
     * @throws NullPointerException если добавляемый элемент null
     */
    boolean add(E e);
    
    /**
     * Удаляет элемент из множества
     * Возвращает true если множество содержало 
     * удаляемый элемент.  
     *
     * @param o удаляемый элемент
     * @return true если множество содержало удаляемый элемент
     * @throws NullPointerException если удаляемый элемент null
     */
    boolean remove(E o);
    
    /**
     * Удаляет все элементы множества
     */
    void clear();
    
}