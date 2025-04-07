import java.util.HashMap;
import java.util.Map;

public class Soal6 {
    public static void main(String[] args) {
        Map<String, Integer> harga = new HashMap<>();
        harga.put("Ayam Bakar", 20000);
        harga.put("Ayam Puk Puk", 13000);
        harga.put("Ayam Goreng Krispi", 15000);
        harga.put("Es Teh", 5000);
        harga.put("Es Jeruk", 7000);

        Map<String, String> tipe = new HashMap<>();
        tipe.put("Ayam Bakar", "Makanan");
        tipe.put("Ayam Puk Puk", "Makanan");
        tipe.put("Ayam Goreng Krispi", "Makanan");
        tipe.put("Es Teh", "Minuman");
        tipe.put("Es Jeruk", "Minuman");

        Map<String, Integer> rehan = new HashMap<>();
        rehan.put("Ayam Bakar", 2);
        rehan.put("Es Teh", 1);

        Map<String, Integer> amba = new HashMap<>();
        amba.put("Ayam Puk Puk", 1);
        amba.put("Es Teh", 3);

        Map<String, Integer> faiz = new HashMap<>();
        faiz.put("Ayam Goreng Krispi", 1);
        faiz.put("Ayam Puk Puk", 1);
        faiz.put("Ayam Bakar", 1);
        faiz.put("Es Teh", 1);
        faiz.put("Es Jeruk", 1);

        System.out.println("Rehan Whangsap harus bayar: Rp" + hitungTotal(rehan, harga, tipe));
        System.out.println("Amba Roni harus bayar: Rp" + hitungTotal(amba, harga, tipe));
        System.out.println("Faiz Ngawi harus bayar: Rp" + hitungTotal(faiz, harga, tipe));
    }

    public static int hitungTotal(Map<String, Integer> pesanan, Map<String, Integer> harga, Map<String, String> tipe) {
        double subtotal = 0.0;

        for (Map.Entry<String, Integer> entry : pesanan.entrySet()) {
            String item = entry.getKey();
            int jumlah = entry.getValue();
            int hargaItem = harga.get(item);
            String tipeItem = tipe.get(item);

            double pajakItem = tipeItem.equals("Makanan") ? 0.05 : 0.03;
            double hargaSetelahPajak = hargaItem + (hargaItem * pajakItem);
            subtotal += hargaSetelahPajak * jumlah;
        }

        double total = subtotal + (subtotal * 0.15);
        return (int) total;
    }
}
