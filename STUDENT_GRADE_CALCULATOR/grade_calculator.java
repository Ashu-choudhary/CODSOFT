import java.util.*;

public class grade_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean generate_again = true;

        while (generate_again){

            System.out.println("------------WELCOME STUDENT GRADE CALCULATOR------------");
            System.out.print("Enter the Name of Student :- ");
            String name = sc.next();
            System.out.println("HEY! " + name);
            System.out.print("Enter the marks of Maths:- ");
            int math = sc.nextInt();
            System.out.print("Enter the marks of Science:- ");
            int science = sc.nextInt();
            System.out.print("Enter the marks of Hindi:- ");
            int hindi = sc.nextInt();
            System.out.print("Enter the marks of English:- ");
            int english = sc.nextInt();
            System.out.print("Enter the marks of Social Science:- ");
            int social_science = sc.nextInt();

            int total = math+science+hindi+english+social_science;
            int average_percentage = total/5;

            System.out.println("Total Marks is :- " + total);
            System.out.println("Average Percentage is :- " + average_percentage + "%");

            if(average_percentage>=60){
                System.out.println("Congratulations " + name + " You PASS with First Division");
            }
            else if(average_percentage>=50 ){
                System.out.println("Congratulations " + name + " You PASS with Second Division");
            }
            else if(average_percentage>=40 ){
                System.out.println("Congratulations " + name + " You PASS with Third Division");
            }
            else if(average_percentage>=33 ){
                System.out.println("Congratulations " + name + " You just PASS" );
            }
            else{
                System.out.println("Sorry " + name + " You FAIL 'TRY HARDWORK" );
            }

            System.out.println("YOU WANT TO CALCULATE MORE (y/n):");
            String generate_again_Input = sc.next().toLowerCase();
            generate_again = generate_again_Input.equals("y");
        }

        sc.close();

    }
    
}