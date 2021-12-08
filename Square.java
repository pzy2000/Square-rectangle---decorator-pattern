public class Square {
    Rectangle rect=new Rectangle();
    int width;

    Square(int width)
    {
        rect.setWidth(width);
        rect.setLength(width);
    }

    public void setRect(Rectangle rect) {
        this.rect = rect;
    }

    public void setWidth(int width)
    {
        rect.setLength(width);
        rect.setWidth(width);
    }

    public int getWidth() {
        return width;
    }
    public double getArea(){
        return rect.getArea();
    }
}
