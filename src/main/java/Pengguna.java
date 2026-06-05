public abstract class Pengguna {
    private int id;
    String nama;
    private String email;
    private String noTelp;

    public Pengguna() {}

    public Pengguna(int id, String nama, String email, String noTelp) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.noTelp = noTelp;
    }

    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getEmail() { return email; }
    public String getNoTelp() { return noTelp; }
    
    public void setId(int id) { this.id = id; }
    public void setNama(String nama) { this.nama = nama; }
    public void setEmail(String email) { this.email = email; }
    public void setNoTelp(String noTelp){ this.noTelp = noTelp; }

    public abstract String getInfo();
}  
