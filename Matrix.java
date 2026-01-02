class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }
    }
}