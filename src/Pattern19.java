public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        int ch = 97;//a=97
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(ch+i-j));
            }
            System.out.println();
        }
    }
}
/*
a
ba
cba
dcba
edcba
 */