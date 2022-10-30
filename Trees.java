import java.util.*;

import javax.sound.midi.Instrument;

public class Trees {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;

        }

        public void insert(int value) {
            if (value <= data) {
                if (left == null) {
                    left = new Node(value);
                } else {
                    left.insert(value);
                }

            } else {
                if (right == null) {
                    right = new Node(value);
                } else {
                    right.insert(value);
                }
            }
        }

        public boolean contains(int value) {
            if (value == data) {
                return true;
            } else if (value < data) {
                if (left == null) {
                    return false;
                } else {
                    return left.contains(value);
                }
            } else {
                if (right == null) {
                    return false;
                } else {
                    return right.contains(value);
                }
            }

        }

        public void printInOrder(){
            if (left != null){
                left.printInOrder();
            }
            System.out.println(data);
            if(right != null){
                right.printInOrder();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("This is how a tree works");

        int data = 8;
        Node leafNode = new Node(45);
        leafNode.insert(12);
        leafNode.insert(4);
        leafNode.insert(78);
        leafNode.insert(100);
        leafNode.insert(21);
        leafNode.insert(65);

        leafNode.printInOrder();
    }
}
