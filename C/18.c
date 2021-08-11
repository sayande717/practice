//Input details of n students, print details of student with highest marks.
#include <stdio.h>
struct student
{
    int roll_no, marks;
    char name[25];
} stud[100], t;

void main()
{
    int i, j, n;
    printf("Enter the no of students\n");
    scanf("%d", &n);
    printf("Enter student information\nFormat:- Name <press Enter> Roll No <press Enter> Marks\n");
    for (i = 0; i < n; i++)
    {
        scanf("%s %d %d", stud[i].name, &stud[i].roll_no, &stud[i].marks);
    }
    for (i = 0; i < n; i++) //Sorting in descending order, stud[0].marks = highest marks.
    {
        for (j = 0; j < n - 1; j++)
        {
            if (stud[j].marks < stud[j + 1].marks)
            {
                t = stud[j];
                stud[j] = stud[j + 1];
                stud[j + 1] = t;
            }
        }
    }
    printf("\nDetails of student with highest marks\n");
    printf("Name:%s\nRoll No:%d\nMarks:%d\n", stud[0].name, stud[0].roll_no, stud[0].marks);
}