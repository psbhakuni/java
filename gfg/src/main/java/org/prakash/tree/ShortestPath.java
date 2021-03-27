package org.prakash.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Person lives in a special city where houses are arranged in a hierarchical manner.
Starting from house number 1, each house leads to two more houses.
1 leads to 2 and 3.
2 leads to 4 and 5.
3 leads to 6 and 7. and so on.
Given the house numbers on two houses x and y, find the length of the shortest
path between them.

Example :
Input : x = 8, y = 10 Think you can solve it?
Output : 4
Explanation : 8-> 4-> 2-> 5-> 10
The length of the shortest path
between 8 and 10 is 4.

 */
public class ShortestPath {

    public static void main(String[] args) {
        Node[] nodes = new Node[16];
        for (int i = 1; i <= 15; i++) {
            nodes[i] = new Node(i);
        }
        for (int i = 1; i <= 7; i++) {
            nodes[i].left = nodes[i * 2];
            nodes[i].right = nodes[i * 2 + 1];
        }

        HouseTree tree = new HouseTree();
        tree.root = nodes[1];

        List<Integer> pathToRootFor8 = getPathToRoot(nodes[8]);
        List<Integer> pathToRootFor10 = getPathToRoot(nodes[10]);
        //System.out.println(pathToRootFor8);
        //System.out.println(pathToRootFor10);

        List<Integer> result = pathToRootFor8.stream()
                .distinct()
                .filter(pathToRootFor10::contains)
                .collect(Collectors.toList());

        pathToRootFor8.removeAll(result);
        pathToRootFor10.removeAll(result);

        System.out.println(pathToRootFor8.size() + pathToRootFor10.size());
    }

    private static List<Integer> getPathToRoot(Node node) {
        int n = node.data;
        List<Integer> pathToRoot = new ArrayList<Integer>();
        while (n > 0) {
            if (n / 2 > 0) {
                pathToRoot.add(n);
            }
            n = n / 2;
        }

        pathToRoot.add(1);

        return pathToRoot;
    }
}

class HouseTree {
    // Root of the Binary Tree
    Node root;

    public HouseTree() {
        root = null;
    }

    /* function to print level order traversal of tree*/
    void printLevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printGivenLevel(root, i);
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node root) {
        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else return (rheight + 1);
        }
    }

    /* Print nodes at the given level */
    void printGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }
}

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

