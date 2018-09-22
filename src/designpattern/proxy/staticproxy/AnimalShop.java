package designpattern.proxy.staticproxy;

/**
 * 代理类
 */
public class AnimalShop implements Factory {

    private CatFactory catFactory;

    public AnimalShop (CatFactory catFactory){
        super();
        this.catFactory = catFactory;
    }
    @Override
    public void getAnimal(String animalType) {
          hello();
          catFactory.getAnimal(animalType);
          goodbye();
    }
    private void hello(){
        System.out.println("welcome");
    }
    private void goodbye(){
        System.out.println("goodbye");
    }
}
