public class Pattern3 {
    public static void main(String[] args) {
        int n = 5 ;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j <= i ; j ++){
                System.out.print(n-i);
            }
            System.out.println();
        }
    }
}
/*
5
44
333
2222
11111
 */