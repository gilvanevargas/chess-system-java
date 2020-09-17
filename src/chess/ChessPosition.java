package chess;

import boardgame.Position;

public class ChessPosition {
<<<<<<< HEAD

	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
=======
	
	private char column;
	private int row;
	
	
	public ChessPosition(char column, int row) {
		
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
>>>>>>> b74488ef88c973630c173c7e69c0882a66d316e8
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
<<<<<<< HEAD

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}

=======
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position){
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
>>>>>>> b74488ef88c973630c173c7e69c0882a66d316e8
	@Override
	public String toString() {
		return "" + column + row;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> b74488ef88c973630c173c7e69c0882a66d316e8
