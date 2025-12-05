package trabalhopoo2.exceptions;

/**
 *
 * @author Iuri da Silva Fernandes
 * @author Dyonathan Bento Laner
 */
public class JogadaInvalidaException extends RuntimeException { // Exceção disparada quanto existe a tentativa de realizar uma jogada considerada inválida  

    public JogadaInvalidaException() {
    }

    public JogadaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
