import java.util.Scanner;

public class QueueUsingArray {
    private static final int MAX_SIZE = 5; 
    private int front, rear;  
    private int[] queue;  

    public QueueUsingArray() {
        queue = new int[MAX_SIZE];  
        front = -1;  
        rear = -1;   
    }
    public boolean isFull() {
        return rear == MAX_SIZE - 1;
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + element);
        } else {
            if (front == -1) {
                front = 0;  
            }
            queue[++rear] = element;  
            System.out.println(element + " enqueued to the queue");
        }
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue");
            return -1;  
        } else {
            int dequeuedElement = queue[front++];  
            return dequeuedElement;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot peek");
            return ;
        } else {
            return queue[front];  
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No elements to display.");
        } else {
            System.out.println("Queue elements are:");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    int dequeued = queue.dequeue();
                    if (dequeued != -1) {
                        System.out.println("Dequeued element: " + dequeued);
                    }
                    break;
                case 3:
                    int frontElement = queue.peek();
                    if (frontElement != -1) {
                        System.out.println("Front element: " + frontElement);
                    }
                    break;
                case 4:
                    queue.display();
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
