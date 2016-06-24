package unionfind;

/**
 * Created by ashsrinivas on 6/23/16.
 */
public class QuickFind implements UnionFindable {

    private int[] elements;

    // Initialize a union-find data
    // structure with n objects
    public QuickFind(int n) {
        // Create an array of size n
        // and set each index equal
        // to its corresponding element
        elements = new int[n];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int pId = elements[p];
        int qId = elements[q];

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == pId) {
                elements[i] = qId;
            }
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return elements[p] == elements[q];
    }

    @Override
    public int find(int p) {
        return elements[p];
    }

    @Override
    public int count() {
        return elements.length;
    }
}
