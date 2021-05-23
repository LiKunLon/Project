

import org.omg.SendingContext.RunTime;

import java.util.*;
import java.lang.Math;//数学公式




public class Test {
    //扑克牌


    //最小栈
    /*class MinStack {
        Stack<Integer> stack=new Stack<>();
        //辅助栈
        Stack<Integer> minStack=new Stack<>();

        * initialize your data structure here.
        public MinStack() {

        }

        public void push(int x) {
            stack.push(x);
            //辅助栈为空的话,把x也添加给他
            if(minStack.isEmpty()){
                minStack.push(x);
            }else{
                //辅助栈不为空
                //如果x比栈顶元素小
                //再把x压入辅助栈
                if(x<=minStack.peek()){
                    minStack.push(x);
                }
            }
        }

        public void pop() {
            int x=stack.pop();
            //如果两个栈顶元素相等,都pop();
            if(x==minStack.peek()){
                minStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }*/


    //栈实现队列
    /*class MyQueue {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        *//** Initialize your data structure here. *//*
        public MyQueue() {

        }

        *//** Push element x to the back of queue. *//*
        public void push(int x) {
            s1.push(x);
        }

        *//** Removes the element from in front of queue and returns that element. *//*
        public int pop() {
            if(empty()){
                return -1;
            }
            //将主栈中元素逐个压入辅助栈
            //辅助栈栈顶元素,就是主栈中最后一个元素
            //直接pop()
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        *//** Get the front element. *//*
        public int peek() {
            if(empty()){
                return -1;
            }
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            //跟上面pop()一样
            //这个直接拿到peek就行
            return s2.peek();
        }

        *//** Returns whether the queue is empty. *//*
        public boolean empty() {
            return s1.empty()&&s2.empty();
        }
    }*/
    //队列实现栈
    /*class MyStack {
        private Queue<Integer> qu1=new LinkedList<>();
        private Queue<Integer> qu2=new LinkedList<>();

        *//** Initialize your data structure here. *//*
        public MyStack() {

        }

        *//** Push element x onto stack. *//*
        public void push(int x) {
            //哪个队列不为空,
            //放进哪个队列
            if(!qu1.isEmpty()){
                qu1.offer(x);
            }else if(!qu2.isEmpty()){
                qu2.offer(x);
            }else{
                qu1.offer(x);
            }

        }

        *//** Removes the element on top of the stack and returns that element. *//*
        public int pop() {
            if(empty()){
                return -1;
            }
            //每次出不为空的队列,出size-1个到另一个空队列,弹出最后剩下的元素就是要出栈的
            if(!qu1.isEmpty()){
                int size=qu1.size();
                for(int i=0;i<size;i++){
                    qu2.offer(qu1.poll());
                }
                return qu1.poll();
            }else{
                int size=qu2.size();
                for(int i=0;i<size;i++){
                    qu1.offer(qu2.poll());
                }
                return qu2.poll();
            }
        }

        *//** Get the top element. *//*
        public int top() {
            if(empty()){
                return -1;
            }
            //每次出不为空的队列,出size-1个到另一个空队列,弹出最后剩下的元素就是要出栈的
            if(!qu1.isEmpty()){
                int size=qu1.size();
                int cur=-1;
                for(int i=0;i<size;i++){
                    cur=qu1.poll();
                    qu2.offer(cur);
                }
                return cur;
            }else{
                int size=qu2.size();
                int cur=-1;
                for(int i=0;i<size;i++){
                    cur=qu2.poll();
                    qu1.offer(cur);
                }
                return cur;
            }
        }

        *//** Returns whether the stack is empty. *//*
        public boolean empty() {
            return qu1.isEmpty()&&qu2.isEmpty();
        }
    }*/

