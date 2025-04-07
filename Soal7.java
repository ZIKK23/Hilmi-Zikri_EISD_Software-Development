public class Soal7 {
    public static void main(String[] args) {
        String[] encryptedChats = {
            "xfqfr bfmdz",
            "gjxtp lzj rfz ifkyfw jxi snm",
            "gwt, gjxtp qz rfz rfpfs in bfwlty lfp?",
            "fpz xfdfsl pfrz, rfz lfp ofin ufhfwpz",
            "dfsl pnwnr xynhpjw otrtp pz pnhp ifwn lwzu"
        };

        for (String chat : encryptedChats) {
            System.out.println(decrypt(chat));
        }
    }

    public static String decrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char huruf : text.toCharArray()) {
            if (Character.isLetter(huruf)) {
                char decrypted = (char) ((huruf - 'a' - 5 + 26) % 26 + 'a');
                result.append(decrypted);
            } else {
                result.append(huruf); 
            }
        }
        return result.toString();
    }
}
