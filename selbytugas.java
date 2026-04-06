import java.util.Scanner;
    public class selbytugas{
        public static void main (String[] args) {
            Scanner input = new Scanner(System.in);
            
            System.out.print("Makanan : ");
            float makan = input.nextFloat();

            System.out.print("Transportasi : ");
            float trans = input.nextFloat();

            System.out.print("Belanja : ");
            float belanja = input.nextFloat();

            float pengeluaran = makan + trans + belanja;

            double total_makan = ((double)makan / pengeluaran) * 100;
            double total_trans = ((double)trans / pengeluaran) * 100;
            double total_belanja = ((double)belanja / pengeluaran) * 100;

            System.out.printf("Makanan  : %.2f%%\n", total_makan);
            System.out.printf("Transportasi : %.2f%%\n", total_trans);
            System.out.printf("Belanja  : %.2f%%\n", total_belanja);


        }
    }