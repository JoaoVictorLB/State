package main.java.state;

public class FuncionarioEstadoAfastado extends FuncionarioEstado {

    private FuncionarioEstadoAfastado() {};
    private static FuncionarioEstadoAfastado instance = new FuncionarioEstadoAfastado();
    public static FuncionarioEstadoAfastado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Afastado";
    }

    public boolean demitir(Funcionario funcionario){
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        return true;
    }
}
