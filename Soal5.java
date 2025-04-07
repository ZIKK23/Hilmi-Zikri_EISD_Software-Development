public class Soal5 {
    public static void main(String[] args) {
        String nama = "naiplovyu";
        int total = 0;

        for (int i = 1; i <= 6; i++) {
            total += permute(nama.length(), i);
        }

        System.out.println("total kemungkinan username: " + total);
    }

    public static int permute(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static int factorial(int x) {
        int result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}