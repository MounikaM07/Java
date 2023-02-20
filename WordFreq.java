import java.util.Scanner;
import java.util.HashMap;

public class WordFeq {
    public  static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println("Enter a sentence : ");
        String s=sc.nextLine();
        String[] words = s.split(" ");
        for (String word : words) {
            if (hm.containsKey(word))
                hm.put(word, hm.get(word) + 1);

            else
                hm.put(word, 1);

        }

        System.out.println(hm);
    }
}