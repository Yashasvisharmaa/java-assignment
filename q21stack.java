import java.util.Scanner;

public class StackUsingArray {
    private static final int MAX_SIZE = 5;
    private int top;  
    private int[] stack;  
    public StackUsingArray() {
        stack = new int[MAX_SIZE];  
        top = -1;  
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push " + element);
        } else {
            stack[++top] = element;  
            System.out.println(element + " pushed onto the stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop");
            return -1;  
        } else {
            int poppedElement = stack[top--];  
            return poppedElement;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot peek");
            return -1;  
        } else {
            return stack[top];  
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No elements to display.");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;
                case 3:
                    int topElement = stack.peek();
                    if (topElement != -1) {
                        System.out.println("Top element: " + topElement);
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
