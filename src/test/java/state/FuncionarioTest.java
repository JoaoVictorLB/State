package test.java.state;

import main.java.state.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {
    Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario();
    }

    // Funcionário Contratado

    @Test
    public void naoDeveContratarFuncionarioContratado(){
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertFalse(funcionario.contratar());
    }

    @Test
    public void deveDemitirFuncionarioContratado(){
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.demitir());
        assertEquals(FuncionarioEstadoDemitido.getInstance(), funcionario.getEstado());
    }

    @Test
    public void deveAfastarFuncionarioContratado(){
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.afastar());
        assertEquals(FuncionarioEstadoAfastado.getInstance(), funcionario.getEstado());
    }

    @Test
    public void deveConcederLicencaFuncionarioContratado(){
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.atestarLicenca());
        assertEquals(FuncionarioEstadoLicenca.getInstance(), funcionario.getEstado());
    }

    // Funcionário Afastado

    @Test
    public void deveDemitirFuncionarioAfastado(){
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertTrue(funcionario.demitir());
        assertEquals(FuncionarioEstadoDemitido.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDeveConcederLicencaFuncionarioAfastado(){
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertFalse(funcionario.atestarLicenca());
    }

    @Test
    public void naoDeveContratarFuncionarioAfastado(){
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertFalse(funcionario.contratar());
    }

    @Test
    public void naoDeveAfastarFuncionarioAfastado(){
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertFalse(funcionario.afastar());
    }

    // Funcionário Demitido

    @Test
    public void naoDeveDemitirFuncionarioDemitido(){
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.demitir());
    }

    @Test
    public void naoDeveContratarFuncionarioDemitido(){
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.contratar());
    }

    @Test
    public void naoDeveAfastarFuncionarioDemitido(){
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.afastar());
    }

    @Test
    public void naoDeveConcederLincencaFuncionarioDemitido(){
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.atestarLicenca());
    }

    // Funcionário de Licença
    @Test
    public void naoDeveDemitirFuncionarioDeLicenca(){
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        assertFalse(funcionario.demitir());
    }

    @Test
    public void naoDeveContratarFuncionarioDeLicenca(){
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        assertFalse(funcionario.contratar());
    }

    @Test
    public void naoDeveAfastarFuncionarioDeLicenca(){
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        assertFalse(funcionario.afastar());
    }

    @Test
    public void naoDeveConcederLincencaFuncionarioDeLicenca(){
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        assertFalse(funcionario.atestarLicenca());
    }
}
