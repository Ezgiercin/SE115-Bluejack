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



            String computer_hand= "";
            String player_hand= "";
            for(int g=0;g<5;g++){
                computer_hand += deck[g]+ ",";
                player_hand += deck[deck.length-1-g]+ ",";
            }

            String[] signs = {"+", "-"};
            Random random = new Random();
            for (int h = 0; h < 3; h++) {
                String sign = signs[random.nextInt(signs.length)];
                String color = colors[random.nextInt(colors.length)];
                int value = random.nextInt(6) + 1;   //values between 1 and 6
                //System.out.println("Card" + h + " " + sign + color + value);
                computer_hand += "," + sign + color + value;
                if(h==2) {
                    System.out.println("Computer_hand:" + computer_hand);
                }
            }
            for(int k=0;k<3;k++){
                String sign = signs[random.nextInt(signs.length)];
                String color = colors[random.nextInt(colors.length)];
                int value = random.nextInt(6) + 1;   //values between 1 and 6
                //System.out.println("Card" + k + " " + sign + color + value);
                player_hand += "," + sign + color + value;
                if(k==2) {
                    System.out.println("Player_hand:" + player_hand);
                }
            }
        }

    }

