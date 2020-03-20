package chess;

import boardgame.Position;

public class ChessPosition {
	private char column;//coluna 
	private int row;//linha
	public ChessPosition(char column, int row) {
	if(column < 'a' || column > 'h'||row < 1 || row > 8) {//isso é uma programação defenciva.
		throw new ChessException("Error instantiating ChessPosition. valid values are from a1 to h8.");
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
	protected Position toPosition() {
		return new Position(8 - row, column - 'a' );	
	}
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a'- position.getColumn()), 8 - position.getRow());
	}
	@Override
	public String toString() {
		return ""+ column + row;//esse é um macete usando a String vazia para ele poder concatenar automatico
		//se nós tiramos o compilador não aceitará.
	}
}
