import java.util.Scanner;
public class StudiKasus113 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

    //Deklarasi varibale
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon = 0, totalBayar;
        int kembalian, kurang;

    //Input jumlah cup & uang bayar
        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        uangBayar = sc.nextInt();

    //Hitung total harga awal
        totalHarga = jumlahCup * hargaPerCup;

    //Cek diskon
    if (totalHarga >= 100000) {
        diskon = totalHarga * 10 / 100;
    }
    //Total bayar setelah diskon
      totalBayar = totalHarga - diskon;

    //Output totalHarga, diskon, totalBayar
        System.out.println("Total harga: Rp " + totalHarga);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("total bayar: Rp " + totalBayar);

    //Cek kembalian atau kurang
    if (uangBayar >= totalBayar) {
        kembalian = uangBayar - totalBayar;
        System.out.println("Kembalian: Rp " + kembalian);
    } else {
        kurang = totalBayar - uangBayar;
        System.out.println("Uang tidak cukup, kurang: Rp " + kurang);
    }
    }
    
}
    
