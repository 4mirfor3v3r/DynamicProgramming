package HitungFibonacci;
import java.util.*;
public class Tugas1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] data ={5000,2000,1000,500,100};
        int[] hasil = new int[5];
        int jumlah,x,temp;
        
        System.out.println("Pecahan Uang Rp. 100, 500, 1000, 2000, 5000");
        System.out.print("Masukkan Jumlah Uang : ");
        jumlah = input.nextInt();
        
        for(int i = 0;i<5;i++){
            temp=jumlah;
            if(jumlah>=data[i]){
               x = jumlah/data[i];
                hasil[i] = x;
                jumlah = temp%data[i];
            }
            else{
                hasil[i]=0;
            }
        }
        
    }
}
