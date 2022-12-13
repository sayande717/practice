class minmaxin2Darray
{
    public static void main(String[] args) {
    }
    static int[] minandmax(int arr[]) {
        int a[] = new int[2];
        /*
         * a[0] = Minimum element.
         * a[1] = Maximum element.
         */
        a[0] = a[1] = arr[0];
        for (int row = 1; row < arr.length; row++) {
            if (arr[row] < a[0]) {
                a[0] = arr[row];
            }
            if (arr[row] > a[1]) {
                a[1] = arr[row];
            }
        }
        return a;
    }
}