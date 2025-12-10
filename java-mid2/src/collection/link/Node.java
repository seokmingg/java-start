package collection.link;

public class Node {
     Object data;
     Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

//    @Override
//    public String toString() {
//        return "Node{" +
//                "data=" + data +
//                ", next=" + next +
//                '}';
//    }//ide tostring 자동생성

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.data);
            x = x.next;
            if (x != null) {
                sb.append(", ");
            }
        }
        sb.append("]");



        return  sb.toString();
    }

}
