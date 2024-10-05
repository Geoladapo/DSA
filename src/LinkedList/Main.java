package LinkedList;


public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.removeFirst(10);
        list.contains(20);
        list.size();
    }
}
