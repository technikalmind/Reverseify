# Reverseify
Reverses strings and integer arrays.

Summary
---------
User can selection from 2 options or exit
- 1) Reverse a set of integers
- 2) Reverse a string
- 3) Exit

**Technical Details:**
- 1) The user can enter as many integers as they like. Integers are temporarily stored in a linked list, which is later converted into an array for reversal.
- 2) The reversal is done utilizing a stack. *Int*s and *char*s are pushed onto the stack in the order they existed on the array. The numbers are then popped off the stack and into another array. Because the stack is Last In First Out, the *int*s/*char*s are placed in reverse order.

**Sample Input:**

1 2 3 4

hello world how are you today

**Sample Output:**

4 3 2 1

yadot uoy era woh dlrow olleh
