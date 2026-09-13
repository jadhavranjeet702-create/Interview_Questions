import java.net.SocketOption;

class cstack{

    int front ;
    int[] arr;
    int rear;
    int currentsize;
    int maxsize;

    cstack(int size)
    {
        this.maxsize=size;
        this.arr = new int[maxsize];
        this.rear=-1;
        this.front=0;
        this.currentsize=-1;
    }

    public void insertdata(int data)
    {

        if(isfull())
        {
            System.out.println(" queue is full");
        }
        rear=(rear+1)%maxsize;
        arr[rear]=data;
        currentsize++;


    }
    public boolean isfull()
    {
        return (rear == maxsize-1);
    }



    public int removedata()
    {
        if(isemp())
        {
            System.out.println(" queue is empty ");
        }
        int f = arr[front];
        front=(front+1)%maxsize;

        currentsize --;
        return f;
    }

    public boolean isemp()
    {
        return (front == -1);
    }

    public void peek()
    {
        System.out.println(" front peek "+arr[front]);
    }

    public void display()
    {
        for(int e : arr)
        {
            System.out.print(" - "+e);
        }
    }

}




public class CircuQueue {

    public static void main(String[] args) {

        cstack st = new cstack(4);
        st.insertdata(10);
        st.insertdata(20);
        st.insertdata(30);
        st.insertdata(40);


        st.peek();

        System.out.println();


        st.display();

        System.out.println();

        System.out.println("removed element ="+st.removedata());

        System.out.println();

        st.peek();

//        st.display();



        System.out.println("removed element ="+st.removedata());
        System.out.println("removed element ="+st.removedata());
        System.out.println();
        st.insertdata(35);

        System.out.println("removed element ="+st.removedata());

//        st.display();


        st.peek();


    }

}

