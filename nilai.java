package TugasPercabangan;
import java.util.Scanner;
public class nilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        char grade;
        System.out.println("Masukkan nilai:");
        num = sc.nextInt();
        if(num >=85) {
            grade = 'A';
            System.out.println("Grade Anda: "+ grade);
        }else if (num >= 75) {
            grade = 'B';
            System.out.println("Grade Anda: "+ grade);
        }else if (num >= 65) {
            grade = 'C';
            System.out.println("Grade Anda: "+ grade);
        }else if (num >= 55) {
            grade = 'D';
            System.out.println("Grade Anda: "+ grade);
        }else{
            grade = 'E';
            System.out.println("Grade Anda: "+ grade);
        }sc.close();
        }
    }
