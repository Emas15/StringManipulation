import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter something: ");

        String input = sc.nextLine();

        String character = "";


        for(int i = 0; i< input.length(); i++){
            char currentChar = input.charAt(i);

            boolean counted = false;

            for(int j=0; j<character.length(); j++){
                if(currentChar == character.charAt(j)){
                    counted = true;
                    break;
                }
            }

            if(!counted){
                int count =0;
                

                for(int k =0; k<input.length(); k++){
                    if(input.charAt(k) == currentChar){
                        count++;
                    }
                }
                character+=currentChar;
            

            System.out.println(currentChar+ " = "+count);

            
        }
    }
sc.close();


    }
    
}
