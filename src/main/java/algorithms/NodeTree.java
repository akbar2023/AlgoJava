package algorithms;

import jdk.nashorn.internal.ir.Node;

public class NodeTree {

    NodeTree droite;
    NodeTree gauche;
    int value;

    public NodeTree(int key) {
        if (key > this.value) {
            droite.value = key;
        } else {
            gauche.value = key;
        }

    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

//    public int findX(int x) {
//        if(x == this.value) {
//            return this.value;
//        }
//
//        if(x > this.value) {
//            return droite.value;
//        }
//
//        if(x < this.value) {
//            return gauche.value;
//        }
//        return x;
//    }

}
