public class dosenMain05 {
    
    public static void main(String[] args) {
        
        dosen05 dosen1 = new dosen05();
        dosen1.idDosen = "D001";
        dosen1.nama = "Budi";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlihan = "Pemrograman";
        dosen1.hitungMasaKerja(2025);


        dosen1.tampilkanInformasi();
        
        dosen05 dosen2 = new dosen05("D002", "sumbul", false, 2015, "Jaringan");
        dosen2.tampilkanInformasi();
        dosen2.hitungMasaKerja(2025);


    }
}
