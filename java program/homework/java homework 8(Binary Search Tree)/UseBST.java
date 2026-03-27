
/**
 * Write a description of class a here.
 *
 * @author (your name) Au Sai Chun(21105253D)
 * @version (a version number or a date)
 */
public class UseBST {
 public static void main(String[] args) {
 // Create a BST
 BST<String> tree = new BST<String>();
 // Add strings into the binary tree in the order of “George”, “Michael”, “Tom”, “Adam”, “Jones”, 
//“Peter”, “Daniel”.
 tree.add("George");
 tree.add("Micheal");
 tree.add("Tom");
 tree.add("Adam");
 tree.add("Jones");
 tree.add("Peter");
 tree.add("Daniel");
 System.out.print("Inorder (sorted): ");
 tree.inorder();
 System.out.print("\nPostorder: ");
 tree.postorder();
 System.out.print("\nPreorder: ");
 tree.preorder();
 System.out.print("\nThe number of nodes is " + tree.getSize());
 // Search for an element
 System.out.print("\nIs Peter in the tree? " +tree.search("Peter"));
 // Get a path from the root to Peter
 System.out.print("\nA path from the root to Peter is: ");
 java.util.ArrayList<BST.TreeNode<String>> path = tree.path("Peter");
     for (int i = 0; path != null && i < path.size(); i++)
    {
     System.out.print(path.get(i).element + " ");
    }
 }
}
