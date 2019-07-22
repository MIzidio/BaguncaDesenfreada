package estrutura;

public abstract class PilhaException extends RuntimeException {
	
	private String msg;
	
	public PilhaException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return "Pilha Exception: " + msg;
	}

}
