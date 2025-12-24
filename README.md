# Tic-Tac-Toc-Game

Tic-Tac-Toe — Java Console Game Engine

| Component      | Responsibility              |
| -------------- | --------------------------- |
| `board[][]`    | Maintains game state        |
| `printBoard()` | Handles board visualization |
| `haveWon()`    | Evaluates win conditions    |
| `main()`       | Controls game flow          |

<h6>Control Flow Diagram</h6>

┌────────────┐
│  START     │
└─────┬──────┘
      ↓
Initialize Board
      ↓
Read Player Names
      ↓
Set Current Player (X)
      ↓
Display Board
      ↓
Read Move (Row, Column)
      ↓
Is Cell Empty?
   ┌──┴───┐
  YES    NO
   ↓      ↓
Place     Reject
Move      Move
   ↓
Check Win?
   ┌──┴───┐
  YES    NO
   ↓      ↓
Declare  Switch
Winner   Player
   ↓
  END

<h6>Execution Instructions</h6>
<h6>Compile</h6>
javac Main.java

<h6>Run</h6>
java Main

<h4>Runtime Output</h4>
Enter name for Player X: Manish
Enter name for Player O: Rahul

X |   |   |
  | O |   |
  |   | X |

Manish (X) has won!



