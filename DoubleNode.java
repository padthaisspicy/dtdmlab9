public class DoubleNode{
    private double data;
    private Node next;
    public DoubleNode(){
        this.data = null;
        this.next = null;
    }
   public DoubleNode(double data){
    this.data = data;
   } 
   public DoubleNode(double data,  Node next){
    this.data = data;
    this.next = next;
   }
   public Node getNext(){
    return this.next;
   }
   public double getData(){
    return this.data;
   }
   public void setNext(Node next){
    this.next = next;
   }
}
