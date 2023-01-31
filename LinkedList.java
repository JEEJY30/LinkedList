public class LinkedList {
    Node head;

    void insert(int age, String name, double gpa) {
        Node node = new Node();
        node.age = age;
        node.name = name;
        node.gpa = gpa;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    void insertAtStart(int age, String name, double gpa) {
        Node node = new Node();
        node.age = age;
        node.name = name;
        node.gpa = gpa;
        node.next = null;

        node.next = head;
        head = node;
    }

    void insertAt(int index, int age, String name, double gpa) {
        Node node = new Node();
        node.age = age;
        node.name = name;
        node.gpa = gpa;
        node.next = null;

        if (index == 0) {
            insertAtStart(age, name, gpa);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
    }

    void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            Node deleted = null;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            deleted = current.next;
            current.next = deleted.next;
            deleted = null;
        }
    }

    void show() {
        Node exiNode = head;
        while (exiNode.next != null) {
            System.out.println("Name -> " + exiNode.name + "| Age -> " + exiNode.age + "| GPA-> " + exiNode.gpa);
            exiNode = exiNode.next;
        }
        System.out.println("Name -> " + exiNode.name + "| Age -> " + exiNode.age + "| GPA-> " + exiNode.gpa);
    }
}