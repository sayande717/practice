class Reverse {
    static int reverse(int number) {
        int rev=0;
        while (number != 0) {
            rev = rev*10+(number%10);
            number/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println("Reverse: "+reverse(Integer.parseInt(args[0])));
    }
}