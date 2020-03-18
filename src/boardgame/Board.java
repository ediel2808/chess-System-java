package boardgame;

public class Board {

	private int rows;
	private int column;
	private Piece[][]pieces;
	public Board(int rows, int columns) {
		this.rows = rows;
		this.column = column;
		pieces = new Piece[rows][columns];
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
}
