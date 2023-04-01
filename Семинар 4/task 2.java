public class LinkedQueue<E> implements Queue<E> {
    private int count;
    private Node<E> front, rear;
 
    public LinkedQueue() {
       count = 0;
       front = rear = null;
    }
 
    public void enqueue (E element) {
       Node<E> node = new Node<E> ();
 
       if (isEmpty())
          front = node;
       else
          rear.setNext (node);
 
       rear = node;
       count++;
    }
 
    public E dequeue() throws QueueEmptyException {
       if (isEmpty())
          throw new QueueEmptyException  ("queue");
 
       E result = front.getElement();
       front = front.getNext();
       count--;
 
       if (isEmpty())
          rear = null;
 
       return result;
 
    }
 
    public E first() throws QueueEmptyException {
       if (isEmpty())
          throw new QueueEmptyException ("queue"); 
 
       return front.getElement();
    }
 
 
    public boolean isEmpty() {
       return (front == rear);
    }
 
 
    public int size() {
       return count;
    }
 
 
     public E front() throws QueueEmptyException {       
         if (isEmpty())
             throw new QueueEmptyException("Queue underflow.");
         return (E) front.getNext();
     }
 }