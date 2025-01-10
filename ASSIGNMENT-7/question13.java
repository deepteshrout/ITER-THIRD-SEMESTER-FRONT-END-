import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] frequency = new int[10];
        
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        scanner.close();
    }
}


/*This Java program calculates and displays the frequency of each digit in a given integer. Here's an explanation of the code step by step:

### 1. **Importing the Scanner**
```java
import java.util.Scanner;
```
The `Scanner` class is used to read input from the user.

---

### 2. **Main Method**
```java
public static void main(String[] args) {
```
This is the entry point of the program where the execution begins.

---

### 3. **Reading Input**
```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();
```
- A `Scanner` object is created to read user input.
- The program prompts the user to enter a number, which is stored as an integer (`number`).

---

### 4. **Array to Hold Frequencies**
```java
int[] frequency = new int[10];
```
- This array keeps track of the count of each digit (from 0 to 9).
- The index of the array represents the digit, and the value at each index represents its frequency.

---

### 5. **Counting the Frequency**
```java
while (number > 0) {
    int digit = number % 10;  // Extract the last digit
    frequency[digit]++;       // Increment the count for the extracted digit
    number /= 10;             // Remove the last digit from the number
}
```
- The `while` loop continues until `number` becomes 0.
- `number % 10`: Retrieves the last digit of the number.
- `frequency[digit]++`: Increments the count for the corresponding digit in the `frequency` array.
- `number /= 10`: Removes the last digit by performing integer division.

---

### 6. **Displaying Frequencies**
```java
System.out.println("Digit frequencies:");
for (int i = 0; i < frequency.length; i++) {
    if (frequency[i] > 0) {
        System.out.println("Digit " + i + ": " + frequency[i]);
    }
}
```
- The program iterates through the `frequency` array.
- If a digit appears at least once (`frequency[i] > 0`), its count is displayed.

---

### 7. **Closing Scanner**
```java
scanner.close();
```
Closes the `Scanner` object to release resources.

---

### **Example Walkthrough**
**Input:** `12321`

1. Initial `frequency` array: `[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]`.
2. Loop iterations:
   - `number % 10 = 1`: `frequency[1]++ → [0, 1, 0, 0, 0, 0, 0, 0, 0, 0]`, `number = 1232`.
   - `number % 10 = 2`: `frequency[2]++ → [0, 1, 1, 0, 0, 0, 0, 0, 0, 0]`, `number = 123`.
   - `number % 10 = 3`: `frequency[3]++ → [0, 1, 1, 1, 0, 0, 0, 0, 0, 0]`, `number = 12`.
   - `number % 10 = 2`: `frequency[2]++ → [0, 1, 2, 1, 0, 0, 0, 0, 0, 0]`, `number = 1`.
   - `number % 10 = 1`: `frequency[1]++ → [0, 2, 2, 1, 0, 0, 0, 0, 0, 0]`, `number = 0`.
3. Output:
   ```
   Digit frequencies:
   Digit 1: 2
   Digit 2: 2
   Digit 3: 1
   ```

Let me know if you need further clarification! */