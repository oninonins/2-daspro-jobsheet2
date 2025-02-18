public class MahasiswaMain05 {
    
    public static void main(String[] args) {
        
        // Membuat objek Mahasiswa
        Mahasiswa05 mhs1 = new Mahasiswa05();
        mhs1.nama = "Farrelino";
        mhs1.nim = "244107020122";
        mhs1.kelas = "TI 1F";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 1E");
        mhs1.updateIpk(3.75);
        mhs1.tampilkanInformasi();
    }
}
