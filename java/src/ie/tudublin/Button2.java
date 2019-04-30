package ie.tudublin;

import com.sun.javafx.collections.MappingChange.Map;

import processing.core.PApplet;

public class Button2 extends PApplet
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private float sw;//Screen width

    private String[] Text = {"B", "U", "T", "T", "O", "N"};

    public Button2(UI ui, float x, float y, float width, float height,float sw)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.sw = sw;
    }
    int a = 64;
    int b = 0;
    int e = 128;
    int f = 0;
    int g = 15;

    void drawbutton2()
    {
        //Frame of button
        ui.noFill();
        ui.stroke(255);
        ui.line(x, y + g, x + width, y - g);
        ui.line(x, y + g, x, y + height + g);
        ui.line(x + width, y - g, x + width, y + height - g);
        ui.line(x, y + height + g, x + width, y + height - g);
        
        //Coloring button
        float c;
        float d;
        for(int j = 0 ; j < height ; j++)
        {
            ui.line(x, y + g + j, x + width, y - g + j);
            c = map(j, 0, height, a, b);
            d = map(j, 0, height, e, f);
            ui.stroke(0, c, d);
        }

        //text of button
        float a = x;
        float b = y;
        for(int i = 0 ; i < Text.length ; i ++){
            ui.textSize(30);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.fill(255);
            ui.text(Text[i], a + 60, b + 75);
            a = a + 36;
            b = b - 36 * g / 300;
            
        }
    }

    public void render()
    {
        drawbutton2();
        mouseClicked();
        mouseOnTheLeft();
    }
    public void mouseOnTheLeft()
    {
        if (ui.mouseX < sw * .45f)
        {
            g = 0;
        }
        else
        {
            g = 15;
        }
    }

    public void mouseClicked()
    {
        int which = -1;
		
        if ((ui.mouseX > x && ui.mouseX < x + width))
        {
			if ((ui.mouseY > y && ui.mouseY < y + height))
            {
                which = 1;
                //The button blinks When the mouse on the button
                int i = 1;
                i = a;
                a = b;
                b = i;
                i = e;
                e = f;
                f = i;
            }
			
        }
        if(which != -1)
		{
            System.out.println("2");
            
        }
        
    }

}