# Competitive Programming
Data structure and algorithms- GFG
Compitative Programming- GFG


### 1 Mathematics


### 2 Bit Magic

1. bitwise AND (&):
Takes two numbers as operands and does AND on every bit of two numbers. 
The result of AND is 1 only if both bits are 1. 
Suppose A = 5 and B = 3, therefore A & B = 1.
```
A =  101
B =  011
A&B= 001 => 1
```

2. bitwise OR (|):
Takes two numbers as operands and does OR on every bit of two numbers. 
The result of OR is 1 if any of the two bits is 1.
Suppose A = 5 and B = 3, therefore A | B = 7.
```
A =  101
B =  011
A|B= 111 => 7
```
3. bitwise XOR (^): 
Takes two numbers as operands and does XOR on every bit of two numbers. 
The result of XOR is 1 if the two bits are different. 
Suppose A = 5 and B = 3, therefore A ^ B = 6.
```
A =  101
B =  011
A^B= 110 => 6
```
4. Bitwise NOT (~):
Takes one number and inverts all bits of it. 
Suppose A = 5, therefore ~A = -6.
-   x = 000........01 // =1
-  ~x = 111........10 // = 2
-  In java, -ve number are stored 2's complement representation
-  representation of ~x = 2^32-x
 - ~5=-6;

 5. Left Shift (<<):
 Takes two numbers, left shifts the bits of the first operand (x), 
 the second operand decides the number of places to shift(y).
 -  3    = 000...0011
 -  3<<4 = 000...0110000  here y digits from fromt are removed and same amount of zeros are added in back.
  in general : 
 -  x>>y => x*2^y

6. Right Shift (>>):
 - Takes two numbers, right shifts the bits of the first operand (x), 
 the second operand decides the number of places to shift (y).
 - 33      = 00....100001
 - 33 >> 2 = 00....001000   here last two(y) digits are removed and same num (y) of zeros addes in front

#### Signed right shift (>>)  
 - in case of -ve x it fills leading bits with ones 
 - in case of +ve x it fills leading bits with zeros
- binary reprensatation of -1 = 2^32-1 = 1111.......11 (all 32 1's)
- -2 = 2^32-2 = 1111...........110 (31 1's and 1 0's)
- -2 >> 1     = 11111...........11 here x is -ve we remove last y num of digit and add y num of 1's in front
-            = -1    as leading bits are 1 so o/p is -1
- -2 >> 1     = -1
-  Ie if we shift -2 to any value the o/p will be -1 only

#### Unsigned right shift(>>>) : here -ve num become +ve 
 - in case of -ve x it fills leading bits with zeros
    - -2 = 2^32-2 = 1111............10 (31 1's and 1 0's)
    - -2 >>> 1    = 01111...........11  here x is -ve we remove last y num of digit and add y num of 0's in front so it become +ve <br/>
    -        = 2^31-1 = 2147483647
    - -2 >>> 2    = 00111...........11
    -        = 2^30-1 = 107374123
 
