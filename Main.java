public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(99);
        list.insert(88);
        list.insertAtStart(11);
        list.insertAtStart(77);
        list.insertAt(2, 66);
        list.deleteAt(2);
        list.show();
    }
}