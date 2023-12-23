import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playerSetScore = 0;
        int computerSetScore = 0;
        int playerScore=0;
        int computerScore = 0;
        int playerBoardSize = 0;
        int computerBoardSize = 0;
        int gameDeckCounter = 0;

        System.out.println("Welcome to BlueJack game");
        System.out.println("Game is starting!");
        Deck deck = new Deck();

        String[][] computerHandArray = deck.getComputerHandArray();
        String[][] playerHandArray = deck.getPlayerHandArray();
        String[][] finalGameDeck = deck.getFinalGameDeck();

        boolean isGamePlaying = true;
        while (isGamePlaying) {

            boolean isSetPlaying = true;
            computerScore=0;
            playerScore=0;
            boolean isPlayerStand=false;
            System.out.println("New set is starting");
            int bluePlayerCounter=0;
            int blueComputerCounter=0;
            int drawnCardPlayer=0;

            while (isSetPlaying) {

                int drawnCardComputer;

                if (!isPlayerStand) {
                    System.out.println("Player's turn");
                    System.out.println(Arrays.deepToString(playerHandArray));
                    System.out.println("1-Ask for a card from the game deck");
                    System.out.println("2-Play a card from your hand");
                    System.out.println("3-Stand");
                    System.out.println("Enter 1, 2 or 3");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            drawnCardPlayer = Integer.parseInt(finalGameDeck[gameDeckCounter][0]);
                            playerScore += drawnCardPlayer;
                            playerBoardSize++;
                            gameDeckCounter++;
                            if (finalGameDeck[gameDeckCounter][1].equals("B")){   //is the card blue
                                bluePlayerCounter++;
                            }
                            break;
                        case 2:
                            System.out.println("Which card do you want to use: 1, 2, 3 or 4");
                            System.out.println("Enter 1, 2, 3 or 4");
                            int number=sc.nextInt();
                            switch (number){
                                case 1:
                                    if (playerHandArray[0][0].equals("x2")){
                                        playerScore += drawnCardPlayer * 1;
                                        playerBoardSize++;
                                        playerHandArray[0][0]=null;
                                    } else if (playerHandArray[0][0].equals("+/-")) {
                                        playerScore = playerScore- 2 * drawnCardPlayer;
                                        playerBoardSize++;
                                        playerHandArray[0][0]=null;
                                    } else if (playerHandArray[0][1].equals("-")) {
                                        int a=Integer.parseInt(playerHandArray[0][0]);
                                        a=a*(-1);
                                        playerScore+=a;
                                        playerBoardSize++;
                                        playerHandArray[0][0]=null;
                                        if (playerHandArray[0][2].equals("B")){  //is the card blue
                                            bluePlayerCounter++;
                                        }
                                    } else {
                                        int a=Integer.parseInt(playerHandArray[0][0]);
                                        playerScore+=a;
                                        playerBoardSize++;
                                        playerHandArray[0][0]=null;
                                        if (playerHandArray[0][2].equals("B")){  //is the card blue
                                            bluePlayerCounter++;
                                        }
                                    }
                                    break;
                                case 2:
                                    if (playerHandArray[0][0].equals("x2")){
                                        playerScore += drawnCardPlayer;
                                        playerBoardSize++;
                                        playerHandArray[1][0]=null;
                                    } else if (playerHandArray[1][0].equals("+/-")) {
                                        playerScore = playerScore- 2 * drawnCardPlayer;
                                        playerBoardSize++;
                                        playerHandArray[1][0]=null;
                                    } else if (playerHandArray[1][1].equals("-")) {
                                        int a=Integer.parseInt(playerHandArray[1][0]);
                                        a=a*(-1);
                                        playerScore+=a;
                                        playerBoardSize++;
                                        playerHandArray[1][0]=null;
                                        if (playerHandArray[1][2].equals("B")){  //is the card blue
                                            bluePlayerCounter++;
                                        }
                                    } else {
                                        int a=Integer.parseInt(playerHandArray[1][0]);
                                        playerScore+=a;
                                        playerBoardSize++;
                                        playerHandArray[1][0]=null;
                                        if (playerHandArray[1][2].equals("B")){  //is the card blue
                                            bluePlayerCounter++;
                                        }
                                    }
                                    break;
                                case 3:
                                    if (playerHandArray[2][0].equals("x2")){
                                        playerScore += drawnCardPlayer;
                                        playerBoardSize++;
                                        playerHandArray[2][0]=null;
                                    } else if (playerHandArray[2][0].equals("+/-")) {
                                        playerScore = playerScore- 2 * drawnCardPlayer;
                                        playerBoardSize++;
                                        playerHandArray[2][0]=null;
                                    } else if (playerHandArray[2][1].equals("-")) {
                                        int a=Integer.parseInt(playerHandArray[2][0]);
                                        a=a*(-1);
                                        playerScore+=a;
                                        playerBoardSize++;
                                        playerHandArray[2][0]=null;
                                        if (playerHandArray[2][2].equals("B")){  //is the card blue
                                            bluePlayerCounter++;
                                        }
                                    } else {
                                        int a=Integer.parseInt(playerHandArray[2][0]);
                                        playerScore+=a;
                                        playerBoardSize++;
                                        playerHandArray[2][0]=null;
                                        if (playerHandArray[2][2].equals("B")){  //is the card blue
                                            bluePlayerCounter++;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (playerHandArray[3][0].equals("x2")){
                                        playerScore+=drawnCardPlayer;
                                        playerBoardSize++;
                                        playerHandArray[3][0]=null;
                                    } else if (playerHandArray[3][0].equals("+/-")) {
                                        playerScore = playerScore- 2 * drawnCardPlayer;
                                        playerBoardSize++;
                                        playerHandArray[3][0]=null;
                                    } else if (playerHandArray[3][1].equals("-")) {
                                        int a=Integer.parseInt(playerHandArray[3][0]);
                                        a=a*(-1);
                                        playerScore+=a;
                                        playerBoardSize++;
                                        playerHandArray[3][0]=null;
                                        if (playerHandArray[3][2].equals("B")){  //is the card blue
                                            bluePlayerCounter++;
                                        }
                                    } else {
                                        int a=Integer.parseInt(playerHandArray[3][0]);
                                        playerScore+=a;
                                        playerBoardSize++;
                                        playerHandArray[3][0]=null;
                                        if (playerHandArray[3][2].equals("B")){  //is the card blue
                                            bluePlayerCounter++;
                                        }
                                    }
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Player chose to stand");
                            if (computerScore >= 17) {
                                isSetPlaying = false;
                            }
                            isPlayerStand = true;
                            break;
                    }
                }

                if (computerScore < 17) {   //computer can draw or play a card if it's score suitable for this condition
                    drawnCardComputer = Integer.parseInt(finalGameDeck[gameDeckCounter][0]);  //computer drawn first card
                    System.out.println("Computer drawn "+ drawnCardComputer);
                    gameDeckCounter++;
                    computerBoardSize++;
                    computerScore += drawnCardComputer;
                    if (finalGameDeck[gameDeckCounter][1].equals("B")){   //is this card blue
                        blueComputerCounter++;
                    }

                    for (int i = 0; i < 4; i++) {
                        if (computerHandArray[i][0] != null) {
                            if (computerHandArray[i][0].equals("x2")) {
                                if ((drawnCardComputer * 1 + computerScore) == 20) {
                                    computerScore += drawnCardComputer * 1;
                                    computerBoardSize++;
                                    computerHandArray[i][0] = null;
                                    break;
                                }
                            } else if (computerHandArray[i][0].equals("+/-")) {
                                if (computerScore > 20) {
                                    computerScore = computerScore - 2 * drawnCardComputer;
                                    computerHandArray[i][0] = null;
                                    computerBoardSize++;
                                    break;
                                }
                            } else {
                                int a = Integer.parseInt(computerHandArray[i][0]);
                                if (computerHandArray[i][1].equals("-")){
                                    a=a*(-1);
                                }
                                if ((computerScore + a) == 20) {
                                    computerScore += a;
                                    computerHandArray[i][0] = null;
                                    computerBoardSize++;
                                    if (computerHandArray[i][2].equals("B")){  //is the card blue
                                        blueComputerCounter++;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }



                if (computerScore > 20 && playerScore <= 20) {
                    System.out.println("Computer busted, player won the set");
                    playerSetScore++;
                    isSetPlaying = false;
                    computerBoardSize = 0;
                    playerBoardSize = 0;
                    blueComputerCounter=0;
                    bluePlayerCounter=0;
                } else if (playerScore > 20 && computerScore <= 20) {
                    System.out.println("Player busted, computer won the set");
                    computerSetScore++;
                    isSetPlaying = false;
                    computerBoardSize = 0;
                    playerBoardSize = 0;
                    blueComputerCounter=0;
                    bluePlayerCounter=0;
                } else if (computerBoardSize == 9 && playerBoardSize == 9 && playerScore <= 20 && computerScore <= 20 && Math.abs(20 - computerScore) < Math.abs(20 - playerScore)) {
                    computerSetScore++;
                    isSetPlaying = false;
                    computerBoardSize = 0;
                    playerBoardSize = 0;
                    blueComputerCounter=0;
                    bluePlayerCounter=0;
                } else if (playerBoardSize == 9 && computerBoardSize == 9 && computerScore <= 20 && playerScore <= 20 && Math.abs(20 - playerScore) < Math.abs(20 - computerScore)) {
                    playerSetScore++;
                    isSetPlaying = false;
                    computerBoardSize = 0;
                    playerBoardSize = 0;
                    blueComputerCounter=0;
                    bluePlayerCounter=0;
                } else if (playerBoardSize == 9 && computerBoardSize == 9 && playerScore == 20 && computerScore == 20) {
                    System.out.println("Set is tied");
                    isSetPlaying = false;
                    computerBoardSize = 0;
                    playerBoardSize = 0;
                    blueComputerCounter=0;
                    bluePlayerCounter=0;
                }else if (isPlayerStand && computerScore>=17){
                    if (playerScore<computerScore){
                        System.out.println("Computer won the set");
                        computerSetScore++;
                        computerBoardSize = 0;
                        playerBoardSize = 0;
                        blueComputerCounter=0;
                        bluePlayerCounter=0;
                    }else if (computerScore<playerScore) {
                        System.out.println("Player won the set");
                        playerSetScore++;
                        computerBoardSize = 0;
                        playerBoardSize = 0;
                        blueComputerCounter=0;
                        bluePlayerCounter=0;
                    }else{
                        System.out.println("Set is tied");
                        computerBoardSize = 0;
                        playerBoardSize = 0;
                        blueComputerCounter=0;
                        bluePlayerCounter=0;
                    }
                    isSetPlaying=false;
                } else if ((blueComputerCounter==computerBoardSize) && computerScore==20) {
                    computerSetScore++;
                    isSetPlaying = false;
                    computerBoardSize = 0;
                    playerBoardSize = 0;
                    blueComputerCounter=0;
                    bluePlayerCounter=0;
                } else if ((bluePlayerCounter==playerBoardSize) && playerScore==20){
                    playerSetScore++;
                    isSetPlaying = false;
                    computerBoardSize = 0;
                    playerBoardSize = 0;
                    blueComputerCounter=0;
                    bluePlayerCounter=0;
                }

                System.out.println("Player score:"+playerScore);
                System.out.println("Computer score:"+computerScore);

                if ((gameDeckCounter == 29) || playerSetScore >= 3 || computerSetScore >= 3) {
                    isGamePlaying = false;
                    isSetPlaying = false;
                    break;
                }

            }

            System.out.println("Player:" + playerSetScore + " - Computer:" + computerSetScore);
        }


        //determine the winner of the game

        if (playerSetScore>computerSetScore) {
            System.out.println("Player won the game");
        } else if(playerSetScore<computerSetScore){
            System.out.println("Computer won the game");
        }else {
            System.out.println("Tie");
        }
        sc.close();

        System.out.println("Player:" + playerSetScore + " - Computer:" + computerSetScore);

    }
}



