package ie.tudublin;

import com.sun.javafx.collections.MappingChange.Map;

import processing.core.PApplet;

public class ButtonLeft extends PApplet
{
    UI ui;
    private float x;
    private float y;
    private float z;
    private float l;
    private float width;
    private float height;
    private float sw;//Screen width
    private float sh;//Screen height

    
    private String[] Text1 = {"S", "T", "A", "R", "T"};
    private String[] Text2 = {"P", "A", "U", "S", "E"};

    public ButtonLeft(UI ui, float x, float y, float z, float l, float width, float height,float sw, float sh)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.z = z;
        this.l = l;
        this.width = width;
        this.height = height;
        this.sw = sw;
        this.sh = sh;
    }

    int a1 = 64;
    int a2 = 64;
    int a3 = 64;
    int a4 = 64;
    int b1 = 0;
    int b2 = 0;
    int b3 = 0;
    int b4 =0;
    int e1 = 128;
    int e2 = 128;
    int e3 = 128;
    int e4 = 128;
    int f1 = 0;
    int f2 = 0;
    int f3 = 0;
    int f4 = 0;
    int g = 15;
    int k = 0;

    void drawbutton1()
    {
        if(flag)
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
    }

    

    void drawbutton2()
    {
        if(flag)
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
    }

    //button3 and button4 control electronic clock
    void drawbutton3()
    {
        if(flag2)
        {
            //Frame of button

            ui.noFill();
            ui.stroke(255);
            ui.line(z + k, l + g, z + width + k, l - g);
            ui.line(z + k, l + g, z + k, l + height + g);
            ui.line(z + width + k, l - g, z + width + k, l + height - g);
            ui.line(z + k, l + height + g, z + width + k, l + height - g);
            
            //Coloring button
            float c;
            float d;
            for(int j = 0 ; j < height ; j++)
            {
                ui.line(z + k, l + g + j, z + width + k, l - g + j);
                c = map(j, 0, height, a3, b3);
                d = map(j, 0, height, e3, f3);
                ui.stroke(0, c, d);
            }

            //text of button
            float a = z + k;
            float b = l;
            for(int i = 0 ; i < Text1.length ; i ++){
                ui.textSize(30);
                ui.textAlign(PApplet.CENTER, PApplet.CENTER);
                ui.fill(255);
                ui.text(Text1[i], a + 75, b + 75);
                a = a + 36;
                b = b - 36 * g / 300;
                
            }
        }
    }

    void drawbutton4()
    {
        if(flag2)
        {
            //Frame of button
            ui.noFill();
            ui.stroke(255);

            float p = sw / 5;
            ui.line(z + k + p, l + g, z + width + k + p, l - g);
            ui.line(z + k + p, l + g, z + k + p, l + height + g);
            ui.line(z + width + k + p, l - g, z + width + k + p, l + height - g);
            ui.line(z + k + p, l + height + g, z + width + k + p, l + height - g);
            
            //Coloring button
            float c;
            float d;
            for(int j = 0 ; j < height ; j++)
            {
                ui.line(z + k + p, l + g + j, z + width + k + p, l - g + j);
                c = map(j, 0, height, a4, b4);
                d = map(j, 0, height, e4, f4);
                ui.stroke(0, c, d);
            }

            //text of button
            float a = z + k + p;
            float b = l;
            for(int i = 0 ; i < Text1.length ; i ++){
                ui.textSize(30);
                ui.textAlign(PApplet.CENTER, PApplet.CENTER);
                ui.fill(255);
                ui.text(Text2[i], a + 75, b + 75);
                a = a + 36;
                b = b - 36 * g / 300;
                
            }
        }
    }


    public void render()
    {
        drawbutton1();
        drawbutton2();
        drawbutton3();
        drawbutton4();
        buttonBlinks();
        mouseOnTheLeft();
        mouseClicked();
        
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
        float p = sw / 5;
        
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

        //button3 blinks
        if ((ui.mouseX > z + k && ui.mouseX < z + width + k))
        {
			if ((ui.mouseY > l && ui.mouseY < l + height))
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

        //button4 blinks
        if ((ui.mouseX > z + k + p && ui.mouseX < z + width + k + p))
        {
			if ((ui.mouseY > l && ui.mouseY < l + height))
            {
         
                //The button blinks When the mouse on the button
                int i = 1;
                i = a4;
                a4 = b4;
                b4 = i;
                i = e4;
                e4 = f4;
                f4 = i;
            }
			
        }
    }

    Boolean flag = true;//diplay classic clock
    Boolean flag2 = false;//display electronic clock

    //select clock
    public void mouseClicked()
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
            flag = true;
            flag2 = false;
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
            flag = false;
            flag2 = true;
        }
    }

}