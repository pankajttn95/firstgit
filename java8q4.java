import java.util.Scanner;

/**
 * Created by root on 26/6/17.
 */

// 4. Write a program to print a table of any number using lambda expression

        import java.util.Scanner;

interface LambdaDemo{

    public void printTable(int a);

}

public class java8q4 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number :");
        int num=input.nextInt();

        LambdaDemo obj=(int a)->{
            int i=0;
            while(++i<=10)
            {
                System.out.println(">>"+a*i);
            }
        };

        obj.printTable(num);

    }

}
