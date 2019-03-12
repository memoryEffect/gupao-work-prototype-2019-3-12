package deepPrototype;

/**
 * Created by mzcsh on 2019/3/13.
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng =new QiTianDaSheng();
        try {
            QiTianDaSheng qiTianDaSheng1= (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println("深克隆："+(qiTianDaSheng.jingubang==qiTianDaSheng1.jingubang));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        QiTianDaSheng q=new QiTianDaSheng() ;
        QiTianDaSheng s= q.shallowClone(q);
        System.out.println("浅克隆："+(q.jingubang==s.jingubang));
    }
}
