class ProductnSumofDigits {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int sum=0,product=1;
        while(number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            product = product * digit;
            number = number / 10;
        }
        System.out.println("Result: "+(product-sum));
    }
}