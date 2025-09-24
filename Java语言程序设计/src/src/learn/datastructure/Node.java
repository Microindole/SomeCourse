package learn.datastructure;
class Node {
    int data; 
    Node lchild;
    Node rchild; 
    int ltag; 
    int rtag;     
    public Node(int data) {
        this.data = data;
        this.lchild = null;
        this.rchild = null;
        this.ltag = 0;
        this.rtag = 0;
    }
    @Override
    public String toString() {
        return "Node{data=" + data + "}";
    }
}

