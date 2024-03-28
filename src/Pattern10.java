public class Pattern10 {
    public static void main(String[] args) {
        int n = 5 ;
        int ch = 65 ;//A=65
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j <= i ; j ++){

                System.out.print((char)(ch+n-j-1));
            }
            System.out.println();
        }
    }
}
/*
E
ED
EDC
EDCB
EDCBA
 */