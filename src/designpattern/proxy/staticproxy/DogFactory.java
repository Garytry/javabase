package designpattern.proxy.staticproxy;

public class DogFactory implements Factory {
    @Override
    public void getAnimal(String animalType) {
        System.out.println("this is a "+animalType);
    }
}
