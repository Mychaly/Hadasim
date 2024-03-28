public class Triangle extends Tower {
    public Triangle(double height, double width) {
        super(height, width);
    }

    public double getPerimeter() {
        double rib = Math.sqrt(getWidth() / 2 * getWidth() / 2 + getHeight() * getHeight());
        return rib * 2 + getWidth();
    }

    public void printPerimeter() {
        System.out.println("Perimeter: " + getPerimeter());
    }

    public void printTriangle() {

        if (getWidth() % 2 == 0 || getWidth() > getHeight() * 2||getWidth()<=3)
            System.out.println("The triangle can not be printed");
        else {
            int sum = ((int) getWidth() - 2) / 2;
            int  x = ((int) getHeight() - 2) / sum;
            int s = ((int) getHeight() - 2) % sum;
            int value = 1;
            print(value, (int) getWidth());
            for (int i = 0; i < s; i++) {
                print(value + 2, (int) getWidth());
            }
            for (int i = 0; i < sum; i++) {
                value += 2;
                for (int j = 0; j < x; j++) {
                    print(value, (int) getWidth());
                }
            }
            print(value + 2, (int) getWidth());

        }
    }

    public void print(int value, int width) {
        int x = (width - value) / 2;
        for (int i = 0; i < x; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < value; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

}
