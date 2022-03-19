import java.util.ArrayList;

public class Matrix {

    public static ArrayList indexesOfNullColumns (int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < matrix[0].length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] != 0) break;

                if(j == matrix.length - 1) result.add(i);
            }
        }

        return result;
    }

    public static int[] indexOfMaximum (int[][] matrix) {
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 0;
        int max = matrix[0][0];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }


        return result;
    }

}
