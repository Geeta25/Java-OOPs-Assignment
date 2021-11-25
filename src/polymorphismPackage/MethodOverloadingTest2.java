package polymorphismPackage;

import java.util.Scanner;

public class MethodOverloadingTest2 {

    //Add 2 integers and concatenate 2 strings with same method name(Apply method Overloading)
    public static void main(String[] args) {
        int num1=15;
        int num2=20;
        String str1="Awesome ";
        String str2="Vapasi";
        MethodOverloading2 methodOverloading2=new MethodOverloading2();
        methodOverloading2.additionMethod(num1,num2);
        methodOverloading2.additionMethod(str1,str2);

    }

}
