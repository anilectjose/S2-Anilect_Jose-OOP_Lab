public class StackAsLinkedList {
 
    StackNode root;
 
    static class StackNode {
        int data;
        StackNode next;
 
        StackNode(int data) { this.data = data; }
    }
 
    public boolean isEmpty()
    {
        if (root == null) {
            return true;
        }
        else
            return false;
    }
 
    public void push(int data)
    {
        StackNode newNode = new StackNode(data);
 
        if (root == null) {
            root = newNode;
        }
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }
 
    public int pop()
    {
        int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is Empty");
        }
        else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }
 
    public int peek()
    {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return root.data;
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        StackAsLinkedList sll = new StackAsLinkedList();
 
        sll.push(10);
        sll.push(20);
        sll.push(30);
 
        System.out.println(sll.pop()
                           + " popped from stack");
 
        System.out.println("Top element is " + sll.peek());
    }
}


// import java.io.*;
// import java.util.*;
 
// class Test
// {  
//     // Pushing element on the top of the stack
//     static void stack_push(Stack<Integer> stack)
//     {
//         for(int i = 0; i < 5; i++)
//         {
//             stack.push(i);
//         }
//     }
     
//     // Popping element from the top of the stack
//     static void stack_pop(Stack<Integer> stack)
//     {
//         System.out.println("Pop Operation:");
 
//         for(int i = 0; i < 5; i++)
//         {
//             Integer y = (Integer) stack.pop();
//             System.out.println(y);
//         }
//     }
 
//     // Displaying element on the top of the stack
//     static void stack_peek(Stack<Integer> stack)
//     {
//         Integer element = (Integer) stack.peek();
//         System.out.println("Element on stack top: " + element);
//     }
     
//     // Searching element in the stack
//     static void stack_search(Stack<Integer> stack, int element)
//     {
//         Integer pos = (Integer) stack.search(element);
 
//         if(pos == -1)
//             System.out.println("Element not found");
//         else
//             System.out.println("Element is found at position: " + pos);
//     }
 
 
//     public static void main (String[] args)
//     {
//         Stack<Integer> stack = new Stack<Integer>();
 
//         stack_push(stack);
//         stack_pop(stack);
//         stack_push(stack);
//         stack_peek(stack);
//         stack_search(stack, 2);
//         stack_search(stack, 6);
//     }
// }