public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton(){
        System.out.println("in constructor");
    }

    public static  Singleton getInstance(){
        if (uniqueInstance == null){ // if uniqueInstance is null then we have not created the instance yet
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }

        }
        return uniqueInstance;
    }


}
