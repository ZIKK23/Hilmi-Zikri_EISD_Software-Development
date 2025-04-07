import java.util.*;

public class Soal8 {
    public static void main(String[] args) {

        Map<String, String> produkKategori = new HashMap<>();
        produkKategori.put("TV", "elektronik");
        produkKategori.put("headphone", "elektronik");
        produkKategori.put("baju", "fashion");
        produkKategori.put("gitar", "musik");
        produkKategori.put("sepatu", "olahraga");
        produkKategori.put("kamera", "elektronik");

        Map<String, List<String>> minatPelanggan = new HashMap<>();
        minatPelanggan.put("Rina", Arrays.asList("elektronik", "musik"));
        minatPelanggan.put("Budi", Arrays.asList("fashion", "musik"));
        minatPelanggan.put("Hartono", Arrays.asList("olahraga", "elektronik"));

        for (String nama : minatPelanggan.keySet()) {
            List<String> minat = minatPelanggan.get(nama);
            List<String> rekomendasi = new ArrayList<>();

            for (String produk : produkKategori.keySet()) {
                String kategori = produkKategori.get(produk);

                if (minat.contains(kategori)) {
                    rekomendasi.add(produk);
                }
            }

            System.out.println(nama + ": " + rekomendasi);
        }
    }
}
