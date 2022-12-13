#include<stdio.h>
class Employee
{
    char userid[50], password[50];
    int salary;
    public:
        void employee_input()
        {
            printf("Enter Employee User ID: ");
            scanf("%s",&userid);
            printf("Enter password: ");
            scanf("%s",&password);
        }
        //For updating the salary
        void salary_update(int sal)
        {
            salary=sal;
        }
        void employee_display()
        {
            printf("\nEmployee User ID: %s",userid);
            //Uncomment if you want to display the password.
            //printf("\nPassword: %s",password);
            printf("\nSalary: %d\n",salary);
            printf("\n");
        }
};
//Class Admin inherits the public methods of class Employee
class Admin : public Employee
{
    char userid[50],password[50];
    int sal;
    public:
        void admin_input()
        {
            printf("\nEnter Admin User ID: ");
            scanf("%s",&userid);
            printf("Enter password: ");
            scanf("%s",&password);
        }
        void run_admin()
        {
            admin_input();
            printf("Enter new salary: ");
            scanf("%d",&sal);
            salary_update(sal);
            printf("\nInformation updated.");
            employee_display();
        }
        void run_employee()
        {
            employee_input();
        }
};

int main()
{
    Admin ob;
    //First take the employee details as input.
    ob.run_employee();
    //Take admin credentials as input, update the salary, display the updated information.
    ob.run_admin();
    return 0;
}