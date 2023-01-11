// 5! = 5*4*3*2*1
class FactorsofNumber {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.print("Factors of " + number + ": ");
        for (int i = 1; i < number; i++) {
            if(number%i == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}