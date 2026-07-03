
package UAS;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 12. Input/Output 
        Scanner input = new Scanner(System.in);
        
        // 13. ARRAY 
        WargaBanjarmasin[] listWarga = new WargaBanjarmasin[100];
        int jumlahWarga = 0; // Counter untuk mencatat total data terisi

        // 2. OBJECT
        listWarga[jumlahWarga++] = new WargaBanjarmasin("637101", "Reza", "Banjarmasin Utara");
        listWarga[jumlahWarga++] = new WargaBanjarmasin("637102", "Halim", "Banjarmasin Tengah");

        // 11. PERULANGAN
        while (true) {
            System.out.println("\n=== APLIKASI DATA WARGA BANJARMASIN ===");
            System.out.println("1. Tampilkan Semua Warga");
            System.out.println("2. Tambah Warga Baru");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu (1-3): ");
            
            String menu = input.nextLine();

            // 10. SELEKSI (If-Else)
            if (menu.equals("1")) {
                System.out.println("\n--- DATA WARGA ---");
                if (jumlahWarga == 0) {
                    System.out.println("Belum ada data.");
                } else {
                    // Perulangan (For loop) 
                    for (int i = 0; i < jumlahWarga; i++) {
                        System.out.println((i + 1) + ". " + listWarga[i].info());
                    }
                }
            } 
            else if (menu.equals("2")) {
                System.out.println("\n--- INPUT DATA WARGA ---");
                System.out.print("Masukkan NIK: ");
                String nikInput = input.nextLine();
                System.out.print("Masukkan Nama: ");
                String namaInput = input.nextLine();
                System.out.print("Masukkan Kecamatan: ");
                String kecInput = input.nextLine();

                // Proses membuat OBJECT baru dari inputan user
                WargaBanjarmasin wargaBaru = new WargaBanjarmasin(nikInput, namaInput, kecInput);
                
                // Menggunakan Mutator untuk set nama
                wargaBaru.setNama(namaInput);

                // Memasukkan object baru ke dalam Array
                listWarga[jumlahWarga] = wargaBaru;
                jumlahWarga++; 
                
                System.out.println("✓ Data warga berhasil disimpan!");
            } 
            else if (menu.equals("3")) {
                System.out.println("Aplikasi selesai. Terima kasih!");
                break; 
            } 
            else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        input.close();
    }
}
