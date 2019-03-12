package prototype;

/**
 * Created by mzcsh on 2019/3/12.
 */
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype){
        this.prototype = prototype;
    }
    public Prototype startClone(Prototype studentPrototype){
        return studentPrototype.clone();
    }
}
