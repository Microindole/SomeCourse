//public class InorderThreadedBinaryTree {
//    public Node findInorderSuccessor(Node p) {
//        if (p == null) {
//            return null;
//        }
//        if (p.rtag == 1) {
//            return p.rchild;
//        } else {
//            Node current = p.rchild;
//            if (current == null) {
//                return null;
//            }
//            while (current.ltag == 0) {
//                current = current.lchild;
//            }
//            return current;
//        }
//    }
//}