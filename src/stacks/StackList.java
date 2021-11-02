package stacks;

import java.util.Iterator;


/**
 * A parameterized class which implements Iterable. StackList is a singly
 * linked list / stack used to store internet URLs as Strings. StackList has 2 inner classes StackIterator
 * and Node, which are used in structuring the data passed to StackList.
 *
 *
 * @author Ali Zargari
 */
public class StackList<T> implements Iterable<T>{

    // holds the string name of the element in stack
    private String name;

    // top most element/Node in the StackList
    private Node top;

    // Number of elements in the stack.
    private int size;

    /**
     * This function places an item of type generic parameter T on the top of the stack.
     *
     * @param t will be the new item at the top of the stack.
     */
    public void push(T t){
        Node temp = new Node(t);
        temp.next = top;
        top = temp;
        size++;

    }

    /**
     * This function simply sets the top variable to null, removing the top most
     * element in the stack, while updating other stats such as size.
     *
     */
    public T pop(){
        if (isEmpty())
            return null;

        Node temp = top;
        top = top.next;
        size--;
        return temp.data;

    }

    /**
     * If the stack isn't empty, the data type at the top will be returned by this method.
     *
     * @return The data type for the data seen at the top of the stack.
     */
    public T peek(){
        if (isEmpty())
            return null;

        return top.data;
    }

    /**
     * Clears the stack. Sets top to null and size to 0.
     */
    public void clear(){
        top = null;
        size = 0;
    }

    /**
     * Returns a stringified version of the StackList. Prints the information of each element
     * in the stack
     *
     * @return A string version of this stack.
     */
    public String toString(){

        Node link = top;
        String temp = "[";


        while (link != null) {

            temp += link.data.toString();
            link = link.next;

            if (size() > 1) {
                temp += ", ";
            }
        }
        temp += "]";

        return temp.replaceAll(", ]", "]");
    }


    /**
     * Returns true if the stack is empty. False if not empty
     *
     * @return False if size is not 0, true if it is 0.
     */
    public boolean isEmpty(){
        return (size == 0);
    }

    /**
     * Accessor for the size variable.
     *
     * @return the size variable. Number of elements in stack.
     */
    public int size(){
        return size;
    }

    /**
     * Returns a StackIterator to be used in properly iterating through a StackList.
     *
     * @return A modified iterator meant for iterating through a StackList of type T.
     */
    public Iterator<T> iterator() {

        return new StackIterator();
    }

    /**
     * Node is used to store the data being processed by StackList.
     * Holds a pointer to the next Node, and an object of generic type T.
     *
     */
    private class Node {
        Node next;  // Contains next item.
        T data;  // Data of type T being held in Node

        /**
         * Constructor for Node
         *
         * @param data is the data to be held by this object.
         */
        Node(T data){
            this.next = null;
            this.data = data;
        }

    }

    /**
     * An object of inner class StackIterator helps iterate through a stack of type T.
     * Is an Iterator, will have next and hasNext functions.
     *
     * */
    private class StackIterator implements Iterator<T>{

        /**
         * The current Node
         */
        private Node current;

        /**
         * Constructor used to initialize current
         */
        public StackIterator(){

            current = top;
        }

        /**
         * Returns true if there is a next item in the stack. It returns false if
         * we are at the end of our list.
         *
         * */
        @Override
        public boolean hasNext() {
            return (current != null);
        }


        /**
         * Returns the "next" item in the StackIterator. "next" here is referring to the data that
         * our "cursor" just went over. It will start from the first item, and go all the way to last.
         */
        @Override
        public T next() {
            T temp = current.data;
            current = current.next;
            return temp;
        }
    }
}
