//program13
//write a java program to count the number of objects created
public class CountObjects {
    static int count = 0;

    public CountObjects() {
        count = count + 1;
    }

    public static void main(String[] args) {
        CountObjects obj1 = new CountObjects();
        CountObjects obj2 = new CountObjects();
        CountObjects obj3 = new CountObjects();
        CountObjects obj4 = new CountObjects();
        CountObjects obj5 = new CountObjects();

        System.out.println("Number of objects: " + CountObjects.count);
    }
}
/* Sample Output:
