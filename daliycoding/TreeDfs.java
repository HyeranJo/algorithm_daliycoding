package daliycoding;

import java.util.ArrayList;

public class TreeDfs {
    public static void main(String[] args) {
        TreeDfs.tree root = new TreeDfs.tree("1");
        TreeDfs.tree rootChild1 = root.addChildNode(new TreeDfs.tree("2"));
        TreeDfs.tree rootChild2 = root.addChildNode(new TreeDfs.tree("3"));
        TreeDfs.tree leaf1 = rootChild1.addChildNode(new TreeDfs.tree("4"));
        TreeDfs.tree leaf2 = rootChild1.addChildNode(new TreeDfs.tree("5"));
        ArrayList<String> output = dfs(root);
        System.out.println(output); // --> ["1", "2", "4", "5", "3"]

        leaf1.addChildNode(new TreeDfs.tree("6"));
        rootChild2.addChildNode(new TreeDfs.tree("7"));
        output = dfs(root);
        System.out.println(output); // --> ["1", "2", "4", "6", "5", "3", "7"]
    }
    public static ArrayList<String> dfs(tree node) {
        ArrayList<String> result = new ArrayList<>();
        dfsHelper(node, result);
        return result;
    }
    public static void dfsHelper(tree node, ArrayList<String> result) {
        // base case
        if(node == null) return;
        
        // recursive case
        result.add(node.getValue());

        // children에 값이 있다면 반복문을 사용해서 재귀 호출
        ArrayList<tree> children = node.getChildrenNode();
        if(children != null) {
            for(tree child : children) {
                dfsHelper(child, result);
            }
        }

    }
    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String value) {
            this.value = value;
            this.children = null;
        }
        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1); // 추가한 다음 마지막 노드 반환
        }
        public String getValue() {
            return value;
        }
        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}
