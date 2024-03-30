public class Pattern22 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=i ; j--) {
                System.out.print(n-i);
            }
            System.out.println();
        }
    }
}
/*
55555
4444
333
22
1

 */