# Java Practice Project

This Java project is a small practice project that consists of several Java classes which perform various tasks including sorting, character manipulation, and list operations. The project showcases fundamental Java programming concepts such as class creation, method implementation, and collections handling.

### Technologies / Tools Used

- **Java**: The core programming language used.
- **Java Collections Framework**: Utilized for data manipulation and management.
- **Comparator Interface**: Used for custom sorting of Employee objects based on job titles and surnames.

### Features

The project includes several key functionalities:

1. **List Manipulation**:
   - Creation of a list to store favorite computer game titles.
   - Checking if a given title is in the list.
   - Sorting the list in reverse alphabetical order and printing the sorted list.

2. **Unique Character Counting**:
   - Reading a string from the user and displaying the total number of characters and the number of unique characters.

3. **Employee Sorting**:
   - Creating a list of Employee objects.
   - Sorting the list using a custom comparator based on job titles and then by surname.

### Running the Project

To run this project, ensure you have Java installed on your system. Navigate to the project directory and compile the code using `javac`, then run the compiled classes with `java`. For example:

### Project Structure

- `src/`
  - `Clasess/`
    - `CharactersHelper.java`: Contains methods for counting unique characters and printing string information.
    - `Employee.java`: Defines an Employee class with properties for name, surname, and job.
    - `EmployeeComparator.java`: Implements a Comparator for sorting Employee objects.
  - `com/company/`
    - `Main.java`: Contains the main method and drives the functionality of the other classes through various tasks.

