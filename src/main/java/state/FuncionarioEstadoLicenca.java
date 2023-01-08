package main.java.state;

public class FuncionarioEstadoLicenca extends FuncionarioEstado {

    private FuncionarioEstadoLicenca() {};
    private static FuncionarioEstadoLicenca instance = new FuncionarioEstadoLicenca();
    public static FuncionarioEstadoLicenca getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Demitido";
    }
}
