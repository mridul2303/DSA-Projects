public class LL {

    private Node head ;
    private Node tail;

    private int size;
    public LL(){
        this.size = 0;

    }
    //to insert first element
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;

        }
        size += 1;
    }
    //to display
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;

        }
        System.out.println("END");
    }
    //to insert at last index
    public void insertLast(int value){
        if (tail == null){
            insertFirst(value);
return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;

    }
    //to insert at particular index
    public void insert(int value,int index){
        if (index == 0){
            insertFirst(value);
            return;
        }
        if (index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1 ; i < index ; i ++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }
    //to delete first element
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head==null){
            tail = null;
        }
        size --;
        return val;
    }
    //to get value of particular index
    public Node get (int index){
        Node node = head;
        for (int i = 0 ; i < index ; i++){
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }
        Node secondlast = get(size-2);
        int val = tail.value;
        tail = secondlast;
        return val;
    }
    //to delete particular index value
    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;


        return val;
    }

    //to remove duplicate

    public void removeDuplicate(){
        Node node = head;
        while (node.next!=null){
            if (node.value==node.next.value){
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //merging two linked lists in ascending order
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();
        while (f!= null && s!= null){
            if (f.value<s.value){
                ans.insertLast(f.value);
                f =f.next;

            }
            else {
                ans.insertLast(s.value);
                s=s.next;
            }
            while (f!=null){
                ans.insertLast(f.value);
                f = f.next;

            }
            while (s!=null){
                ans.insertLast(s.value);
                s = s.next;

            }
        }
        return ans;

    }
    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;


        }
    }
}
