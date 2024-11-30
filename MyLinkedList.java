import java.util.NoSuchElementException;
import java.util.*;
public class MyLinkedList <E> implements ListInterface <E> {
    private Node <E> head;
    private int numNode;
    public MyLinkedList(){
        head = null;
        numNode = 0;
    }
    
    public void addFirst(E item){
        head = new Node<E>(item, head);
        numNode++;
    }
  
    public void addAfter(Node<E> curr, E item){
        if(curr == null){
            addFirst(item);
        }
        else{
            Node<E> newNode = new Node<E>(item, curr.getNext());
            curr.setNext(newNode);
            numNode++;
        }
    }
    
    public void addLast(E item){
        if(head == null){
            addFirst(item);
        }
        else{
            Node<E> tmp = head;
            while(tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            Node<E> newNode = new Node<E>(item, null);
            tmp.setNext(newNode);
            numNode++;
        }
    }
    
    public E removeFirst() throws NoSuchElementException{
        if(head == null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }
        else{   
            Node<E> tmp = head;
            head = head.getNext();
            numNode --;
            return tmp.getData();
        }
    }
   
    public E removeAfter(Node<E> curr) throws NoSuchElementException{
        if(curr == null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }
        else
        {
            Node<E> delNode = curr.getNext();
            if(delNode != null) {
               curr.setNext(delNode.getNext());
                numNode --;
                return delNode.getData();
            }
            else{
                throw new NoSuchElementException("No next node toremove");
            }
        }
    }
  
    public E removeLast() throws NoSuchElementException
    {
        if(head == null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }
        else{
            Node<E> preNode = null;
            Node<E> delNode = head;
            if(delNode.getNext() == null){
                return removeFirst();
            }
            while(delNode.getNext() != null){
                preNode = delNode;
                delNode = delNode.getNext();
            }
            preNode.setNext(delNode.getNext());
            numNode --;
            return delNode.getData();
        }
    }
   public E removeCurr(Node<E>curr) throws NoSuchElementException{
        if(head==null){
            throw new NoSuchElementException("Empty List");
        }
        else{
            Node<E> preNode = null;
            Node<E> delNode = head;
            while(delNode.getNext()!=null){
                if(delNode.getData()==curr.getData()){
                    break;
                }
                preNode=delNode;
                delNode = delNode.getNext();
            }
            if(preNode==null){
                return null;
            }
            else{
                preNode.setNext(delNode.getNext());
                numNode--;
            }
            return delNode.getData();
        }

   }
    public void print(){
        if(head != null){
            Node<E> tmp = head;
            System.out.print("List: " + tmp.getData());
            tmp = tmp.getNext();
            while(tmp != null)
            {
            System.out.print(" -> " + tmp.getData());
            tmp = tmp.getNext();
            }
            System.out.println();
        }
        else{
            System.out.println("List is empty!");
        }
    }
   
    public boolean isEmpty(){
        if(numNode == 0) return true;
        return false;
    }
  
    public E getFirst() throws NoSuchElementException{
    if(head == null){
        throw new NoSuchElementException("Can't get element from an empty list");

    }
    else{
        return head.getData();
    }
    } 
  
    public Node<E> getHead(){
        return head;
    }
    
    public int size(){
        return numNode;
    }
    
    public boolean contains(E item){
        Node<E> tmp = head;
        while(tmp != null){
            if(tmp.getData().equals(item))
                return true;
            tmp = tmp.getNext();
        }
        return false;
    }
    public int countEven(){
        int count = 0;
        for(Node<E> n = head; n!=null; n=n.getNext()){
            int x = (int)(n.getData());
            if(x%2==0){
                count++;
            }
        }
        return count;
        
    }
    public boolean checkIsPrime(int temp){
        boolean check = true;
        if(temp<=1){
            return false;
        }
        if(temp==2){
            return true;
        }
        else{
        for(int i=3; i<temp; i++){
            if(temp%i==0){
                check = false;
                break;
            }
        }
        }
         return check;
    }
    public int countPrime(){
          int count = 0;
        for(Node<E> n = head; n!=null; n=n.getNext()){
            int x = (int)(n.getData());
            if(checkIsPrime(x)==true){
                count++;
            }
            
        }
        return count;
        
    }
    public void addItem(Node<E> x){
        Node<E> check = null;
        for(Node<E> n = head; n!=null; n=n.getNext()){
            int a = (int)(n.getData());
            if(a%2==0){
                 check = n;
                 break;
            }
    }
    if(head.getData() == check.getData()){
        x.setNext(head);
        head=x;
        numNode++;
    }
    else{
        Node<E> delNode = head;
        Node<E> prevNode = null;
        while(delNode.getNext()!= null){
            if(delNode.getData()==check.getData()){
                prevNode.setNext(x);
                x.setNext(delNode);
                numNode++;
                break;
                
            }
            prevNode = delNode;
            delNode = delNode.getNext();

        }
         
    }
     
}
public int findMax(){
    int max = 0;
    for(Node<E> n = head; n!=null; n=n.getNext()){
            int a = (int)(n.getData());
           if(a>max){
            max = a;
           }
    }
    return max;
}

public void Reverse(){
    if(head==null){
        return;
    }
    else{
        Node<E> prev = null;
        Node<E> curr = head;
        while(curr!=null){
           Node<E> next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}

}

