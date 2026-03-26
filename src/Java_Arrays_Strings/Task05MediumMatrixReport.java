package Java_Arrays_Strings;

public class Task05MediumMatrixReport {
    public static void main (String[] args){
        int[][] matrix = {
                {13, 27, 30, 48},
                {15, 25, 35, 45},
                {12, 22, 32, 42}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row sum: " + rowSum);
        }

        int allRows = matrix.length;
        int allCols = matrix[0].length;
        for (int j = 0; j < allCols; j++) {
            int colSum = 0;
            for (int i = 0; i < allRows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column sum: " + colSum);
        }

        int totalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                totalSum += matrix[i][j];
            }
            System.out.println("Total sum: " + totalSum);
        }



    }

}
