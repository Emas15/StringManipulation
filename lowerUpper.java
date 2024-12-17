import java.util.Scanner;

public class lowerUpper{

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = sc.nextLine();

        String result = "";

   

        for(int i =0; i<name.length(); i++){

            char ch = name.charAt(i);


            if( ch>='a' && ch<='z'){
                char upper = (char) (ch-32);

                result+=upper;
            }
        


            else if( ch>='A' && ch<='Z'){
                char lower= (char) (ch+32);

                result+=lower;
            }

            else{
                result+=ch;
            }
            
            
           


        }
        System.out.println(result);
        sc.close();
    }
    
}