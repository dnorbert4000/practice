import java.util.ArrayList;
import java.util.Collections;

public class PokerHand {

    public static void main(String args[]) {
        ArrayList<Integer> hand = new ArrayList();
        hand.add(2);
        hand.add(7);
        hand.add(12);
        hand.add(11);
        hand.add(3);
        hand.add(4);
        hand.add(14);
        IsStraight(hand);
    }

    public static boolean IsStraight(ArrayList<Integer> cards) {
        Collections.sort(cards);
        int counter = 0;
        int indexAce = cards.indexOf(14);
        if(indexAce >0 /*& indexAce<cards.size()-1*/) {
            cards.remove(indexAce);
            cards.add(0,14);
            counter++;
        }
        System.out.println(cards);
        for(int i=0; i<cards.size()-1; i++) {
            if(i <cards.size()-1) {
                if (cards.get(i) + 1 == cards.get(i + 1) /*& cards.get(i)-1*/) {
                    counter++;
                }
            }
        }
        if(counter+1==cards.size()-1 & cards.size()>4 || counter>3) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

}
