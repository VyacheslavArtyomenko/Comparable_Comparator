public class Window implements Comparable<Window>{
    private int height;
    private int width;
    private int area;

    public Window(int height, int width) {
        this.height = height;
        this.width = width;
        this.area = height * width;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (obj == null && obj.getClass() != this.getClass())
            return false;

        Window window = (Window) obj;
        return this.height == window.height && this.width == window.width;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    public int getArea(){
        return area;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + this.height;
        result = prime * result + this.width;
        return result;
    }

    @Override
    public int compareTo(Window o) {
        return this.area - o.area;
    }

    @Override
    public String toString() {
        return "Window with area " + area + " (height " + height + ", width " + width + ")";
    }
}
