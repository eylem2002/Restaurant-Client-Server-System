# restaurant-Client-Server-System
his project is a client-server application for  Restaurant that provides services for two clients, each making different food orders. The server communicates with clients over port number 1515. Client1 requests burger orders, while Client2 requests pizza orders.

### Client1 (Burger Order)
1. Client1 sends a message to the server: "Hello server! Please send me the burger order."
2. The server receives the message and sends the burger order to Client1.
3. The server prompts Client1 to enter the type of burger: "Please enter your type of Burger (Beef, Chicken, Kids)."
4. Client1 enters the type and sends it to the server.
5. The server validates the input:
   - If incorrect, it sends a message to Client1: "Wrong input... try again."
   - If correct, the server asks for the flavor based on the type.
6. Client1 enters the flavor and sends it to the server.
7. The server asks if Client1 wants a sandwich or a meal.
8. Client1 responds, and if the type is "kids," the client can only choose a meal.
9. The server asks for the quantity: "Please enter the quantity."
10. Client1 enters the quantity, and the server calculates the price.
11. The server sends the result to Client1 to be printed.
12. The server asks if Client1 wants another burger from the menu:
    - If "yes," the process is repeated.
    - If "no," the process stops.
13. After completing the order, the server calculates the total price for all burger types and sends it to Client1.

### Client2 (Pizza Order)
1. Client2 sends a message to the server: "Hello server! Please send me the pizza order."
2. The server receives the message and sends the pizza order to Client2.
3. The server prompts Client2 to enter the flavor of pizza: "Please enter your flavor of Pizza (Margarita, Vegetables, Chicken)."
4. Client2 enters the flavor and sends it to the server.
5. The server validates the input:
   - If incorrect, it sends a message to Client2: "Wrong input... try again."
   - If correct, the server asks for the size of the pizza.
6. Client2 enters the size and sends it to the server.
7. The server asks how many boxes of this pizza size Client2 wants.
8. Client2 responds, and the server calculates the price.
9. The server asks if Client2 wants another pizza from the menu:
    - If "yes," the process is repeated.
    - If "no," the process stops.
10. After completing the order, the server calculates the total price for all pizza flavors and sends it to Client2.
