package Basketball;
import apcs.Window;
public class Basket {   
    int x = 700;
    int y = 350;

    public void draw() {
    	
    	Window.out.color("white");
    	Window.out.line(x-16, y, x-12, y+20);
    	Window.out.line(x+14, y, x+12, y+20);
    	Window.out.line(x-16, y, x+12, y+20);
    	Window.out.line(x+14, y, x-12, y+20);
    	Window.out.color("gray");
    	Window.out.rectangle(x+24, Window.height()-((Window.height()-y)/2), 3, Window.height()-y);
    	Window.out.color("red");	
    	Window.out.rectangle(x+4, y, 40, 3);
    	Window.out.color("brown");
    	Window.out.rectangle(x+24, y-20, 3, 40);
    	
    	
    }

}