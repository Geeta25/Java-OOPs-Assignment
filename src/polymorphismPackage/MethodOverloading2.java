package polymorphismPackage;

public class MethodOverloading2 {

    static void additionMethod(int num1,int num2){
        System.out.println("Sum of two integers is: "+(num1+num2));
    }

    static void additionMethod(String str1, String str2){
        System.out.println("Concatenation of two strings is: "+(str1+str2));
    }

}
