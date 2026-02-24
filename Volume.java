
//program15
//write a java program to calculate the volume of a cube
import java.util.Scanner;

interface VolumeInterface {
    double pi = 3.14159;

    void readdata(Scanner sc);

    void dispvolume();
}

class Sphere implements VolumeInterface {
    double r, volume;

    public void readdata(Scanner sc) {
        System.out.print("Enter radius of sphere: ");
        r = sc.nextDouble();
    }

    public void dispvolume() {
        volume = (4.0 / 3.0) * pi * r * r * r;
        System.out.println("Volume of Sphere = " + volume);
    }
}

class Cylinder implements VolumeInterface {
    double r, h, volume;

    public void readdata(Scanner sc) {
        System.out.print("Enter radius of cylinder: ");
        r = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        h = sc.nextDouble();
    }

    public void dispvolume() {
        volume = pi * r * r * h;
        System.out.println("Volume of Cylinder = " + volume);
    }
}

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sphere s = new Sphere();
        s.readdata(sc);
        s.dispvolume();

        Cylinder c = new Cylinder();
        c.readdata(sc);
        c.dispvolume();

        sc.close();
    }
}
/*
 * Sample Output:
 * Enter radius of sphere: 5
 * Volume of Sphere = 523.5983333333332
 * Enter radius of cylinder: 5
 * Enter height of cylinder: 10
 * Volume of Cylinder = 785.3975
 */
