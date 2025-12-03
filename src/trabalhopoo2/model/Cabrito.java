package trabalhopoo2.model;

public class Cabrito extends Animal {

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
