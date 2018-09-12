package HitungFibonacci;
import java.util.*;
public class HitungFibonacci {
    public static void tampilJudul(String identitas){
        System.out.println("Identitas : "+ identitas);
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    
    public static void main(String[] args){
        String identitas = "Ahmad Amirudin / X-RPL3 / 02";
        tampilJudul(identitas);
        
        int n = tampilInput();
    }
    
    private static int tampilInput(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bilangan Ke-: ");
        int n = input.nextInt();
        
        return n;
    }
}
