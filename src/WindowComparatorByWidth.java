import java.util.Comparator;

public class WindowComparatorByWidth implements Comparator<Window> {

    @Override
    public int compare(Window o1, Window o2) {
        return o1.getWidth() - o2.getWidth();
    }
}
