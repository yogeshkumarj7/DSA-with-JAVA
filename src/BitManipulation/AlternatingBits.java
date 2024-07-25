class AlternatingBits {

    public static boolean isAlternate(int N) {
        int prevBit = N % 2;
        N /= 2;
        while (N > 0) {
            if (N % 2 == prevBit) {
                return false;

            } else {
                prevBit = N % 2;
            }

            N /= 2;
        }

        return true;

    }

    public static void main(String args[]) {
        System.out.println(isAlternate(0));
    }

}