import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner kb = new Scanner((System.in));

        System.out.println("---STUDENT GRADE CALCULATOR---");

        System.out.println("Enter number of Subjects:");
        // Taking number of subjects
        int noOfSubjects = kb.nextInt();

        int marks;
        // Adding totals subject Marks
        int sum=0;
        for(int i=1; i<=noOfSubjects; i++){
            System.out.println("Enter marks of subject "+i+" out of 100:");
            // inputting student subject marks
            marks = kb.nextInt();
            // Printing a message if user inputted above marks than 100
            if(marks > 100){
                System.out.println("You have to input out of 100 marks not above them");
                break;
            }
            sum+=marks;
        }
        // Finding Average Marks
        double avg = (double)sum/noOfSubjects;

        System.out.println("Total marks obtained: "+sum+"/"+(noOfSubjects*100));
        System.out.println("Average Percentage is: "+avg+"%");

        // Gives grade as per the marks
        if(avg > 90 && avg <= 100){
            System.out.println("Grade is: 'A+'");
        }
        else if(avg > 80 && avg <= 90){
            System.out.println("Grade is: 'A'");
        }
        else if(avg > 70 && avg <= 80){
            System.out.println("Grade is: 'B+'");
        }
        else  if(avg > 60 && avg <= 70){
            System.out.println("Grade is: 'B'");
        }
        else if(avg > 50 && avg <= 60){
            System.out.println("Grade is: 'C+'");
        }
        else if(avg > 40 && avg <= 50){
            System.out.println("Grade is: 'C'");
        }
        else if(avg > 33 && avg <= 40){
            System.out.println("Grade is: 'D'");
        }
        else{
            System.out.println("Grade is: 'F'");
        }

    }
}

