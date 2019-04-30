package ie.tudublin;

import com.sun.javafx.collections.MappingChange.Map;

import processing.core.PApplet;

public class Note extends PApplet
{
    private float x;
    private float y;
    private float width;
    private float height;

    private float sw;//Screen width
    private float sh;//Screen height

    UI ui;

    private String[] Text = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "q", "w", "e", "r", "t", "y", "u", "i", "o", "p","A","S","D","F","G","H","J","K","L",";","'","Z","X","C","V","B","N","M",",",".","/"};// 
    public Note(UI ui, float x, float y, float width, float height, float sw, float sh)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.sw = sw;
        this.sh = sh;
    }

    void drawInputWindow()
    {
        //draw Keyboard
        ui.stroke(0);
        ui.strokeWeight(1);
        ui.fill(255);
        ui.rect(x, y , width, height, 10);

        //draw keys
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                int q = i + j * 10;
                float gap = 3;
                float a = x + gap + width / 10 * i;
                float b = y + gap + width / 10 * j;
                ui.stroke(255);
                ui.strokeWeight(1);
                ui.fill(0);
                ui.rect(a, b , width / 10, width / 10, 10);

                //Letters and Numbers
                ui.textAlign(PApplet.CENTER, PApplet.CENTER);
                ui.strokeWeight(5);
                ui.textSize(40);
                ui.fill(255);
                ui.text(Text[q], x + width / 20 + i * width / 10, y + width / 20 + j * width / 10);

            }
        }

        //draw screen
        ui.stroke(0);
        ui.strokeWeight(10);
        ui.fill(255);
        ui.rect(x / 2, y - height * 3, width * 1.5f, height * 1.8f, 10);
        ui.stroke(255);
        ui.strokeWeight(10);
        ui.fill(0);
        ui.rect(x, y - height, width, height, 10);
                
    }

    public void render()
    {
        drawInputWindow();
    }

    
}

