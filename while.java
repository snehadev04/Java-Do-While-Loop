// This program demonstrates the do-while loop in Java.
class loop {
    public static void main(String[] args) {
        int n = 5;  // Initialize the loop counter
        // Do-while loop to print "Hi" followed by the current value of n
        do {
            System.out.println("Hi" + n);  // Print "Hi" followed by the current value of n
            n++;  // Increment the loop counter
        } while (n <= 3);  // Continue looping while n is less than or equal to 3
    }
}
