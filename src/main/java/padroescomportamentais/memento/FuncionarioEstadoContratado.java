package padroescomportamentais.memento;



public class FuncionarioEstadoContratado implements FuncionarioEstado {

    private FuncionarioEstadoContratado() {};
    private static FuncionarioEstadoContratado instance = new FuncionarioEstadoContratado();
    public static FuncionarioEstadoContratado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Contratado";
    }

}
