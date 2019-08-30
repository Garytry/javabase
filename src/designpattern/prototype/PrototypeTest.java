package designpattern.prototype;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("宝马");
        System.out.println(car.getClassname());
        Car car1 = (Car)car.clone();
        System.out.println(car1.getClassname());
        System.out.println(car==car1);

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }

    }
}
