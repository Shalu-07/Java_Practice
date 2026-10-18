public class Patterns {
    public static void main(String[] args) {
        // System.out.println("********");
        //  System.out.println("*******");
        //   System.out.println("******");
        //    System.out.println("*****");
        //     System.out.println("****");
        //      System.out.println("***");



        //       System.out.println("********");
        //  System.out.println("********");
        //   System.out.println("********");
        //    System.out.println("********");
        //     System.out.println("********");
     
       //      System.out.println("********");

            //  solid square pattern
    //    int n = 16;

    //    for(int row=1; row<=n; row++) {
    //     for(int col=1; col<=n; col++) {
    //         System.out.print("* ");
    //     }

    //     System.out.println();
    //    }


    //    int n = 4;

    //    for(int row = 1; row<=n-1 ; row++){
    //     for(int col=1; col<=n; col++){
    //         System.out.print("* ");
    //     }

    //     System.out.println();
    //    }

    // right angle triangle

    // int n = 5;

    // for(int row = 1; row<=n; row++){
    //       for(int col = 1; col<=row; col++){
    //         System.out.print("* ");
    //       }

    //       System.out.println();
    // }
  

    //  solid rhombus

    // int n = 5;

    // for(int row =1; row<=n; row++ ){
    //     for(int col=1; col<=n-row; col++){
    //         System.out.print(" ");
    //     }

    //     for(int col=1; col<=n; col++){
    //         System.out.print("* ");
    //     }

    //     System.out.println();
    // }


        //   *****
        //   ****
        //   *** 
        //   ** 
        //   *

        //    int n = 5;

        //    for(int row = 1; row<=n; row++){
        //     for(int col = 1; col<=n-row+1; col++){
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        //    }
             
               

        //     *******
        //      *****
        //       ***
        //        *


        int n = 4;

        for(int row = 1; row<=n ; row++){
            for(int col = 1; col<=row-1; col++){
                System.out.print(" ");
            }

            for(int col = 1; col<=2*n-2*row+1; col++){
                System.out.print("* ");
            }

            System.out.println();
        }








































    
    }
    
}
