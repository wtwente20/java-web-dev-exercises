package exercises.two;
import java.util.ArrayList;
public class ArrayList1 {
    public static String fiveLetters(ArrayList<String> arr) {
        String filler = "";
        for(String string : arr) {
            if(string.size() == 5) {
                filler += string;
            }
        }
    }
    public static int evenNums(ArrayList<Integer> arr) {
        int total = 0;
        for(int integer : arr) {
            if(integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        nums.add(11);
        System.out.println(evenNums(nums));
    }
}
