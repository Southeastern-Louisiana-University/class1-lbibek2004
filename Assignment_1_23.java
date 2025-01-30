import java.util.Scanner;
public class Assignment_1_23{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int terminate = 0, count = 0;
        double number = 0, total = 0;

        while (terminate != -1){
        System.out.print("Enter the percentage(-1 to end): ");
        number = myObj.nextInt();
        terminate = (int) number;
        if (number > 110){
            System.out.print("Invalid input. Please ensure number is between 0 and 110.\nEnter the percentage(-1 to end):");
            //number = myObj.nextInt();
            continue;
        }
        total += number;
        if (terminate == -1){
            break;
        }
        count++;
        }
        double average = total / count;
        String letterGrade = "";
        if (average >= 90){
            letterGrade = "A";
        } else if (average >= 80 && average < 90){
            letterGrade = "B";
        } else if (average >= 70 && average < 80){
            letterGrade = "C";
        } else if (average >= 60 && average < 70){
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        System.out.printf("Your grade for %.2f is:  %s\n", average, letterGrade);
    }
} 

