# Lab1

Implementation of Code Maintainability in the working of Gumball Machine

Three types of Gumball Machines are implemented:

One Quarter Gumball Machine: Value of each gumball is 25 cents. Accepts only Quarter. Ejects one Gumball once amount of 25 cents is reached.

Two Quarter Gumball Machine: Value of each gumball is 50 cents. Accepts only Quarters. Ejects one Gumball once amount of 50 cents is reached

Slot Gumball Machine: Value of each gumball is 50 cents. Accepts Nickels, Dimes and Quarters. Ejects one Gumball once amount of 50 cents is reached.

Java Typical Approach:

Implementation using single Gumball Machine class. Values passed as arguments in gumball machine constructor: Number of gumballs present in the machine and type of machine(Machine 1 , Machine 2 or Machine 3).

Depending on machine type, the conditions of insert coin and turn crank are validated for respective machines.

Java Pattern Approach:

State Interface with 4 methods respectively:
Insert Coin
Eject Coin
Turn Crank
dispense

4 States implementing this Interface namely:
No Sufficient Coins State
Has Sufficient Coins State
Gumball Sold State
All Gumballs Sold State/ Sold Out State

Once a coin is inserted, depending on machine type, the conditions for insert coin and turn crank are validated.

