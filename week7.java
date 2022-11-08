import processing.video.*;
ArrayList<Capture> c = new ArrayList<Capture>();
int i =0;
PImage p;

void setup(){
   
size(800,800);
int l = 400;

while(l!=1){
color mycolor = color(random(255),random(255),random(255));
  c.add(new Capture(this,l,l));//creates a new image to capture
  for(int k = 0;k< c.get(i).width;k=k+2){
  c.get(i).pixels[(int)random(k)] = mycolor;
  }
 l=l/2;//shrinks the image
 i++;//next image
}

}
int j =0;
void draw(){

 
   c.get(j).start();
c.get(j).read();
c.get(j).loadPixels();// loads the pixels

image(c.get(j),random(500),random(500));// outputs the image

j++;
if(j == i){
  j = 0;
}

}
