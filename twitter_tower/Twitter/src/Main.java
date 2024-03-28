import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int number = 0;
    double width, height;
        while (number != 3) {
        System.out.println("Type 1 for rectangle 2 for triangle and 3 for exit");
        number = in.nextInt();
        String tower = " ";

        switch (number) {
            case 1:
                tower = "RectangleTower";
                System.out.println("Type Height");
                height = in.nextInt();
                System.out.println("Type width");
                width = in.nextInt();
                Rectangle r = new Rectangle(height, width);
                r.print();
                break;
            case 2:
                tower = "TriangleTower";
                tower = "RectangleTower";
                System.out.println("Type Height");
                height = in.nextInt();
                System.out.println("Type width");
                width = in.nextInt();
                Triangle t = new Triangle(height, width);
                t.printTriangle();
                break;
            case 3:
                break;
        }
    }


}
}

