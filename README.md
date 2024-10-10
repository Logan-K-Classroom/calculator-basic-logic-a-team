# Calculator: Basic Logic - Controls Subteam - Team Steam Robotics (FRC 5119)

## Overview

Continuing from your previous work on the Controls Subteam Calculator Project, you will now create a basic calculator using Java logic structures. This project, titled "Calculator: Basic Logic," focuses on implementing arithmetic operations using conditionals such as `if` statements, `if-else` conditions, and logic operators to determine the appropriate operation based on user input.

By completing this project, you will:

- Learn to implement math operations in Java using variables and logic operators.
- Gain experience with error handling for invalid or edge-case operations.
- Work with GitHub for version control, emphasizing branching, merging, and collaboration.

## Assignment Requirements

For this assignment, you will integrate all arithmetic operations into a single `Calculator.java` file. The other files (`Addition.java`, `Subtraction.java`, `Multiplication.java`, `Division.java`, `Exponent.java`) will be left alone and may be used in a future project. You will utilize Java logic to determine the correct operation to perform based on user input and ensure that any invalid input or operations are appropriately handled.

### New Requirements

- You will be provided with an additional **String** input called `operator`, which will represent the operation to be performed (`+`, `-`, `*`, `/`, `^`).
- Your task is to implement logic in the `Calculator.java` file to determine the appropriate arithmetic operation based on the value of `operator`.
- The program should also handle invalid operations and division by zero by printing a message including `"Error"` to the console in such cases (ex: "Error: Division by zero").

### Objectives

- **Java Logic Implementation:** Use `if` statements, `if-else` conditions, and logic operators to handle different operations in a single file.
- **Error Handling:** Implement logic to print `"Error"` for invalid operations, such as unsupported operators or division by zero.
- **Consolidation:** All operations from Part 1 (`Addition.java`, `Subtraction.java`, `Multiplication.java`, `Division.java`, `Exponent.java`) should now be implemented in the `Calculator.java` file, based on the `operator` input.

### Tasks

1. Modify the `Calculator.java` file to include:
   - An additional input: `String operator`.
   - Logic to determine which arithmetic operation to perform based on the value of `operator`.
   - Error handling for invalid operations, including division by zero.
2. Use **double** variables `firstNumber` and `secondNumber` as before, and print the result of the operation to the console.
3. If the `operator` is not one of the specified symbols (`+`, `-`, `*`, `/`, `^`), or if there is a division by zero, print `"Error"` to the console.

### Guidelines

- **Branching and Merging:** Continue to use branches for development, with team members collaborating to implement and review the changes in `Calculator.java`.
- **Version Control:** Maintain good version control practices, with specific, informative commit messages and frequent commits.

### Example Commit Messages

- `Added logic for handling + operator in Calculator.java`
- `Implemented error handling for division by zero in Calculator.java`

## Grading Criteria

Your work will be evaluated based on:

- **Correctness of Output:** The `Calculator.java` file will be graded based on whether the correct input results in the correct output for each operation.
- **Error Handling:** Proper handling of invalid operations and division by zero must result in the output `"Error"`.
- **Version Control:** Proper use of branches, consistent commits, and effective merging practices.

## Submission and Testing

- **Testing Process:** Tests will be run as needed when your team requests a progress check. Ensure all changes have been merged into the main branch before requesting a test run.
- **Output Requirements:** Make sure the result of your operations is correctly printed to the console, and `"Error"` is printed for invalid cases. Any incorrect or missing output will result in a reduction in points.
