public class Pattern7 {
    public static void main(String[] args) {
        int n = 5 ;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j <= i ; j ++){
                System.out.print(n-i+j);
            }
            System.out.println();
        }
    }
}
/*
5
45
345
2345
12345
 */