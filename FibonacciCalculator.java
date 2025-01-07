public class FibonacciCalculator {

    public static void main(String[] args) {

        int position = 10;
        int result = computeFibonacciRecursive(position);
        System.out.println("The Fibonacci number at position " + position + " is: " + result);
    }

    public static int computeFibonacciRecursive(int position) {

        if (position == 0 || position == 1) {
            return position;
        }

        else {
            // Recursive function calls itself until base case is met
            return computeFibonacciRecursive(position-1) + computeFibonacciRecursive(position-2);
        }
    }
}

