import java.util.Arrays;
import java.util.Scanner;

//public class Long {
    //找单身狗
   /* public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1};
        Single(arr);
    }
    public static void Single(int arr[]) {
        int a=0;
        for(int i=0;i<arr.length;i++){
            a=a^arr[i];
        }
        System.out.println(a);
    }*/
    //迭代斐波那契数
    /*public static int fib(int n){
        int f0=0;
        int f1=1;
        int f2=0;
        if(n<=1){
            return n;
        }
        for(int i=1;i<=n;i++){
            f2=f0+f1;
            f0=f1;
            f1=f2;
        }
        return f2;
    }

    public static void main(String[] args) {
        System.out.println("请输入一个数:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(fib(num));
    }*/
    //求阶乘和
    /*public static void main(String[] args) {
        System.out.println("请输入所求的阶乘:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int j=1;j<=n;j++){
           sum+= Fac(j);
        }
        System.out.println(sum);
    }
    public static int Fac(int n){
        int ret=1;
        for (int i=1;i<=n;i++){
            ret*=i;
        }
        return ret;
    }*/
    //求N的阶乘
    /*public static void main(String[] args) {
        System.out.println("输入所求阶乘数:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fac(n));
    }
    public static int fac(int n){
        int ret=1;
        for(int i=1;i<=n;i++){
            ret*=i;
        }
        return ret;
    }*/


    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    /*public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int len=arr.length;
        swap(arr,len);
        for(int i=0;i<len-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void swap(int[] arr,int len){
        int left=0;
        int right=len-1;
        for(int i=0;i<len;i++){
            while((left<right)&&(arr[left]%2==1)){
                left++;
            }
            while((left<right)&&(arr[right]%2==0)){
                right--;
            }
            if(left<right){
                int tmp=arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;
            }
        }
    }*/

    //在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    /*public static void main(String[] args) {
        System.out.println("输入三个数:");
        Scanner sc=new Scanner(System.in );
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("最大数为:");
        System.out.println(max3(a,b,c));
    }
    public static int max2(int a,int b){
        return a>b?a:b;
    }
    public static int max3(int a,int b,int c){
        return max2(max2(a,b),c);
    }
