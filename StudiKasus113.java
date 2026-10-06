import java.util.Scanner;
public class StudiKasus113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //Deklarasi variabel
    int hargaPerCup = 18000;
    int jumlahCup, uangBayar;
    int totalHarga, diskon, totalBayar;
    int kembalian, kurang;

    //Input jumlah cup
    System.out.print(" Masukkan jumlah cup: ");
    jumlahCup = sc.nextInt();
    System.out.print(" Masukkan uang bayar: ");
    uangBayar = sc.nextInt();

    //Hitung total harga awal & diskon
    totalHarga = jumlahCup * hargaPerCup;
    diskon = 0;
    
    //Hitung diskon berdasarkan min. pembelian
    if (totalHarga >= 100000) {
        diskon = totalHarga * 10 / 100;
    
    //Hitung total bayar setelah diskon
    totalBayar = totalHarga - diskon;

    //Output total harga, diskon, total bayar
    System.out.println("Total harga: "+ totalHarga);
    System.out.println("Diskon: " + diskon);
    System.out.println("Total bayar: " + totalBayar);

    //Hitung kembalian atau kurang
    if (uangBayar >= totalBayar) {
        kembalian = uangBayar - totalBayar;
        System.out.println("Kembalian: " + kembalian);
    } else {
        kurang = totalBayar - uangBayar;
        System.out.println("Uang tidak cukup, kurang Rp " + kurang);
    }

}

    }
}
