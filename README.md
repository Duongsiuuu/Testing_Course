# Calculator Application

This project is a simple Java-based calculator with basic arithmetic operations: addition, subtraction, multiplication, and division. It also includes unit tests to verify the functionality of the calculator.

---

## Features

The `Calculator` class provides the following methods:
- `add(int a, int b)` - Returns the sum of `a` and `b`.
- `subtract(int a, int b)` - Returns the difference between `a` and `b`.
- `multiply(int a, int b)` - Returns the product of `a` and `b`.
- `divide(int a, int b)` - Returns the quotient of `a` and `b`. Throws `IllegalArgumentException` if `b` is zero.

---

## Tests

Unit tests for the `Calculator` class are written using **TestNG**. The test methods cover the following cases:
- Addition: Verifies that two numbers are added correctly.
- Subtraction: Verifies that the difference between two numbers is correct.
- Multiplication: Verifies that two numbers are multiplied correctly.
- Division: Verifies that one number is divided by another correctly.
- Division by Zero: Ensures that dividing by zero throws an `IllegalArgumentException`.

### Example Test Cases

- **Addition Test**
  ```java
  @Test
  public void testAdd() {
      Calculator calculator = new Calculator();
      assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
  }
