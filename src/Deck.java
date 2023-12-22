import java.util.Random;
import java.util.Scanner;

public class Deck {
    private String computer_hand;
    private String player_hand;
    private String final_computer_hand;
    private String final_player_hand;
    private String[][] computerHandArray;
    private String[][] playerHandArray;
    private String[][] finalGameDeck;
    Scanner sc = new Scanner(System.in);
    Random r = new Random(System.currentTimeMillis());
    private String deck[];



    public Deck() {

        playerHandArray = new String[4][3];
        computerHandArray = new String[4][3];
        finalGameDeck = new String[30][2];
        String colors[] = {"R", "G", "B", "Y"};
        String numbers[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        deck = new String[40];
        for (int c = 0; c < 40; c++) {
            for (int i = 0; i < colors.length; i++) {
                for (int a = 0; a < numbers.length; a++) {
                    deck[c] = numbers[a] + colors[i];
                    c++;
                }
            }
        }
        for (int k = 0; k < deck.length; k++) {
            int x = r.nextInt(deck.length);   //get a random value
            String y = deck[k];
            deck[k] = deck[x];
            deck[x] = y;
        }
        //for(int c=0;c<deck.length;c++){System.out.println(deck[c]);}
        //System.out.println("computer_hand:"+ computer_hand);
        //System.out.println("player_hand:"+ player_hand);


        String[] signs = {"+", "-"};
        Random random = new Random();
        String computer_hand = "";
        String player_hand = "";
        for (int g = 0; g < 5; g++) {
            String sign = signs[random.nextInt(signs.length)];
            if (g == 0) {
                computer_hand += sign + deck[0];
                player_hand += sign + deck[0];
            } else {
                computer_hand += "," + sign + deck[g];
                player_hand += "," + sign + deck[deck.length - 1 - g];
            }
        }


        for (int h = 0; h < 3; h++) {
            String sign = signs[random.nextInt(signs.length)];
            String color = colors[random.nextInt(colors.length)];
            int value = random.nextInt(6) + 1;   //values between 1 and 6
            //System.out.println("Card" + h + " " + sign + color + value);
            computer_hand += "," + sign + value + color;
            if (h == 2) {
                System.out.println("Computer_hand:" + computer_hand);
            }
        }
        for (int k = 0; k < 3; k++) {
            String sign = signs[random.nextInt(signs.length)];
            String color = colors[random.nextInt(colors.length)];
            int value = random.nextInt(6) + 1;   //values between 1 and 6
            //System.out.println("Card" + k + " " + sign + color + value);
            player_hand += "," + sign + value + color;
            if (k == 2) {
                System.out.println("Player_hand:" + player_hand);
            }
        }


        int[] arr3 = {0, 1, 1, 1, 1};
        int value = random.nextInt(2);   //values are 0 and 1
        //   System.out.println("value:"+value);
        for (int e = 0; e < 2; e++) {
            if (value == 1) {
                String sign = signs[random.nextInt(signs.length)];
                String color = colors[random.nextInt(colors.length)];
                int value1 = random.nextInt(6) + 1;   //values between 1 and 6
                computer_hand += "," + sign + value1 + color;
            } else {
                int[] arr4 = {2, 3};
                int value2 = random.nextInt(2) + 2;   //values are 2 and 3
                //   System.out.println("value2:"+value2);
                if (value2 == 2) {
                    computer_hand += ",x2";
                } else {
                    computer_hand += ",+/-";
                }
            }
        }
        System.out.println("Computer_hand:" + computer_hand);

        int[] arr = {0, 1, 1, 1, 1};
        int value3 = random.nextInt(2);   //values are 0 and 1
        //   System.out.println("value3:" + value3);
        for (int e = 0; e < 2; e++) {
            if (value3 == 1) {
                String sign = signs[random.nextInt(signs.length)];
                String color = colors[random.nextInt(colors.length)];
                int value4 = random.nextInt(6) + 1;   //values between 1 and 6
                player_hand += "," + sign + value4 + color;
            } else {
                int[] arr1 = {2, 3};
                int value5 = random.nextInt(2) + 2;   //values are 2 and 3
                //   System.out.println("value5:" + value5);
                if (value5 == 2) {
                    player_hand += ",x2";
                } else {
                    player_hand += ",+/-";
                }
            }
        }
        System.out.println("Player_hand:" + player_hand);


        String[] computerhandArray = computer_hand.split(",");
        String[] finalcomputerArray = new String[4];
        for (int p = 0; p < 4; p++) {
            int RandomIndex;
            do {
                RandomIndex = random.nextInt(10);
            } while (computerhandArray[RandomIndex] == null);
            finalcomputerArray[p] = computerhandArray[RandomIndex];
            computerhandArray[RandomIndex] = null;
            final_computer_hand = finalcomputerArray[0] + "," + finalcomputerArray[1] + "," + finalcomputerArray[2] + "," + finalcomputerArray[3];
        }
        for (int k = 0; k < 4; k++) {
            if (finalcomputerArray[k].equals("x2") || finalcomputerArray[k].equals("+/-")) {
                computerHandArray[k][0] = finalcomputerArray[k];
            } else if (finalcomputerArray[k].substring(1, 3).equals("10")) {
                computerHandArray[k][0] = finalcomputerArray[k].substring(1, 3);
                computerHandArray[k][1] = String.valueOf(finalcomputerArray[k].toCharArray()[0]);
                computerHandArray[k][2] = String.valueOf(finalcomputerArray[k].toCharArray()[3]);
            } else {
                computerHandArray[k][0] = String.valueOf(finalcomputerArray[k].toCharArray()[1]);
                computerHandArray[k][1] = String.valueOf(finalcomputerArray[k].toCharArray()[0]);
                computerHandArray[k][2] = String.valueOf(finalcomputerArray[k].toCharArray()[2]);
            }
        }
        System.out.println("Computer_hand:" + final_computer_hand);

        String[] playerhandArray = player_hand.split(",");
        String[] finalplayerArray = new String[4];
        for (int s = 0; s < 4; s++) {
            int RandomIndex2;
            do {
                RandomIndex2 = random.nextInt(10);
            } while (playerhandArray[RandomIndex2] == null);
            finalplayerArray[s] = playerhandArray[RandomIndex2];
            playerhandArray[RandomIndex2] = null;
            final_player_hand = finalplayerArray[0] + "," + finalplayerArray[1] + "," + finalplayerArray[2] + "," + finalplayerArray[3];
        }
        for (int k = 0; k < 4; k++) {
            if (finalplayerArray[k].equals("x2") || finalplayerArray[k].equals("+/-")) {
                playerHandArray[k][0] = finalplayerArray[k];
            } else if (finalplayerArray[k].substring(1, 3).equals("10")) {
                playerHandArray[k][0] = finalplayerArray[k].substring(1, 3);
                playerHandArray[k][1] = String.valueOf(finalplayerArray[k].toCharArray()[0]);
                playerHandArray[k][2] = String.valueOf(finalplayerArray[k].toCharArray()[3]);
            } else {
                playerHandArray[k][0] = String.valueOf(finalplayerArray[k].toCharArray()[1]);
                playerHandArray[k][1] = String.valueOf(finalplayerArray[k].toCharArray()[0]);
                playerHandArray[k][2] = String.valueOf(finalplayerArray[k].toCharArray()[2]);
            }
        }
        System.out.println("Player_hand:" + final_player_hand);



        for (int h = 0; h < 30; h++) {
            if (deck[h + 5].substring(0, 2).equals("10")) {
                finalGameDeck[h][0] = deck[h + 5].substring(0, 2);
                finalGameDeck[h][1] = String.valueOf(deck[h + 5].toCharArray()[2]);
            } else {
                finalGameDeck[h][0] = String.valueOf(deck[h + 5].toCharArray()[0]);
                finalGameDeck[h][1] = String.valueOf(deck[h + 5].toCharArray()[1]);
            }
        }
        System.out.println();

    }

    public String getComputer_hand() {
        return computer_hand;
    }

    public void setComputer_hand(String computer_hand) {
        this.computer_hand = computer_hand;
    }

    public String getPlayer_hand() {
        return player_hand;
    }

    public void setPlayer_hand(String player_hand) {
        this.player_hand = player_hand;
    }

    public String getFinal_computer_hand() {
        return final_computer_hand;
    }

    public void setFinal_computer_hand(String final_computer_hand) {
        this.final_computer_hand = final_computer_hand;
    }

    public String getFinal_player_hand() {
        return final_player_hand;
    }

    public void setFinal_player_hand(String final_player_hand) {
        this.final_player_hand = final_player_hand;
    }

    public String[][] getComputerHandArray() {
        return computerHandArray;
    }

    public void setComputerHandArray(String[][] computerHandArray) {
        this.computerHandArray = computerHandArray;
    }

    public String[][] getPlayerHandArray() {
        return playerHandArray;
    }

    public void setPlayerHandArray(String[][] playerHandArray) {
        this.playerHandArray = playerHandArray;
    }

    public String[] getDeck() {
        return deck;
    }

    public void setDeck(String[] deck) {
        this.deck = deck;
    }

    public String[][] getFinalGameDeck() {
        return finalGameDeck;
    }

    public void setFinalGameDeck(String[][] finalGameDeck) {
        this.finalGameDeck = finalGameDeck;
    }
}




    

