import java.util.Arrays;

public class charFrequency {

    public static int[] charFr(String s) {

        int frequency[] = new int[26];
        char str[] = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            // 'a' in ASCII (or Unicode) has a value of 97
            frequency[str[i] - 'a']++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        // int frequencies[] = charFr(str);

        // for (int i = 0; i < 26; i++) {
        // char ch = (char) ('a' + i);
        // System.out.println(ch + " :" + frequencies[i]);
        // }

        int frequencies[] = charFr(str);

        System.out.println(Arrays.toString(frequencies));

    }
}