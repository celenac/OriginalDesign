import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

//Celena Chang, AP Computer Science, Block 3
boolean pressSun;
public void setup()
{
  size(400,300);
  background(0);
  smooth();
  frameRate(5);
  stroke(0);
}

public void draw ()
{
	stroke(0);
background(0);
 sun();
 mercury();
 venus();
 mars();
 earth();
 jupiter();
 saturn();
 uranus();
 neptune();
}

public void sun()
{
	stroke(0);
  fill(255,255,0);
  ellipse(-50,150,175,175);
}

public void mercury()
{
	int mercuryX=60;
	float mercuryY=150;
  fill(10,87,167);
  ellipse(mercuryX,mercuryY,5,5);
}

public void venus()
{
  fill(250,100,0);
  ellipse(70,150,10,10);
}

public void mars()
{
  fill(126,15,15);
  ellipse(85,150,8,8);
}

public void earth()
{
  fill(90,175,216);
  ellipse(100,150,11,11);
}

public void jupiter()
{
  fill(178,120,48);
  ellipse(175,150,50,50);
}

public void saturn()
{
	stroke(0);
  fill(0xffF0C066);
  ellipse(240,150,35,35);
  stroke(255);
  strokeWeight(1.5f);
	line(210,160,270,140);
}

public void uranus()
{
	strokeWeight(1);
	stroke(0);
  fill(0xffA7F5FF);
  ellipse(300,150,20,20);
 	strokeWeight(0.5f);
  stroke(255);
	line(300,135,300,165);
}

public void neptune()
{
	stroke(0);
	strokeWeight(1);
  fill(0xff31C48F);
  ellipse(370,150,18,18);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
