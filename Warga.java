
package UAS;


// 1. CLASS 
public class Warga {
    
    // 3. ATRIBUT 
    // 7. ENCAPSULATION 
    protected String nik;
    protected String nama;

    // 4. CONSTRUCTOR 
    public Warga(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    // 5. MUTATOR 
    public void setNama(String nama) {
        this.nama = nama;
    }

    // 6. ACCESSOR 
    public String getNik() {
        return this.nik;
    }

    // Metode Utama yang nanti akan di-override (Polymorphism)
    public String info() {
        return "NIK: " + this.nik + " | Nama: " + this.nama;
    }
}
