package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    ButtonRight br;
    ButtonLeft bl;
    Clock c;
    //Note n;

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
        br = new ButtonRight(this, width * .75f , height * .1f, 400, 200, width, height);
        bl = new ButtonLeft(this, width * .085f, height * .75f, width * .085f, height * .2f, 300, 150, width, height);
        c = new Clock(this, width * .28f, width * .25f, width * .3f, width * .28f, height * .65f, width * .28f, width, height,width * .155f, height * .65f, width * .3f, width * .1f);
        //n = new Note(this, width * .155f, height * .65f, width * .3f, width * .1f, width, height);
        radar = new Radar(this, 1, width / 2, height / 2, width * .25f);
        //Get value
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
        //Top gradient layer
        for (int i = 0; i < height / 5; i++) {
            
            x = map(i, 0, height / 5, 64, 0);
            y = map(i, 0, height / 5, 128, 0);
            line(0, i, width, i);
            stroke(0, x, y);
              
            
        }
    }

    void bottomLayer()
    {
        //bottom gradient layer 
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

        radar.update();
        radar.render();
        br.render();
        //mc.update();
        bl.render();
        c.render();
        //n.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

