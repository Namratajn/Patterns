public class Pattern28 {
    public static void main(String[] args) {
        int ch = 65 ;
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=i ; j--) {
                System.out.print((char)(ch+i));
            }
            System.out.println();
        }
    }
}
/*
AAAAA
BBBB
CCC
DD
E
 */