# 🎮 Tic Tac Toe in Java

[![Java](https://img.shields.io/badge/Java-17-orange)](https://www.java.com/)  
[![License](https://img.shields.io/badge/License-MIT-blue)](LICENSE)

A **console-based Tic Tac Toe game** written in Java. Two players can play on the same computer by entering the row and column coordinates for their moves.

---

## Features ✨
- 3x3 board displayed in the console
- Two-player gameplay (Player X and Player O)
- Detects win conditions (rows, columns, diagonals)
- Detects draw conditions when the board is full
- Prevents invalid moves (occupied cells or out-of-bounds input)
- Simple and beginner-friendly code

---

## Getting Started 🚀

### Prerequisites
- Java JDK 11 or higher installed on your system
- A terminal or command prompt

### Installation
1. Clone this repository:
```bash
git clone https://github.com/ankeshkashyap/TicTacToe.git
```
2. Change directory :
 ```bash
cd TicTacToe
```
3. Compile the Java program:
```bash
javac Game.java
```
4. Run the game:
```bash
java Game
```
## How to Play 🎯

 The board is 3x3. Rows and columns are numbered 0, 1, 2.
Players take turns entering the row and column number of the cell they want to mark.
The first player to align three of their marks (X or O) horizontally, vertically, or diagonally wins.
If the board fills up with no winner, the game ends in a draw.
Invalid or occupied cells will prompt an error message.


## Example
```
   |   |   
---+---+---
   |   |   
---+---+---
   |   |   

Player X enter coords (r/c):
0 0

 X |   |   
---+---+---
   |   |   
---+---+---
   |   |   
