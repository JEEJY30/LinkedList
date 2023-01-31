public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(22, "Bro", 3.5);
        list.insert(18, "joy", 3.4);
        list.insertAtStart(11, "Jane", 2.3);
        list.insertAtStart(24, "anabel", 4.5);
        list.insertAt(2, 26, "Hugo", 2.8);
        // list.deleteAt(2);
        list.show();

    }
}