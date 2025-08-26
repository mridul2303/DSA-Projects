//Doubly Linked List
public class Dll {
    Node head;

    public void inputFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.pre = null;
        if (head!=null){
            head.pre = node;

        }
        head = node;
    }
public void display(){
        Node node = head;
        while (node!=null){
            System.out.println(node.val+" -> ");
            node = node.next;
        }
    System.out.println("END");}


    private class Node{
        int val;
        Node pre;
        Node next;
        Node(int val){
            this.val = val;
        }
    Node(int val, Node pre , Node next){
        this.val= val;
        this.next = next;
        this.pre = pre;
        }
    }
}
