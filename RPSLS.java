import java.util.Scanner;

//Myles Page
//Assignment 2
//2/11/19

//RPCLS == Rock paper scissors lizard spock
public class RPCLS {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quit = 0;
		int com;
		int menu = 0;
		int choice = 0;
		int comScore = 0;
		int userScore = 0;
		int playAgain = 0;
		
		//Start of the program
		System.out.println("Welcom to Rock Paper Scissors! \n Press 1 to play. \n Press 2 to Quit.");
		menu = input.nextInt();
		//Menu select
		while(menu == 1) {
			//Detect if someone is two points ahead and if so ends game 
			while(comScore > userScore + 1 || userScore > comScore + 1) {
				//Computer wins
				if(comScore > userScore) {
					System.out.println("Compuer Won!");
					System.out.println("Play again?\n 1 for yes \n 2 for no");
					playAgain = input.nextInt();
					//Play again 
					if(playAgain == 1) {
						comScore = 0;
						userScore = 0;
					}
					//quit
					else {
						quit = 1;
					}
				}	
				//Player wins
				else {
					System.out.println("You Won!");
					System.out.println("Play again?\n 1 for yes \n 2 for no");
					playAgain = input.nextInt();
					//Play again
					if(playAgain == 1) {
						comScore = 0;
						userScore = 0;
					}
					//Quit
					else {
						quit = 1;
					}
				}
				break;
			}
			//Quit menu
			while(quit == 1) {
				menu = 2;
			}
			
			//Main menu of chooses 
			System.out.println("\nPlease Choose \n 1 for Rock \n 2 for Paper \n 3 for Scissors \n 4 for lizard \n 5 for Spock");
			choice = input.nextInt();
			
			//Rock 
			if(choice == 1) {
				com = (int) (Math.random()*((5)));
				//Computer picks Rock
				if(com == 0) {
					System.out.println("\nBoth played Rock");
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Scissors
				else if (com == 1) {
					System.out.println("\nYou played rock \nComputer played Scissors");
					System.out.println("Rock crushes Scissors");
					userScore = userScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}	
				//Computer picks Paper
				else if (com == 2) {
					System.out.println("\nYou played rock\nComputer played Paper");
					System.out.println("Paper covers Rock");
					comScore = comScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Lizard
				else if (com == 3) {
					System.out.println("\nYou played rock\nComputer played lizard");
					System.out.println("Rock crushes Lizard");
					userScore = userScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Spock
				else if(com == 4) {
					System.out.println("\nYou played rock\nComputer played spock");
					System.out.println("Spock vaporizes Rock");
					comScore = comScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
			}
			
			//Paper
			else if(choice == 2) {
				com = (int) (Math.random()*((3)));
				//Computer picks Rock
				if(com == 0) {
					System.out.println("\nYou played Paper \nComputer played Rock");
					System.out.println("Paper covers Rock");
					userScore = userScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Scissors
				else if (com == 1) {
					System.out.println("\nYou played Paper\nComputer played Scissors");
					System.out.println("Scissors cuts Paper");
					comScore = comScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}	
				//Computer picks Paper
				else if (com ==2) {
					System.out.println("\nYou both did Paper");
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Lizard
				else if (com == 3) {
					System.out.println("\nYou played Paper \nComputer played lizard");
					System.out.println("Lizard eats Paper");
					comScore = comScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Spock
				else if(com == 4) {
					System.out.println("\nYou played Paper \nComputer played spock");
					System.out.println("Paper disproves Spock");
					userScore = userScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
			}
			
			//Scissors
			else if(choice == 3) {
				com = (int) (Math.random()*((3)));
				//Computer picks Rock
				if(com == 0) {
					System.out.println("\nYou played Scissors \nComputer played Rock");
					System.out.println("Rock crushes Scissors");
					comScore = comScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Scissors
				else if (com == 1) {
					System.out.println("\nYou both did Scissors");
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Paper
				else if (com ==2) {
					System.out.println("\nYou played Scissors \nComputer played Paper");
					System.out.println("Scissors cuts Paper");
					userScore = userScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Lizard
				else if (com == 3) {
					System.out.println("\nYou played Scissors \nComputer played lizard");
					System.out.println("Scissors decapatates Lizard");
					userScore = userScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Spock
				else if(com == 4) {
					System.out.println("\nYou played Scissors \nComputer played spock");
					System.out.println("Spock smashes Scissors");
					comScore = comScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
			}
			
			//Lizard
			else if(choice == 4) {
				com = (int) (Math.random()*((3)));
				//Computer picks Rock
				if(com == 0) {
					System.out.println("\nYou played Lizard \nComputer played Rock");
					System.out.println("Rock crushes Lizard");
					userScore = userScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Scissors
				else if (com == 1) {
					System.out.println("\nYou played Lizard \nComputer played Scissors");
					System.out.println("Scissors decapatates Lizard");
					comScore = comScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Paper
				else if (com ==2) {
					System.out.println("\nYou played Lizard \nComputer played Paper");
					System.out.println("Lizard eats paper");
					comScore = comScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Lizard
				else if (com == 3) {
					System.out.println("\nYou both did Lizard");
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Spock
				else if(com == 4) {
					System.out.println("\nYou played Lizard \nComputer played spock");
					System.out.println("Lizard poisons Spock");
					userScore = userScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
			}
			
			//Spock
			else if(choice == 5) {
				com = (int) (Math.random()*((3)));
				
				//Computer picks Rock
				if(com == 0) {
					System.out.println("\nYou played Spock \nComputer played Rock");
					System.out.println("Spock vaporizes Rock");
					comScore = comScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Scissors
				else if (com == 1) {
					System.out.println("\nYou played Spock \nComputer played Scissors");
					System.out.println("Spock smashes Scissors");
					userScore = userScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Paper
				else if (com ==2) {
					System.out.println("\nYou played Spock \nComputer played Paper");
					System.out.println("Paper disproves Spock");
					userScore = userScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Lizard
				else if (com == 3) {
					System.out.println("\nYou played Spock \nComputer played Lizard");
					System.out.println("Lizard poisons Spock");
					comScore = comScore+1;
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
				//Computer picks Spock
				else if(com == 4) {
					System.out.println("\nYou both did Spock");
					System.out.println("Score \nComputer:"+comScore+"\nPlayer:" +userScore);
				}
			}
			
			//Quit menu help
			else if(choice == 101) {
				menu = 2;
			}
			
			//# not on the list 
			else{
				System.out.println("Invalid Choice");
			}
		}	
		
		//Quit menu
		while(menu == 2) {
			System.out.println("Quitting");
			break;
		}
	//Close scanner
	input.close();
	}
}