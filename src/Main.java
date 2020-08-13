import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // Using Comparable for class Window, should sort by area
        Set<Window> windowsSetForComparable = new TreeSet();

        windowsSetForComparable.add(new Window(1, 1));
        windowsSetForComparable.add(new Window(5, 5));
        windowsSetForComparable.add(new Window(4, 4));
        windowsSetForComparable.add(new Window(2, 2));
        windowsSetForComparable.add(new Window(3, 3));

        System.out.println("Using Comparable for class Window, should sort by area:");
        showCollection(windowsSetForComparable);
        System.out.println();


        //Using Comparator for class Window, should sort by height
        WindowComparatorByHeight windowComparatorByHeight = new WindowComparatorByHeight();
        Set<Window> windowsSetForComparatorByHeight = new TreeSet<>(windowComparatorByHeight);

        windowsSetForComparatorByHeight.add(new Window(100, 1));
        windowsSetForComparatorByHeight.add(new Window(500, 2));
        windowsSetForComparatorByHeight.add(new Window(400, 2));
        windowsSetForComparatorByHeight.add(new Window(200, 3));
        windowsSetForComparatorByHeight.add(new Window(300, 4));

        System.out.println("Using Comparator for class Window, should sort by height:");
        showCollection(windowsSetForComparatorByHeight);
        System.out.println();


        //Using Comparator for class Window, should sort by width
        WindowComparatorByWidth windowComparatorByWidth = new WindowComparatorByWidth();
        Set<Window> windowsSetForComparatorByWidth = new TreeSet<>(windowComparatorByWidth);

        windowsSetForComparatorByWidth.add(new Window(100, 1));
        windowsSetForComparatorByWidth.add(new Window(500, 2));
        windowsSetForComparatorByWidth.add(new Window(400, 2));
        windowsSetForComparatorByWidth.add(new Window(200, 3));
        windowsSetForComparatorByWidth.add(new Window(300, 4));

        System.out.println("Using Comparator for class Window, should sort by width:");
        showCollection(windowsSetForComparatorByWidth);
        System.out.println();


        //Using Comparator for class House, short sort by number of windows
        HouseComparator houseComparator = new HouseComparator();
        Set<House> housesSetForComparator = new TreeSet<>(houseComparator);
        ArrayList<Window> windows = new ArrayList<>(windowsSetForComparatorByHeight);   // copy windows for TreeSet to Arraylist for constructor

        housesSetForComparator.add(new House(7, windows));
        housesSetForComparator.add(new House(1, windows));
        housesSetForComparator.add(new House(3, windows));
        housesSetForComparator.add(new House(4, windows));
        housesSetForComparator.add(new House(11, windows));

        System.out.println("Using Comparator for class House, short sort by number of windows:");
        showCollection(housesSetForComparator);
        System.out.println("Number of Windows is the same for all houses, so only one house should be printed");
    }

    public static void showCollection(Collection collection) {
        for (Object element : collection) {
            System.out.println(element);
        }
    }
}