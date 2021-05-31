public class practice {
    //从键盘上输入10个数，赋值给一个长度为10的数组，利用冒泡排序法为数组排序。

/* public static void main(String[] args) {
        //初始化数组
        int[] arr =new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入十个数:");
        //循环输入十个数
        for(int i=0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个数");
            arr[i]=sc.nextInt();
        }
        //冒泡排序(升序)
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        //for-each打印数组
        for (int x:arr) {
            System.out.println(x);
        }
    }*//*


    //最小公倍数
    */
//public static void main(String[] args) {
//        System.out.println("输入两个数:");
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println("这两数的最小公倍数为:"+beiShu(a,b));
//    }
//    public static int beiShu(int a,int b){
//        int m=a;
//        int n=b;
//        while(b!=0){
//            int c=a%b;
//            a=b;
//            b=c;
//        }
//        return m*n/a;
//    }


    //将一个正整数分解质因数。例如：输入90，打印出90=2*3*3*5。

/*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int m=sc.nextInt();
        int n=2;
        System.out.print(m+"=");//打印不用换行
        while(n<=m){
            if(m==n){
                System.out.print(m);
                break;//找到最后一个质因数后break
            }
            else if(m%n==0){//找到一个质因数
                System.out.print(n+"*");
                m=m/n;//新的m
            }
            else{//寻找下一个质因数
                n++;
            }
        }
    }*//*



    //将一个字符由小写字母转换为大写字母
   */
/* public static void main(String[] args) {
        System.out.println("请输入你要转化的字母:");
        char b;
        Scanner input=new Scanner(System.in);
        String i=input.next();
        b=i.charAt(0);
        System.out.println((char)(int)(b-32));
    }*//*


     */
/*//*
/反向输出一个三位数
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a=num%10;//个位数;
        int b=num/10%10;//十位数;
        int c=num/100;//百位数;
        String str="反向输出结果为:";
        System.out.println(str+a+b+c);
    }*//*


    //分解质因数
    */
/*public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.print(m+"=");
        int n=2;
        while(n<=m){
            if(n==m){
                System.out.print(m);
                break;
            }
            else if(m%n==0){
                System.out.print(n+"*");
                m=m/n;
            }
            else{
                n++;
            }
        }
    }*//*




    //一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
   */
/* public static void main(String[] args) {
        for(int i=2;i<1000;i++){
            int sum=0;
            for (int j=1;j<i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }*//*


    //99乘法表
    */
/*public static void main(String[] args) {
        for(int i=0;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }*//*


    //数组转字符串
    */
/*public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(toString(arr));
    }
    public static String toString(int[] arr){
        String ret="[";
        for(int i=0;i<arr.length;i++){
            ret+=arr[i];
            if(i!=arr.length){
                ret+=',';
            }
        }
        ret+="]";
        return ret;
    }*//*


    //应用Arrays.toString(arr)方法
    */
/*public static void main(String[] args) {
        int[] arr={1,2,3,4};
        String newArr= Arrays.toString(arr);
        System.out.println(newArr);
    }*//*

    //打印数组
    */
/*public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for (int x:arr) {
            System.out.println(x);
        }
    }*//*


    //找数组中最大的元素
    */
/*public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7346,37,35,6};
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                int tmp=arr[i];
                arr[i]=max;
                max=tmp;
            }
        }
        return max;
    }*//*

    //求数组元素平均值
    */
/*public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(average(arr));
    }
    public static double average(int[] arr){
        int sum=0;
        for (int x: arr) {
            sum+=x;
        }
        return (double)sum/(double)arr.length;
    }*//*



    //检查数组有序性
    */
/*public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7};
        System.out.println(Sort(arr));
    }
    public static boolean Sort(int[] arr){
        for (int i=0;i<arr.length;i++){
            if(arr[i]<arr[i+1]){
                return true;
            }
        }
        return false;
    }*//*


    //顺序查找
    */
/*public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(Find(arr,5));
    }
    public static int Find(int[] arr,int toFind){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==toFind){
                return i;
            }
        }
        return -1;
    }*//*


    //二分查找
    */
/*public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Find(arr,4));

    }
    public static int Find(int[] arr,int toFind){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(toFind>arr[mid]){
                left=mid+1;
            }
            else if(toFind<arr[mid]){
                right=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }*//*


    //冒泡排序
    */
/*public static void main(String[] args) {
        int[] arr={12,532,53,46,4,7,235,576};
        for (int i=0;i<=arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        for (int x:arr) {
            System.out.println(x);
        }
    }*//*


    //数组逆序
    */
/*public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            left++;
            right--;
        }
        for (int x:arr
             ) {
            System.out.println(x);
        }
    }*//*


    //数组数字排列,偶数在前,奇数在后
   */
/* public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        transform(arr);
        for (int x:arr) {
            System.out.println(x);
        }
    }
    public static void transform(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while((left<right)&&arr[left]%2==0){
                left++;
            }
            while((left<right)&&arr[right]%2!=0){
                right--;
            }
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
        }
    }*//*


     */
/*//*
/求数组的平均值
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(average(arr));
    }
    public static double average(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return (double)sum/(double)arr.length;
    }*//*


    //求数组元素之和
    */
/*public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Sum(arr));
    }
    public static int Sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }*//*

    //原数组元素×2
    */
/*public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Big(arr);
        for (int x:arr
             ) {
            System.out.print(x+" ");
        }
    }
    public static void Big(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]*=2;
        }
    }*//*


    //数组拷贝得到新的数组
    */
/*public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2=new int[5];
        copyOf(arr1,arr2);
    }
    public static void copyOf(int[] arr1,int[] arr2){

        for (int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        for (int x:arr2
             ) {
            System.out.print(x+" ");
        }
    }*//*

    //数组拷贝方法
    */
/*public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2=new int[5];
        System.arraycopy(arr1,0,arr2,0,5);
        for (int x:arr2
             ) {
            System.out.print(x+" ");
        }
    }*//*


    //变种水仙花数 - Lily Number：把任意的数字，
    //从中间拆分成两个数字，比如1461 可以拆分成（1和461）,（14和61）,（146和1),所有拆分后的乘积之和等于自身，是一个Lily Number。
    //例如：655 = 6 * 55 + 65 * 5
    //1461 = 1*461 + 14*61 + 146*1
    //求出 5位数中的所有 Lily Number。
    */
/*public static void main(String[] args) {

        //1*4

        for(int num=9999;num<=99999;num++){
            int a=num/10000;
            int b=num%10000;
            //2*3  12345
            int c=num/1000;
            int d=num%1000;
            //3*2 12345
            int e=num/100;
            int f=num%100;
            //4*1
            int g=num/10;
            int h=num%10;
            if(num==a*b+c*d+e*f+g*h){
                System.out.print(num+" ");
            }
        }


    }*//*

    //打印数组
   */
/* public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        print1(arr);
        System.out.println();
        print2(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }
    public static void print1(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void print2(int[] arr){
        for (int x:arr
             ) {
            System.out.print(x+" ");
        }
    }*//*


    //创建数组并赋初值1-100
    */
/*public static void main(String[] args) {
        int[] arr=new int[100];
        for(int i=0;i<=99;i++){
            arr[i]=i+1;
        }
        for (int x:arr
             ) {
            System.out.print(x+" ");
        }
    }
*//*


    //分解质因数
    */
/*public static void main(String[] args) {
        System.out.println("请输入一个待分解数:");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.print(m+"=");
        int n=2;
        while(n<=m){
            if(n==m){
                System.out.print(m);
                break;
            }else if(m%n==0){
                System.out.print(n+"*");
                m=m/n;
            }else{
                n++;
            }
        }
    }*//*


    //A B D C B D C B
    */
/*public static void main(String[] args) {
        int i=0;
        for(Out('A');Out('B')&&(i<2);Out('C')){
            i++;
            Out('D');
        }
    }

    public static boolean Out(char c){
        System.out.println(c);
        return true;
    }*//*


    //给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
    */
/*public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int len=nums.length;
        int[] ans=new int[2];
        for (int i=0; i < len-1; i++) {
            for(int j=i+1;j<len;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    System.out.println(Arrays.toString(ans));
                }
            }
        }
    }*//*

     */
/*public int[] twoSum(int[] nums, int target) {
        int[] answer=new int[2];//new一个数组用来接收答案
        int len=nums.length;
        for (int i = 0; i <len-1 ; i++) {//i只能跑到倒数第二个数字
            for(int j=i+1;j<len;j++){//j在i后面
                if(nums[i]+nums[j]==target){
                    answer[0]=i;
                    answer[1]=j;
                    return answer;
                }
            }
        }
        answer= new int[]{'没', '有'};//注意返回值类型
        return answer;
    }*//*

    //数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。
    */
/*public int majorityElement(int[] nums) {
        int len=nums.length;
        for (int i = 0; i <=(len/2) ; i++) {
            for(int j=i+(len/2);j<len;j++){
                if(nums[i]==nums[j]){
                    return  nums[i];
                }
            }
        }
        return -1;
    }*//*


    //判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
       */
/* public static boolean isPalindrome(int x) {
            if(x<0){//负数不是回文数
                return false;
            }
            int cur=0;
            int num=x;
            while(num!=0){
                cur=cur*10+num%10;//计算倒序数值
                num/=10;
            }
            return cur==x;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        int a=sc.nextInt();
        System.out.println(isPalindrome(a));;
    }
*//*


    //整数反转
    */
/*public static int reverse(int num) {
        int cur = 0;
        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
            return 0;
        }
        if (num < 0) {
            num = -num;
            while (num != 0) {
                cur = cur * 10 + num % 10;
                num /= 10;
            }
            return -cur;
        } else {
            while (num != 0) {
                cur = cur * 10 + num % 10;
                num /= 10;
            }
            return (int) cur == (int)cur ? cur : 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(reverse(a));
    }*//*


    //交换两个数组内容
  */
/*  public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={6,5,4,3,2,1};
        for(int i=0;i<6;i++){
            int tmp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=tmp;
        }
        for (int x:arr1
             ) {
            System.out.print(x+" ");
        }
        System.out.println();
        for (int a:arr2
             ) {
            System.out.print(a+" ");
        }
    }*//*


    //杨辉三角
    */
/*public static void main(String[] args) {
        Triangle(5);
    }
    public static void Triangle(int n){
        int[][] data=new int[30][30];
        int i=0;
        int j=0;
        for(i=1;i<n;i++){
            data[i][0]=1;//两边都是1
            for(j=1;j<=i;j++){
                data[i][j]=data[i-1][j]+data[i-1][j-1];//递推公式
            }
        }
        for (int k = 0; k <n ; k++) {
            for(int m=0;m<=k;m++){
                System.out.print(data[k][m]+" ");
            }
            System.out.println();
        }
    }*//*


    //给定一个整型数组, 实现冒泡排序(升序排序)
   */
/* public static void main(String[] args) {
        int[] arr={1,4,2,3,8,6,9,7,10,5};
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            for (int j = 0; j <len-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }*//*


    //给定一个整型数组, 判定数组是否有序（递增）
    */
/*public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]<arr[i+1]){
                return true;
            }
        }
        return false;
    }*//*


    //给定一个有序整型数组, 实现二分查找
    //二分查找的前提是数组有序
    */
/*public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr, 8));

    }
    public static int binarySearch(int[] arr,int key){
        int len=arr.length;
        int left=0;
        int right=len-1;
        while(left<right) {
            int mid = (left + right) / 2;
            if (key < arr[mid]) {
                right = mid - 1;
            }
            else if (key > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }*//*


    //数组拷贝方法
    */
/*public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        for (int x:copy(arr)
             ) {
            System.out.print(x+" ");
        }
    }
    public static int[] copy(int[] arr){
        int[] arr2=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];
        }
        return arr2;
    }*//*


    //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
    */
/*public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(toString(arr));
    }
    public static String toString(int[] arr){
        String ret="[";
        for (int i = 0; i < arr.length; i++) {
            ret=ret+arr[i];
            if(i!=arr.length-1){
                ret+=',';
            }
        }
        ret+="]";
        return ret;
    }*//*


    //数组拷贝
    //①arrays.copyof
    */
/*public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2=new int[arr1.length];
        for (int x:Arrays.copyOf(arr1, 6)
             ) {
            System.out.print(x+" ");
        }
    }*//*

    //②system.arrcopy
    */
/*public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7};
        int[] arr2=new int[arr1.length];
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        System.out.println(Arrays.toString(arr2));
    }*//*

    //③引用.clone()
    */
/*public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2=arr1.clone();
        for (int x:arr2
             ) {
            System.out.print(x+" ");
        }
    }*//*

    //④循环
    */
/*public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2=new int[arr1.length];
        for (int i = 0; i <arr1.length ; i++) {
            arr2[i]=arr1[i];
        }
        for (int x:arr2
             ) {
            System.out.print(x+" ");
        }
    }*//*


    //字符串逆序
//    public static void main(String[] args) {
//        System.out.println("请输入一个字符串:");
//        Scanner sc=new Scanner(System.in);
//        String str1=sc.nextLine();
//        String str2=func1(str1);
//        String str3=func2(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//    }
//    //字符串转字符数组
//    public static String func2(String str){
//        char[] arr=str.toCharArray();
//        int len=arr.length;
//        for (int i = 0; i <(len/2) ; i++) {
//            char tmp=arr[i];//从前往后走
//            arr[i]=arr[len-1-i];//从后往前走
//            arr[len-1-i]=tmp;
//            //循环完成交换
//        }
//        return new String(arr);
//    }
//    //字符串反转方法
//    public static String func1(String str){
//        StringBuilder sb = new StringBuilder(str);
//        return sb.reverse().toString();
//    }
    //字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
    //请定义一个函数实现字符串左旋转操作的功能。
    //比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
    */
/*public static void main(String[] args) {
        System.out.println("请输入一个字符串:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(Turn(str, 4));

    }
    public static String Turn(String str,int n){
        String a=str.substring(n);
        String b=str.substring(0,n);
        return a+b;
    }*//*

     */
/*public static String reverse(String str){
        char[] arr=str.toCharArray();
        int len=arr.length;
        for (int i = 0; i <len/2 ; i++) {
            char tmp=arr[i];
            arr[i]=arr[len-1-i];
            arr[len-1-i]=tmp;
        }
        return new String(arr);
    }*//*


    //给定整形数组,偶数放前面,奇数放后面
   */
/* public static void main(String[] args) {
        int[] arr1={1,5,6,2,4,3,8,9,7,0};
        int len=arr1.length;
        int left=0;
        int right=len-1;
        while(left<right){
            while((left<right)&&(arr1[left]%2==0)){
                left++;
            }
            while((left<right)&&(arr1[right]%2!=0)){
                right--;
            }
            int tmp=arr1[left];
            arr1[left]=arr1[right];
            arr1[right]=tmp;
        }
        for (int x:arr1
             ) {
            System.out.print(x+" ");
        }
    }*//*


    //给定两个数组,进行交换
    */
/*public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        Swap(arr1,arr2);
        System.out.println("交换后:");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
    public static void Swap(int[] arr1,int[] arr2){
        int len=arr1.length;
        for (int i = 0; i <len-1 ; i++) {
            int tmp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=tmp;
        }
    }*//*

    //类练习
    */
/*static class Person{
        public String name;
        public int age;

    }

    public static void main(String[] args) {
        Person person=new Person();
        person.age=19;
        person.name="zhangsan";
        System.out.println(person);
    }*/
//public boolean Huiwen() {
//    String str="absba";
//    char[] arr=str.toCharArray();
//    int len=arr.length;
//    for(int i=0;i<len/2;i++){
//        if(arr[i]!=arr[len-1-i]){
//            return false;
//        }else{
//            return true;
//        }
//    }
//    return true;
//}
//public static void main1(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int num = sc.nextInt();
//    int count = 0;
//    while (num != 0) {
//        if (num % 2 == 1) {
//            count++;
//        }
//        num = num / 2;
//    }
//    System.out.println(count);
//}
//
//    public static void main2(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        int count1=0;
//        for(int i=1;i<=32;i++){
//            if(((num>>i)&1)==1){
//                count1++;
//            }
//        }
//        System.out.println(count1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        int count2=0;
//        while(num!=0){
//            num=num&(num-1);
//            count2++;
//        }
//        System.out.println(count2);
//    }

    //    public static void main(String[] args) {
//        String str="abc";
//        char[] num=str.toCharArray();
//        int[] arr={1,2,3};
//        //String arr1=arr.toString();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(num);
//    }
//public static void main(String[] args) {
//    int[][] arr={{1,2,3,3,4},{1,2,3},{1,2,3},{1,2,3}};
//    System.out.println(arr.length);
//    System.out.println(arr[0].length);
//}
//public static void main(String[] args) {
//    double x=3.0;
//    int y=5;
//    x=x/--y;
//    System.out.println(x);
//}
    public static void main1(String[] args) {
//        int i = 0;
//        Integer j = new Integer(0);
//        System.out.println(i == j);
//        System.out.println(j.equals(i));
        /*String x = "fmn";
        x.toUpperCase();
        String y = x.replace("f", "F");
        y = y + "wxy";
        System.out.println(y);*/


        /*System.out.println("->");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);*/




        /*System.out.print("->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //求阶乘
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum *= i;
        }
        int count = 0;
        for (int i = n; i >= 5; i--) {
            int tmp = i;
            while (tmp % 5 == 0) {
                count++;
                tmp /= 5;
            }
        }
        System.out.println(count);*/
    }

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int date = sc.nextInt();
        int days = 0;
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days += 30;
                    break;
                case 2:
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        days += 29;
                        break;
                    } else {
                        days += 28;
                        break;
                    }

            }
        }
        days += date;
        System.out.println(days);
    }*/
    /*public static void main(String[] args) {
        String fool1 = args[1];
        String fool2 = args[2];
        String fool3 = args[3];
    }*/
    /*public static void main(String[] args) {
        String str = "";
        StringBuffer sb = new StringBuffer(str);
        sb.append("lkl");
        System.out.println(sb);
    }*/


    /*public static void main(String[] args) {
        int n=12;
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        if(sum<10){
            System.out.println(sum);
        }else{
            int a=sum/10;
            int b=sum%10;
            System.out.println(a+b);
        }
    }*/
    public static void main(String[] args) {
        /*int num=9;
        for(int i=0;i<2;i++){
            num+=num*Math.pow(10,i);
        }
        System.out.println(num);*/
        String str="abcd de";
        if(str.contains(" ")){
            System.out.println("yes");
        }
    }

}
