*/

    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系

    /*public static void main(String[] args) {
        System.out.println("输入数字的个数为：");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(n==2){
            System.out.println("输入数字：");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int num1 = max( a , b );
            System.out.println("最大值为："+num1);//输出两个整数比较大小的值
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            double num2 = max( c , d );
            System.out.println("最大值为："+num2);//输出两个小数比较大小的值
        }else if (n==3){
            System.out.println("输入数字：");
            double e = sc.nextDouble();
            double f = sc.nextDouble();
            int g = sc.nextInt();
            double num3 = max( e , f , g );
            System.out.println("最大值为："+num3);//输出两个小数和一个整数比较大小的值
        }
    }
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static double max(double a,double b){
        return a>b?a:b;
    }
    public static double max(double a,double b,int c){
        return max(a,b)>c?max(a,b):c;
    }*/

    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
    /*public static void main(String[] args) {
        System.out.println("输入的数字个数:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.println("输入数字:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("这两个数和为:"+addInt(a,b));
        }
        else if(n==3){
            System.out.println("输入数字:");
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            System.out.println("这三个小数的和为:"+addDouble(a,b,c));
        }
    }
    public static int addInt(int a,int b){
        return a+b;
    }
    public static double addDouble(double a,double b,double c){
        return a+b+c;
    }*/

    //青蛙跳台阶
    /*public static void main(String[] args) {
        System.out.println("跳几级台阶:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("跳"+n+"级台阶有"+fib(n)+"种方法");
        System.out.println("跳"+n+"级台阶有"+fib2(n)+"种方法");
    }
    //递归(非高效方法)
    public static int fib(int n){
        if(n<3){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    //非递归
    public static int fib2(int n){
        if(n<3){
            return n;
        }
        else{
            int first=1;
            int second=2;
            int total=0;
            while(n-->2){
                total=first+second;
                first=second;
                second=total;
            }
            return total;
        }
    }*/

    //递归求斐波那契第N项
    /*public static void main(String[] args) {
        System.out.println("求到第几项:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
        System.out.println(fib2(n));
    }
    //递归
    public static int fib(int n){
        if(n<3){
            return 1;
        }
        else
            return fib(n-1)+fib(n-2);
    }
    //非递归
    public static int fib2(int n){
        if(n<=2){
            return 1;
        }
        else{
            int first=1;
            int second=1;
            int total=0;
            while(n>2){
                total=first+second;
                first=second;
                second=total;
                n--;
            }
            return total;
        }
    }*/

    //递归打印数字每一位
    /*public static void main(String[] args) {
        System.out.println("输入一个数:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pri(n);
    }
    public static void Pri(int n){
        if(n>9)
            Pri(n/10);
        System.out.println(n%10);
    }*/


    //输入一个非负整数，返回组成它的数字之和
    /*public static void main(String[] args) {
        System.out.println("请输入一个数字:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("和为:"+add(num));
    }
    public static int add(int n){
        if(n<9){
            return n;
        }
        else{
            return n%10+add(n/10);
        }
    }*/

    //递归求和1 + 2 + 3 + ... + 10
    /*public static void main(String[] args) {
        System.out.println(add(10));
    }
    public static int add(int n){
        if(n==1){
            return n;
        }
        else{
            return n+add(n-1);
        }
    }*/

    //递归求N的阶乘
    /*public static void main(String[] args) {
        System.out.println("请输入一个数:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("该数字的阶乘为:");
        System.out.println(fac(n));
    }
    public static int fac(int n){
        if(n==1){
            return n;
        }
        else{
            return n*fac(n-1);
        }
    }*/

    //递归求解汉诺塔问题
    /*public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        tower(n,'a','b','c');
        sc.close();
    }
    public static void tower(int n,char a,char b,char c){
        if(n==1){
            System.out.println(a+"->"+c);
        }else{
            tower(n-1,a,c,b);
            System.out.println(a+"->"+c);
            tower(n-1,b,a,c);
        }
    }*/
    //寒假作业
    //大写转小写字母
    /*public static void main(String[] args) {
        System.out.println(toLowerCase("ABCD"));
    }
    public static String toLowerCase(String str){
        if(str==null||str.length()==0){
            return str;
        }
        //利用toCharArray方法把字符串转化成字符数组
        char[] ch=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch[i]>='A'&&ch[i]<='Z'){
                ch[i]+=32;
            }
        }
        return String.valueOf(ch);
    }*/
    //回文数
    /*public static boolean huiWen(int num){
        if(num<0){
            return false;
        }
        int cur=0;
        int x=num;
        while(x!=0){
            cur=cur*10+x%10;
            x/=10;
        }
        return cur==num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean flag=huiWen(a);
        System.out.println(flag);
    }
*/

//}


/*class Animal{
    public String name;
    public int age;
    public void eat(){
        System.out.println("Animal::eat!!!");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog::eat!!!");
    }
}*/
class Shape{
    public void draw(){
    }
}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("●");
    }
}
class Rectangular extends Shape{
    @Override
    public void draw(){
        System.out.println("□");
    }
}
class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("△");
    }
}
class Flower extends Shape{
    @Override
    public void draw(){
        System.out.println("♣");
    }
}


public class Long{
    public static void main(String[] args) {
        Shape shape1=new Circle();
        Shape shape2=new Rectangular();
        Shape shape3=new Triangle();
        Shape shape4=new Flower();
        drawShape(shape1);
        drawShape(shape2);
        drawShape(shape3);
        drawShape(shape4);

    }
    public static void drawShape(Shape shape){
        shape.draw();
    }
    //多态方法
    public static void drawShapes(){
        Shape[] shapes={new Circle(),new Triangle(),new Rectangular(),new Flower()};
        for (Shape shape:shapes) {
            shape.draw();
        }
    }
    public static void main1(String[] args) {
        //通过父类的引用  引用子类的对象
        //前提是发生向上转型
        //Animal animal=new Dog();
        //animal.eat();
    }
}

