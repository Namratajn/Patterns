public class Pattern24 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=i ; j--) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
/*
54321
5432
543
54
5
 */