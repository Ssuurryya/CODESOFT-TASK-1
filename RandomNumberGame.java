import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String args[]) {
        
    
        int min = 1;
        int max = 100;

        Random random = new Random();

        int randomNumber = random.nextInt((max - min) + 1) + min;

        Scanner sc= new Scanner(System.in);
        boolean playagain=true;
        while(playagain){ 
         int numberoftries=0;
         int  maximumtries=5;
         boolean guesscorrectly=false;

         System.out.println("Guess one number between " + min + " and " + max + ": ");

           while(numberoftries<maximumtries){
              int userguess = sc.nextInt();
              numberoftries++;
               if(userguess == randomNumber){
                  System.out.println("Congratulation,you guess it coreect");
                  guesscorrectly=true;
              }else if(userguess<randomNumber){
                  System.out.println("Try Higher");
              }
               else{
                  System.out.println("Try Lower");
              }
            }
         if(numberoftries==maximumtries){
            System.out.println("Game over your chance is over.The coorect number is:"+randomNumber);
         }
          
         System.out.println("Do you want an another chance?(yes/no): ");
         String wanttoplayagain=sc.next().toLowerCase();
         playagain=wanttoplayagain.equals("yes") || wanttoplayagain.equals("y");
        } 
        System.out.println("Thanks for playing.");
    }
}