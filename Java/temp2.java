public void setZeroes(int[][] matrix) {
    int m = matrix.length; // number of rows
    int n = matrix[0].length; // number of columns
    for (int rowIndex = 0; rowIndex < m; rowIndex++) {
        for (int colIndex = 0; colIndex < n; colIndex++) {
            if (matrix[rowIndex][colIndex] != 0) {
                continue;
            } else {
                for (int delRow = 0; delRow < m; delRow++) {
                    matrix[delRow][colIndex] = 0;
                }

                for (int delCol = 0; delCol < n; delCol++) {
                    matrix[rowIndex][delCol] = 0;
                }
            }
        }
    }
}
