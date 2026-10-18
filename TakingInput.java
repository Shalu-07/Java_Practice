import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    static void main(String[] args) {
        // int a = 5;
        // int b = 6;

        // System.out.println(a+b);

        Scanner sc = new Scanner(System.in);
        // ye line scanner class ka ek object bana kr deti hai
        // or ye object help krta h input lene k lie
        System.out.println("Enter the value of firstNum:");
        int firstNum = sc.nextInt();
        System.out.println("Enter the value of secondNum:");
        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum;
        System.out.println("Answer is :" + ans);


        BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger:" + bg);

        System.out.println("Enter the value of flag:");
        boolean flag = sc.nextBoolean();
        System.out.println("Enter the value of shortVal:");
        short shortVal = sc.nextShort();
        System.out.println("Enter the value of floatValue:");
        float floatValue = sc.nextFloat();

        System.out.println(" flag is :" + flag);
        System.out.println("shortVal is :" + shortVal);
        System.out.println("floatValue is :" + floatValue);


        // java garbage collector  = 
    



    }
    
}
