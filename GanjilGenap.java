package TugasPercabangan;
import java.util.Scanner;
public class GanjilGenap {
    public static void main(String[]args){
        int num;
        String jenis;
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka:");
        num = sc.nextInt();
        sc.close();
        if(num % 2 == 0){
            jenis = "Genap";
        }else{
            jenis = "Ganjil";
        }
        System.out.println("Bilangannya adalah Bilangan: "+jenis);
    }
}