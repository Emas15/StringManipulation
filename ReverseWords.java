import java.util.Scanner;
public class ReverseWords {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String reversed = "";

        for(int i = word.length()-1; i>=0; i--){
            char ch = word.charAt(i);
            reversed+=ch;
        }


        if(reversed.equals(word)){
            System.out.println("That is a paildrome");
        }

        System.out.println(reversed);

        sc.close();
    }
    
}
