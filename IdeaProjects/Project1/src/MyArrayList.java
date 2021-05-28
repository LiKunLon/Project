import java.util.Arrays;

/*class Practice{
    public static class MyArrayList {
        private int usedSize;
        private int[] elem;
        public MyArrayList(){
            this.elem=new int[5];
        }
        //输入
        public void insert(int num){
            this.elem[this.usedSize]=num;
            this.usedSize++;
        }
        //打印
        public void Show(){
            for (int i = 0; i <this.usedSize; i++) {
                System.out.print(this.elem[i]+" ");
            }
        }
        //判断满
        public boolean isFull(int[] elem){
            if(this.usedSize==elem.length){
                return true;
            }
            return false;
        }
        //扩容
        public void enlarge(){
            this.elem=Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //在pos位置插入data
        public void add(int pos,int data){
            //先判断是否满了
            if(isFull(elem)){
                //System.out.println("满了!");
                enlarge();
            }
            //判断pos位置是否合法
            if (pos>this.usedSize||pos<0){
                System.out.println("pos位置不合法");
            }
            //移动元素
            //从后往前循环,保证不越界
            for (int i=usedSize-1 ;i>=pos; i--) {
                this.elem[i+1]=this.elem[i];
            }
            this.elem[pos]=data;
            this.usedSize++;
        }
        //是否包含某个元素
        public boolean contain(int toFind){
            for (int i = 0; i <this.usedSize ; i++) {
                if(this.elem[i]==toFind){
                    return true;
                }
            }
            return false;
        }
        //查找某个元素对应位置
        public int search(int toFind){
            for (int i = 0; i <this.usedSize ; i++) {
                if(toFind==this.elem[i]){
                    return i;
                }
            }
            return -1;
        }
        //获取pos位置的元素
        public int getPos(int pos){
            if(pos<0||pos>this.usedSize){
                return -1;
            }
            return this.elem[pos];
        }
        //给pos位置元素设置成value
        public void setPos(int pos,int value){
            if(pos<0||pos>this.usedSize){
                System.out.println("pos输入有误!");
                return ;
            }
            this.elem[pos]=value;
        }
        //获取顺序表长度
        public int Length(){
            return this.elem.length;
        }
        //清空顺序表
        public void Clear(){
            this.usedSize=0;
        }
        //删除第一次出现的关键字key=2
        public void Delete(int key){
            int index=search(key);
            if(index==-1){
                System.out.println("没找到!");
                return;
            }
            for (int i = index; i <this.usedSize-1 ; i++) {
                this.elem[i]=this.elem[i+1];
            }
            this.usedSize--;
        }
    }

    public static void main(String[] args) {
        MyArrayList list=new MyArrayList();
        list.insert(1);
        list.insert(5);
        list.insert(3);
        list.insert(2);
        list.Show();
        //插入
        list.add(3,7);
        System.out.println("插入后:");
        list.Show();
        //是否包含
        System.out.println();
        System.out.print(list.contain(3));
        //查找元素位置
        System.out.println();
        System.out.println("该元素的下标为:"+list.search(4));
        //获取pos位置元素
        System.out.println(list.getPos(3));
        //pos位置设为value
        list.setPos(2,9);
        list.Show();
        //获取长度
        System.out.println();
        System.out.println("长度为:"+list.Length());
        //删除第一次出现key
        list.Delete(1);
        list.Show();
        //清空顺序表
        System.out.println();
        System.out.println("清空顺序表");
        list.Clear();
    }
}*/



