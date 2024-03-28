public abstract class Tower {
   private double height;
   private double width;

    public Tower(double height, double width) {
        this.setHeight(height) ;
        this.setWidth(width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height>=2)
           this.height = height;
        else
           this.height=2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public abstract double getPerimeter();



}
