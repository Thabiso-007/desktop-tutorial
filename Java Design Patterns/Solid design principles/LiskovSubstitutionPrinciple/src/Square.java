// Subclass representing a square
class Square extends Rectangle {
    public Square() {}

    public Square(int size) {
        width = size;
        height = size;
    }

    // Override setWidth to ensure square properties
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    // Override setHeight to ensure square properties
    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}