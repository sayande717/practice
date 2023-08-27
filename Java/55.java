// 0 1 1 2 3 5 8 13 21 34 55 89
class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);
        int i=1;
        do {
            int c=a+b;
            System.out.print(" "+c);
            a = b;
            b = c;
            i++;
        } while(i<=10);
        System.out.println();
    }
}