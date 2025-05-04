
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat03 stack = new StackSurat03(10);
        int pilih;

        do {
            System.out.println("\n=== Sistem Pengelolaan Surat Izin ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    stack.push(new Surat03(id, nama, kelas, jenis, durasi));
                    break;

                case 2:
                    Surat03 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("=== Surat Diproses ===");
                        proses.display();
                    }
                    break;

                case 3:
                    Surat03 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("=== Surat Terakhir ===");
                        terakhir.display();
                    } else {
                        System.out.println("Belum ada surat!");
                    }
                    break;

                case 4:
                    System.out.print("Cari nama mahasiswa: ");
                    String cari = sc.nextLine();
                    if (stack.search(cari)) {
                        System.out.println("Surat ditemukan!");
                    } else {
                        System.out.println("Surat tidak ditemukan!");
                    }
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
}