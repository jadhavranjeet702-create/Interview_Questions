class stack{

    int maxsize;
    int[] arr;
    int top;


    stack(int size)
    {
        this.maxsize=size;
        this.arr = new int[maxsize];
        this.top=-1;

    }


    public void addstack(int data)
    {
        arr[++top]=data;
    }
    public int delete()
    {
        return arr[top--];
    }

    public int peek()
    {
        return arr[top];
    }

}


public class Stackpractice {

    public static void main(String[] args) {
        stack st = new stack(3);

        st.addstack(10);
        st.addstack(20);
        st.addstack(30);

        System.out.println("befir remote ="+st.peek());

        st.delete();

        System.out.println("after remote ="+st.peek());
    }

}
