public class Soal1 {
    public static void main(String[] args) {
        double[] ratings1 = {4.5, 2.0, 1.5, 3.0, 2.5, 4.0, 5.0, 3.5, 2.0, 1.0};
        double[] result1 = getRatingSummary(ratings1);
        System.out.println("[" + result1[0] + ", " + result1[1] + ", " + result1[2] + "]");

        double[] ratings2 = {5, 4, 2.5, 5, 3.6, 1.1, 3.6, 4, 4.2, 1.5};
        double[] result2 = getRatingSummary(ratings2);
        System.out.println("[" + result2[0] + ", " + result2[1] + ", " + result2[2] + "]");
    }
    public static double [] getRatingSummary(double[] ratings) {
        double min = ratings[0];
        double max = ratings[0];
        double sum = 0;

        for (double rating : ratings) {
            if (rating < min) {
                min = rating;
            }
            if (rating > max) {
                max = rating;
            }
            sum += rating; 
        }

        double avg = sum / ratings.length;

        return new double[] {min, max, Math.round(avg * 10.0) / 10.0};
    }
}
