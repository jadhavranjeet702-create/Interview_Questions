class node{

    int data;
    node next;

    node(int data)
    {
        this.data=data;
        this.next=null;

    }
}

class stacklinked
{

    node top;

    stacklinked()
    {
        this.top=null;
    }


    public void addnode(int data)
    {
        node newnode = new node(data);

        newnode.next=top;
        top = newnode;

    }
    public int deletenode()
    {
        node temp=top;
        top=top.next;


        return temp.data;
    }

    public void peek()
    {
         System.out.print(top.data+" ");
    }


    public void display()
    {
        node dis=top;
        while (dis != null)
        {
            System.out.println(dis.data+" ");
            dis=dis.next;
        }
    }


}




public class StackusingLinkedlist {
    public static void main(String[] args) {

        stacklinked linked = new stacklinked();

        linked.addnode(10);
        linked.addnode(20);
        linked.addnode(30);
        linked.addnode(40);


        linked.display();
        System.out.println();

        linked.deletenode();

        System.out.println();

        linked.display();
    }
}
