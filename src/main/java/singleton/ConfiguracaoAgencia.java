package singleton;

public class ConfiguracaoAgencia {

    private static ConfiguracaoAgencia instancia;

    private double taxaCambio;
    private double taxaAdministrativa;

    private ConfiguracaoAgencia() {
        this.taxaCambio = 5.20;
        this.taxaAdministrativa = 2.5;
    }

    public static ConfiguracaoAgencia getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoAgencia();
        }
        return instancia;
    }

    public double getTaxaCambio() {
        return taxaCambio;
    }

    public double getTaxaAdministrativa() {
        return taxaAdministrativa;
    }
}
