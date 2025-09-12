import java.util.Scanner;

//implementation of binary tree
public class Implementation {
    private class Node{
        int value;
        Node left;
        Node right;
        Node(int value ){
            this.value = value;
        }
    }
    private Node root;
    //to insert
    public void populate(Scanner inp ){
        System.out.println("enter root node");
        int value = inp.nextInt();
        root =new Node(value);
        populate(inp,root);

    }
    private void populate(Scanner inp , Node node){
        System.out.println("do you want to enter left node: ");
        boolean left = inp.nextBoolean();
        if (left){
            System.out.println("enter the value of " + node);
            int value = inp.nextInt();
            node.left = new Node(value);
            populate(inp,node.left);

        }
        System.out.println("do you want to enter right node: ");
        boolean right = inp.nextBoolean();
        if (right){
            System.out.println("enter the value of right of " + node);
            int value = inp.nextInt();
            node.right = new Node(value);
            populate(inp,node.right);

        }
    }
    //display function
    public void display(){
        display(this.root, "");

    }
    public void display(Node node , String indent){
        if (node!=null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left , indent + "\t");
        display(node.right , indent + "\t");
    }

   public void prettyDisplay(){
        prettyDisplay(root,0);

   }
   public void prettyDisplay(Node node , int level){
        if (node == null ){
            return;

        }
        prettyDisplay(node.right,level+1);
            if (level!=0){
                for (int i = 0; i< level-1;i++){
                    System.out.print("|\t\t");

                }
                System.out.println("|------->" + node.value);
            }
            else {
                System.out.println(node.value);

            }
       }   }
