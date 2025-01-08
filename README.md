# Calculator Project

A simple Java calculator implementation that provides basic arithmetic operations with corresponding unit tests.
![Screenshot (391)](https://github.com/user-attachments/assets/987622bf-2d8a-44ac-bfcf-cd44a8ebad5a)


## Features

- Basic arithmetic operations:
  - Addition
  - Subtraction
  - Multiplication
  - Division (with zero division handling)

## Project Structure

```
.
├── Calculator.java       # Main calculator implementation
└── CalculatorTest.java   # Unit tests for calculator
```

## Technical Requirements

- Java 8 or higher
- JUnit/TestNG for running tests

## Installation

1. Clone the repository
2. Make sure you have Java installed on your system
3. Set up your preferred Java IDE (Eclipse, IntelliJ IDEA, etc.)
4. Import the project into your IDE

## Usage

The Calculator class provides the following methods:

```java
Calculator calculator = new Calculator();

// Addition
int sum = calculator.add(2, 3);        // Returns 5

// Subtraction
int difference = calculator.subtract(3, 2);  // Returns 1

// Multiplication
int product = calculator.multiply(2, 3);     // Returns 6

// Division
int quotient = calculator.divide(6, 3);      // Returns 2

// Division by zero throws IllegalArgumentException
calculator.divide(6, 0);  // Throws IllegalArgumentException
```

## Testing

The project includes a comprehensive test suite in `CalculatorTest.java`. The tests cover:

- Basic arithmetic operations
- Edge cases
- Division by zero exception handling

To run the tests:

1. Make sure you have TestNG configured in your project
2. Run `CalculatorTest.java` as a TestNG test

## Error Handling

- The calculator handles division by zero by throwing an `IllegalArgumentException`
- All operations work with integer values only

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details

## Contact

For any questions or concerns, please open an issue in the repository.
