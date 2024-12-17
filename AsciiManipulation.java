import java.util.Scanner;

public class AsciiManipulation {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        // Result to store the output
        String result = "";
        
        // Start with lowercase for the first letter
        boolean isLower = true; 
        
     
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i); 

            
            if (ch >= 'a' && ch <= 'z') { 
                
                if (isLower) {
                    result += ch; 
                } else {
                    result += (char)(ch - 32); 
                }
                isLower = !isLower; 
            } 
            else if (ch >= 'A' && ch <= 'Z') {
               
                if (isLower) {
                    result += (char)(ch + 32); 
                } else {
                    result += ch;
                }
                isLower = !isLower; 
            } else {
           
                result += ch;
            }
        }
        
   
        System.out.println("Result: " + result);
        sc.close();
    }
}