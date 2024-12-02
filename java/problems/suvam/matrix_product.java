package suvam;

public class matrix_product {
    public static void main(String[] args) {
        //matrix 1
        int[][] matrix1 = new int[2][3];
        matrix1[0] = new int[]{1, 3, 4};
        matrix1[1] = new int[]{4, 5, 6};
        System.out.println("matrix 1 is :");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print("\t" + matrix1[i][j]);
            }
            System.out.println();
        }
        //matrix2
        int[][] matrix2 = new int[2][3];
        matrix2[0] = new int[]{11, 13, 14};
        matrix2[1] = new int[]{24, 15, 16};
        System.out.println("matrix 2 is :");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print("\t" + matrix2[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n product of the two matrix are: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print("\t" + (matrix1[i][j]*matrix2[i][j]));
            }
            System.out.println();
        }
    }
}
