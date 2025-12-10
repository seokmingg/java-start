package collection.link;

public class NodeMain1 {

    public static void main(String[] args) {
        //노드생성하고 연겷라기:a->b->c
        Node node1 = new Node("A");
        node1.next = new Node("B");
        node1.next.next = new Node("C");

        System.out.println("모든노드탐색하기");
//        System.out.println(node1.data); //A
//        System.out.println(node1.next.data); //B
//        System.out.println(node1.next.next.data); //C

        printAll(node1);

        //마지막노드조회하기
        Node lastNode = getLastNode(node1);
        System.out.println("lastNode = " + lastNode);


        //특정인덱스의 노드조회하기
        System.out.println("특정인덱스의 노드조회하기");
        int index = 2;
        Node indexedNode = getIndexedNode(node1, index);
        System.out.println(index + "번째 노드:" + indexedNode.data);



        //노드추가하기 D노드추가하기
        System.out.println("노드 추가하기");
        add(node1, "D");
        System.out.println("node1 = " + node1);
        add(node1, "D");
        System.out.println("node1 = " + node1);


    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.data);
            x = x.next;
        }
    }


    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static Node getIndexedNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private  static void  add(Node node, String data) {
       Node lastNode = getLastNode(node);
       lastNode.next = new Node(data);

    }

}