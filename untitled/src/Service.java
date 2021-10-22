public class Service {

    public void printHello(String name) {
        System.out.println("this is printHello method");
        System.out.println(name.toUpperCase());
    }

    public int mult(int i1, int i2) {
        System.out.println("try to mult two int values");
        return i1*i2;
    }

    public void testNeedToDelete() {
        System.out.println("delete");
    }

}
