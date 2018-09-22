package designpattern.template;

/**
 * @author gengdesehng
 * @date 2018/9/4
 */
public class LOL extends Game {
    @Override
    public void initialize() {
        System.out.println("init game");
    }

    @Override
    public void startPlay() {
        System.out.println("start game,five kill,loss");
    }

    @Override
    public void endPlay() {
        System.out.println("end game,close computer");
    }
}
