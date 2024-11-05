package com.codingame;

class Node {
    // keep these fields
    Node left, right;
    int value;

    /*
     * You don't have to implement these constructors.
     */
    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(int value) {
        this.value = value;
    }

    /*
     * The method you have to implement.
     */
    Node find(int v) {
        Node current = this;
        while (current != null && v != current.value) {
            current = v < current.value ? current.left : current.right;
        }
        return current;
    }

    /*
     * This is a recursive method that will work for small trees but will raise a
     * StackOverflowError exception for deeper trees.
     */
    Node find_working_but_wrong_solution(int v) {
        if (v == this.value)
            return this;

        return v < this.value ?
                this.left != null ? this.left.find(v) : null :
                this.right != null ? this.right.find(v) : null;
    }
}