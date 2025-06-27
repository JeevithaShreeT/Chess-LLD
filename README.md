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

-Color.java - An Enum class to represent the black and white play colors.
-Pieces.java - An abstract class for all chess pieces.
-King.java - Is a Subclass of the Pieces.java class, Individual piece logic.
-Queen.java - Is a Subclass of the Pieces.java class, Individual piece logic.
-Bishop.java - Is a Subclass of the Pieces.java class, Individual piece logic.
-Rook.java - Is a Subclass of the Pieces.java class, Individual piece logic.
-Knight.java - Is a Subclass of the Pieces.java class, Individual piece logic.
-Pawn.java - Is a Subclass of the Pieces.java class, Individual piece logic.
-Player.java - Represents the chess player.
-Cell.java - Represents individual squares on the board.
-ChessGame.java - Coordinates the game state and move Validations, Reading inputs, Game loop and move controller
-ChangeRowCol.java - To change the input String to rows and columns accordingly on the board, Converts between board notation and array coordinates.
-Board.java - Represents the 8x8 board and piece placement.
-Chess.java - Entry point (main method)

**Design Principles Used**

-Inheritance: Pieces base class with polymorphic isValidMove() implemented by each piece.

-Encapsulation: Position, color, and state logic encapsulated inside each piece.

-Clean Board Abstraction: Board manages piece positioning, printing, and movement logic.

-Input Parser: Handles algebraic notation to array index conversion (e2 → [6, 4]).

**Note** : This LLD Problem is available in Work@tech website, Please go through the Question for better understanding.

## Author

- [Jeevitha Shree T](https://github.com/JeevithaShreeT)
