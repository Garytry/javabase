package designpattern.template;

/**
 * @author gengdesehng
 * @date 2018/9/4
 */
public class TemplateDemo {

    public static void main(String[] args) {
        Game lol = new LOL();
        lol.play();

        Game football = new Football();
        football.play();
    }



}
