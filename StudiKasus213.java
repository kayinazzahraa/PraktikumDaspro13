import java.util.Scanner;
public class StudiKasus213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //Input nama mahasiswa dan jenis kegiatan
        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) ");
        String jenisKegiatan = sc.nextLine();

    //Cek cabang 1
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen: ");
            int dokumen = sc.nextInt();
            System.out.print("Peringkat juara: ");
            int juara = sc.nextInt();

    //Pemberian dana juara
            if (juara >= 1 && juara <= 3) {

            //Status dokumen
            if (dokumen == 4) {
                System.out.println("Status: Dokumen lengkap. Dana penghargaan diberikan.");
            } else {
                System.out.println("Status: Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan");
            }
            
            }
        }
    }
}