# BreakOut
I developed few years ao for  my 1st year in Enineering School a classic Java 2D game with a little twist : Breakout.
Breakout is an arcade game originally developed by Atari Inc. The game was created in 1976.
The game is played in 3 different levels, according to Racket's speed and bricks display:
![easy](https://github.com/afafelwafi/BreakOut/blob/main/eady.png)![medium](https://github.com/afafelwafi/BreakOut/blob/main/medium.png)![hard](https://github.com/afafelwafi/BreakOut/blob/main/hard.png)


----------------
## Design pattern : MVC
In this project, we use MVC software design (Model View Controller) in order to separate the display from information, user actions and data access :
* model: Element that contains the data as well as the logic related to the data: validation, reading and recording. It can, in its most simple, contain only a single value, or a more complex data structure. The model represents the universe in which fits the game: Racket, Brick, Settings, Life, Ball.
* view: Visible part of a graphical interface. The view uses the model, window, buttons, etc. A view contains visual elements as well as the logic necessary to display the data coming from the model, there are two classes:Game, Window.
* controller: Module that processes the actions user, modifies both the model and view data 
![files](https://github.com/afafelwafi/BreakOut/blob/main/files_mvc.PNG)


----------------
## UML Diaram
![uml](https://github.com/afafelwafi/BreakOut/blob/main/UML.png)

