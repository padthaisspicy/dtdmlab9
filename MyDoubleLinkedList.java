import java.util.NoSuchElementException;

import javax.naming.NoPermissionException;

import java.util.*;
public class MyDoubleLinkedList{
    private DoubleNode head;
    private int numNode;
    public MyDoubleLinkedList(){
        this.node = null;
        numNode = 0;
    }
    public void addFirst(double data){
        head = new DoubleNode(data, head);
        numNode++;
    }
    public void remove(DoubleNode data){
        if(head==null){
            throw new NoPermissionException("Empty List");
        }
        else{
            DoubleNode delNode = head;
            DoubleNode preNode = null;
            while(delNode.getNext()!= null){
                if(delNode.getData()==data.getData()){
                    break;
                }
                preNode=delNode;
                delNode = delNode.getNext();
            }
            preNode.setNext(delNode.getNext());
        }
    }
}