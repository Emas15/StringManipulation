import java.util.Scanner;
public class PasswordValidation {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String pass = sc.nextLine();

        boolean upper = false;
        boolean lower = false;
        boolean special = false;
        boolean digit = false;
        boolean space = false;

        for(int i = 0; i < pass.length(); i++){
            char ch = pass.charAt(i);

            if(ch == ' '){
                space = true;
            }
            else if(ch>='A' && ch<='Z'){
                upper = true;
            }
            else if(ch>='a' && ch<='z'){
                lower = true;
            }

            else if(ch>='0' && ch<='9'){
                digit =true;
            }

            else{
                special = true;
            }

        }
            if(pass.length() >= 8 && upper && lower && digit && special && space){
                System.out.println("valid password");
            }

            else{
                System.out.println("Weak password");
            }

            sc.close();
        }

        
    }
