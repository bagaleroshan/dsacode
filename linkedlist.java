class LL{
    Node head;
    
    public class Node{
    
        String data;
        node next;
    
        Node(String data){
            this.data=data;
            this.next=null;
    
        }
    }
    public void insertBefore(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAfter(String data){
         Node newNode =new Node(data);
         if(head==null){
            head=newNode;
            return;
         }
         node lastNode=head;
         while(lastNode.next !=null){
            lastNode=lastNode.next;
         }
         lastNode.next=newNode;
    }
    public void printList(){
        Node currNode=head;
        while (currNode !=null){
            System.out.print(currNode.data+"");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL List=new LL();
        List.insertBefore("is");
        List.insertBefore("this");
        List.printList();
        l.insertAfter("a");
        l.printList();
    }
    }