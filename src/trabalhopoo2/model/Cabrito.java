package trabalhopoo2.model;

/**
 *
 * @author Iuri da Silva Fernandes
 * @author Dyonathan Bento Laner
 */
public final class Cabrito extends Animal { // Representa o cabrito

    private boolean jaUsouSuperPulo = false;

    @Override
    public String getNomeDeExibicao() {
        return "Cabrito";
    }

    public boolean isJaUsouSuperPulo() {
        return jaUsouSuperPulo;
    }

    public void setJaUsouSuperPulo(boolean jaUsouSuperPulo) {
        this.jaUsouSuperPulo = jaUsouSuperPulo;
    }

}
