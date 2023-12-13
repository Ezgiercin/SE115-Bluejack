import java.util.Random;
import java.util.Scanner;

    public class Deck {
        String computer_hand;
        String player_hand;
        Scanner sc = new Scanner(System.in);
        Random r = new Random(System.currentTimeMillis());
        private String[] deck;

        public Deck() {

            String colors[] = {"R", "G", "B", "Y"};
            String numbers[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
            deck = new String[40];
            for (int c = 0; c < 40; c++) {
                for (int i = 0; i < colors.length; i++) {
                    for (int a = 0; a < numbers.length; a++) {
                        deck[c] = colors[i] + numbers[a];
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


            String computer_hand = "";
            String player_hand = "";
            for (int g = 0; g < 5; g++) {
                if (g == 0) {
                    computer_hand += deck[0];
                    player_hand += deck[0];
                } else {
                    computer_hand += "," + deck[g];
                    player_hand += "," + deck[deck.length - 1 - g];
                }
            }


            String[] signs = {"+", "-"};
            Random random = new Random();
            int lastValueComputer = -1;
            int lastValuePlayer = -1;
            for (int h = 0; h < 3; h++) {
                String sign = signs[random.nextInt(signs.length)];
                String color = colors[random.nextInt(colors.length)];
                int value = random.nextInt(6) + 1;   //values between 1 and 6
                //System.out.println("Card" + h + " " + sign + color + value);
                computer_hand += "," + sign + color + value;
                if (h == 2) {
                    System.out.println("Computer_hand:" + computer_hand);
                }
                lastValueComputer = value;
            }
            for (int k = 0; k < 3; k++) {
                String sign = signs[random.nextInt(signs.length)];
                String color = colors[random.nextInt(colors.length)];
                int value = random.nextInt(6) + 1;   //values between 1 and 6
                //System.out.println("Card" + k + " " + sign + color + value);
                player_hand += "," + sign + color + value;
                if (k == 2) {
                    System.out.println("Player_hand:" + player_hand);
                }
                lastValuePlayer = value;
            }


            int[] arr3 = {0, 1, 1, 1, 1};
            int value = random.nextInt(2);   //values are 0 and 1
            //   System.out.println("value:"+value);
            for (int e = 0; e < 2; e++) {
                if (value == 1) {
                    String sign = signs[random.nextInt(signs.length)];
                    String color = colors[random.nextInt(colors.length)];
                    int value1 = random.nextInt(6) + 1;   //values between 1 and 6
                    computer_hand += "," + sign + color + value1;
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
                    player_hand += "," + sign + color + value4;
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
                int RandomIndex = random.nextInt(computerhandArray.length);
                finalcomputerArray[p] = computerhandArray[RandomIndex];
                computer_hand = finalcomputerArray[0] + "," + finalcomputerArray[1] + "," + finalcomputerArray[2] + "," + finalcomputerArray[3];
            }
            System.out.println("Computer_hand:" + computer_hand);

            //AYNI KARTI RANDOM SEÇMESİNİ ENGELLE
        }
    }
    

