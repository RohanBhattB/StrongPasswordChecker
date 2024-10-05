# StrongPasswordChecker

This project is a simple Java-based password verfier that checks whether a given password meets certain criteria for security. It ensures that the password follows these rules:

1.Minimum Length: The password must be at least 7 characters long.
2.Contains atleast a Number: The password must include at least one digit.
3.Contains atleast a Special Character: The password must include at least one special character from a predefined set.
Not a Common Password: The password is checked against a list of commonly used passwords stored in the esample.txt file. If the password matches an entry in this file, it is considered insecure.

-->Why the commonpass.txt File is Important?
The commonpass.txt file contains a list of frequently used passwords that attackers often try first in brute-force attacks. Many users rely on simple or commonly known passwords, making them easy targets for attackers. By checking the password against this list, the program ensures that users avoid weak and easily guessable passwords, which could otherwise be exploited in brute-force or dictionary attacks.

Including this check makes the password validation more robust and provides a defense against one of the most common attack vectors.

-Birudaraju Rohan Bhatt
