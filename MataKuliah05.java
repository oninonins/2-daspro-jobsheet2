class MataKuliah05 {
    //atribut
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    public MataKuliah05() {
    }

    public MataKuliah05(String kode, String nm, int sksMK, int jam) {
        kodeMK = kode;
        nama = nm;
        sks = sksMK;
        jumlahJam = jam;
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam += jam;

    }

    void kurangiJam(int jam) {
        //pengecekan jumlah jam bisa dikurangi atau tidak
        if (jumlahJam - jam >= 0) {
            jumlahJam -= jam;
        } else {
            System.out.println("Jumlah jam tidak valid");
        }
    }

}
