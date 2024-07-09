class isSharpee {

    public static boolean sharpee(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum % 5 == 0;
    }

    public static int[] printSharpee(int n) {

        int storedSharpee[] = new int[n];
        int num = 1;
        int count = 0;
        while (count < n) {
            if (sharpee(num)) {
                storedSharpee[count] = num;
                count++;
            }
            num++;
        }

        return storedSharpee;
    }

    public static void main(String args[]) {
        int arr[] = printSharpee(100);
        for (int res : arr) {
            System.out.print(res + " ");
        }
        System.out.println();

    }
}