    //实现循环队列
    /*class MyCircularQueue {
        public int front;//队头
        public int rear;//代表当前可以存放数据的下标
        public int[] elem;

        public MyCircularQueue(int k) {
            this.elem=new int[k];
            this.front=0;
            this.rear=0;
        }
        //入队
        public boolean enQueue(int value) {
            //判满
            if(isFull()){
                return false;
            }
            this.elem[this.rear]=value;
            this.rear=(this.rear+1)%this.elem.length;
            return true;
        }
        //出队
        public boolean deQueue() {
            //判空
            if(isEmpty()){
                return false;
            }
            //删掉队头元素就好了
            //让front挪到下一个位置即可
            this.front=(this.front+1)%this.elem.length;
            return true;
        }
        //拿到队头元素
        public int Front() {
            if(isEmpty()){
                return -1;
            }
            //直接返回front下标的元素即可
            int num=this.elem[this.front];
            return num;
        }
        //拿到队尾元素
        public int Rear() {
            if(isEmpty()){
                return -1;
            }
            *//**
             * 队尾有两种情况:
             * ①:队是满的,rear已经去了0号位置
             * ②:正常情况
             *//*
            int index=-1;
            if(this.rear==0){
                index=this.elem.length-1;
            }else{
                index=this.rear-1;
            }
            return this.elem[index];
        }

        public boolean isEmpty() {
            //front和rear相遇时
            //则为空
            return this.front==this.rear;
        }

        public boolean isFull() {
            //rear在最后面,下一个就是front
            //(rear+1)%length就到队头了
            //牺牲了一个空间
            return (this.rear+1)%this.elem.length==this.front;
        }
    }*/




    /*class Node{
        public int val;
        public Node next;
        public Node(int val){
            this.val=val;
        }
    }

    class MyQueue{
        public Node first;
        public Node last;
        int size=0;
        public boolean offer(int val){
            Node node=new Node(val);
            if(this.first==null){
                this.first=node;
                this.last=node;
            }else{
                //实现的是队列;进行尾插
                this.last.next=node;
                node.next=null;
            }
            size++;
            return true;
        }
        public int poll() throws RuntimeException{
            if(isEmpty()){
                throw new RuntimeException("队列是空的!");
            }
            int num=this.first.val;
            this.first=this.first.next;
            return num;
        }
        public int peek() throws RuntimeException{
            if(isEmpty()){
                throw new RuntimeException("队列是空的!");
            }
            int num=this.first.val;
            return num;
        }
        public boolean isEmpty(){
            return size==0;
        }
        public int size(){
            return size;
        }

    }*/

    //栈 倒置数组
    /*public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        int[] arr1={1,2,3,4,5};
        int[] arr2=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            int num=arr1[i];
            stack.push(num);
        }
        for (int x:arr2) {
            x=stack.pop();
            System.out.print(x+" ");
        }
    }*/


    //杨辉三角
    //①泛型
    /*public List<List<Integer>> func(int numRows){
        List<List<Integer>> ret=new ArrayList<>();
        if(numRows<=0){
            return null;
        }
        List<Integer> list=new ArrayList<>();
        list.add(1);
        ret.add(list);
        for(int i=1;i<numRows;i++){
            List<Integer> curRow=new ArrayList<>();
            curRow.add(1);
            for(int j=1;j<i;j++){
                List<Integer> prevRow=new ArrayList<>();
                int num=prevRow.get(j-1)+prevRow.get(j);
                curRow.add(num);
            }
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }
    //数组
    public static int[][] Triangle(int num){
        int[][] arr=new int[num][num];
        for (int i = 0; i <num ; i++) {
            arr[i][0]=arr[i][i]=1;
            for (int j = 0; j <num ; j++) {
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
        return arr;
    }
    public static void print(int[][] arr){
        int len=arr.length;
        for (int i = 0; i <len ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }*/




    /*//删除第一个字符串中出现的第二个字符串的自字符
    *//**
     * 例如:
     * String str1="welcome to bit";
     * String str2="come";
     * 输出:"wl t bit";
     *//*
    public static List<Character> func(String str1, String str2){
        List<Character> list=new ArrayList<>();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            //遍历第一个字符串;
            //第二个字符串里没有;就添加给list
            if(!str2.contains(ch+"")){
                list.add(ch);
            }
        }
        return list;
    }
    public static String func2(String str1,String str2){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(!str2.contains(ch+"")){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str1="welcome to bit";
        String str2="come";
        System.out.println(func(str1, str2));
        System.out.println(func2(str1, str2));
    }*/


