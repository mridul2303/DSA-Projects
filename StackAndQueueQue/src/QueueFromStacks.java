import java.util.Stack;
//basically we are making queue from two stacks
public class QueueFromStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;
    QueueFromStacks(){
        first = new Stack<>();
        second = new Stack<>();
    }

    //items are added in same way
    public void add(int item){
        first.push(item);
    }
    //first we empty first stack and add take first element to second so
    //that lower one come to the first
    //then after storing value in removed
    //do the opposite
    public int remove()throws Exception{
        while (!first.isEmpty()){
            second.push(first.pop());

        }
        int removed = second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());

        }
        return removed;

    }
public int peek()throws Exception{
    while (!first.isEmpty()){
        second.push(first.pop());

    }
    int peeked = second.peek();
    while (!second.isEmpty()){
        first.push(second.pop());

    }
    return peeked;
}
}
//we can make remove efficient but then add will not be efficient