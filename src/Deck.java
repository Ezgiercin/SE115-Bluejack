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
            //for(int c=0;c<deck.length;c++){ System.out.println(deck[c]);}

            computer_hand=deck[0]+"+";
            player_hand=deck[39]+"+";
            computer_hand+=deck[1]+"+";
            player_hand+=deck[38]+"+";
            computer_hand+=deck[2]+"+";
            player_hand+=deck[37]+"+";
            computer_hand+=deck[3]+"+";
            player_hand+=deck[36]+"+";
            computer_hand+=deck[4];
            player_hand+=deck[35];



        }
    }

