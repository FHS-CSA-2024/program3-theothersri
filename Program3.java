//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:

class Quadralateral {
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        
        //take inputs
        System.out.println("Enter the length: ");
        Integer l = myObj.nextInt();
        System.out.println("Enter the width: ");
        Integer w = myObj.nextInt();
        
        //calculate area and perimeter
        int area = 0;
        int peri = 0;
        area = l*w;
        peri = 2*l+2*w;
        
        //output
        System.out.println("The length is: "+l);
        System.out.println("The width is: "+w);
        System.out.println("The area is:" + area);
        System.out.println("The perimeter is:" + peri);
        
        

        
        
    }
}


//Paste console output below:
/*


*/
