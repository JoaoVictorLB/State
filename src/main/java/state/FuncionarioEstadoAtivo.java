package main.java.state;

public class FuncionarioEstadoAtivo extends FuncionarioEstado {

    private FuncionarioEstadoAtivo() {};
    private static FuncionarioEstadoAtivo instance = new FuncionarioEstadoAtivo();
    public static FuncionarioEstadoAtivo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Contratado";
    }

    public boolean afastar(Funcionario funcionario){
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        return true;
    }

    public boolean atestarLicenca(Funcionario funcionario){
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        return true;
    }

    public boolean demitir(Funcionario funcionario){
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        return true;
    }

}
