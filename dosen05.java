class dosen05 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlihan;


    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlihan: " + bidangKeahlihan);
        System.out.println("Lama bekerja " + hitungMasaKerja(2025) + " tahun");
    }

    public dosen05() {
    }

    public dosen05(String id, String nm, boolean status, int thn, String bidang) {
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = thn;
        bidangKeahlihan = bidang;
    }

    void ubahStatusAktif(boolean statusBaru) {
        statusAktif = statusBaru;
    }

     int hitungMasaKerja(int thnSkrng) {
        return thnSkrng - tahunBergabung;
     }


     void ubahKeahlihan(String bidangBaru) {
        bidangKeahlihan = bidangBaru;
     }

}
