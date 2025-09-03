import java.util.Queue;

public class CustomQueue {
    protected int[] data ;
    private final int DEFAULT_SIZE = 10;
    int end = 0;
    CustomQueue(){
        data = new int[DEFAULT_SIZE];

    }
CustomQueue(int size){
        data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is Empty");

        }
        int removed = data[0];
        for (int i = 1; i < end ; i++){
            data[i-1] = data[i];

        }
        end--;
        return removed;

    }
public void display(){
        for (int i = 0; i < end ; i++){
            System.out.println(data[i] + " ");

        }
    System.out.println("END");

}

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(10);
        queue.insert(45);
        queue.insert(25);
        queue.insert(43);
        queue.display();
    }}
