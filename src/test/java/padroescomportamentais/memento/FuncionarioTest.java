package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveArmazenarEstados() {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        funcionario.setEstado(FuncionarioEstadoEmprestado.getInstance());
        assertEquals(2, funcionario.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        funcionario.restauraEstado(0);
        assertEquals(FuncionarioEstadoContratado.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoEmprestado.getInstance());
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        funcionario.restauraEstado(1);
        assertEquals(FuncionarioEstadoContratado.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}