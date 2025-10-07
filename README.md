# Assignment 2 (MVC) Group 36

## Group Members And Responsibilities 
| Name           | ID        | Responsibility   |
|----------------|-----------|------------------|
| Blake Heselden | 100916163 |                  |
| Steven Sun     | 100816207 | Code Development |
| Evan Tome      | 100912667 | Q2               |

## Q1

### Class Diagram of Swing

## Q2
The example code implements the MVC pattern by separating the program into a Model, View, and Controller component. The 
model stores the first and last name data and provides setter and getter methods to separate the data from the user 
interface. The view handles the graphical user interface using Swing components and is only concerned with what should 
be displayed. There are no direct interactions between the model and the view. The controller manages interactions 
between the user and the application by taking input from the view and updating the model accordingly.

It differs from the conventional MVC pattern described in the lectures because the model does not notify the view or 
controller when its data changes. Instead, the controller directly retrieves data from the model and updates the view. 
In the traditional MVC pattern, the view observes the model and updates automatically when data changes.

### Sequence Diagram

