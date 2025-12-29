# Tic-Tac-Toc-Game

Tic-Tac-Toe — Java Console Game Engine

| Component      | Responsibility              |
| -------------- | --------------------------- |
| `board[][]`    | Maintains game state        |
| `printBoard()` | Handles board visualization |
| `haveWon()`    | Evaluates win conditions    |
| `main()`       | Controls game flow          |

<h6>Control Flow Diagram</h6>

## Tic Tac Toe Game Flow

```mermaid
flowchart TD
    A[START] --> B[Initialize Board]
    B --> C[Read Player Names]
    C --> D["Set Current Player - X"]
    D --> E[Display Board]
    E --> F["Read Move - Row and Column"]
    F --> G{Is Cell Empty?}

    G -- Yes --> H[Place Move]
    G -- No --> I[Reject Move]

    H --> J{Check Win?}
    J -- Yes --> K[Declare Winner]
    J -- No --> L[Switch Player]

    K --> M[END]
    L --> E

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



