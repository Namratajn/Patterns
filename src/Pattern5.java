public class Pattern5 {
    public static void main(String[] args) {
        int n = 5 ;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j <= i ; j ++){
                System.out.print(n-j);
            }
            System.out.println();
        }
    }
}
/*
5
54
543
5432
54321

 */