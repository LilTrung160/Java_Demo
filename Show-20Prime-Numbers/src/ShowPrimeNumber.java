public class ShowPrimeNumber {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        System.out.println("20 prime numbers are: ");
        while (count < 20) {
            if (isPrime(number)){
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
