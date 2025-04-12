import java.util.Scanner;



public class Bit {
    
    public static void main (String args[]){ 
        int a =0;
        
        //int X=0; 
        

       // System.out.println("Input the value ");
        Scanner myobj = new Scanner(System.in);
        int n = myobj.nextInt();
		System.out.println();
       // myobj.nextLine(); 
		 //Scanner myobj1 = new Scanner(System.in);


        String[] arr1 = new String[n]; 
        for(int i=0;i<n;i++){ 
           arr1[i]= myobj.nextLine();
        }
        for(int i=0;i<n;i++){
            if(arr1[i].equals("X++") ||arr1[i].equals ("++X")){
                //X++;
                a += 1;


            }
            else if (arr1[i].equals("X--") ||arr1[i].equals ("--X") ) {
                a -= 1;
               // X--;
            }
        
        }
        System.out.println(  a);
    
    
    

    }

  
   

}
