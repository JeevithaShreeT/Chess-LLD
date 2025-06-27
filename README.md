**Chess Validator**

A Java-based backend engine that models a chessboard and validates legal movements for each chess piece. Built using object-oriented principles, this project simulates a two-player chess game through the command line, enforcing proper turn order and piece-specific move rules.

**Features**

- Full 8x8 chessboard with all standard pieces (King, Queen, Rook, Bishop, Knight, Pawn)
- Turn-based gameplay (White vs Black)
- Validates legal moves based on piece type and current position
- Detects invalid moves due to:
  - Movement rule violations
  - Occupied squares
  - Capturing same-color pieces
  - Leaping over other pieces (except knight)
- Basic notation handling (`e2 e4` style input)
- Visual board printing after every move


**Project Structure**

- `Color.java` – Enum class to represent the black and white player colors.
- `Pieces.java` – Abstract base class for all chess pieces.
- `King.java` – Subclass of `Pieces.java`, handles king-specific movement.
- `Queen.java` – Subclass of `Pieces.java`, handles queen-specific movement.
- `Bishop.java` – Subclass of `Pieces.java`, handles bishop-specific movement.
- `Rook.java` – Subclass of `Pieces.java`, handles rook-specific movement.
- `Knight.java` – Subclass of `Pieces.java`, handles knight-specific movement.
- `Pawn.java` – Subclass of `Pieces.java`, handles pawn-specific movement.
- `Player.java` – Represents a player and their color.
- `Cell.java` – Represents a square on the board.
- `ChangeRowCol.java` – Converts user input like `e2` to array indices.
- `Board.java` – Represents the 8x8 board and manages piece placement.
- `ChessGame.java` – Game loop, move coordination, input handling.
- `Chess.java` – Main class, starts the program.
**Design Principles Used**

-Inheritance: Pieces base class with polymorphic isValidMove() implemented by each piece.

-Encapsulation: Position, color, and state logic encapsulated inside each piece.

-Clean Board Abstraction: Board manages piece positioning, printing, and movement logic.

-Input Parser: Handles algebraic notation to array index conversion (e2 → [6, 4]).

**Note** : This LLD Problem is available in Work@tech website, Please go through the Question for better understanding.

## Author

- [Jeevitha Shree T](https://github.com/JeevithaShreeT)
