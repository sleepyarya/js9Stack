package js9Stack;

public class Mahasiswa03 {

    String nama, nim, kelas;
    int nilai;

    Mahasiswa03(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
