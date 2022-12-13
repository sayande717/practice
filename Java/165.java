import javax.lang.model.util.ElementScanner14;
import javax.print.FlavorException;

class searchSortedMatrix {
    public static void main(String[] args) {
        int[][] array = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        int numberToBeSearched = 15;
        int startRow = 0;
        int endRow = array.length - 1;
        while(startRow <= endRow) {
            int mid = startRow + (endRow-startRow) / 2;
            int midElement = array[startRow][mid];
            if(numberToBeSearched < midElement) {
                endRow = startRow;
            }
            else if(numberToBeSearched == midElement) {
                System.out.println("Element found at row "+(startRow));
            }

        }
        
    }
}