

public class numericpattern187 {
    public static void main(String[] args) {
        int n= 5;
        for (int row = 1; row <= n; row++) {
            for (int spaces = n-row; spaces > 0 ; spaces--) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                if (row % 2 == 1){
                    System.out.print(row +" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
