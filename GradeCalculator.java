import java.util.Scanner;
public class GradeCalculator 
{
    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in)) 
        {
            System.out.println( "Enter the candidate name:");
            String name = input.nextLine();
            // Get the student's grades.
            System.out.println( "Enter the candidate grades:");
            int[] Marks = new int[6];
            for (int i = 0; i < Marks.length; i++)
            {
                Marks[i] = input.nextInt();
            }
            // Calculate the student's average grade.
            int average = 0;
            for (int grade : Marks) 
            {
                average += grade;
            }
            average /= Marks.length;
            System.out.println("Student Name: " + name);
            System.out.println("Average Grade: " + average);
            String Grade;
            if (average == 100)
            {
                Grade = "A+";
            } else if (average >= 90) 
            {
                Grade = "A";
            } else if (average >= 80) 
            {
                Grade = "B";
            } else if (average >= 70)
            {
                Grade = "C";
            } else if (average >= 60)
            {
                Grade = "D";
            } else
            {
                Grade = "F";
            }
            System.out.println("Grade: " + Grade);
        }
    }
}
