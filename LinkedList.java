import java.util.*;
import java.util.NoSuchElementException;
public class LinkedList<E> implements CM307List<E> 
{
    private int size = 0;
    private Node<E> head = null;
    private class Node<E>
    {
        private E data = null;
        private Node<E> next = null;

        private Node(E data, Node <E> next)
        {
            this.data = data;
            this.next = null;
        }

        private Node()
        {

        }
    }
    public int size()
    {
        return this.size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public void add(E data)
    {
        Node<E> newNode = new Node<E>();
        newNode.data = data;
        if(head == null)
        {
            head = newNode;
            size++;
        }
        else
        {
            Node<E> curr = head;
            while(curr.next!= null) 
            curr = curr.next;
            curr.next = newNode;
            size++;
        }
    }

    public E get(int n) throws NoSuchElementException
    {
        if(n < 0 || n > size) throw new NoSuchElementException();
        Node<E> curr = head;
        for(int k = 0; k < n; k++)curr = curr.next;
        return curr.data;
    }

    public E remove(int n) throws NoSuchElementException
    {
        if(n<0 || n>=size) throw new NoSuchElementException();
        E data;
        if(n==0)
        {
            data=head.data;
            head=head.next;
            size--;
        }
        else 
        {
            Node<E> prev=head;
            for(int k=0; k<n-1; k++) prev=prev.next;
            data=prev.next.data;
            prev.next =prev.next.next;
            size--;
        }
        return data;
    }

    public void insert(int n, E data)throws NoSuchElementException
    {
        if(n<0 || n>size)throw new NoSuchElementException();
        Node<E> newNode = new Node<E>();

        newNode.data = data;
        if(n==0)
        {
            newNode.next= head;
            head=newNode;
            size++;
        }
        else
        {
            Node<E> prev=head;
            for(int k=0; k<n-1; k++) prev=prev.next;
            
            newNode.next = prev.next;
            prev.next = newNode;
            size++;

        }
    }

    public String toString()
    {
        
        String s="List has " + size + " elements: \n";
        Node<E> curr= head;
        for(int k=0; k<size;k++)
        {
            s= s + k + ")" + curr.data + "  ";
            curr=curr.next; 
        }
        return s;
    }
}
