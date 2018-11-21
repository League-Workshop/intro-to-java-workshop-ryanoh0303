PImage backgroundImage;

int x=40;
int y=400;
int ballxSpeed=10;
int ballySpeed=10;
int x2=250;
int y2=750;

void setup(){
 size(800,800);
 backgroundImage=loadImage("blackout-trailer-poster-resize-1200x0-70.jpg");
 backgroundImage.resize(width,height);
  
}


  





void draw(){
  background(backgroundImage);
  stroke(192,129,239);
  fill(0,51,170);
  ellipse(x,y,75,75);
  fill(255,0,0);
  rect(x2,750,330,50);
  x2=mouseX;

if(x==width){
 ballxSpeed=-ballxSpeed;
 x=x+ballxSpeed;
  
}
else if(x==0){
  ballxSpeed=-ballxSpeed;
  x=x+ballxSpeed;
}

else if(y==height){
 ballySpeed=-ballySpeed;
 y=y+ballySpeed;
}
else if(y==0){
 ballySpeed=-ballySpeed;
 y=y+ballySpeed;
  
}
else{
  x=x+ballxSpeed;
  y=y+ballySpeed;
  
}
if(x=x2 & y=y2){
  ballySpeed=-ballySpeed;
  y=y+ballySpeed;
          
}
}