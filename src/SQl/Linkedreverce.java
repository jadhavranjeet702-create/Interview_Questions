class rnode {
    int data;
    rnode next;

    rnode(int data) {
        this.data = data;
        this.next = null;
    }

}

class revnode{

    rnode head;
    public void addnodes(int data)
    {
        rnode newnode = new rnode(data);


        newnode.next=head;
        head=newnode;

    }

    public void reverce()
    {
        rnode prev = null;
        rnode current = head;
        while (current != null)
        {
            rnode newnode = current.next;
            current.next=prev;
            prev = current;
            current = newnode;

        }

        while (prev != null)
        {
            System.out.print(prev.data+" -->");
            prev=prev.next;
        }

    }


    public void display()
    {
        rnode temp=head;

        while (temp != null){
            System.out.print(temp.data+"-->");

            temp=temp.next;
        }

    }
}



public class Linkedreverce {

    public static void main(String[] args) {
        revnode rev = new revnode();

        rev.addnodes(10);
        rev.addnodes(20);
        rev.addnodes(30);
        rev.addnodes(40);
        rev.addnodes(50);
        rev.display();

        System.out.println();

        rev.reverce();
    }





}
