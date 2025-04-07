import java.util.HashSet;

public class Soal4 {
    public static void main(String[] args) {
        int[] data = {20, 1, 3, 2, 4, 6, 8, 5, 7, 9, 11, 13, 15, 10,  12, 14, 16, 18, 20, 17, 19};
        System.out.println(checkDuplicate(data));
    }

    public static boolean checkDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
