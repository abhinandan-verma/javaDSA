package Queue;

import java.util.Scanner;

public class circularQLL {
    static int max =4;
    static int[] queue = new int[max];
    static int front = -1;
    static int rear = -1;

    public static void enQueue(int item){
        if(front == -1 && rear == -1){
            front=0;
            rear =0;
            queue[rear] =item;
            System.out.println(item+" enqueued successfully");
        }else{
            if(front == (rear+1)%max){
                System.out.println("Overflow");
            }else{
                rear++;
                queue[rear] = item;
                System.out.println(item+" enqueued successfully");
            }
        }
    }

    private  static int dequeue(){
        if(front == -1 && rear == -1){
            System.out.println("Underflow ");
            return  -1;
        }else {
            if (front == rear){
                int v = queue[front];
                front =-1;
                rear = -1;
                return v;
            }else {
                int v = queue[front];
                front = (front+1)%max;
                return v;
            }
        }
    }
    private static void  displayQueue(){
        if (front == -1 ) {
            System.out.println("No queue found");
            return;
        }
        int i;
        for (i = front; i!= rear; i=(i+1)%max){
            System.out.println(queue[i]);
        }
        System.out.println(queue[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to circular queue using Array");
        int choice = 0;
        while (choice != -1) {
            System.out.println("Enter your choice");
             choice = sc.nextInt();
             switch (choice){
                 case 1 :
                     System.out.println("Enter the item to be enQueued");
                     int item = sc.nextInt();
                     enQueue(item);
                     break;
                 case 2 : int del = dequeue();
                     System.out.println(del + " dequeued successfully");
                    break;
                 case 3: displayQueue();
                    break;
                 default:
                     System.out.println("Enter legal choice");
             }

        }

    }


}
