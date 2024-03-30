public class Pattern36 {
    public static void main(String[] args) {
        int ch = 96;
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print((char) (ch+n-j));
            }
            System.out.println();
        }
    }
}
/*
abcde
abcd
abc
ab
a
 */