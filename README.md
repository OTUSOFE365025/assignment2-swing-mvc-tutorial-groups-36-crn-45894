# Assignment 2 (MVC) Group 36

## Group Members And Responsibilities 
| Name           | ID        | Responsibility   |
|----------------|-----------|------------------|
| Blake Heselden | 100916163 | Q1               |
| Steven Sun     | 100816207 | Code Development |
| Evan Tome      | 100912667 | Q2, Q4           |

## Q1
Swing is a Java library used to build desktop graphical user interfaces that run smoothly on an operating system. At its core, Swing provides a comprehensive suite of UI controls, buttons, text boxes, tables, menus, panels among many other things that developers can assemble into interactive windows. Since all of its components are written entirely in Java, programs made with Swing look and function the same no matter where they run. What makes Swing especially appealing is how customizable developers can easily adjust the layout, colors, and behavior of components to match the style of their application. Overall, developers often choose Swing when they want a reliable, flexible way to design desktop applications that work consistently and look great across different platforms.

### Class Diagram of Swing
<img width="676" height="812" alt="image" src="https://github.com/user-attachments/assets/1bd98f0a-0cd0-4326-90d8-6cabfaac67b3" />

## Q2
The example code implements the MVC pattern by separating the program into a Model, View, and Controller component. The 
model stores the first and last name data and provides setter and getter methods to separate the data from the user 
interface. The view handles the graphical user interface using Swing components and is only concerned with what should 
be displayed. There are no direct interactions between the model and the view. The controller manages interactions 
between the user and the application by taking input from the view and updating the model accordingly.

It differs from the conventional MVC pattern described in the lectures because the model does not notify the view or 
controller when its data changes. Instead, the controller directly retrieves data from the model and updates the view. 
In the traditional MVC pattern, the view observes the model and updates automatically when data changes.

## Q4

### Sequence Diagram
<img width="1286" height="731" alt="image" src="https://github.com/user-attachments/assets/5bcb2184-d709-4d0a-b90e-d8e4b1af9cf3" />


