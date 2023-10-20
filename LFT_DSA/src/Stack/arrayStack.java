package Stack;

import java.util.Arrays;

public class arrayStack
{
    int MAX_SIZE=20;
    int[] stack=new int[MAX_SIZE];
    int top;

    arrayStack()
    {
        top=-1;
    }
    public void push(int val)
    {

        if(top==MAX_SIZE-1)
        {

            throw new IndexOutOfBoundsException("Stack Exceeds MAX SIZE [20]");
        }
        stack[++top]=val;
    }
    public int pop( )
    {
        return stack[top--];
    }
    public int peek()
    {
        return stack[top];
    }

    public void display()
    {
        System.out.println(Arrays.toString(stack));
    }

    public int gettop()
    {
        return top;
    }
}
