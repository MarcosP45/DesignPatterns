package facade;

public class Terminal extends Setor {

    private static Terminal terminal = new Terminal();

    private Terminal() {};

    public static Terminal getInstancia() {
        return terminal;
    }
}
