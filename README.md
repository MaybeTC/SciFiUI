# SciFi UI Project

Name: Mingjun Gao

Student Number: D16122910


# Description of the assignment

Use Java with Processing to create a UI for a sci-fi movie device like a warp drive, 
engines, weapons system. You can base it on any movie you like or come up with your own. 
It should be kinda usable. It should have lots of animation & interactivity and look amazing. 
It can be as far out as you like. In other words it can be for an alien. 
You sould use all the stuff you are learning on the course:
Variables, loops, methods
Arrays & array lists
Objects, inheritance, polymorphism
The unit circle and trigonometry
pushMatrix, popMatrix, translate and rotate


# Instructions

I made a UI about clock. The UI includes up and down gradient background, 
central scanning radar, left and right gradient buttons, a classic clock, 
a Electric clock, and a keyboard map.
The three buttons on the right are "clock", "electronic" and "note".
The left and right buttons are tilted, but they become rectangular when the mouse approaches them. 
Press "Clock" to display the classic clock, and "Electronic" and "Note" buttons to display 
the Electric clock and keyboard respectively.
Classic clocks and Electric clock will display the current time on the left of the screen in different forms.
And they all have two buttons: "Start" and "Pause."
These two buttons can control whether they stop or not.
Click "Stop" and the clock will return to its original appearance and remain still.
Click "Start" and the clock will show the current time and continue to work.
I originally wanted to make the third keyboard map capable of inputting, recording and displaying string.
But I encountered some technical problems and did not succeed.


# How it works

In the gradient layer above and below the background, the gradient button, I used for loop and line and rgb colormode to complete.
Tilt the button by changing the value of y and change the value of y when the mouse approaches, I used if loop and mouseX mouseY.
Click on the three buttons and change the pictures. the technical stuff I used are Boolean flag, mouseclick () and if loop,
I used if(flag){}  to control the generation and disappearance of pictures.
classic clock & 
I used ellipse (), fill (), stroke (), to draw a classic clock's dial,I used for()loop, if (), line () and text () to draw scale lines and number.
I used rect() to draw the electronic clock's dial.
I used line () drew clocks hands and translate () to move it to the middle of the clock. 
I used radians (), if (), rodians (), to show the angle of the hands.
second(),minute(),hour(),day(),mouth(),year(),
I used float second = second()and string() to displayed the current time on different clocks respectively.
and I used "boolean flag;" to central the current time displayed or not.


# What I am most proud of in the assignment

The clock that records the current time.
Changes in buttons when gradient buttons and proximity buttons are used.


# This is a youtube video:

https://www.youtube.com/watch?v=JX2MWciylao&feature=youtu.be

