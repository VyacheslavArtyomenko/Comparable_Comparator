import java.util.Comparator;

public class WindowComparatorByHeight implements Comparator<Window> {

    @Override
    public int compare(Window o1, Window o2) {
        return o1.getHeight() - o2.getHeight();
    }
}
