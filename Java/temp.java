class Solution {
    public final static void main(int[][] matrix) {
        int m = matrix.length; // head
        int n = matrix[0].length; // tail
        System.out.println(m+','+n);
        for (int rowIndex = 0; rowIndex < m; rowIndex++) {
            for (int colIndex = 0; colIndex < n; colIndex++) {
                if (matrix[rowIndex][colIndex] != 0) {
                    continue;
                } else {
                    for (int delRow = 0; delRow < n; delRow++) {
                        matrix[rowIndex][delRow] = 0;
                    }

                    for (int delCol = 0; delCol < m; delCol++) {
                        matrix[delCol][colIndex] = 0;
                    }

                    rowIndex++;
                    colIndex++;
                }
            }
        }
    }
}