import java.util.Scanner;

public class StringBasic {
     public static void main(String[] args) {
        // string are just a sequence of character
        // double inverted quma 
        // string lateral == string str = "love";
        // new keyword == string str = new string("love");
        // string pool == 1. stack memory    2. stack memory
        // access of charcter 
        // String firstName = "Love";
        // String lastName = new String("babbar");
        // System.out.println(firstName + " " + lastName);

        // System.out.println(firstName.length());
        // System.out.println(firstName.charAt(3));

        // string are immutable = changes are not allowed in this
        // String name = "Rana";
        // name = "Bana";
        // System.out.println(name);


        // string builder =  StringBuilder is a class in Java used to create and modify
        //  strings without creating a new object every time the string changes.

        // comparing string

        // String name1 = "Love";
        // String name2 = "Love";

        // if(name1 == name2) {
        //     System.out.println("Both strings are equal");
        // }

        // else{
        //     System.out.println("Both strings are not equal");
        // }
          

        // string input = sc------ next()
                            // ------- next Line()
                      
            //   Scanner sc = new Scanner(System.in);
            //   System.out.println("Provide the string content:");   
            //   String str = sc.nextLine();
            //   System.out.println("Value: " + str);  
              
            //   common string methods
            // common string methods


            // print each character of the string 

            String str = "Hello java";

            int n = str.length();
            for(int i = 0; i<n; i++){
                char ch = str.charAt(i);
                System.out.print(ch);
            }

    
    
    
    
    
    
    }

    
}
