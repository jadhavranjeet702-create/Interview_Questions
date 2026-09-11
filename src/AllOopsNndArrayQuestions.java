class larger{

    //36. CODING: Find the largest element in an integer array
    public void biggest() {


        int arr[] = {10, 15, 50, 25, 30};
        int large = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println("larger element = " + large);
    }
}

//37. CODING: Find the smallest element in an array.

class smallest{

    public void smallfind()
    {
        int arr[] = {10, 15, 50, 25, 30};
        int small = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("larger element = " + small);

    }
}

class average{

    //38. CODING: Find the sum and average of all elements in an array.

    public void avgandsum()
    {
        int arr[] = {10, 15, 50, 25, 30};
        int sum = 0;
        double avg;

        for(int i = 0 ; i <= arr.length-1; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(" sum of arr ="+sum);
        avg=sum/arr.length;
        System.out.println("avg = "+avg);
    }
}

class evodd {

    // CODING: Count the number of even and odd elements.

    public void evenodd()

    {


        int arr[] = {10, 15, 50, 25, 30};
        int even = 0;
        int odd = 0;

        for (int i = 0; i <= arr.length - 1; i++) {

            if(arr[i] % 2==0)
            {
                even ++;
            }else {
                odd ++;
            }
        }

        System.out.println(" sum of even ="+even+ "sum of odd"+odd);
    }
}

class reverce {

    //. CODING: Reverse an array without using another array.

    public void arrrev()

    {


        int arr[] = {10, 15, 50, 25, 30};

        int left = 0;
        int right = arr.length - 1;


        while(left < right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            right --;
            left ++;
        }

        for(int i = 0; i < arr.length ; i++)
        {
            System.out.print("  "+ arr[i]);
        }


    }

}

class secondlargest{
    //41. CODING: Find the second-largest element in an array.
    public void seclg()
    {
        int arr[] = {10, 15, 50, 25, 30};
        int larg=arr[0];
        int secondlarg=0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > larg )
            {
                secondlarg = larg;
                larg=arr[i];
            }
            else if (arr[i] > secondlarg)
            {
                secondlarg=arr[i];
            }
        }
        System.out.println();
        System.out.println("largest = "+larg+" second lagest "+secondlarg);
    }

}

class searchingele{

    //42. CODING: Search for a given element using linear search.
    int key=0;
    searchingele(int key)
    {
        this.key = key;
    }
    public void search()
    {

        int arr[] = {10, 15, 50, 25, 30};

        int found = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i]==key)
            {
                System.out.println("found ");
                found++;
                return;
            }
        }
        if(found == 0)
        {
            System.out.println(" not found");
        }
    }
}

class frequency{
    int key;

    frequency(int key)
    {
        this.key=key;
    }
//43. CODING: Count how many times a particular number occurs in an array.

    public void countfreq()
    {
        int arr[] = {10, 15, 50,50, 25, 30,50};
        int count=0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == key)
            {
                count ++;
            }
        }
        System.out.println("frequenct ="+count);

    }
}

class duplicate{
    //44. CODING: Find duplicate elements in an array.


    public void dupli()
    {
        int arr[] = {10, 15, 50, 25, 30,50};

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(" duplicate element ="+arr[i]);
                    break;
                }
            }
        }

    }
}

class combine{

    //45. CODING: Merge two integer arrays into a single array.
    public void merge()
    {
        int arr1[] = {10, 15, 50, 25, 30};
        int arr2[] = {10, 15, 50, 25, 30};



        int[] arr3 = new int[arr1.length+arr2.length];



        for(int i = 0 ; i < arr1.length ; i++)
        {
            arr3[i] = arr1[i];
        }

        for(int i = 0 ; i < arr2.length ; i++)
        {
            arr3[i+arr1.length] = arr2[i];
        }

        for(int i : arr3)
        {
            System.out.print( "  "+i);
        }

    }
}

class BankAccount {

    //29. CODING: Create a BankAccount class using encapsulation with accountNumber,
    // accountHolder, balance, deposit(), withdraw() and displayBalance().

    private String accountnumber;
    private String accountholder;
    private double balance;


    public void deposite(int amount)
    {
        if(amount <= 0 )
        {
            System.out.println("invalid amount");
        }else {
            balance += amount;
        }

    }

    public void withdrow(int amount) {
        if (amount > balance) {
            System.out.println("in sufficent fund");
        } else {
            balance =balance- amount;
        }
    }

    public void displayBalance()
    {
        System.out.println(" current balance ="+balance);
    }


}


class  Employee{

    //30. CODING: Create a parent class Employee and child classes
// Developer and Tester. Demonstrate inheritance and method overriding.
    public void work()
    {
        System.out.print(" employ working ");
    }


}

class devloper extends Employee{

    @Override
    public void work() {
        System.out.println("Devloper write code");
    }
}


class Tester extends Employee{

    @Override
    public void work() {
        super.work();
        System.out.println(" tester test code");
    }


}


class student{

    // 28. CODING: Create a Student class with name, rollNo, marks,
    // parameterized constructor and displayStudent() method.

    String name;
    int rollno;
    double marks;

    student(String name, int rollno , double marks)
    {
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }

    public void displaystudent()
    {
        System.out.println("Student name :"+name);
        System.out.println("Student rollno :"+rollno);
        System.out.println("Student marks :"+marks);
    }

}


public class AllOopsNndArrayQuestions {

    public static void main(String[] args) {

//        larger lg = new larger();
//        lg.biggest();
//
//        smallest sm = new smallest();
//        sm.smallfind();
//
//        average av = new average();
//        av.avgandsum();
//
//        evodd evod =new  evodd();
//        evod.evenodd();
//
//        reverce rev = new reverce();
//        rev.arrrev();
//
//        secondlargest secl =new  secondlargest();
//        secl.seclg();
//
//        searchingele se = new searchingele(55);
//        se.search();
//
//        frequency freq=new frequency(50);
//        freq.countfreq();
//
//        duplicate du = new duplicate();
//        du.dupli();

//        combine co = new combine();
//        co.merge();

        BankAccount acc = new BankAccount();
        acc.deposite(500);
        acc.displayBalance();

        acc.withdrow(100);

        acc.displayBalance();

        Employee dev = new devloper();
        dev.work();

        Tester tes = new Tester();
        tes.work();

//        Employee emp = new Employee();
//

        student stud = new student("ranjeet", 23052, 79.09);
        stud.displaystudent();
    }

}
