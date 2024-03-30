public class Pattern21 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=i ; j--) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
/*
11111
2222
333
44
5

 */