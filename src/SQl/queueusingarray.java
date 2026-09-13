class queueproblem{

    int maxsize;
    int[] arr;
    int front;
    int rear;

    queueproblem(int size)
    {
        this.maxsize=size;
        this.arr = new int[maxsize];
        this.front=-1;
        this.rear=-1;

    }

    public void enqueue(int data)
    {
        if(rear == -1)
        {
            rear=0;
            front=0;
            arr[rear]=data;
        }else {

            arr[++rear]=data;
        }
    }

    public int dqueue()
    {
        return arr[front++];

    }

    public void peek()
    {
        System.out.println(" "+arr[front]);
    }
    public void displayqueue()
    {
        while (front <= rear)
        {
            System.out.println(arr[front++]);
        }
    }



}



public class queueusingarray {

    public static void main(String[] args) {

        queueproblem queue = new queueproblem(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println();

        System.out.println("befor remove");
        queue.peek();

       System.out.println();


       queue.dqueue();


        System.out.println();
      System.out.println("after remove");
        queue.peek();

        System.out.println("desplaying remove");
        System.out.println();

        queue.displayqueue();

    }
}


