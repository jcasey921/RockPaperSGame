/*
 * Rock/Paper/Scissors Game - Game Score
 * Justin L Casey
 * Class : PRG/215 Helen Jiang
 */
package rpsgamescore;
import java.util.Scanner;
public class RPSGameScore {

    public static void main(String[] args) 
    {
         int player1Score = 0;
         int player2Score = 0;
     //Added boolean so I could add a replay / reset score option later.   
         boolean gameRunning = true;
        System.out.println("Hello, this is the classic game of Rock/Paper/Scissors! This is a 2 player game. \n");
         while (gameRunning)
        {
    
     //Setting a int to hold player scores.   
     Scanner scan = new Scanner(System.in);
     //Scanner for user input.
     
     String player1, player2, R = "Rock", P = "Paper", S = "Scissors", I = "invalid move";
     // Setting to be used later.
     
     //Greeting user and telling them the game. Added "This is a 2 player game. \n" for cleaner appearance.
     
     //while(player1Score < player2Score + 5 && player2Score < player1Score + 5){
     //Added a while loop to allow the game to continue until a player has 5 more wins than the other.
         System.out.println("Player 1 choose : rock, paper or scissors");
     //Having player1 make a selection.
    player1 = scan.nextLine();
    player1 = player1.toLowerCase();
    {
        if(player1.equals("rock") || player1.equals("r"))
            player1 = R;
        
        else if(player1.equals("paper") || player1.equals("p"))
            player1 = P;
        
        else if(player1.equals("scissors") || player1.equals("s"))
            player1 = S;
        
        else
            player1 = I;
    }
    //This sets up what they choose through if/else to be used as R P S or I later in the program.
    System.out.println("Player 2 choose : rock, paper, or scissors.");
    //Having player2 make a selection.
    player2 = scan.nextLine();
    player2 = player2.toLowerCase();
    {
        if(player2.equals("rock") || player2.equals("r"))
            player2 = R;
        
        else if(player2.equals("paper") || player2.equals("p"))
            player2 = P;
        
        else if(player2.equals("scissors") || player2.equals("s"))
            player2 = S;
        else
            player2 = I;
    }
    //This sets up what they choose through if/else to be used as R P S or I later in the program.
    if(player1.equals(R) && player2.equals(P)){
        System.out.println("Player 2 wins : Paper covers Rock.");
   player2Score++;
    }
    else if(player1.equals(P) && player2.equals(S)){
                System.out.println("Player 2 wins : Scissors cuts Paper.");
    player2Score++;
    }       
    else if(player1.equals(S) && player2.equals(R)){
                System.out.println("Player 2 wins : Rock breaks Scissors.");
    player2Score++;
    }        
    else if(player2.equals(R) && player1.equals(P)){
                System.out.println("Player 1 wins : Paper covers Rock.");
    player1Score++;
    }        
    else if(player2.equals(P) && player1.equals(S)){
                System.out.println("Player 1 wins : Scissors cuts Paper.");
    player1Score++;
    }      
    else if(player2.equals(S) && player1.equals(R)){
                System.out.println("Player 1 wins : Rock breaks Scissors");
    player1Score++;
    } 
    //player1Score++ and player2Score++ added to keep count of wins for each player as they are awarded.
    else if(player1.equals(I) || player2.equals(I))
        System.out.println("Invalid entry. Replay this round.");
    //Corrected the code to display this when an invalid entry from either player is entered and replay the round.
    else 
                System.out.println("Tied with " + player1 + ".");
    
    //This breaks down the players entered choices to decide who wins.
     
    if(player1Score == player2Score + 5 || player2Score == player1Score + 5)
        {
                 System.out.println("Player 1 final score is: " + player1Score + "\nPlayer 2 final score is: " + player2Score );
                 System.out.println("Would you like to play agian?");
                 
                 String response = scan.nextLine();
                 String lowerResponse = response.toLowerCase();
                 if (lowerResponse.equals("yes") || lowerResponse.equals("y"))
                {
                     player1Score = 0;
                     player2Score = 0;
                 System.out.println("Scores are reset to 0. Play again and have fun!");
                 //When the user decides to play again scores are reset and the game starts over.  
                 }
                 else 
                 {
                     gameRunning = false;
                 }
                         }
    else
                 System.out.println("Player 1 score is: " + player1Score + "\nPlayer 2 score is: " + player2Score );
    //After each round the score is displayed. Once a player has 5 more wins than the other player the game will end and display the final scores.
                }
           
        }
    }
    

