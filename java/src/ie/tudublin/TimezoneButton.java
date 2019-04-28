package ie.tudublin;

import com.sun.javafx.collections.MappingChange.Map;

import processing.core.PApplet;

public class TimezoneButton
{
    private float x;
    private float y;
    private float width;
    private float height;
    //private float dx = 50;
    //private float b;
    
    private String[] Text = {"C", "L", "O", "C", "K"};//text
    
    UI ui;

    public TimezoneButton(UI ui, float x, float y, float width, float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        //this.b = b;

        //radius = diameter / 2;
    }

    void drawButton()
    {
        ui.noFill();
        
        //Frame of button
        ui.stroke(255);
        ui.strokeWeight(4);
        ui.line(x, y - 15, x + width, y + 15);
        ui.line(x, y - 15, x, y + height - 15);
        ui.line(x + width, y + 15, x + width, y + height + 15);
        ui.line(x, y + height - 15, x + width, y + height + 15);
        
        //Coloring button
        float c;
        float d;
        for(int j = 0 ; j < height ; j++)
        {
            ui.line(x, y - 15 + j, x + width, y + 15 + j);
            c = ui.map(j, 0, height, 64, 0);
            d = ui.map(j, 0, height, 128, 0);
            ui.stroke(0, c, d);
        }

        //Text of button
        float a = x;
        float b = y;
        for(int i = 0 ; i < Text.length ; i ++){
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(50);
            ui.fill(255);
            ui.text(Text[i], a + 120, b + 100);
            a = a + 36;
            b = b + 36 * .0375f;
            //0.0375 = 15 / 400
        }

        
    }

    public void render()
    {
        drawButton();
        
    }
    
    public void mouseClicked()
    {
        int which = -1;
		
        if ((ui.mouseX > x && ui.mouseX < x + width))
        {
			if (ui.mouseY > y && ui.mouseY < y + height)
            {
                which = 1;
            }
			
        }
        if(which != -1)
			{
				System.out.println("Hello");
			}
    }

    public void update()
    {
        
    }
    
}





