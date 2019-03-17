# Lab #6

## Strategy Pattern

When an Order is placed, a Paper Receipt and Packing Slip is printed. 
Here, two classes implement the PrintOrder interface -  PackingSlip and Receipt  
The PrintOrder interface contains the "printOrderReceipt()" method. 

### Receipt: 
This Receipt is printed in the sequence of items as ordered by the customer.  
The items are divided into - Meat, Bottom bun and top bun toppings.   
It is maintained in a collection. 
This collection is iterated in the sequence in which items were requested.

## PackingSlip:  
The Slip is printed in a predetermined manner as set by Five Guys Burger 
The Packing Slip is generated to encompass the layering used in the burger shop
 - Top bun toppings  
 - Bottom bun toppings  
 - Meat 
 