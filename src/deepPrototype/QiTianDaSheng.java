package deepPrototype;

import java.io.*;
import java.util.Date;

/**
 * Created by mzcsh on 2019/3/12.
 */
public class QiTianDaSheng extends Monkey implements Cloneable,Serializable {
    public Jingubang jingubang;

    public QiTianDaSheng(){
        this.birthday =new Date();
        this.jingubang = new Jingubang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return deepClone();
    }

    public Object deepClone(){

        try {
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            oos.flush();
            oos.close();

            ByteArrayInputStream  bais=new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            QiTianDaSheng copy= (QiTianDaSheng) ois.readObject();

            copy.birthday = new Date();
            return copy;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public QiTianDaSheng shallowClone(QiTianDaSheng target){
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height =target.height;
        qiTianDaSheng.weight=target.weight;

        qiTianDaSheng.jingubang= target.jingubang;
        qiTianDaSheng.birthday=new Date();
        return qiTianDaSheng;
    }
}
