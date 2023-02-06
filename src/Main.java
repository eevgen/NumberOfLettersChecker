import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter phrase: ");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < phrase.length(); i++) {
            char letter = phrase.charAt(i);

            if(hashMap.containsKey(letter)) {
                int oldCount = hashMap.get(letter);
                int newCount = oldCount + 1;
                hashMap.put(letter, newCount);
            } else {
                hashMap.put(letter, 1);
            }
        }
        System.out.println(hashMap);
    }
}