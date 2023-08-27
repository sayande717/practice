class switchnew
{
    public static void main(String[] args) 
    {
        int n = 2;
        int m = 10;
        switch(n) //Single cases
        {
            case 1 -> System.out.println("One"); //For single line
            case 2 -> 
            {
                System.out.println("Two"); //For multiple lines
            }
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            default -> System.out.println("Something");
        }    
        switch(m) //Multiple cases
        {
            case 1,2,3,4,5 -> System.out.println("1,2,3,4,5");
            case 6,7,8 -> System.out.println("6,7,8");
            case 9 -> System.out.println("9");
            default -> System.out.println("Something");
        }
    }
}