/*
  *   *   *
 * * * * * *
*   *   *   *

*/

// spaces : 3 1 3
// stars:
// class Pattern {
//     public static void main(String[] args) {
//         for(int i = 2;i>0;i--) {
//             for(int printFirstSpace = 0;printFirstSpace<i;printFirstSpace++) {
//                 System.out.print(" ");
//             }
            
//         }
//     }
// }





// Merge Sort
import java.util.Arrays;
class Sort {
    public static void main(String[] args) {
        int[] array = {-1,542,323,0,993,-93};
        System.out.println(Arrays.toString(divideArray(array)));
    }

    static int[] divideArray(int[] inArray) {
        if(inArray.length == 1) {
            return inArray;
        }
        int mid = inArray.length/2;
        int[] LHS = divideArray(Arrays.copyOfRange(inArray, 0, mid));
        int[] RHS = divideArray(Arrays.copyOfRange(inArray, mid, inArray.length));
        return mergeSort(LHS,RHS);
    }


    static int[] mergeSort(int[] inArray1, int[] inArray2) {
        int[] outArray = new int[inArray1.length+inArray2.length];
        int Array1Index,Array2Index,outArrayIndex;
        Array1Index = Array2Index = outArrayIndex = 0;
        while(Array1Index < inArray1.length && Array2Index < inArray2.length) {

            if(inArray1[Array1Index] <= inArray2[Array2Index]) {
                 outArray[outArrayIndex] = inArray1[Array1Index];
                Array1Index++;
            }

            else if(inArray1[Array1Index] > inArray2[Array2Index]) {
                outArray[outArrayIndex] = inArray2[Array2Index];
                Array2Index++;
            }

            outArrayIndex++;
        }

        
        while(Array1Index < inArray1.length) {
            outArray[outArrayIndex] = inArray1[Array1Index];
            Array1Index++;
            outArrayIndex++;
        }

        while(Array2Index < inArray2.length) {
            outArray[outArrayIndex] = inArray2[Array2Index];
            Array2Index++;
            outArrayIndex++;
        }
        

        return outArray;
    }
}