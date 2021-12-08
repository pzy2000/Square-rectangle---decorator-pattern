public class Rectangle {
    public double length;
    public double width;
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(int length){
        this.length=length;
    }
    public void setWidth(int width)
    {
        this.width=width;
    }
    public double getArea()
    {
        return width*length;
    }

}
