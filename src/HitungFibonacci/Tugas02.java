package HitungFibonacci;

import java.util.Scanner;

public class Tugas02 {
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] data ={10000,7000,5000,3000,2000};
        int berat[] = {7,5,4,3,2};
        int[] hasil = new int[5];
        int[] total = new int[5];
        String[] br = {"E","B","A","D","C"};
        int jumlah,x,temp;
        int t=0;
        
        System.out.print("Masukkan Berat Barang : ");
        jumlah = input.nextInt();
        
        for(int i = 0;i<5;i++){
            temp=jumlah;
            if(jumlah>=berat[i]){
               x = jumlah/berat[i];
               total[i] += x*data[i];
                hasil[i] = x;
                jumlah = temp%berat[i];
            }
            else{
                hasil[i]=0;
            }
        }
        for(int i=0;i<5;i++){
            System.out.println("Barang Jenis "+br[i]+" Sebanyak "+hasil[i]+" Dengan Harga "+total[i]);
            t +=total[i]; 
        }
            System.out.println("");
            System.out.println("Total Rp."+t);
    }
}
