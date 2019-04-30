package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Clock extends PApplet
{
    
    private float x;
    private float y;
    private float cd;//Diameter of clock

    private float z;
    private float l;
    private float ecw;//width of Electronic clock
    private float sw;//Screen width
    private float sh;//Screen height

    UI ui;

    public Clock(UI ui,float x, float y,  float cd, float z, float l, float ecw, float sw, float sh)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.cd = cd;

        this.z = z;
        this.l = l;
        this.ecw = ecw;

        this.sw = sw;
        this.sh = sh;

    }

    void drawclockdial()
    {   
        if(flag3)
        {
            // draw dial 
            ui.ellipseMode(CENTER);
            ui.stroke(0);
            ui.strokeWeight(10);
            ui.fill(255);
            ui.ellipse(x, y, cd, cd);

            // scale lines
            for(int i = 1; i <= 60; i++) 
            {
                ui.pushMatrix();  // Coordinate system location
                ui.translate(x, y);  // Moving coordinate system(0,0)to(width/2, height/2)
                ui.rotate(radians(i * 6));
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
        }
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

    Boolean flag = true;//Control classic clock Pause and Start
    Boolean flag2 = true;//Control electronic clock Pause and Start

    int Second;
    int Minute;
    int Hour;
    float Minutefloat;
    float Hourfloat;

    int Year;
    int Month;
    int Day;


    void drawhand()
    {
        if(flag3)
        {
            mouseClicked1();
            //hour hand
            ui.pushMatrix();
            ui.translate(x, y);

            float angleHour = radians(270);

            if((Hourfloat >= 3 && Hourfloat <= 12) || Hourfloat >= 15 && Hourfloat <= 24)
            {
                angleHour = radians(30 * (Hourfloat - 3));
            }
            else
            {
                angleHour = radians(30 * (Hourfloat - 1) + 300);
            }
            if (flag)// Judging whether the key is pressed or not and stopping the rotation
            {
                ui.rotate(angleHour);
            } 
            else 
            {
                ui.rotate(radians(270));
            }
            
            ui.stroke(0);
            ui.strokeWeight(15);
            ui.line(-cd * .02f, 0, cd * .15f, 0);
            ui.popMatrix();


            //minute hand
            ui.pushMatrix();
            ui.translate(x, y);

            float angleMinute = radians(270);

            if((Minutefloat >= 0 && Minute <= 15))
            {
                angleMinute = radians(270 + 6 * Minutefloat);
            }
            else
            {
                angleMinute = radians(6 * (Minutefloat - 15));
            }
            if (flag)// Judging whether the key is pressed or not and stopping the rotation
            {
                ui.rotate(angleMinute);
            } 
            else 
            {
                ui.rotate(radians(0));
            }

            ui.stroke(0);
            ui.strokeWeight(9);
            ui.line(-cd * .024f, 0, cd * .25f, 0);
            ui.popMatrix();
            

            //second hand
            ui.pushMatrix();
            ui.translate(x, y);

            float angleSecond = radians(270);

            if ((Second >= 0 && Second <= 15)) 
            {
                angleSecond = radians(270 + 6 * Second);
            } 
            else 
            {
                angleSecond = radians(6 * (Second - 15));
            }
            if (flag) // Judging whether the key is pressed or not and stopping the rotation
            { 
                ui.rotate(angleSecond);
            } 
            else 
            {
                ui.rotate(radians(180));
            }

            ui.stroke(255,0,0);
            ui.strokeWeight(3);
            ui.line(-cd * .025f, 0, cd * .32f, 0);
            ui.fill(255,0,0);
            ui.ellipse(cd * .36f, 0, 15, 15);
            ui.stroke(255);
            ui.popMatrix();
        }
    }


    void drawElectronicClock(){
        mouseClicked2();
        if(flag4)
        {
            //draw dial
            ui.noStroke();
            ui.fill(255);
            ui.rect(z - ecw * 1.133f / 2, l - ecw * .65f * 1.05f / 2, ecw * 1.133f, ecw * .65f * 1.05f, 9);
            ui.noStroke();
            ui.fill(0, 8, 16);
            ui.rect(z - ecw / 2, l - ecw * .65f / 2, ecw, ecw * .65f, 9);
        }

        //Diplay time and date
        Second = second();
        Minute = minute();
        Hour = hour();
        Minutefloat = minute() + Second / 60.0f;
        Hourfloat = hour() + Minute / 60.0f;

        Year = year();
        Month = month();
        Day = day();

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

        if(flag4)
        {
            //Display time
            if (flag2)// Judging whether the key is pressed or not and stopping the rotation
            {
                String Time = hourDraw + ":" + minuteDraw + ":" + secondDraw;
                ui.textSize(90);
                ui.fill(255);
                ui.text(Time, z, l - 40);

                //Display date
                String Date = Year + "/" + Month + "/" + Day;
                ui.textSize(45);
                ui.fill(255);
                ui.text(Date, z, l + 60);
            } 
        }

    }

    public void render()
    {
        drawclockdial();
        drawElectronicClock();
        drawhand();
        mouseClicked3();
    }


    //Judging whether the pause and start keys are pressed or not
    public void mouseClicked1()
    {
        //Clicked Start button
        int which = -1;
        
        if ((ui.mouseX > sw * .1f && ui.mouseX < sw * .1f + 300))
        {
			if ((ui.mouseY > sh * .75f && ui.mouseY < sh * .75f + 150))
            {
                
                which = 1;
                
            }
			
        }
        if(which != -1)
        {
            flag = true;
        }

        //Clinked Pause button
        float p = sw / 5;
        int which2 = -1;
        if ((ui.mouseX > sw * .1f + p && ui.mouseX < sw * .1f + 300 + p))
        {
			if ((ui.mouseY > sh * .75f && ui.mouseY < sh * .75f + 150))
            {
                
                which2 = 1;
                
            }
			
        }
        if(which2 != -1)
        {
            flag = false;
            
        }
    }
    
    //Judging whether the pause and start keys are pressed or not
    public void mouseClicked2()
    {
        //Clicked Start button
        int which = -1;
        
        if ((ui.mouseX > sw * .085f && ui.mouseX < sw * .085f + 300))
        {
			if ((ui.mouseY > sh * .2f && ui.mouseY < sh * .2f + 150))
            {
                
                which = 1;
                
            }
			
        }
        if(which != -1)
        {
            flag2 = true;
        }

        //Clinked Pause button
        float p = sw / 5;
        int which2 = -1;
        if ((ui.mouseX > sw * .085f + p && ui.mouseX < sw * .085f + 300 + p))
        {
			if ((ui.mouseY > sh * .2f && ui.mouseY < sh * .2f + 150))
            {
                
                which2 = 1;
                
            }
			
        }
        if(which2 != -1)
        {
            flag2 = false;
            
        }
    }

    Boolean flag3 = true;//diplay classic clock
    Boolean flag4 = false;//display electronic clock

    //select clock
    public void mouseClicked3()
    {
        
        //Clicked Classic button
        int which = -1;
        
        if ((ui.mouseX > sw * .75f && ui.mouseX < sw * .75f + 400))
        {
			if ((ui.mouseY > sh * .15f && ui.mouseY < sh * .15f + 200))
            {
                
                which = 1;
                
            }
			
        }
        if(which != -1)
        {
            flag3 = true;
            flag4 = false;
        }

        //Clinked Electronic button
        float p = sh / 3;
        int which2 = -1;
        if ((ui.mouseX > sw * .75f && ui.mouseX < sw * .75f + 400))
        {
			if ((ui.mouseY > sh * .15f + p && ui.mouseY < sh * .15f + 200 + p))
            {
                
                which2 = 1;
                
            }
			
        }
        if(which2 != -1)
        {
            flag3 = false;
            flag4 = true;
        }
    }


}