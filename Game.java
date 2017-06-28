package Basketball;
import apcs.Window;;
public class Game {
    public static void main(String[] args) {

        Window.size(800, 600);
        Ball ball = new Ball();
        Basket basket = new Basket();
        while(true) {
        	Window.frame();
        	Window.out.background(135,206,250);
        	ball.draw();
        	ball.move();
        	ball.interact();
        	
        	basket.draw();
        	
        	
        }
    }

}