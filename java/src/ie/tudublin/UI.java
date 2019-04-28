package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    FrequencyButton fb;
    TimezoneButton tb;
    Clock c;


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
        //size(1200, 800);
        fullScreen(); 
        // Use fullscreen instead of size to make your interface fullscreen
    }

    public void setup()
    {
        fb = new FrequencyButton(this, width * .15f, height * .75f, 300, 150);
        tb = new TimezoneButton(this, width * .75f , height * .15f, 400, 200);
        c = new Clock(this, width * .25f, width * .25f, width * .3f);
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

    void topLayer()
    {
        //上方渐变图层layer
        for (int i = 0; i < height / 5; i++) {
            
            x = map(i, 0, height / 5, 64, 0);
            y = map(i, 0, height / 5, 128, 0);
            line(0, i, width, i);
            stroke(0, x, y);
              
            
        }
    }

    void bottomLayer()
    {
        //下方渐变图层layer
        for (int i = 0; i < height / 5; i++) {
            py = i +(height - height / 5);
            x = map(i, 0, height / 5, 0, 64);
            y = map(i, 0, height / 5, 0, 128);
            line(0, py, width, py);
            stroke(0, x, y);
        }
    }


    public void draw()
    {
        background(0);
        colorMode(RGB, 255);
        noStroke();
        topLayer();
        bottomLayer();

        fb.render();

        //mc.update();
        tb.render();
        c.render();
        radar.update();
        radar.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

