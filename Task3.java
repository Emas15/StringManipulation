import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char specialChar = sc.next().charAt(0); //accessing the special character which is a char data type.

        String result ="";

        for(int i= 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if(ch == specialChar){
                result+="\n";
            }
            else{
                result+=ch;
            }
        }
        System.out.println(result);
        sc.close();
    }
    
}