    /*class MyStack{
        public int[] elem;
        public int top;//可以代表下标:当前可以存放元素的下标.
        //也可以代表当前存放了多少元素
        public MyStack(){
            this.elem=new int[10];
        }
        public boolean  isFull(){
            return this.top==this.elem.length;
        }
        public int push(int data){
            if(isFull()){
                throw new RuntimeException("栈满了!");
            }
            this.elem[top]=data;
            this.top++;
            return this.elem[top-1];//减一是因为上面有个++;但本身投票还是在上面,只是访问了下面的元素
        }
        public int pop(){
            if(empty()){
                throw new RuntimeException("栈为空!");
            }
            //让top的位置向下移动一个;
            //下次插入元素直接覆盖掉
            //就相当于是pop了
            this.top--;
            return this.elem[this.top];
        }
        public int peek(){
            if(empty()){
                throw new RuntimeException("栈为空!");
            }
            return this.elem[this.top-1];
        }
        public  boolean empty(){
            return this.top==0;
        }
        public int size(){
            return this.top;
        }
    }
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());//5
        System.out.println(stack.pop());//5
        System.out.println(stack.pop());//4
        System.out.println(stack.pop());//3
        System.out.println(stack.pop());//2
        System.out.println(stack.pop());//1
        System.out.println(stack.empty());
        System.out.println(stack.peek());
    }*/
   /* public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        //添加元素
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        //peek访问栈顶元素
        System.out.println(stack.peek());//4
        //pop抛出栈顶元素->删除
        System.out.println(stack.pop());//4
        System.out.println(stack.pop());//3
        System.out.println(stack.pop());//2
        System.out.println(stack.pop());//1
        //判空,返回值boolean
        System.out.println(stack.empty());
        //继承了vector,可以调用他的方法,返回值boolean
        System.out.println(stack.isEmpty());
        //空栈抛出元素,会发生空栈异常
        System.out.println(stack.pop());
    }
*/


    /*public static List<Character> func(String str1,String str2) {
        List<Character> list =new ArrayList<>();
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str2.indexOf(str1.charAt(i))==-1){
                    list.add(str1.charAt(i));
                }
            }
        }
        return list;
    }*/

    /*public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(arr.length);
        System.out.println(arr[0].length);
    }*/


    /*class MyArrayList<E>{
    public E[] elem;
    public int usedSize;
    public MyArrayList(){
        this.elem=(E[])new Object[10];
    }

    public void add(E data){
        this.elem[usedSize]=data;
        this.usedSize++;
    }
    public E get(int pos){
        return this.elem[pos];
    }


}*/

   /* public static void main(String[] args) {
        MyArrayList<String> myArrayList=new MyArrayList<>();
        myArrayList.add("abc");
        myArrayList.add("def");
        myArrayList.add("gh");
        String ret=myArrayList.get(0);
        System.out.println(ret);

        MyArrayList<Integer> myArrayList1=new MyArrayList<>();
        myArrayList1.add(1);
        myArrayList1.add(112);
        myArrayList1.add(12903);
        int num=myArrayList1.get(2);
        System.out.println(num);

        MyArrayList<Double> myArrayList2=new MyArrayList<>();
        myArrayList2.add(1.0);
        myArrayList2.add(5.6);
        myArrayList2.add(4.3);
        double val=myArrayList2.get(1);
        System.out.println(val);
    }*/



/*class Student{
    public String name;
    public String Class;
    public double score;

    public Student(String name, String aClass, double score) {
        this.name = name;
        Class = aClass;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "姓名='" + name + '\'' +
                ", 班级='" + Class + '\'' +
                ", 分数=" + score +
                '}';
    }
}*/


    /*public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(4);
        //默认升序
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }*/

    /*public static void main1(String[] args) {
        List<Student> list=new ArrayList<>();
        Student stu1=new Student("李坤龙","五班",85.5);
        Student stu2=new Student("李岚","五班",90.0);
        list.add(stu1);
        list.add(stu2);
        //第一种打印方法
        System.out.println(list.toString());
        //第二种打印方法
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //第三种打印方法
        System.out.println();
        for (Student student:list
             ) {
            System.out.println(student);
        }

    }*/


    /*public static void main(String[] args) {
        int[] nums={31,5,13,8,1235};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }*/


