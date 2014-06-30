/**
 * Created by edouard on 30/06/14.
 */
public class Handler {

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    private Handler nextHandler;

    public Handler(){
        this.nextHandler = new Handler();
    }

    public void canHandle(Integer value){

    }


}
