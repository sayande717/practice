class SortedMatrix {

    public static void main(String[] args) {
        int[][] array = {
                { 2, 3, 4, 5 },
                { 6, 7, 8, 9 },
                { 11, 12, 13, 14 },
                { 66, 67, 68, 69 }
        };
        int numberToBeSearched = 8;
        int rowStart = 0;
        int rowEnd = array.length - 1;
        while (rowStart != rowEnd) {
            int rowMid = rowStart + (rowEnd - rowStart) / 2;
            int middleElement = (array[rowMid].length - 1) / 2;
            if (array[rowMid][middleElement] < numberToBeSearched) {
                rowStart++;
            } 
            else if (array[rowMid][middleElement] > numberToBeSearched) {
                rowEnd--;
            } 
            else {
                break;
            }
        }
        rowStart = rowStart - 1;
        int targetColumn = binarySearch(array[rowStart], numberToBeSearched);
        if (targetColumn == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at row: " + (rowStart+1) + " and column: " + (targetColumn+1));
        }
    }

    static int binarySearch(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (arr[midIndex] < target) {
                startIndex = midIndex + 1;
            } else if (arr[midIndex] > target) {
                endIndex = midIndex - 1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }
}
