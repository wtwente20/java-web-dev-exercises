package studio2;
import java.util.HashMap;
import java.util.Map;
public class CountingCharacters {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least" +
                " one of the two terms has to be zero to start with. So if you move all the" +
                " terms over to one side, you can put the quadratics into a form that can be " +
                "factored allowing that side of the equation to equal zero. Once you’ve done " +
                "that, it’s pretty straightforward from there.";
        char[] charactersInString = quote.toLowerCase().toCharArray();

        HashMap<Character, Integer> characterMap = new HashMap<>();


        for (char letter : charactersInString) {
            if (characterMap.containsKey(letter)) {
                characterMap.put(letter, characterMap.get(letter) + 1);
            } else {
                characterMap.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> newLetter : characterMap.entrySet()) {
            System.out.println(newLetter.getKey() + ": " + newLetter.getValue());

        }
    }
}