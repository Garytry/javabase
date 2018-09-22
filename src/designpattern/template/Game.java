package designpattern.template;

/**
 * 抽象类，模板方法设置为final
 * @author gengdesehng
 * @date 2018/9/4
 */
public abstract class Game {

    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }


}
