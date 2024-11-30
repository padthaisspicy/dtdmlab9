public class text {
     
    public static void main(String[]args)
    { 
          MyLinkedList<Integer> a = new MyLinkedList<>();
           a.addFirst(1);
           a.addLast(2);
           a.addLast(3);
           a.addLast(5);
           a.addLast(6);
           a.print();
           a.removeCurr(new Node<Integer>(5));
           a.print();
            System.out.println(a.countEven());
            System.out.println(a.countPrime());
            a.addItem(new Node<Integer>(11));
            a.print();
            System.out.println(a.findMax());
            a.Reverse();
            a.print();
            
    }
        
}
