public class Matrix {
    int[][] mat1 = new int[3][3];
    int[][] mat2 = new int[3][3];
    int[][] result = new int[3][3];

    Matrix(int[][] mat1, int[][] mat2) {
        this.mat1 = mat1;
        this.mat2 = mat2;
    }

    int[][] matrixAdd(int[][] mat1, int[][] mat2) {
        this.mat1 = mat1;
        this.mat2 = mat2;

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

    int[][] matrixSub(int[][] mat1, int[][] mat2) {
        this.mat1 = mat1;
        this.mat2 = mat2;

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return result;
    }

    int[][] matrixMul(int[][] mat1, int[][] mat2) {
        this.mat1 = mat1;
        this.mat2 = mat2;

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                for (int k = 0; j < mat1[i].length; j++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }

            }
        }
        return result;
    }

    int[][] matrixPrint(int[][] mat) {

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat1 = {
                { 4, 2, 1 },
                { 6, 4, 2 },
                { 5, 2, 7 },
        };
        int[][] mat2 = {
                { 9, 7, 1 },
                { 1, 4, 5 },
                { 6, 2, 4 },
        };

        Matrix matrix = new Matrix(mat1, mat2);
        matrix.matrixPrint(mat1);     
    }

}