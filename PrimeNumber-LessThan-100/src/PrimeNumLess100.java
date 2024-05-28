public class PrimeNumLess100 {
    public static void main(String[] args) {
        int number = 2;
        System.out.println("Prime Numbers less than 100 are: ");
        while (number <= 100) {
            if (isPrime(number)){
                System.out.print(number + " ");
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
