import java.util.Scanner;

public class ReverseSen{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

       
        String temp = "";       
        String result = "";   

   
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

        
            if (ch == ' ') {//space

                if(!temp.equals("")){
              
                    result = temp + " " + result;  // my  //name my   
                    temp = ""; 
                }
            }
             else {
                temp += ch; //my //name //is
            }
        }

        if(!temp.equals("")){
            result = temp + " " + result; //is name my 
        }
     

      
        System.out.println("Reversed words sentence: " + result);
        sc.close();
    }
}
