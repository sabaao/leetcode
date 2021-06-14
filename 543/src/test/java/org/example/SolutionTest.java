package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void shouldAnswerWithFour()

    {
        TreeNode root = new TreeNode();
        root.val = 1;

        TreeNode node2 = new TreeNode();
        node2.val = 2;

        TreeNode node3 = new TreeNode();
        node3.val = 3;

        TreeNode node4 = new TreeNode();
        node4.val = 4;

        TreeNode node5 = new TreeNode();
        node5.val = 5;

        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;

        Solution s = new Solution();
        int actual = s.diameterOfBinaryTree(root);
        assertEquals(4,actual);

    }
}
