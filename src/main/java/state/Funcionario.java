package main.java.state;

public class Funcionario {
    private String nome;
    private FuncionarioEstado estado;

    public Funcionario(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioEstado getEstado() {
        return estado;
    }

    public void setEstado(FuncionarioEstado estado) {
        this.estado = estado;
    }

    public boolean contratar(){ return estado.contratar(this); }

    public boolean demitir(){ return estado.demitir(this); }

    public boolean afastar(){ return estado.afastar(this); }

    public boolean atestarLicenca(){ return estado.atestarLicenca(this); }
}
