package deepPrototype;

import java.io.Serializable;

/**
 * Created by mzcsh on 2019/3/12.
 */
public class Jingubang implements Serializable{
    public float h=100;
    public float d = 10;
    public void big(){
        this.d*=2;
        this.h*=2;
    }
    public  void small(){
        this.d/=2;
        this.h/=2;
    }
}
