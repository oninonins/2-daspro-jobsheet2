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

       Mahasiswa05 mhs2 = new Mahasiswa05("Nino","54366633","TI 1F", 3.25);
       mhs2.updateIpk(3.30);
         mhs2.tampilkanInformasi();

        Mahasiswa05 mhs3 = new Mahasiswa05("Eric Cantona","54366633","TI 1r", 3.25);
        mhs3.tampilkanInformasi();
    }
}
