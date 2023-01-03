import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler uniqueInstance;
    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public static ChocolateBoiler getInstance(){

        if (uniqueInstance == null ){ // check if there is an instance if not synchronise the class
             synchronized (ChocolateBoiler.class){
                 if (uniqueInstance == null){
                     uniqueInstance = new ChocolateBoiler();
                 }
             }
        }
        return uniqueInstance;
    }

    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }


}
