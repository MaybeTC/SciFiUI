package ie.tudublin;

import com.sun.javafx.collections.MappingChange.Map;

import processing.core.PApplet;

public class ButtonLeft extends PApplet
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private float sw;//Screen width

    private String[] Text1 = {"S", "T", "A", "R", "T"};
    private String[] Text2 = {"P", "A", "U", "S", "E"};

    public ButtonLeft(UI ui, float x, float y, float width, float height,float sw)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.sw = sw;
    }
    int a1 = 64;
    int a2 = 64;
    int b1 = 0;
    int b2 = 0;
    int e1 = 128;
    int e2 = 128;
    int f1 = 0;
    int f2 = 0;
    int g = 15;
    int k = 0;

    void drawbutton1()
    {
        //Frame of button
        ui.noFill();
        ui.stroke(255);
        ui.line(x + k, y + g, x + width + k, y - g);
        ui.line(x + k, y + g, x + k, y + height + g);
        ui.line(x + width + k, y - g, x + width + k, y + height - g);
        ui.line(x + k, y + height + g, x + width + k, y + height - g);
        
        //Coloring button
        float c;
        float d;
        for(int j = 0 ; j < height ; j++)
        {
            ui.line(x + k, y + g + j, x + width + k, y - g + j);
            c = map(j, 0, height, a1, b1);
            d = map(j, 0, height, e1, f1);
            ui.stroke(0, c, d);
        }

        //text of button
        float a = x + k;
        float b = y;
        for(int i = 0 ; i < Text1.length ; i ++){
            ui.textSize(30);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.fill(255);
            ui.text(Text1[i], a + 75, b + 75);
            a = a + 36;
            b = b - 36 * g / 300;
            
        }
    }

    

    void drawbutton2()
    {
        //Frame of button
        ui.noFill();
        ui.stroke(255);

        float p = sw / 5;
        ui.line(x + k + p, y + g, x + width + k + p, y - g);
        ui.line(x + k + p, y + g, x + k + p, y + height + g);
        ui.line(x + width + k + p, y - g, x + width + k + p, y + height - g);
        ui.line(x + k + p, y + height + g, x + width + k + p, y + height - g);
        
        //Coloring button
        float c;
        float d;
        for(int j = 0 ; j < height ; j++)
        {
            ui.line(x + k + p, y + g + j, x + width + k + p, y - g + j);
            c = map(j, 0, height, a2, b2);
            d = map(j, 0, height, e2, f2);
            ui.stroke(0, c, d);
        }

        //text of button
        float a = x + k + p;
        float b = y;
        for(int i = 0 ; i < Text2.length ; i ++){
            ui.textSize(30);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.fill(255);
            ui.text(Text2[i], a + 75, b + 75);
            a = a + 36;
            b = b - 36 * g / 300;
            
        }
    }

    public void render()
    {
        drawbutton1();
        drawbutton2();
        buttonBlinks();
        mouseOnTheLeft();
    }

    //If the mouse is near the left button, button will change.
    public void mouseOnTheLeft()
    {
        if (ui.mouseX < sw * .48f)
        {
            g = 0;
            k = 35;
        }
        else
        {
            g = 15;
            k = 0;
        }
        
    }

    public void buttonBlinks()
    {
        //button1 blinks
        if ((ui.mouseX > x + k && ui.mouseX < x + width + k))
        {
			if ((ui.mouseY > y && ui.mouseY < y + height))
            {
         
                //The button blinks When the mouse on the button
                int i = 1;
                i = a1;
                a1 = b1;
                b1 = i;
                i = e1;
                e1 = f1;
                f1 = i;
            }
			
        }

        //button2 blinks
        float p = sw / 5;
        if ((ui.mouseX > x + k + p && ui.mouseX < x + width + k + p))
        {
			if ((ui.mouseY > y && ui.mouseY < y + height))
            {
         
                //The button blinks When the mouse on the button
                int i = 1;
                i = a2;
                a2 = b2;
                b2 = i;
                i = e2;
                e2 = f2;
                f2 = i;
            }
			
        }

    }

}