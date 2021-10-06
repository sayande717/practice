class internship 
{
    float stipend = 50000;
}

class intern extends internship 
{
    float bonus = 5000;
    float total = stipend + bonus;
}

class singleinheritance 
{
    public static void main(String[] args) 
    {
        intern in = new intern();
        System.out.println("Basic stipend = " + in.stipend);
        System.out.println("Bonus on completing extra tasks = " + in.bonus);
        System.out.println("Maximum stipend allowed per month = " + in.total);
    }
}