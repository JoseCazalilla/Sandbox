import java.util.ArrayList;
import java.util.HashSet;

public class IntersectHelper {
    private ArrayList a;
    private HashSet h;
    private HashSet res;

    // Public constructor
    public IntersectHelper() {
        a = new ArrayList();
        h = new HashSet();
        res = new HashSet();
    }

    // This method will fill the array with the info provided
    public void fillArray(int numElems, int maxNum) {
        for (int i = 0; i < numElems; i++) {
            a.add((int)(Math.random() * maxNum));
        }
    }

    // This method will fill the HashSet with the info provided
    public void fillHashset(int numElems, int maxNum) {
        for (int i = 0; i < numElems; i++) {
            // In this case, it will not have duplicated numbers
            h.add((int)(Math.random() * maxNum));
        }
    }

    // This method will return the time it takes to do the intersection
    public long calcIntersection() {

        long foo = 0;
        return foo;
    }

    // This method will return the last result of the intersection
    // Using a hashset will allow use to remove duplicates. We don't need to keep any order, so it is fine
    public HashSet getResultIntersect() {
        return res;
    }

    // This method will clear both the array and the hashSet (just in case we need to use it)
    public void reset() {
        a.clear();
        h.clear();
        res.clear();
    }
}
