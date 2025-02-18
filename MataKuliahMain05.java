public class MataKuliahMain05 {
    
    public static void main(String[] args) {

        // objek MataKuliah
        MataKuliah05 mk1 = new MataKuliah05();
        mk1.kodeMK = "MK001";
        mk1.nama = "Pemrograman Berorientasi Objek";
        mk1.sks = 3;
        mk1.jumlahJam = 1;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilkanInformasi();


        MataKuliah05 mk2 = new MataKuliah05("MK002", "Pemrograman Web", 3, 2);
        mk2.tampilkanInformasi();
    }

}
