public class Pattern6 {
    public static void main(String[] args) {
        int n = 5 ;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j <= i ; j ++){
                System.out.print(i+1-j);
            }
            System.out.println();
        }
    }
}
/*
1
21
321
4321
54321

 */