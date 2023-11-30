class Main{
    public static void main(String[] args){

    }
}
class Node{
    Node right;
    Node left;
    int data;

    Node(){
        right = null;
        left = null;
        data = 0;
    }
    Node(int value){
        right = null;
        left = null;
        data = value;
    }
}
class BinarySearchTree{
    Node root;
    public boolean insertNode(int v){
        Node nNode=new Node(v);
        root=recursiveInsertNode(root,nNode);
        return true;
        }
        
        private Node recursiveInsertNode(Node node, Node nNode ){
            if(node == null)
                node = nNode;
            else if (nNode.data <node.data){
                node.left = recursiveInsertNode(node.left, nNode);
            }
            else if (nNode.data <node.data){
                node.right = recursiveInsertNode(node.right, nNode);
            }  
            return node;
        }
               
        
        Node search(int v){
        return recursiveSearch(root,v);
        }
        
        private Node recursiveSearch(Node node, int v){



        return null;
        }
        
        
        void DFS(Node node){
        //complete iterative method
        }
        
        void BFS(Node node){
        //write iterative method
        }
        
        void DFS_inorder(Node node){
        //complete the recursive code
        }
        
        void DFS_preorder(Node node){
        //complete the recursive code
        }
        
        void DFS_postorder(Node node){
        //complete the recursive code
        }


}