    /*public static void main(String[] args) {
        String str="      ";
        String[] ss=str.split(" ");
        for (String x:ss
             ) {
            System.out.println(x);
        }
    }*/



    /*public static int countSegments(String s) {
        if(s==null||s.equals("")){
            return 0;
        }
        s=s.trim();
        int count=0;
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].isEmpty()){
                continue;
             }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str="Hello, my name is hah ";
        String str1="      1     ";
        int num=countSegments(str);
        System.out.println(num);
    }*/
    /*public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int[] arr1=new int[3];
        int[] arr2=new int[3];
        int[] arr3=new int[nums.length];
        int l=0;
        for (int i = 0; i <3 ; i++) {
            arr1[i]=nums[i];
        }
        for (int j = 3; j <nums.length ; j++) {
            arr2[j-3]=nums[j];
        }
        *//*for (int x:arr2
             ) {
            System.out.print(x+" ");
        }*//*
        for (int k = 0; k <3 ; k++) {
            arr3[l++]=arr1[k];
            arr3[l++]=arr2[k];
        }
        for (int x:arr3
             ) {
            System.out.print(x+" ");
        }

    }*/




    /*public static void main(String[] args) {
        String str="abcd";
        System.out.println(str.indexOf('a'));
    }*/


    /*public static void main(String[] args) {
        int count = 0;
        String allowed = "ab" ;
        String[] strings = {"a","b","abc","aab","bba","aabb"};
        int n=strings.length;
        //遍历字符串数组
        for (int i = 0; i <strings.length ; i++) {
            //遍历每一个字符串里的字符
            for (int j = 0; j <strings[i].length() ; j++) {
                //字符串的每一个字符
                //indexOf(ch)返回指定字符第一次出现的字符串内的索引
                //找不到返回-1
                if(allowed.indexOf ( strings[i].charAt(j) ) == -1){
                    count++;
                    break;
                }
            }
        }
        //用的反向思维
        //算的是不包含的
        //所以n-count
        System.out.println(n-count);
    }*/
    /*public static void main(String[] args) {
        //defgabc
        String str="abcdefg";
        int n=str.length();
        str=reverseK(str,0,2);
        str=reverseK(str,3,n-1);
        str=reverseK(str,0,n-1);
        System.out.println(str);

    }
    public static String reverseK(String str,int start,int end){
        char[] chars=str.toCharArray();
        while(start<end){
            char tmp=chars[start];
            chars[start]=chars[end];
            chars[end]=tmp;
            start++;
            end--;
        }
        return String.valueOf(chars);
    }
*/

    /*public static void main(String[] args) {
        //defgabc
        String str="abcdefg";
        //substring方法是用来截取字符串的
        //左闭右开,取到的是[start,end)区间
        String str1=str.substring(0,3);
        String str2=str.substring(3,7);
        System.out.println(str1);//abc
        System.out.println(str2);//defg
    }*/


    /*//实现一个自己的异常
    static class MyException extends Exception{
        public MyException(String message){
            super(message);
        }
    }

    public static void main(String[] args) {
        try{
            throw new MyException("异常!");
        }catch (MyException e){
            e.printStackTrace();
        }
    }*/


    /*//自定义两个异常
    //用户名错误
    static class UserError extends Exception{
        public UserError(String message){
            super(message);
        }
    }
    //密码错误
    static class PasswordError extends  Exception{
        public PasswordError(String message) {
            super(message);
        }
    }
    public static String username="admin";
    public static String password="123456";

    public static void main(String[] args) {
        try{
            login("admin","123456");
        } catch (PasswordError passwordError) {
            passwordError.printStackTrace();
        } catch (UserError userError) {
            userError.printStackTrace();
        }
    }
    public static void login(String name,String password)throws UserError,PasswordError{
        if(!Test.username.equals(name)){
            throw new UserError("用户名错误!");
        }
        if(!Test.password.equals(password)){
            throw new PasswordError("密码错误!");
        }
        System.out.println("登陆成功!");
    }*/



    /*public static void main(String[] args) {
      //  System.out.println("hello,world!");
        //交换两个int
        int a=10;
        int b=20;
        //①创建第三个变量
       *//* int c=a;
        a=b;
        b=c;*//*
        //②加减法
        *//*a=a+b;
        b=a-b;
        a=a-b;*//*
        //③运算符
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a+",b="+b);
    }*/

