Design Patterns used --
Singleton
We want only a single instance of the waitlist to exist. Hence, Reservation Waitlist Manager needs to be Singleton Class.

Class : WaitlistHandler


Chain of Responsibility
Here, we want more than one object to be able to have an opportunity to handle request. Also it would be decided on run-time which object needs to be created.

Class : TableQueueHandler, TableHandler, ReservationHandler

CRC Cards


Class: Customer

Responsibilities:

Sign up for a table

Be able to send and receive Messages

Confirm or leave - messages

Collaborators: ReservationHandler


Class: ReservationHandler

Responsibilities:

Direct messages to WaitlistHandler when customer signup or when customer leaves

Maintain direct contact with customers

Send and receive message to/from customer

Collaborators: WaitlistHandler, Customer


Class: WaitlistHandler

Responsibilities:

Direct messages to WaitlistHandler when customer signup or when customer leaves.

Maintain single instance of WaitlistHandler

Add customer to wait list

Remove customer from wait list

Collaborators:ReservationHandler, TableQueueHandler, Customer


Class: TableQueueHandler

Responsibilities:

Assign table to best fitting customer at the top of the waitlist

Call next handler in the chain

Provide size of best next available table

Collaborators: WaitlistHandler, TableHandler


Class: TableHandler

Responsibilities:

Check if table empty

Notify TableQueueHandler if Table empty

Book Table and notify once table filled

Collaborators: WaitlistManager,TableQueueHandler
