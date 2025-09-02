public class DynamicStack extends CustomStack{

    DynamicStack(){
        super();//this will call CustomStack()

    }
    DynamicStack(int size){
        super();//this will call CustomStack(int size)

    }

    @Override
    public boolean push(int item) {
        if (this.isFull()){
            //double the array size
            int[] temp = new int[data.length*2];
            // copy all previous item in new data
            for (int i = 0; i< data.length ; i ++){
                temp[i] = data[i];

            }
        data = temp;
        }
        //at this point we know that it is not full
        //insert item
        return super.push(item);
    }
}
