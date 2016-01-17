# Cubing
A simple command line Rubik's Cube solver which uses Jessica Fredric's method to solve the cube.

In this project I started with the initial two classes Cube and Face which are the basis of the Rubik's Cube data structure.
Unlike other Rubik's Cube programme I've used a simple representation of 9 integer variables in the Face class with short forms such as tm-top middle,tl-top left,tr-top right,b for bottom and m for middle row of the Face class varibles.

This approach makes it easy  to make a move on the cube . 

The programme is easy to use :
To enter a cube we  enter each and every Face one by one . Every color is represented by a number. A face can be identified by looking at the middle piece color. Then fill the Face according to instruction from top left to bottom right.

The programme gives the output in form of the steps you need to perform to solve the cube.


