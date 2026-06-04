public class Trainer extends Pengguna{

    private String spesialisasi;
    private double gajiPerJam;
    private double rating;

    public Trainer() {}

    public Trainer(int id, String nama, String email, String noTelp,
                   String spesialisasi, double gajiPerJam, double rating) {
        super(id, nama, email, noTelp);
        this.spesialisasi = spesialisasi;
        this.gajiPerJam = gajiPerJam;
        this.rating = rating;
    }

    // Getter
    public String getSpesialisasi() { return spesialisasi; }
    public double getGajiPerJam() { return gajiPerJam; }
    public double getRating() { return rating; }

    // Setter
    public void setSpesialisasi(String spesialisasi) { this.spesialisasi = spesialisasi; }
    public void setGajiPerJam(double gajiPerJam) { this.gajiPerJam = gajiPerJam; }
    public void setRating(double rating) { this.rating = rating; }

    public double hitungGaji(int jamKerja) {
        return gajiPerJam * jamKerja;
    }

    public String getJadwalAktif() {
        return "Trainer " + getNama() + " memiliki jadwal aktif.";
    }

    public JadwalLatihan buatJadwal(String namaKelas, String waktu, int kapasitas) {
        JadwalLatihan jadwal = new JadwalLatihan();
        jadwal.setNamaKelas(namaKelas);
        jadwal.setWaktuMulai(waktu);
        jadwal.setKapasitas(kapasitas);
        jadwal.setTrainer(this);
        return jadwal;
    }

    @Override
    public String getInfo() {
        return "[TRAINER] Nama: " + getNama()
                + " | Spesialisasi: " + spesialisasi
                + " | Rating: " + rating
                + " | Gaji/Jam: Rp" + String.format("%,.0f", gajiPerJam);
    }
}

    
