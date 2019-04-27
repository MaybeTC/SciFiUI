package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = false;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        //size(800, 800);
        fullScreen(); 
        // Use fullscreen instead of size to make your interface fullscreen
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width * .75f, height * .15f, 400, 200);
        radar = new Radar(this, 1, width / 2, height / 2, 100);
        //赋值
        x = 0;
        y = 0;
        py = 0;
    }

    Radar radar;

    float x;
    float y;
    float py;

    public void draw()
    {
        background(0);
        //上下图层layer
        noStroke();
        colorMode(RGB, 255);
        //上方渐变图层layer
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height / 5; j++) {
                x = map(j, 0, height / 5, 64, 0);
                y = map(j, 0, height / 5, 128, 0);
                point(i, j);
                stroke(0, x, y);
                
            }
        }
        
        //下方渐变图层layer
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height / 5; j++) {
                py = j +(height - height / 5);
                x = map(j, 0, height / 5, 0, 64);
                y = map(j, 0, height / 5, 0, 128);
                point(i, py);
                stroke(0, x, y);
                
            }
            
        }
        

        b.render();

        //mc.update();
        mc.render();

        radar.update();
        radar.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

