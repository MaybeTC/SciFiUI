package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Clock
{
    private float x;
    private float y;
    private float cd;//Diameter of clock

    private float z;
    private float l;

    UI ui;

    public Clock(UI ui,float x, float y, float cd, float z, float l)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.cd = cd;

        this.z = z;
        this.l = l;
    }

    void drawclock()
    {   
        // draw dial 
        ui.ellipseMode(ui.CENTER);
        ui.strokeWeight(10);
        ui.fill(255);
        ui.ellipse(x, y, cd, cd);

        // scale lines
        for(int i = 1; i <= 60; i++) 
        {
            ui.pushMatrix();  // Coordinate system location
            ui.translate(x, y);  // Moving coordinate system(0,0)to(width/2, height/2)
            ui.rotate(ui.radians(i * 6));
            if(i % 5 == 0) 
            { 
                // The tick mark of the whole point
                ui.strokeWeight(10);
                ui.stroke(0);
                ui.line(cd * .4f, 0, cd * .433f, 0);
            } 
            else 
            { 
                // Non-integral tick mark
                ui.strokeWeight(5);
                ui.stroke(0);
                ui.line(cd * .416f, 0, cd * .433f, 0);
            }
                ui.popMatrix();  // Restore coordinate system position
        }
        //number
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.textSize(30);
        ui.fill(0);
        ui.text(12, x, y - cd / 2 + 90);
        ui.text(3, x + cd / 2 - 90, y);
        ui.text(6, x, y + cd / 2 - 90);
        ui.text(9, x - cd / 2 + 90, y);

        /*
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
        */
    }

    int Second;
    int Minute;
    int Hour;
    float Minutefloat;
    float Hourfloat;

    int Year;
    int Month;
    int Day;

    void drawElectronicClock(){
        //draw dial
        ui.noStroke();
        ui.fill(255);
        ui.rect(z - 170, l - 105, 340, 210, 9);
        ui.noStroke();
        ui.fill(0);
        ui.rect(z - 150, l - 100, 300, 200, 9);



        //Diplay time and date
        Second = ui.second();
        Minute = ui.minute();
        Hour = ui.hour();
        Minutefloat = ui.minute() + Second / 60.0f;
        Hourfloat = ui.hour() + Minute / 60.0f;

        Year = ui.year();
        Month = ui.month();
        Day = ui.day();

        String secondDraw = Second + "";
        String minuteDraw = Minute + "";
        String hourDraw = Hour + "";

        if(Second < 10)
        {
            secondDraw = "0" + Second;
        }
        if(Minute < 10)
        {
            minuteDraw = "0" + Minute;
        }
        if(Hour < 10)
        {
            hourDraw = "0" + Hour;
        }

        //Display time
        String Time = hourDraw + ":" + minuteDraw + ":" + secondDraw;
        ui.textSize(50);
        ui.fill(255);
        ui.text(Time, z, l - 20);

        //Display date
        String Date = Year + "/" + Month + "/" + Day;
        ui.textSize(30);
        ui.fill(255);
        ui.text(Date, z, l + 35);

    }

    public void render()
    {
        drawclock();
        drawElectronicClock();
    }

    public void update()
    {

    }
}