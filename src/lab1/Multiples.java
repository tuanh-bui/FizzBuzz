package lab1;

public class Multiples {
    public static void main(String[] args) {

    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        int i = 1;
        while (i < n){
            boolean divisibleBy3 = i % a == 0;
            boolean divisibleBy5 = i % b == 0;

            if (divisibleBy3 || divisibleBy5) {
                count++;
            }
            i ++;
        }
        return count;
    }

    public static int multiples(){
        return multiples(1000, 3, 5);
    }
}
