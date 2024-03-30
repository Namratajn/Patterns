public class Pattern27 {
    public static void main(String[] args) {
        int ch = 65 ;
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=i ; j--) {
                System.out.print((char)(ch+n-i-1));
            }
            System.out.println();
        }
    }
}
/*
EEEEE
DDDD
CCC
BB
A
 */