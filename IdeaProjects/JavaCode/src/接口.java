interface IShape{
    /**
     * 使用关键字interface修饰
     * 1.接口当中的方法 ，不能有具体实现。
     *  接口当中的方法，默认是：public abstract
     *  2.接口当中的成员变量，默认是 public static final
      */
    public static final int age=10;
    //不能具体实现
   // public abstract void func(){
    //}
    void draw();
}
interface A{
    void funcA();
}
interface B{
    void funcB();
}
interface C{
    void funcC();
}
interface D extends A,B,C{
    void funcD();
}
//必须重写
class F implements D{
    @Override
    public void funcA(){
    }
    @Override
    public void funcB(){
    }
    @Override
    public void funcC(){
    }
    @Override
    public void funcD(){
    }
}
abstract class Testabstract{
    public abstract void funcabstract();
}
class Test1 extends Testabstract implements A,B,C{
    @Override
    public void funcA(){
    }
    @Override
    public void funcB(){
    }
    @Override
    public void funcC(){
    }
    @Override
    public void funcabstract(){
    }
}

//类和接口之间的关系:implements
//一个类可以实现多个接口
//一个类可以在继承一个类的同时  实现多个接口
//接口可以扩展(extends)多个接口

class Rect implements IShape{
    @Override
    public void draw(){
        System.out.println("□");
    }
}
class Trian implements  IShape{
    @Override
    public void draw(){
        System.out.println("△");
    }
}
class Flow implements IShape{
    @Override
    public void draw(){
        System.out.println("❀");
    }
}
public class 接口 {
    public static void main(String[] args) {
        drawMap(new Rect());
        drawMap(new Trian());
        drawMap(new Flow());
    }
    public static void drawMap(IShape iShape){
        iShape.draw();
    }
}
