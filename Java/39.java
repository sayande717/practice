class AreaOfParallelogram
{
    public static void main(String[] args) 
    {
        int base = 20;
        int height = 40;
        System.out.println("Area: "+(base * height));
        //Length of adjacent sides and sin is given.
        int side1 = 30;
        int side2 = 40;
        int angle = 90;
        System.out.println("Area: "+(float)(side1 * side2 * Math.sin(angle)));        
    }
}