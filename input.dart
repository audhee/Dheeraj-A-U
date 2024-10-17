// TO taking input of the string and printing as the output

// Basic program in dart to take input from the user.
import 'dart:io';

const Age = 45;//Constant variable that cannot be changed
void main() {
  print('What is your name');// Printing "What is your name" in the screen
  String? name = stdin.readLineSync();// Command to take input from the user part of the package i.e imported at the begging
  print('Your Name is $name');//Printing the intaked command
}
