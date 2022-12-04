class SimpleInterest
{
    public static void main(String[] args) 
    {
        float p = 1000;
        float r = 10.5f; //per annum
        float t = 2;
        float simpleintest = calcSimpleInterest(p, r, t);
        System.out.println("Simple Interest: "+simpleintest);
        System.out.println("Total amount: "+(p+simpleintest));
    }
    static float calcSimpleInterest(float principal, float rate, float time)
    {
        return (principal * (rate/100) * time);
    }
}