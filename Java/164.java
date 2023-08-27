class BinarySearchSorted2DArray {
    public static void main(String[] args) {
        int[][] array = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        /*
         * In this array, both the rows and columns are sorted in ascending order.
         * The lower bound is the first element in the first row, the upper bound is the
         * topmost element in the last column.
         * Row count starts from 0, Column count starts from array[row].length - 1.
         * If the target element is less than the current array[row][column], then we
         * discard the row (row++).
         * If the target element is greater than the current array[row][column], then we
         * discard the column (column--).
         */
        int numberToBeSearched = 37;
        System.out.println("Row, column: " + binarySearch(array, numberToBeSearched));
    }

    static String binarySearch(int[][] arr, int target) {
        int row = 0;
        int column = arr.length - 1;
        while (row < arr.length && column >= 0) {
            if (arr[row][column] == target) {
                // return row-number column-number (of the target element).
                return Integer.toString(row + 1) + " " + Integer.toString(column + 1);
            }
            if (arr[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return Integer.toString(-1);
    }
}