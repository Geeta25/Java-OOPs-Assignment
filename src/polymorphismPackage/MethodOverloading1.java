package polymorphismPackage;

public class MethodOverloading1 {

    static void findLargestNum(int num1,int num2){
        if (num1!=num2) {
            if (num1 > num2) {
                System.out.println("Largest number is: " + num1);
            } else {
                System.out.println("Largest number is: " + num2);
            }
        }
        else{
            System.out.println("Both numbers are equal");
        }
    }

    static void findLargestNum(int num1,int num2,int num3){
        if ((num1!=num2)|(num1!=num3)) {
            if (num1 > num2 && num1 > num3) {
                System.out.println("Largest number is: " + num1);
            } else if (num2 > num1 && num2 > num3){
                System.out.println("Largest number is: " + num2);
            } else {
                System.out.println("Largest number is: " + num3);
            }
        }
        else{
            System.out.println("all three numbers are equal");
        }
    }

}
