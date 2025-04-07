public class Soal2 {
    public static void main(String[] args) {
        checkPalindrome("Angsa");
        checkPalindrome("KataK");
        checkPalindrome("kasur empuk");
        checkPalindrome("Aku suka Kamu");
        checkPalindrome("Ibu Ratna antar Ubi");
    }

    public static void checkPalindrome(String input) {
        String cleaned = input.toLowerCase().replaceAll("[^a-z]", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println("eureeka!");
        } else {
            System.out.println("suka blyat");
        }
    }
}
