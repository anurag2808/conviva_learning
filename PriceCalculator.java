public class PriceCalculator {
    
    /**
     * Method to calculate total amount by multiplying price and quantity
     * @param price The price of the item (double)
     * @param quantity The quantity of items (int)
     * @return The total amount (price * quantity)
     */
    public static double calculateTotalAmount(double price, int quantity) {
        return price * quantity;
    }
    
    /**
     * Method to calculate total amount with double quantity
     * @param price The price of the item (double)
     * @param quantity The quantity of items (double)
     * @return The total amount (price * quantity)
     */
    public static double calculateTotalAmount(double price, double quantity) {
        return price * quantity;
    }
    
    /**
     * Method to calculate total amount with discount
     * @param price The price of the item (double)
     * @param quantity The quantity of items (int)
     * @param discountPercent The discount percentage (double)
     * @return The total amount after discount
     */
    public static double calculateTotalAmountWithDiscount(double price, int quantity, double discountPercent) {
        double totalAmount = price * quantity;
        double discountAmount = (totalAmount * discountPercent) / 100;
        return totalAmount - discountAmount;
    }
    
    /**
     * Method to calculate total amount with tax
     * @param price The price of the item (double)
     * @param quantity The quantity of items (int)
     * @param taxPercent The tax percentage (double)
     * @return The total amount including tax
     */
    public static double calculateTotalAmountWithTax(double price, int quantity, double taxPercent) {
        double totalAmount = price * quantity;
        double taxAmount = (totalAmount * taxPercent) / 100;
        return totalAmount + taxAmount;
    }
    
    public static void main(String[] args) {
        System.out.println("===== Price Calculator =====\n");
        
        // Example 1: Simple calculation
        System.out.println("Example 1: Simple Total Amount Calculation");
        double price1 = 50.00;
        int quantity1 = 5;
        double total1 = calculateTotalAmount(price1, quantity1);
        System.out.println("Price: $" + price1 + ", Quantity: " + quantity1);
        System.out.println("Total Amount: $" + total1);
        
        // Example 2: With decimal quantity
        System.out.println("\nExample 2: Calculation with Decimal Quantity");
        double price2 = 12.50;
        double quantity2 = 2.5;
        double total2 = calculateTotalAmount(price2, quantity2);
        System.out.println("Price: $" + price2 + ", Quantity: " + quantity2 + " kg");
        System.out.println("Total Amount: $" + total2);
        
        // Example 3: With discount
        System.out.println("\nExample 3: Total Amount with Discount");
        double price3 = 100.00;
        int quantity3 = 3;
        double discount = 10.0; // 10% discount
        double total3 = calculateTotalAmountWithDiscount(price3, quantity3, discount);
        System.out.println("Price: $" + price3 + ", Quantity: " + quantity3);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total Amount (after discount): $" + String.format("%.2f", total3));
        
        // Example 4: With tax
        System.out.println("\nExample 4: Total Amount with Tax");
        double price4 = 75.00;
        int quantity4 = 2;
        double tax = 5.0; // 5% tax
        double total4 = calculateTotalAmountWithTax(price4, quantity4, tax);
        System.out.println("Price: $" + price4 + ", Quantity: " + quantity4);
        System.out.println("Tax: " + tax + "%");
        System.out.println("Total Amount (with tax): $" + String.format("%.2f", total4));
        
        // Example 5: Multiple items
        System.out.println("\nExample 5: Multiple Different Items");
        double[][] items = {
            {20.00, 2},    // Item 1: $20 each, quantity 2
            {15.50, 3},    // Item 2: $15.50 each, quantity 3
            {10.00, 5}     // Item 3: $10 each, quantity 5
        };
        
        double grandTotal = 0;
        for (int i = 0; i < items.length; i++) {
            double itemTotal = calculateTotalAmount(items[i][0], (int)items[i][1]);
            grandTotal += itemTotal;
            System.out.println("Item " + (i + 1) + ": $" + items[i][0] + " x " + (int)items[i][1] + " = $" + itemTotal);
        }
        System.out.println("Grand Total: $" + grandTotal);
    }
}
