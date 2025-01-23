import java.util.Scanner;
public class Assignment_1_23{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the percentage: ");
        double number = myObj.nextInt();
        String letterGrade = "";
        if (number >= 90){
            letterGrade = "A";
        } else if (number >= 80 && number < 90){
            letterGrade = "B";
        } else if (number >= 70 && number < 80){
            letterGrade = "C";
        } else if (number >= 60 && number < 70){
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        System.out.printf("Your grade for %.2f is:  %s\n", number, letterGrade);
    }
} 

