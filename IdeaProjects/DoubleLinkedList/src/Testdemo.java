public class Testdemo {
    public static void main(String[] args) {
        DoubleLinkedList list=new DoubleLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.display();
        int len=list.size();
        System.out.println(len);
    }
}
