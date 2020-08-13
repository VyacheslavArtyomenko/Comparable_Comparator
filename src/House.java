import java.util.ArrayList;

public class House {
    private int floors;
    private ArrayList<Window> windows;

    public House(int floors, ArrayList<Window> windows) {
        this.floors = floors;
        this.windows = windows;
    }

    public int getNumberOfWindows() {
        return windows.size();
    }

    @Override
    public String toString() {
        return "House has " + this.floors + " floors and " + getNumberOfWindows() + " windows";
    }
}
