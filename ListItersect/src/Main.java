import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main (String args[]) {
        // Example:
        // Usage of the IntersectHelper Class
        // 1.- Create a new object
        // 2.- Fill both the arrayList and HashSet
        // 3.- Calculate the intersection -> We will get the time it will take
        // 4.- Get the result of that intersections

        IntersectHelper myIntersect = new IntersectHelper();
        myIntersect.fillArray(10, 50);
        myIntersect.fillHashset(10, 50);
        long execTime = myIntersect.calcIntersection();
        HashSet myHashSetInter = myIntersect.getResultIntersect();

        System.out.println("It took "+ execTime + "ms to compute the intersecion");
        System.out.println("Total number of intersected objects: " + myHashSetInter.size());

        myIntersect.reset();
    }
}
