class qqnode{
    int data;
    qqnode next;

    qqnode(int data)
    {
        this.data=data;
        this.next=null;

    }
}


class linkedqueue{
    qqnode head;
    qqnode front;
    qqnode rear;


    linkedqueue()
    {
        this.front=null;
        this.rear=null;

    }

    public void enqueue(int data)
    {
        qqnode newnode = new qqnode(data);

        if(rear == null)
        {
            front = newnode;
            rear = newnode;
        }
        else {
            rear.next=newnode;
            rear=newnode;
        }
    }

    public void  dqueue(){

       front=front.next;

    }

    public void peek(){
       System.out.println(" "+front.data);
    }
}



public class queuelinkedlist {

    public static void main(String[] args) {

        linkedqueue qu = new linkedqueue();

        qu.enqueue(10);
        qu.enqueue(20);
        qu.enqueue(30);
        qu.enqueue(40);
        qu.enqueue(50);

        qu.peek();

      qu.dqueue();

      System.out.println(" ");
        qu.peek();
    }



}
