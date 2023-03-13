/* Recursion: A function that calls itself.
 * Base condition: A condition where recursion will stop making new calls.
 * All function calls go into the stack memory.
 * While the function has not finished executing, it will remain in the stack.
 * When a function finishes executing, it is removed from the stack and the flow of program is restored to the position where the function was called.
 * The stack memory operates in LIFO.
 */

class Numbers {
    public static void main(String[] args) {
        // print1(1);
        print(1);
    }
    /* Here, the function body of print1-print4 is the same, but that of print5 is different.
     * print1-print4 are calling another function within themselves.
     * Stack:
     * | print5(5) |
     * | print4(4) |
     * | print3(3) |
     * | print2(2) |
     * | print1(1) |
     * |__main()___|
    */
    

    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }
    
    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }

    static void print5(int n) {
        System.out.println(n);
    }
    
    // Recursive approach
    static void print(int n) {
        if(n>5) {
            System.out.println();
            return;
        }
        System.out.print(n+" | ");
        print(n+1);
    }
}