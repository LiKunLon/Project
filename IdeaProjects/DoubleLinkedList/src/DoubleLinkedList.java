class ListNode{
    public int val;
    public ListNode prev;
    public ListNode next;
    public ListNode(int val){
        this.val=val;
    }

    public ListNode(int val, ListNode prev, ListNode next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}
public class DoubleLinkedList {
    public ListNode head;
    public ListNode last;
    //头插法
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
            this.last=node;
        }else{
            node.next=this.head;
            this.head.prev=node;
            this.head=node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
            //一定要写last,不然链表不知道在哪
            this.last=node;
        }else{
            this.last.next=node;
            node.prev=this.last;
            this.last=node;
        }
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
            this.last=node;
        }
        if(index==1){
            addFirst(data);
            return;
        }
        if(index==size()){
            addLast(data);
            return;
        }
        if(index<0||index>size()){
            System.out.println("index位置不合法!");
        }
        ListNode cur=this.head;

    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                return true;
            }
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head==null){
            return;
        }
        //删除节点在头
        if(this.head.val==key){
            this.head=this.head.next;
            this.head.next.prev=null;
        }
        if(this.last.val==key){
            this.last=this.last.prev;
            this.last.prev.next=null;
        }
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                cur.prev.next=cur.next;
                cur.next.prev=cur.prev;
            }
            cur=cur.next;
        }
    }
    public void remove2(int key){
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                //头结点
                if(cur==this.head){
                    this.head=this.head.next;
                    this.head.prev=null;
                }else {
                    cur.prev.next = cur.next;
                    //删除节点在中间
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else{
                      //尾结点
                        this.last=this.last.prev;
                    }
                }
                return;
            }else{
                cur=cur.next;
            }
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                //头结点
                if(cur==this.head){
                    this.head=this.head.next;
                    this.head.prev=null;
                }else {
                    cur.prev.next = cur.next;
                    //删除节点在中间
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else{
                        //尾结点
                        this.last=this.last.prev;
                    }
                }
            }else{
                cur=cur.next;
            }
        }
    }
    //得到单链表的长度
    public int size(){
        if(this.head==null){
            return -1;
        }
        ListNode cur=this.head;
        int count=0;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }
    public void display(){
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public void clear1(){
        this.head=null;
        this.last=null;
    }
    //更彻底
    public void clear2(){
        ListNode cur=this.head;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.prev=null;
            cur.next=null;
            cur=curNext;
        }
        this.head=null;
        this.last=null;
    }
    //输入两个链表,找到第一个公共节点
    public ListNode FindSame(ListNode headA,ListNode headB){
        //只要有一个空,直接返回空
        if(headA==null||headB==null){
            return null;
        }
        ListNode l1=headA;
        ListNode l2=headB;
        int lenA=0;
        int lenB=0;
        //两个while求长度
        while(l1!=null){
            l1=l1.next;
            lenA++;
        }
        while(l2!=null){
            l2=l2.next;
            lenB++;
        }
        //两个链表遍历完了,l1,l2都是空
        //一定要指回来
        l1=headA;
        l2=headB;
        int len=lenA-lenB;
        if(len<0){
            //让l1永远指向最长的链表
            l1=headB;
            l2=headA;
            len=lenB-lenA;
        }
        //让最长的链表先走len步
        while(len!=0){
            l1=l1.next;
            len--;
        }
        while(l1!=l2){
            l1=l1.next;
            l2=l2.next;
        }
        return l1;
    }
    /**
     * 链表的回文结构
     * 1.先找中间结点(快慢指针)
     * 2.中点到结尾部分进行反转
     * 3.从前往后走,从后往前走
     */
    public boolean HuiWen() {
        if(this.head==null){
            return false;
        }
        ListNode fast=this.head;
        ListNode slow=this.head;
        //找中间节点
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //反转
        ListNode cur=slow.next;
        while(cur!=null){
            //要在循环里面定义curNext,每一次循环都记录一次新的cue.next!!!
            ListNode curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }
        //head从前往后走,slow从后往前走
        while(head!=slow){
            if(head.val!=slow.val){
                return false;
            }
            //偶数节点情况
            if(head.next==slow){
                return true;
            }
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
}
