package singleton;

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    public SingletonEager() {
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }

}
