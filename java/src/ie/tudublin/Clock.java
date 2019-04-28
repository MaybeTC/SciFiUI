package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Clock
{
    private float x;
    private float y;
    private float cd;//Diameter of clock

    UI ui;

    public Clock(UI ui,float x, float y, float cd)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.cd = cd;
    }

    void drawclock()
    {   
        //Housing washer of clock
        ui.fill(255);
        ui.stroke(255);
        ui.ellipse(x, y, cd, cd);

        //inside track of clock
        ui.fill(0);
        ui.stroke(0);
        ui.ellipse(x, y, cd - 150, cd - 150);

        //scale lines
        ui.fill(0);
        ui.stroke(0);
        ui.strokeWeight(10);
        ui.line(x - cd / 2 + 20, y, x - cd / 2 + 60, y);
        ui.line(x + cd / 2 - 20, y, x + cd / 2 - 60, y);
        ui.line(x, y - cd / 2 + 20, x, y - cd / 2 + 60);
        ui.line(x, y + cd / 2 - 20, x, y + cd / 2 - 60);

        //number
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.textSize(25);
        ui.fill(255);
        ui.text(12, x, y - cd / 2 + 90);
        ui.text(3, x + cd / 2 - 90, y);
        ui.text(6, x, y + cd / 2 - 90);
        ui.text(9, x - cd / 2 + 90, y);

        //hour hand
        ui.noStroke();
        ui.fill(255, 0, 0);
        ui.quad(x, y - cd / 2 + 40, x - 25, (y - cd / 2 - 40) * 1.75f, x, y - 10, x + 25, (y - cd / 2 - 40)* 1.75f);
        //ui.quad(38, 31, 86, 20, x, y, 30, 76);

        //minute hand
        //ui.quad(38, 31, 86, 20, 69, 63, 30, 76);
        //ui.quad(38, 31, 86, 20, 69, 63, 30, 76);
    }

    public void render()
    {
        drawclock();
    }

    public void update()
    {

    }
}