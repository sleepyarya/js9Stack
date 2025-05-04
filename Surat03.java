public class Surat03 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // 'S' untuk sakit, 'I' untuk izin lain
    int durasi; // lama izin dalam hari

    public Surat03() {
    }

    public Surat03(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void display() {
        System.out.println("ID Surat: " + idSurat);
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Kelas: " + kelas);
        System.out.println("Jenis Izin: " + (jenisIzin == 'S' ? "Sakit" : "Izin Lain"));
        System.out.println("Durasi: " + durasi + " hari");
    }
}