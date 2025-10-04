package facade;

public class Aduana extends Setor {

    private static Aduana instancia = new Aduana();

    private Aduana() {};

    public static Aduana getInstancia() {
        return instancia;
    }
}
