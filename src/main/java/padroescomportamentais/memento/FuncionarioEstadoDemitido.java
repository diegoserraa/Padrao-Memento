package padroescomportamentais.memento;



public class FuncionarioEstadoDemitido implements FuncionarioEstado {

    private FuncionarioEstadoDemitido() {};
    private static FuncionarioEstadoDemitido instance = new FuncionarioEstadoDemitido();
    public static FuncionarioEstadoDemitido getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Demitido";
    }
    
}

