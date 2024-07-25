public class toHexadecimal {

    public static String toHexa(int n) {
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

        String res = "";

        // Handle the case where n is 0
        if (n == 0) {
            return "0";
        }

        // Convert to hexadecimal
        while (n != 0) {
            res = hex[n & 15] + res;
            n = n >>> 4;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(toHexa(26)); // Expected output: 15
    }
}
