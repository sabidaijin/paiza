public class singlelist {
    public static void main(String[] args){
        list list1=new list();
        Node node1=new Node();
        node1.data=1;
        list1.append(node1);
        list1.show();   N

    }
    
}

class Node{
    int data;
    Node next;

}

class list{
    Node head;
    void show(){
        System.out.println(this.head.data);
    }
    void append(Node node){
        if(this.head==null){
            this.head=node;
            return;
        }else{
            Node current=this.head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=node;
        
        }
         
    }
    void delete(){
        Node current=this.head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=null;
        
    }
}