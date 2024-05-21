import java.util.ArrayList;
import java.util.List;

public class FibonacciList {

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(10)); 
    }

    public static List<Integer> fibonacci(int n) {
        List<Integer> fibList = new ArrayList<>();
        if (n <= 0) {
            return fibList;
        }

        fibList.add(0);
        if (n > 1) {
            fibList.add(1);
        }

        for (int i = 2; i < n; i++) {
            int nextFib = fibList.get(i - 1) + fibList.get(i - 2);
            fibList.add(nextFib);
        }

        return fibList;
    }
}
