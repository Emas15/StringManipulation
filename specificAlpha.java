import java.util.Scanner;
public class specificAlpha 

    {

        public static void main(String[] args) 
        {
        
            Scanner sc = new Scanner(System.in);
            System.out.print("how many names: ");
            int num = sc.nextInt();
            sc.nextLine();
            

           


            for(int i =1; i<=num; i++){

                
            System.out.print("Enter your name: ");
            String input = sc.nextLine();
            int wordCount = 0;

                

            for( int j =0; j<input.length(); j++){

                char ch = input.charAt(j);

                if( ch == 'a' || ch == 'e' || ch=='i' || ch =='o' || ch == 'u' || ch== 'A' || ch=='E' || ch == 'I' || ch =='O' || ch =='U'){
                    wordCount++;
                }
              
          
            }


            System.out.println(input+ " has "+ wordCount+ " vowels in his name");
           
        }

        sc.close();
        }
    
}
