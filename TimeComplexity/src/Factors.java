public class Factors {

    public static int countFactors(int num) {
        int count = 0;
        for (int i = 1; i*i <= num; i++) {
            if (num % i == 0) {
                if (num/i == i ) {

                    count = count +1;

                } else {

                    count = count + 2;

                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Factors of " + 100 + " is " + countFactors(100));
    }
}
