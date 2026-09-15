public class AddMultipleNumbers {
    
    /**
     * Method to add multiple numbers using varargs
     * @param numbers Variable number of integers to add
     * @return Sum of all numbers
     */
    public static int addNumbers(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    /**
     * Method to add multiple numbers from an array
     * @param numbers Array of integers to add
     * @return Sum of all numbers
     */
    public static int addNumbersFromArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    /**
     * Method to add multiple double numbers
     * @param numbers Variable number of doubles to add
     * @return Sum of all numbers
     */
    public static double addDoubleNumbers(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        // Example 1: Adding multiple integers using varargs
        System.out.println("Example 1: Adding integers using varargs");
        int result1 = addNumbers(10, 20, 30, 40, 50);
        System.out.println("Sum of 10, 20, 30, 40, 50 = " + result1);
        
        // Example 2: Adding different set of numbers
        System.out.println("\nExample 2: Adding different set of numbers");
        int result2 = addNumbers(5, 15, 25);
        System.out.println("Sum of 5, 15, 25 = " + result2);
        
        // Example 3: Adding numbers from an array
        System.out.println("\nExample 3: Adding numbers from an array");
        int[] numbers = {100, 200, 300, 400};
        int result3 = addNumbersFromArray(numbers);
        System.out.println("Sum of array [100, 200, 300, 400] = " + result3);
        
        // Example 4: Adding double numbers
        System.out.println("\nExample 4: Adding double numbers");
        double result4 = addDoubleNumbers(10.5, 20.3, 15.7, 5.2);
        System.out.println("Sum of 10.5, 20.3, 15.7, 5.2 = " + result4);
        
        // Example 5: Single number
        System.out.println("\nExample 5: Single number");
        int result5 = addNumbers(42);
        System.out.println("Sum of 42 = " + result5);
    }
}
