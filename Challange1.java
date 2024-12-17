import java.util.Scanner;
public class Challange1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the secter message: ");
        String message = sc.nextLine();
        String result = "";

        int v = 0;
        int c =0;
        int d =0;
        int s = 0;

 

        for(int i = (message.length()-1); i >= 0; i--){

            char ch = message.charAt(i);


            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
                result+=ch;
            }

    
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
    v++;
}

            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                c++;
            }
            
            else if(ch >='0' && ch<='9'){
                d++;
            }
            else{
                s++;
            }



        }
        System.out.println(result);
        System.out.println(v);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);

        sc.close();
    }
    
}
