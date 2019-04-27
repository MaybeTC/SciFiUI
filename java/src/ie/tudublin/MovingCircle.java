package ie.tudublin;

import processing.core.PApplet;
/*
public class MovingCircle
{
    private float x;
    //private float dx = 1;
    private float y;
    private float width;
    private float height;
    private float a;
    private float b;
    //文本
    private String[] Text = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    //private float radius;
    UI ui;

    public MovingCircle(UI ui, float x, float y, float width, float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.a = a;
        this.b = b;

        //radius = diameter / 2;
    }
    
    public void render()
    {
        ui.stroke(255);
        ui.noFill();
        //ui.rect(x, y, width, height);
        //边框
        ui.line(x, y + 15, x + width, y - 15);
        /*for (int i = 0; i < width; i++) {
            for (int j = 0; j < 10; j++) {
                
                ui.point(x + i , y + j);
                ui.stroke(255, 255, 255);
                
            }
        }*


        ui.line(x, y + 15, x, y + height + 15);
        ui.line(x + width, y - 15, x + width, y + height - 15);
        ui.line(x, y + height + 15, x + width, y + height - 15);
        ui.fill(255);
        // Static field
        
        float a = x;
        float b = y;
        for(int i = 0 ; i < Text.length ; i ++){
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(50);
            ui.text(Text[i], a + 75, b + 100);
            a = a + 36;
            b = b - 36 * .0375f;
            //0.0375 = 15 / 400
        }

    }
    
    /*
    public void update()
    {
        x += dx;
        if ((x > ui.width - radius) || (x < radius))
        {
            dx *= -1;
        }
    }
    *
}
*/



public class MovingCircle
{
    private float x;
    private float dx = 1;
    private float y;
    private float diameter;
    private float radius;
    UI ui;

    public MovingCircle(UI ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        radius = diameter / 2;
    }
    
    public void render()
    {
        ui.stroke(255);
        ui.noFill();
        ui.ellipse(x, y, diameter, diameter);
        ui.fill(255);
        // Static field
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text("I am a moving circle", x, y);

    }

    public void update()
    {
        x += dx;
        if ((x > ui.width - radius) || (x < radius))
        {
            dx *= -1;
        }
    }
}

/*


*/
