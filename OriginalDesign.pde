//Celena Chang, AP Computer Science, Block 3
boolean pressSun;
void setup()
{
  size(400,300);
  background(0);
  smooth();
  frameRate(5);
  stroke(0);
}

void draw ()
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

void sun()
{
	stroke(0);
  fill(255,255,0);
  ellipse(-50,150,175,175);
}

void mercury()
{
	int mercuryX=60;
	float mercuryY=150;
  fill(10,87,167);
  ellipse(mercuryX,mercuryY,5,5);
}

void venus()
{
  fill(250,100,0);
  ellipse(70,150,10,10);
}

void mars()
{
  fill(126,15,15);
  ellipse(85,150,8,8);
}

void earth()
{
  fill(90,175,216);
  ellipse(100,150,11,11);
}

void jupiter()
{
  fill(178,120,48);
  ellipse(175,150,50,50);
}

void saturn()
{
	stroke(0);
  fill(#F0C066);
  ellipse(240,150,35,35);
  stroke(255);
  strokeWeight(1.5);
	line(210,160,270,140);
}

void uranus()
{
	strokeWeight(1);
	stroke(0);
  fill(#A7F5FF);
  ellipse(300,150,20,20);
 	strokeWeight(0.5);
  stroke(255);
	line(300,135,300,165);
}

void neptune()
{
	stroke(0);
	strokeWeight(1);
  fill(#31C48F);
  ellipse(370,150,18,18);
}

