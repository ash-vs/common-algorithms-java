import unionfind.QuickFind;
import unionfind.UnionFindable;

public class Main {

    public static void main(String[] args) {
        RunUnionFindQuickFind();
    }

    private static void RunUnionFindQuickFind() {
        int n = StdIn.readInt();
        UnionFindable unionFind = new QuickFind(n);
        while(!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!unionFind.connected(p, q))
            {
                unionFind.union(p, q);
                StdOut.println(p + " " + q);
            }
        }
    }
}
