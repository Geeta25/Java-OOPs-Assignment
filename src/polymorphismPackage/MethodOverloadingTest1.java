package polymorphismPackage;

import java.util.Scanner;

public class MethodOverloadingTest1 {

    //Find the largest of 2 numbers and largest of 3 numbers(Apply method overloading concept)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        MethodOverloading1 methodOverloading1=new MethodOverloading1();
        methodOverloading1.findLargestNum(num1,num2);
        methodOverloading1.findLargestNum(num1,num2,num3);

    }
}
