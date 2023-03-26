package OOP.OOP_HW.HW03;

import OOP.OOP_HW.HW03.Interface.Lengthable;
import OOP.OOP_HW.HW03.Interface.Squareable;


public class Circle implements BaseFig implements Lengthable{
    protected int r;

    public Circle() {
        this.r = 0;
    }

    public Circle(int r) {
        if (r <= 0) {
            System.out.println("Невозможно созжать такую фигуру");
            System. exit(0);
        }
        this.r = r;
    }

    public double Length() {
        return 2 * Math.PI * r;
    }

    public double Square() {
        return Math.PI * r * r;
    }

    public String Info() {
        return String.format("Circle: radius - %d, Length - %f, Square - %f",
                             this.r, this.Length(), this.Square());
    }

    public int Radius() {
        return this.r;
    }
}
