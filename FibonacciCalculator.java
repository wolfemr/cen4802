public class FibonacciCalculator {

    public static void main(String[] args) {

        int position = 10;
        int result = computeFibonacciRecursive(position);
        System.out.println("The Fibonacci number at position " + position + " is: " + result);
    }

    /**
     * Calculates the Fibonacci number at a given position recursively. 
     * The Fibonacci number is written to a local variable and returned.
     * 
     * @param   position the position of the Fibonacci number to be calculated
     * @return           the value of the Fibonacci number at the position passed to the method
     */
    public static int computeFibonacciRecursive(int position) {

        int fibonacciValue;

        if (position == 0 || position == 1) {
            return position;
        }

        else {
            // Recursive function calls itself until base case is met
            fibonacciValue = computeFibonacciRecursive(position-1) + computeFibonacciRecursive(position-2);
        }

        return fibonacciValue;
    }
}

