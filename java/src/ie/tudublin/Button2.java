package ie.tudublin;

import processing.core.PApplet;

public class Button2
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String[] Text = {"B", "U", "T", "T", "O", "N"};

    public Button2(UI ui, float x, float y, float width, float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        
    }

    void drawbutton()
    {
        //Frame of button
        ui.noFill();
        ui.stroke(255);
        ui.line(x, y + 15, x + width, y - 15);
        ui.line(x, y + 15, x, y + height + 15);
        ui.line(x + width, y - 15, x + width, y + height - 15);
        ui.line(x, y + height + 15, x + width, y + height - 15);
        
        //Coloring button
        float c;
        float d;
        for(int j = 0 ; j < height ; j++)
        {
            ui.line(x, y + 15 + j, x + width, y - 15 + j);
            c = ui.map(j, 0, height, 64, 0);
            d = ui.map(j, 0, height, 128, 0);
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
            b = b - 36 * .0375f;
            //0.0375 = 15 / 400
        }
    }

    public void render()
    {
        drawbutton();
    }
}