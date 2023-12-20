import org.w3c.dom.Node;

public class stackLL {
    private static class node{
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private class stack{
        private node top;

        public stack() {
            this.top = null;
        }
    }
    public static void main(String[] args) {

    }
}