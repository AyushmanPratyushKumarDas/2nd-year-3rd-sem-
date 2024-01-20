public class Queue {
    public int q[]=new int[10];
    int rear = -1;
    int front = -1;
    public void enqueue(int n){
        if(front==(q.length-1)){
            System.out.println("Queue complete");
        }
        else{
            q[++front]=n;
            if(front==0){
                rear=0;
            }
        }
    }
    public void dequeue(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("dequeued number "+q[rear]);
            q[rear]=0;
            rear++;
        }
    }
    public void display(){
        for(int i = rear;i<=front;i++){
            System.out.print(q[i]+",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);q.enqueue(2);q.enqueue(3);q.enqueue(4);
        q.display();
        q.dequeue();
        q.display();
    }
}
