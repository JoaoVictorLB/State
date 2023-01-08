package main.java.state;

public abstract class FuncionarioEstado {

    public abstract String getEstado();

    public boolean contratar(Funcionario funcionario){ return false; }

    public boolean demitir(Funcionario funcionario){ return false; }

    public boolean afastar(Funcionario funcionario){ return false; }

    public boolean atestarLicenca(Funcionario funcionario){ return false; }
}
