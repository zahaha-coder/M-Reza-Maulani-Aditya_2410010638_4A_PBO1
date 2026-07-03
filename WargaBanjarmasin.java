package UAS;

// 8. INHERITANCE / Pewarisan
public class WargaBanjarmasin extends Warga {
    
    // 7. ENCAPSULATION 
    private String kecamatan; 

    // Constructor Kelas Anak
    public WargaBanjarmasin(String nik, String nama, String kecamatan) {
        super(nik, nama);
        this.kecamatan = kecamatan;
    }

    // 9. POLYMORPHISM 
    @Override
    public String info() {
        return "[Warga Banjarmasin] NIK: " + this.nik + " | Nama: " + this.nama + " | Kecamatan: " + this.kecamatan;
    }
}