import java.util.Date;
public class Membership {
    private String tipe;
    private double harga;
    private Date tanggalMulai;
    private Date tanggalBerakhir;
    private int durasiHari;

    public Membership() {}

    public Membership(String tipe, double harga, Date tanggalMulai, int durasiHari) {
        this.tipe = tipe;
        this.harga = harga;
        this.tanggalMulai = tanggalMulai;
        this.durasiHari = durasiHari;
   
        long ms = (long) durasiHari * 24 * 60 * 60 * 1000;
        this.tanggalBerakhir = new Date(tanggalMulai.getTime() + ms);
    }

    // Getter
    public String getTipe() { return tipe; }
    public double getHarga() { return harga; }
    public Date getTanggalMulai() { return tanggalMulai; }
    public Date getTanggalBerakhir() { return tanggalBerakhir; }
    public int getDurasi() { return durasiHari; }

    // Setter
    public void setTipe(String tipe) { this.tipe = tipe; }
    public void setHarga(double harga) { this.harga = harga; }
    public void setTanggalMulai(Date tanggalMulai) { this.tanggalMulai = tanggalMulai; }
    public void setTanggalBerakhir(Date tanggalBerakhir){ this.tanggalBerakhir = tanggalBerakhir; }
    public void setDurasiHari(int durasiHari) { this.durasiHari = durasiHari; }

    public String isAktif() {
        Date sekarang = new Date();
        if (tanggalBerakhir == null) return "Tidak Aktif";
        return sekarang.before(tanggalBerakhir) ? "Aktif" : "Kadaluarsa";
    }

    public String perpanjang(int hari) {
        if (tanggalBerakhir == null) tanggalBerakhir = new Date();
        long ms = (long) hari * 24 * 60 * 60 * 1000;
        tanggalBerakhir = new Date(tanggalBerakhir.getTime() + ms);
        durasiHari += hari;
        return "Membership diperpanjang " + hari + " hari. Berakhir: " + tanggalBerakhir;
    }

    public int getSisaHari() {
        if (tanggalBerakhir == null) return 0;
        long diff = tanggalBerakhir.getTime() - new Date().getTime();
        return (int) (diff / (24 * 60 * 60 * 1000));
    }
}
