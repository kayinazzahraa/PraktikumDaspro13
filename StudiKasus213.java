import java.util.Scanner;
public class StudiKasus213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //Input nama mahasiswa dan jenis kegiatan
        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = sc.nextLine();

    //Cek cabang 1 (BELMAWA/BAKORMA/MANDIRI)
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen: ");
            int dokumen = sc.nextInt();
            System.out.print("Peringkat juara: ");
            int juara = sc.nextInt();

    //Pemberian dana juara
            if (juara >= 1 && juara <= 3) {
            //Status kelengkapan dokumen
            if (dokumen == 4) {
                System.out.println("Status: Dokumen lengkap. Dana penghargaan diberikan.");
            } else {
                System.out.println("Status: Dokumen tidak lengkap (kurang " + (4 -  dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
            } 
            } else {
                System.out.println("Status: Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan");
            } 

    //Cek cabang 2 (PKM/LAINNYA)
            } else if (jenisKegiatan.equalsIgnoreCase("pkm")) {
                System.out.print("Jumlah Dokumen: ");
                int dokumen = sc.nextInt();
                System.out.print("Status PKM (1 = lolos, 0 = tidak lolos) : ");
                int pkm = sc.nextInt();

                //Dana untuk PKM yang lolos
                if (pkm == 1) {
                    //Dokumen lengkap 
                    if (dokumen == 4) {
                        System.out.println("Status: Dokumen lengkap. Dana penghargaan diberikan. ");
                    }
                    } else {
                        System.out.println("Status: Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan. ");
                    }
                    //Kegiatan lain yang tidak dapat dana
                } else { 
                    System.out.println("Status: Kegiatan lainnya tidak memperoleh dana penghargaan");
                    }
    }
}
            
        
    
