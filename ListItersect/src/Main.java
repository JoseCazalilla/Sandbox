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
        myIntersect.fillArray(10000, 50000);
        myIntersect.fillHashset(10000, 50000);
        long execTime = myIntersect.calcIntersection();

        // This is how we can do it in a n^2 cost, instead of lineal.
        // Non-optimal, but I just wanted to make sure of the benefit
        //long execTime = myIntersect.calcIntersectionForLoop();

        HashSet myHashSetInter = myIntersect.getResultIntersect();

        System.out.println("It took "+ execTime + "ms to compute the intersection");
        System.out.println("Total number of intersected objects: " + myHashSetInter.size());

        myIntersect.reset();
    }
}
