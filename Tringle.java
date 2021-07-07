
/**
 * A simple program that prints a trianle of 
 * asterisks  that points to up,down, left and right. 
 */
public class Tringle {
    
    public static void main(String[] args) {
        
        System.out.println();
     
        printTriangleAsc(10);
        System.out.println();
        printTriangleDesc(10);
        System.out.println();
        printRightTriangle(16);
        System.out.println();
        printLeftTriangle(16);
        
    }


    private static void printRightTriangle(int size){

         size =  size / 2;//get the half of size
         //make this half odd
         size =  (size % 2 == 0 ? size++ : size);


         //print the first part of the triangle
        for (int i = 1; i <= size;i++) {
            System.out.println();
                for( int j =1; j<= i; ++j)
                System.out.print(" *");
        }

        //print the second part of the triangle
        for (int i = size-1; i >= 0;--i) {
            System.out.println();
               for( int j =1; j<= i; ++j)
                System.out.print(" *");
        }
    }


    private static void printLeftTriangle(int size){

        size =  size / 2;
        size =  (size % 2 == 0 ? size++ : size);
        for(int i =1; i <= size; ++i){
            System.out.println();

            //print indentations 
            for(int x = 1; x <= size - i ; ++x )
              System.out.print("  ");

                //print asterisks that form our triangle
                 for(int j=1; j <= i; ++j){
                    System.out.print(" *");  
                }
        }//end outer loop 1

        for(int i = size-1; i >= 0;--i){
            System.out.println();

            //print indentations 
            for(int x = size - i; x >= 1 ; --x )
              System.out.print("  ");

                //print asterisks that form our triangle
                 for(int j=1; j <= i; ++j)
                    System.out.print(" *");  
                
        }//end outer loop 2

       


   }

    private static void printTriangleAsc(int size){
        //draw a trianglur shape of asterisks that points 
        //upward
        for(int i=1; i <= size; ++i){

            System.out.println();

            //print indentations 
            for(int x = size -  i; x >= 0; --x )
              System.out.print(" ");

              //print asterisks that form our triangle
            for(int j=1; j <= i; ++j)      
                System.out.print("* ");  
            
                

        }//end outer loop


       
    }//end method 
    

    
    private static void printTriangleDesc(int size){
        //draw a trianglur shape of asterisks that points 
        //downward
        for(int i=size; i >= 1; --i){

            System.out.println();

            //print indentations 
            for(int x = 1;  x <= (size -  i); ++x )
              System.out.print(" ");

              //print asterisks that form our triangle
            for(int j=1; j <= i; ++j){
                if(j == 1) System.out.print(" "); 
                System.out.print("* ");  
            }
                

        }//end outer loop
    }//end method 
}//end class