    /*public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入你的名字:");
        String name=input.nextLine();
        System.out.println(name);
        System.out.println("请输入你的年龄：");
        int age=input.nextInt();
        System.out.println(age);
        System.out.println("请输入你的工资：");
        float salary=input.nextFloat();
        System.out.println(salary);
        System.out.println("你的信息如下:");
        System.out.println("姓名:"+name+",年龄:"+age+",工资:"+salary);
        input.close();
    }*/
    /*//用户输入三个数字,从小到大输出
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        System.out.println("输入的三个数字为:");
        System.out.println("a="+a+",b="+b+",c="+c);
        input.close();
        if(a>b){
            int t=a;
            a=b;
            b=t;
        }
        if(b>c){
            int t=b;
            b=c;
            c=t;
        }
        if(a>c){
            int t=a;
            a=c;
            c=t;
        }
        System.out.println("这三个数从小到大的顺序为:");
        System.out.println("a="+a+",b="+b+",c="+c);
    }*/

    /*//用户输入三个数字,输出最大最小值
    public static void main(String[] args) {
        System.out.println("请输入三个待比较数:");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        System.out.println("输入的三个数字为:");
        System.out.println("a="+a+",b="+b+",c="+c);
        input.close();
        if(a>b){
            int t=a;
            a=b;
            b=t;
        }
        if(b>c){
            int t=b;
            b=c;
            c=t;
        }
        if(a>c){
            int t=a;
            a=c;
            c=t;
        }
        System.out.println("最大值为:"+c);
        System.out.println("最小值为:"+a);
    }*/

    //猜数字游戏
    /*public static void menu() {
        System.out.println("***********************");
        System.out.println("***欢迎来到猜数字游戏******");
        System.out.println("********1.play*********");
        System.out.println("********2.quit*********");
        System.out.println("***********************");

    }

    public static void game() {
        System.out.println("开始游戏!");
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int toGuess=random.nextInt(100)+1;
        while(true){
            System.out.println("请输入你猜的数字:(1-100)");
            int num=sc.nextInt();
            if(num<toGuess){
                System.out.println("小了");
            }else if(num>toGuess){
                System.out.println("大了");
            }else{
                System.out.println("bingo!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        boolean flag=true;
        while(flag){
            menu();
            System.out.println("请输入指令是否开始游戏:");
            Scanner sc=new Scanner(System.in);
            int input=sc.nextInt();
            switch(input){
                case 1:
                    game();
                    System.out.println("就这?再来一把?");
                    break;
                case 2:
                    flag=false;
                    System.out.println("退出游戏!");
                    break;
                default:
                    System.out.println("你的输入有误!");
                    break;
            }
        }
    }*/
    //根据年龄打印年龄段
    /*public static void main(String[] args) {
        System.out.println("请输入所要判断的年龄:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18){
            System.out.println("这是个少年!");
        }
        else if(age>=19&&age<=28){
            System.out.println("这是个青年!");
        }else{
            System.out.println("这是个老年!");
        }
    }*/
    //判断一个数是否是素数
    /*public static void main(String[] args) {
        System.out.println("请输入要判断的素数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        for (i=2; i < num; i++){
            if(num%i==0){
                break;
            }
        }
        if(num>i){
            System.out.println("不是素数");
        }else{
            System.out.println("是素数");
        }
}*/
    //打印1-100的素数
    /*public static void main(String[] args) {
        int i=0;
        int j=0;
        for(i=1;i<=100;i++) {//循环1-100
            for (j = 2; j < i; j++) {//在[2,i-1]区间循环
                if (i % j == 0) {//不是素数,循环结束
                    break;
                }
            }
            if(j>=i) {//没有满足循环条件的数就是素数
                System.out.println(i);
            }
        }
    }*/
    //1-100数字9出现的次数
    /*public static void main(String[] args) {
        int i=0;
        int count=0;
        for(i=1;i<=100;i++){
            if(i/10==9){//十位上是9的
                count++;
            }
            else if(i%10==9){//个位上是9的
                count++;
            }
        }
        System.out.println(count);
    }*/
    //输出1000-2000的闰年
   /* public static void main(String[] args) {
        int year=0;
        for(year=1000;year<=2000;year++){
            if(year%4==0&&year%100!=0||year%400==0){
                System.out.println(year);
            }
        }
    }*/
    //0-999间水仙花数
    /*public static void main(String[] args) {
        int num,sum;
        int i,j,k;
        for(num=100;num<=999;num++){
            i=num%10;//个位数
            j=(num/10)%10;//十位数
            k=(num/100)%10;//百位数
            sum=i*i*i+j*j*j+k*k*k;
            if(sum==num){
                System.out.println(num);
            }
        }
    }*/

    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
    /*public static void main(String[] args) {
        double i=0;//注意这里是double
        int j=1;
        double sum=0;
        for(i=1;i<=100;i++){
            sum=sum+(1/i)*j;
            j=-j;
        }
        System.out.println(sum);
    }*/

