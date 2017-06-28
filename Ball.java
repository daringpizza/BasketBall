package Basketball;

import apcs.Window;


public class Ball {
	int x = 200;
	int y = Window.height() / 2;
	double dx = 0;
	double dy = 0;
	int time = 0;
	double entropy = 0.5; // amount of energy lost with each bounce 1 = all energy conserved 0 = all energy lost
	double gravityFactor = 0.2;
	boolean shot = false;
	int counter = 0;
	
    
    public void draw() {
    	Window.out.color("orange");
		Window.out.circle(x, y, 10);
		Window.out.color("black");
		if(time%20 < 10) {
			Window.out.line(x+10, y, x-10, y);
			Window.out.line(x, y+10, x, y-10);
		} else {
			Window.out.line(x-7, y-7, x+7, y+7);
			Window.out.line(x+7, y-7, x-7, y+7);
		}

    }
    public void move() {
    	if(Window.mouse.clicked() && shot==false) {
    		dx = (Window.mouse.getX() - x)/10;
    		dy = (Window.mouse.getY() - y)/10;
    		//x = Window.mouse.getX();
    		//y = Window.mouse.getY();
    		shot = true;
    	}
    	x += dx;
    	y += dy;
    	dy = dy + (gravityFactor*time)/100;
    	time++;
    }
    
    public void interact() {
    	if(x<10 || x>Window.width()-10 || y<10) {
    		x = 200;
    		y = Window.height() / 2;
    		dx = 0;
    		dy = 0;	
    		shot = false;
    	}
    	if(y>Window.height()-10){
    		y = Window.height() -10;
    		dy = -(dy*entropy);
    	}
    	if(Math.abs(x-724)<15 && y>310) {
    		x = 724;
    		dx = -dx;
    	}
    	
    	
    	
    }

}