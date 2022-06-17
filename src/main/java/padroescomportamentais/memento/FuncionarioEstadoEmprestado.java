package padroescomportamentais.memento;



public class FuncionarioEstadoEmprestado implements FuncionarioEstado {

    private FuncionarioEstadoEmprestado() {};
    private static FuncionarioEstadoEmprestado instance = new FuncionarioEstadoEmprestado();
    public static FuncionarioEstadoEmprestado getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Emprestado";
    }

}