    //求两个正整数最大公约数(辗转相除法)
    /*public static void main(String[] args) {
        System.out.println("请输入两个整数:");
        Scanner num=new Scanner(System.in);
        int a=num.nextInt();
        int b=num.nextInt();
        while(b!=0){
            int c=a%b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }*/

    //输出整数每一位
    /*public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        daYin(num);
    }
    //递归
    public static void daYin(int n) {
        if(n>9){
            daYin(n/10);
        }
        System.out.println(n%10);
    }
*/

    //输出乘法口诀表(n由用户输入)
    /*public static void main(String[] args) {
        System.out.println("输入n决定几行几列:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.printf("%d*%d=%d\t",i,j,i*j);
            }
        }
    }*/

    //模拟登陆
    /*public static void main(String[] args) {
           //登陆次数
           for (int i = 0; i < 3; i++) {
               //定义用户名与密码
               String username = "Lkl";
               String password = "123456";
               //键盘录入登录的用户名和密码，用scanner实现
               Scanner scanner = new Scanner(System.in);
               System.out.println("请输入用户名:");
               String name = scanner.nextLine();
               System.out.println("请输入密码：");
               String pwd = scanner.nextLine();
               //登录判断(用到了equals方法)
               if (name.equals(username) && pwd.equals(password)) {
                   System.out.println("登录成功，欢迎您:" + username);
                   break;
               } else {
                   if (2-i== 0){
                       System.out.println("你的登录次数已经用完，如有问题请与管理员联系！");
                   }else {
                       System.out.println("登录失败，你今天还有" + (2 - i) + "次登录的机会！");
                   }
              }
           }
       }
*/
    //求一个整数存储时二进制1的个数
    /*public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            num=num&(num-1);
            count++;
        }
        System.out.println(count);
    }*/


    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    /*public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入数字：");
        int value=scan.nextInt();
        System.out.println("偶数序列：");
        for(int i=31;i>0;i-=2){
            System.out.print((value>>i)&1);
        }
        System.out.println("");
        System.out.println("奇数序列：");
        for(int i=30;i>=0;i-=2){
            System.out.print((value>>i)&1);
        }
    }*/

    //打印X图案
        /*public static void main(String[] args) {
            int m=10;
            for (int x = 1; x <= m; x++) {//循环7行
                for (int y = 1; y <= m; y++) {//循环7列
                  if (x == y || x + y == m + 1) {//对角线打印O
                        System.out.print("O");
                  } else {
                     System.out.print(" ");//其他位置打印空格.
                 }
             }
             System.out.println();//换行
         }
     }*/
    /*public static void main(String[] args) {
        //System.out.println(lan());
        //System.out.println(lan());
        String str1="abc"+"de";
        String str="abcde";
        System.out.println(str1==str);

    }
    public static boolean lan(){
        String[] nums1={"ab","c"};
        String[] nums2={"a","bc"};
        String sum1="";
        String sum2="";
        for (int i = 0; i<nums1.length ; i++) {
            sum1 += nums1[i];
        }
        String ret1=sum1;
        System.out.println(ret1);
        for (int j = 0; j <nums2.length ; j++) {
            sum2 += nums2[j];
        }
        String ret2=sum2;
        System.out.println(ret2);
        return sum1==sum2;
    }*/




}
