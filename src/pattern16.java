public class pattern16 {
    public static void main(String[] args) {
        int n = 5;
        int ch = 97;//a=97
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(ch+n-1-j));
            }
            System.out.println();
        }
    }
}
/*
e
ed
edc
edcb
edcba
 */