package singleton;

public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }


    public SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }

}
