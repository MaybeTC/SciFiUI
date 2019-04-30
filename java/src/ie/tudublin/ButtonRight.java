package ie.tudublin;

import com.sun.javafx.collections.MappingChange.Map;

import processing.core.PApplet;

public class ButtonRight extends PApplet
{
    private float x;
    private float y;
    private float width;
    private float height;
    private float sw;//Screen width
    private float sh;

    //private float dx = 50;
    //private float b;
    
    private String[] Text1 = {"C", "L", "A", "S", "I", "C"};//Clasic
    private String[] Text2 = {"E", "L", "E", "C", "T", "O", "N", "I", "C"};//Electronic
    private String[] Text3 = {"N", "O", "T", "E"};//Note
    UI ui;

    public ButtonRight(UI ui, float x, float y, float width, float height, float sw, float sh)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.sw = sw;
        this.sh = sh;

        //this.b = b;

        //radius = diameter / 2;
    }

    int a1 = 64;
    int a2 = 64;
    int a3 = 64;
    int b1 = 0;
    int b2 = 0;
    int b3 = 0;
    int e1 = 128;
    int e2 = 128;
    int e3 = 128;
    int f1 = 0;
    int f2 = 0;
    int f3 = 0;
    int g = 15;
    int k = 0;

    void drawButton1()
    {
        ui.noFill();
        
        //Frame of button
        ui.stroke(255);
        ui.strokeWeight(4);
        ui.line(x + k, y - g, x + width + k, y + g);
        ui.line(x + k, y - g, x + k, y + height - g);
        ui.line(x + width + k, y + g, x + width + k, y + height + g);
        ui.line(x + k, y + height - g, x + width + k, y + height + g);
        
        //Coloring button
        float c;
        float d;
        for(int j = 0 ; j < height ; j++)
        {
            ui.line(x + k, y - g + j, x + width + k, y + g + j);
            c = map(j, 0, height, a1, b1);
            d = map(j, 0, height, e1, f1);
            ui.stroke(0, c, d);
        }

        //Text of button
        float a = x + k;
        float b = y;
        for(int i = 0 ; i < Text1.length ; i ++){
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(50);
            ui.fill(255);
            ui.text(Text1[i], a + 110, b + 100);
            a = a + 36;
            b = b + 36 * g / width;
        }
        
    }

    void drawButton2()
    {
        ui.noFill();
        
        //Frame of button
        ui.stroke(255);
        ui.strokeWeight(4);


        float p = sh / 3;
        ui.line(x + k, y - g + p, x + width + k, y + g + p);
        ui.line(x + k, y - g  + p, x + k, y + height - g  + p);
        ui.line(x + width + k, y + g + p, x + width + k, y + height + g + p);
        ui.line(x + k, y + height - g + p, x + width + k, y + height + g + p);
        
        //Coloring button
        float c;
        float d;
        for(int j = 0 ; j < height ; j++)
        {
            ui.line(x + k, y - g + j + p, x + width + k, y + g + j + p);
            c = map(j, 0, height, a2, b2);
            d = map(j, 0, height, e2, f2);
            ui.stroke(0, c, d);
        }

        //Text of button
        float a = x + k;
        float b = y + p;
        for(int i = 0 ; i < Text2.length ; i ++){
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(50);
            ui.fill(255);
            ui.text(Text2[i], a + 55, b + 100);
            a = a + 36;
            b = b + 36 * g / width;
        }
    }

    void drawButton3()
    {
        ui.noFill();
        
        //Frame of button
        ui.stroke(255);
        ui.strokeWeight(4);


        float p = sh / 3 * 2;
        ui.line(x + k, y - g + p, x + width + k, y + g + p);
        ui.line(x + k, y - g  + p, x + k, y + height - g  + p);
        ui.line(x + width + k, y + g + p, x + width + k, y + height + g + p);
        ui.line(x + k, y + height - g + p, x + width + k, y + height + g + p);
        
        //Coloring button
        float c;
        float d;
        for(int j = 0 ; j < height ; j++)
        {
            ui.line(x + k, y - g + j + p, x + width + k, y + g + j + p);
            c = map(j, 0, height, a3, b3);
            d = map(j, 0, height, e3, f3);
            ui.stroke(0, c, d);
        }

        //Text of button
        float a = x + k;
        float b = y + p;
        for(int i = 0 ; i < Text3.length ; i ++){
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(50);
            ui.fill(255);
            ui.text(Text3[i], a + 145, b + 100);
            a = a + 36;
            b = b + 36 * g / width;
        }
    }

    public void render()
    {
        drawButton1();
        drawButton2();
        drawButton3();
        buttonBlinks();
        mouseOnTheRight();
    }


    //If the mouse is near the right button, button will change.
    public void mouseOnTheRight()
    {
        if (ui.mouseX > sw * .52f)
        {
            g = 0;
            k = -50;
        }
        else
        {
            g = 15;
            k = 0;
        }
    }

    public void buttonBlinks()
    {
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


        float p = sh / 3;
        if ((ui.mouseX > x + k && ui.mouseX < x + width + k))
        {
			if ((ui.mouseY > y + p && ui.mouseY < y + height + p))
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

        
        if ((ui.mouseX > x + k && ui.mouseX < x + width + k))
        {
			if ((ui.mouseY > y + p * 2 && ui.mouseY < y + height + p * 2))
            {
                //The button blinks When the mouse on the button
                int i = 1;
                i = a3;
                a3 = b3;
                b3 = i;
                i = e3;
                e3 = f3;
                f3 = i;
            }
			
        }
        
    }


}





