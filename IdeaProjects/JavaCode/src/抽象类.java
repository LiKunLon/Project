
abstract class Shapes{
    public String name;
    public int age;
    //1.抽象类不能被直接实例化
    abstract public void draw();
    //2.抽象方法不能private的
    //abstract private void draw();
    public void func(){
        System.out.println("func()");
    }
}
//普通类继承了抽象类,一定要重写抽象类当中的抽象方法
class lan extends Shapes{
    @Override
    public void draw(){
        System.out.println("lan");
    }
}
class yuan extends Shapes{
    @Override
    public void draw(){
        System.out.println("yuan");
    }
}

public class 抽象类 {
    public static void main(String[] args) {
        drawMap(new lan());
        drawMap(new yuan());
    }
    public static void drawMap(Shapes shapes){
        shapes.draw();
    }
}
