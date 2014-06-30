/**
 * Created by edouard on 30/06/14.
 */
public abstract class Handler {

    protected Handler nextHandler;
    protected Integer value;

    public Handler(Integer value){
        this.value = value;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

}
