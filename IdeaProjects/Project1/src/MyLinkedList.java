class ListNode {
    public int val;
    public ListNode next;
    public ListNode(){
    }
    public ListNode(int val){
        this.val=val;
    }
}

public class MyLinkedList {
    public ListNode head;
    public ListNode createList(){
        this.head=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        this.head.next=node2;
        node2.next=node3;
        node3.next=node4;
        return this.head;
    }
    //打印单链表
    public void display(){
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public void display(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
    //求单链表长度
    public int Size(){
        ListNode cur=this.head;
        int count=0;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }
    //清空单链表
    public void clear(){
        this.head=null;
    }
    //判断是否包含关键字key
    public boolean contains(int key){
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //头插法
    public void addFirst(int data){
        ListNode add=new ListNode(data);
        if(this.head==null){
            this.head=add;
        }else{
            add.next=this.head;
            this.head=add;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode add=new ListNode(data);
        if(this.head==null){
            this.head=add;
        }else{
            ListNode cur=this.head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=add;
        }
    }
    //查找index-1位置的引用
    public ListNode indexP(int index){
        ListNode cur=this.head;
        int count=0;
        while(count!=index-1){
            cur=cur.next;
            count++;
        }
        return cur;
    }
    //任意位置插入
    public void add(int index,int data){
        if(index<0||index>Size()){
            System.out.println("index不合法!");
        }
        if(index==0){
            addFirst(data);
            return;
        }
        if(index==Size()){
            addLast(data);
            return;
        }
        ListNode cur=indexP(index);
        ListNode node=new ListNode(data);
        node.next=cur.next;
        cur.next=node;
    }

    /**
     * 找到要删除节点的前驱
     * 如果有,返回该节点的引用,没有,返回null
     * @param key
     * @return
     */
    public ListNode searchPrev(int key){
        ListNode cur=this.head;
        while(cur.next!=null){
            if(cur.next.val==key){//cur是前驱,cur.next是要删除节点(下一个节点),cur.next.val是要删除节点的值
                return cur;
            }
            cur=cur.next;//如果不等于,还要继续往后走
        }
        return null;//没找到返回null
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        //如果没节点
        if(this.head==null){
            return;
        }
        //如果是头结点
        if(this.head.val==key){
            this.head=this.head.next;
        }
        //正常删
        ListNode prev=searchPrev(key);
        if(searchPrev(key)==null){
            System.out.println("没有key的前驱!");
        }else{
            ListNode del=prev.next;
            prev.next=del.next;
        }

    }
    //删除所有值为key的节点
    public ListNode removeAllKey(int key){
        if(head==null){
            return null;
        }
        ListNode prev=this.head;
        ListNode cur=prev.next;
        while(cur!=null){
            if(cur.val==key){
                prev.next=cur.next;
            }else{
                prev=cur;
            }
            cur=cur.next;
        }
        if(head.val==key){
            head=head.next;
        }
        return head;
    }

    //逆置单链表
    public ListNode reverseList(){
        ListNode cur=this.head;
        ListNode prev=null;
        ListNode newHead=null;
        while(cur!=null){
            ListNode curNext=cur.next;
            if(curNext==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }
    //返回链表中间结点
    public ListNode middlePoint(){
        ListNode fast=this.head;
        ListNode slow=this.head;
        /**
         * fast!=null是判断奇数节点链表的
         * fast.next!=null是判断偶数节点链表的
         */
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    //输出该链表中倒数第k个结点

    /**
     * 快慢指针法
     * 1.先让fast走k-1步
     * 2.然后两个引用一人一步走
     * 直到fast.next为null
     * slow就是结果
     * @param k
     * @return
     */
    public ListNode FindK(int k){
        ListNode fast=this.head;
        ListNode slow=this.head;
        if(this.head==null){
            return null;
        }
        while(k-1!=0){
            if(fast.next!=null){
                fast=fast.next;
                k--;
            }else{
                return null;//代表k值过大
            }
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    //合并两个有序链表
    public ListNode heBing(ListNode headA, ListNode headB){
        ListNode newHead=new ListNode(-1);
        ListNode cur=newHead;
        while(headA!=null&&headB!=null) {
            if (headA.val > headB.val) {
                cur.next = headB;
                headB = headB.next;
            } else {
                cur.next = headA;
                headA = headA.next;
            }
            cur = cur.next;
        }
        //肯定一个为空.一个不为空
        if(headA==null){
            cur.next=headB;
        }
        if(headB==null){
            cur.next=headA;
        }
        return newHead.next;
    }
    //
    public ListNode FindKK(int k){
        ListNode fast=this.head;
        ListNode slow=this.head;
        //先让fast走k-1步
        while(k-1!=0){
            fast=fast.next;
            k--;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    //删除链表重复节点
    public ListNode deleteSame(){
        ListNode newHead=new ListNode(-1);
        ListNode tmp=newHead;
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.next!=null&&cur.val==cur.next.val){
                while(cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                cur=cur.next;
            }else{
                tmp.next=cur;
                cur=cur.next;
                tmp=tmp.next;
            }
        }
        return newHead.next;
    }
    //
    public ListNode addFirst1(int data){
        ListNode add=new ListNode(data);
        if(this.head==null){
            return null;
        }
        add.next=this.head;
        this.head=add;
        return head;
    }
    public ListNode addLast1(int data){
        ListNode add=new ListNode(data);
        ListNode cur=this.head;
        if(this.head==null){
            return null;
        }
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=add;
        add.next=null;
        return this.head;
    }
    //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public ListNode Seperate(int x){
        ListNode bs=null;//小数据部分始端(beforestart)
        ListNode be=null;//小数据部分末端(beforeend)
        ListNode as=null;//大数据部分始端(afterstart)
        ListNode ae=null;//大数据部分末端(afterend)
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val<x){
                if(bs==null){
                    //两个点都指向放进来的节点
                    bs=cur;
                    be=cur;
                }else{
                    //有数据了进行尾插
                    be.next=cur;
                    be=be.next;
                }
            }else{
                if(as==null){
                    as=cur;
                    ae=cur;
                }else{
                    ae.next=cur;
                    ae=ae.next;
                }
            }
            //让cur也移动着
            cur=cur.next;
        }
        if(bs==null){
            return as;
        }
        //将前后两部分进行头尾相连,成为一个链表
        be.next=as;
        /**
         * 有两个小情况
         * ①:最后要返回小数据部分的头,但是如果小数据部分没有数据,就会出错
         * ②:找不到尾结点
         */
        //如果头有数据,直接将尾结点的next置空
        if(as!=null){
            ae.next=null;
        }
        return bs;
    }
    public ListNode heBing1(ListNode headA, ListNode headB){
        //创建一个傀儡节点(随意取值)
        ListNode newHead=new ListNode(-1);
        ListNode cur=newHead;
        //这两个链表不为空
        while(headA!=null&&headB!=null){
            //两个头结点先比较,小的先放进来,保证升序
            if(headA.val<headB.val){
                cur.next=headA;
                //放进来一个,就让新的头指向下一个
                headA=headA.next;
            }else{
                cur.next=headB;
                headB=headB.next;
            }
            cur=cur.next;
            //走到这,说明已经有一个链表放完了,一个为空,一个不为空
            if(headA==null){
                cur.next=headB;
            }
            if(headB==null){
                cur.next=headA;
            }
        }
        return newHead.next;
    }
    //
    public ListNode removeAllKey1(int key){
        if(this.head==null) return null;
        ListNode prev=this.head;
        ListNode cur=prev.next;
        //如果判断cur.next不为空,尾结点数据访问不到
        while(cur!=null){
            if(cur.val==key){
                //if满足,则cur就是所删节点
                prev.next=cur.next;
            }else{
                prev=cur;
            }
            cur=cur.next;
        }
        if(this.head.val==key){
            this.head=this.head.next;
        }
        return this.head;
    }
    //删除第一次出现的key
    //先找要删除节点的前驱
    public ListNode QianQu(int key){
        ListNode cur=this.head;
        while(cur.next!=null){
            if(cur.next.val==key){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }
    public ListNode RemoveK(int key){
        if(this.head==null){
            return null;
        }
        //如果头结点就是目标
        if(this.head.val==key){
            this.head=this.head.next;
        }
        //正常删
        ListNode cur=this.head;
        ListNode prev=QianQu(key);
        if(QianQu(key)==null){
            System.out.println("没有前驱");
        }else{
            //把要删除的节点定义出来
            ListNode del=prev.next;
            prev.next=del.next;
        }
        return this.head;
    }
    //替换法删除节点
    //实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
    public void delete1(ListNode node){
        if(node==null) return;
        node.val=node.next.val;//换值
        node.next=node.next.next;//换址
    }
    //输入两个链表,找出第一个公共节点
    public ListNode Point(ListNode headA, ListNode headB){
        //判空
        if(headA==null||headB==null){
            return  null;
        }
        int lenA=0;
        int lenB =0;
        ListNode l1=headA;
        ListNode l2=headB;
        //求两个链表长度
        while(l1!=null){
            l1=l1.next;
            lenA++;
        }
        while(l2!=null){
            l2=l2.next;
            lenB++;
        }
        //一定要指回来,不然下面会出现空指针异常
        l1=headA;
        l2=headB;
        int len =lenA-lenB;
        if(len<0){
            //l1永远放最长的链表
            len=lenB-lenA;
            l1=headB;
            l2=headA;
        }
        //让长链表先走len步
        while(len!=0){
            l1=l1.next;
            len--;
        }
        //往后遍历(一样了就停止)
        while(l1!=l2){
            l1=l1.next;
            l2=l2.next;
        }
        return l1;
    }
    //反转单链表
    public ListNode FanZhuan(){
        ListNode newHead=null;
        ListNode cur=this.head;
        ListNode prev=null;
        while(cur!=null){
            //定义个引用保存cur.next
            ListNode curNext=cur.next;
            if(curNext==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }
    //判断链表中是否有环
    public boolean Circle(){
        if(this.head==null){
            return false;
        }
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            //fast和slow相遇,说明有环
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    //返回链表开始入环的第一个节点
    public ListNode detectCycle() {
        if(head==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast !=null&&fast.next!= null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) {
                break;
            }
        }
        //1.循环不满足   2.break;
        if(fast==null||fast.next==null){
            return null;
        }
        slow=this.head;
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
    //对链表进行插入排序
    public ListNode insertionSortList(ListNode head){
        //判空
        if(this.head==null){
            return null;
        }
        ListNode node=new ListNode(-1);//创建傀儡节点,目的:方便插入
        node.next=head;//与头结点连接起来
        ListNode lastSorted=head;//
        ListNode cur=head.next;
        while(cur!=null){
            if(lastSorted.val<=cur.val){//排好序
                lastSorted=lastSorted.next;
            }else{
                ListNode prev=node;//要插入节点的前驱
                while(prev.next.val<=cur.val){
                    /**
                     * prev是要插入节点的前一个
                     * 如果prev下一个节点的val值大于cur的val值
                     * 就要把cur插入prev后面
                     * 这也是循环的退出条件
                     */
                    prev=prev.next;
                }
                //完成对cur的插入
                lastSorted.next=cur.next;//相当于是把要插入的节点在原位置删除,前后再连接起来
                cur.next=prev.next;
                prev.next=cur;
            }
            cur=lastSorted.next;//新的cur一直在lastSorted的后面
        }
        return node.next;
    }


    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        ListNode head=myLinkedList.createList();
        myLinkedList.display();
        int n=myLinkedList.Size();
        System.out.println("单链表长度为:"+n);
        int key=8;
        boolean flag=myLinkedList.contains(key);
        System.out.println("是否包含关键字"+key+":"+flag);
        //头插
        myLinkedList.addFirst(0);
        myLinkedList.display();;
        //尾插
        myLinkedList.addLast(5);
        myLinkedList.display();
        //任意位置插入
        myLinkedList.add(1,9);
        myLinkedList.display();
        //删除关键字key
        myLinkedList.remove(9);
        myLinkedList.display();
        //删除所有的key
        myLinkedList.removeAllKey(1);
        myLinkedList.display();

        //逆置单链表
        //Node ret=myLinkedList.reverseList();
        //myLinkedList.display(ret);
        //返回链表中间结点
        System.out.println("===========");
        ListNode kun=myLinkedList.middlePoint();
        System.out.println(kun.val);
        //输出链表倒数第k个节点
        ListNode lan=myLinkedList.FindK(2);
        System.out.println(lan.val);
    }
}
