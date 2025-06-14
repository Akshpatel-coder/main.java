package newstart;

import java.awt.*;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height){
        this.radius = radius;
        this.radius = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(final int radius) {
        this.radius = radius;
    }



    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
    public double volume() {
        return Math.PI * radius * radius  * height;
    }
}





public class java67 {
    public static void main(String[] args) {
// 1
Cylinder myCylinder =   new Cylinder(9, 12 );
  // myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
      //  myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        // 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());



        // 3

    }
}
