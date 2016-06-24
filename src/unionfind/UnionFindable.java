package unionfind;

/**
 * Created by ashsrinivas on 6/23/16.
 */
public interface UnionFindable {

    // Add a connection between p and q
    void union(int p, int q);

    // Indicates whether p and q are in the
    // same component
    boolean connected(int p, int q);

    // component identifier for p
    int find(int p);

    // number of components
    int count();
}
