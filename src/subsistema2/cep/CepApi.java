package subsistema2.cep;

import singleton.SingletonLazyHolder;

public class CepApi {
    private static class InstanceHolder{
        public static CepApi instancia = new CepApi();
    }


    public CepApi() {
    }

    public static CepApi getInstancia(){
        return CepApi.InstanceHolder.instancia;
    }

    public String recuperarCidade(String cep){
        return "Araraquara";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }
}
