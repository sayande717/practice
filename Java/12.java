import java.util.Scanner;
class nestedswitch
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int empID = in.nextInt();
        System.out.print("Enter Department: ");
        String department = in.next();
        switch(empID)
        {
            case 1 -> System.out.println("Name 1");
            case 2 -> System.out.println("Name 2");
            case 3 ->
            {
                switch(department)
                {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management");
                    default -> System.out.println("No Department");
                }
            }
            default -> System.out.println("Employee does not exist.");
        }
        in.close();
    }
}