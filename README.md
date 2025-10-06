[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/57HVEcop)
Example of an MVC design based on Swing. Answer questions 1 & 2 in this README file

## Q2
The example code implements the MVC pattern by separating the program into a Model, View, and Controller component. The 
model stores the first and last name data and provides setter and getter methods to separate the data from the user 
interface. The view handles the graphical user interface using Swing components and is only concerned with what should 
be displayed. There are no direct interactions between the model and the view. The controller manages interactions 
between the user and the application by taking input from the view and updating the model accordingly.

It differs from the conventional MVC pattern described in the lectures because the model does not notify the view or 
controller when its data changes. Instead, the controller directly retrieves data from the model and updates the view. 
In the traditional MVC pattern, the view observes the model and updates automatically when data changes.

