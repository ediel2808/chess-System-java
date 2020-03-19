package boardgame;

public class BoardException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
public BoardException(String msg) {
	super(msg);//aqui ele vai passar esse mensagem apra o contrutor da superClasse
	//que é o RuntimeException
	}
}
