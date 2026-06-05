import java.util.Date;
public class Member extends Pengguna {
    private int nomorMember;
    private Date tanggalDaftar;
    private String statusAktif;
    private Membership membership;

    public Member() {}

    public Member(int id, String nama, String email, String noTelp,
                  int nomorMember, Date tanggalDaftar, String statusAktif) {
        super(id, nama, email, noTelp);
        this.nomorMember = nomorMember;
        this.tanggalDaftar = tanggalDaftar;
        this.statusAktif = statusAktif;
    }

    // Getter
    public int getNomorMember() {
        return nomorMember; 
    }
    
    public Date getTanggalDaftar() {
        return tanggalDaftar; 
    }
    
    public String getStatusAktif() {
        return statusAktif; 
    }
    
    public Membership getMembership() {
        return membership; 
    }

    // Setter
    public void setNomorMember(int nomorMember) {
        this.nomorMember = nomorMember;
    }
    
    public void setTanggalDaftar(Date tanggalDaftar) { 
        this.tanggalDaftar = tanggalDaftar; 
    }
    
    public void setStatusAktif(String statusAktif) { 
        this.statusAktif = statusAktif; 
    }
    
    public void setMembership(Membership membership) { 
        this.membership = membership; 
    }

    public String getNomorMemberStr() {
        return "Member" + String.format("%04d", nomorMember);
    }

    public String getStatus() {
        return statusAktif;
    }

    public String daftarKelas() {
        return "Member " + getNama() + " berhasil didaftarkan ke kelas";
    }

    @Override
    public String getInfo() {
        return "Nomor Member " + getNomorMemberStr()
                + "\nNama: " + getNama()
                + "\nEmail: " + getEmail()
                + "\nNo HP: " + getNoTelp()
                + "\nStatus: " + statusAktif;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }
    
    public void test() {
        
    }
}

