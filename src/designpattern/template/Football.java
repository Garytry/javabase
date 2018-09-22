package designpattern.template;

/**
 * @author gengdesehng
 * @date 2018/9/4
 */
public class Football extends  Game{

    @Override
    public void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    public void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

}
