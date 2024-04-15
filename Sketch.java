import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(1000, 700);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
    // Allows window to be resized
    surface.setResizable(true);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Declare Variables
    double space; // variable to help space items
    int intX; // x coordinate of object to be printed
    int intY; // y coordinate of object to be printed
    int intGapX; // gap between columns
    int intGapY; // gap between rows

    // prints design
    fill(123,254,93);
    rect(0,0,width,height);// resets background
    
    // Sets Variables
    space = spacing(400 / 7 * 2, 350 / 7 * 2, 20, 15);
    intGapX = (int)(space / 10000.);
    intGapY = (int)(space % 1000);
    intX = intGapX;
    intY = intGapY;
    
    // Prints Grid
    fill(0);
    for (int i = 1; i <= (int)(space * 1000) % 1000; i++){ // column
      intY = intGapY; // resets y value

      for (int n = 1; n <= (int)(Math.round((space % 1 * 1000000) % 1000)); n++){ // row
        if ((i + n) % 2 == 0){
          pig(intX, intY, intX * 255 / width, intY * 255 / height, 255 - intX * 255 / height);
        }
        intY += intGapY + (350 / 7 * 2);        
      }
      intX += intGapX + (400 / 7 * 2);
    }
    
    space = spacing(485, 120, 15, 0);
    intGapX = (int)(space / 10000.);
    intGapY = (int)(space % 1000);
    intX = intGapX;
    intY = intGapY;
    
    // Prints Grid
    for (int i = 1; i <= (int)(space * 1000) % 1000; i++){ // column
      intY = intGapY; // resets y value

      for (int n = 1; n <= (int)(Math.round((space % 1 * 1000000) % 1000)); n++){ // row
        //if ((i + n) % 2 == 1){
          clock(intX, intY);
        //}
        intY += intGapY + 120;        
      }
      intX += intGapX + 485;
    }

  }

  /**
   * prints a pig at the given coordinates
   * @param X-coordinate 
   * @param Y-coordinate 
   * @param amount of red in eye and nose
   * @param amount of green in eye and nose
   * @param amount of blue in eye and nose
   * @author George D.
   */
  private void pig(int intX, int intY, int intR, int intG, int intB){
    stroke(0);
    // Ears and Head
    fill(255,204,229);
    triangle(25 / 7 * 2 + intX, 100 / 7 * 2 + intY, 380 / 7 * 2 + intX, 160 / 7 * 2 + intY, 5 / 7 * 2 + intX, intY);
    triangle(375 / 7 * 2 + intX, 100 / 7 * 2 + intY, 10 / 7 * 2 + intX, 160 / 7 * 2 + intY, 395 / 7 * 2 + intX, intY);
    ellipse(200 / 7 * 2 + intX, 200 / 7 * 2 + intY, 400 / 7 * 2, 350 / 7 * 2);

    // Nose
    fill(255, 160, 230);
    ellipse(200 / 7 * 2 + intX, 275 / 7 * 2 + intY, 251 / 7 * 2, 175 / 7 * 2);
    fill(intR, intG, intB);
    ellipse(150 / 7 * 2 + intX, 275 / 7 * 2 + intY, 75 / 7 * 2, 75 / 7 * 2);
    ellipse(250 / 7 * 2 + intX, 275 / 7 * 2 + intY, 75 / 7 * 2, 75 / 7 * 2);

    // Left Eye
    fill(255);
    ellipse(130 / 7 * 2 + intX, 125 / 7 * 2 + intY, 85 / 7 * 2, 110 / 7 * 2);
    ellipse(270 / 7 * 2 + intX, 125 / 7 * 2 + intY, 85 / 7 * 2, 110 / 7 * 2);
    fill(intR, intG, intB);
    rect(107 / 7 * 2 + intX, 95 / 7 * 2 + intY, 46 / 7 * 2, 60 / 7 * 2);
    beginShape();
    vertex(130 / 7 * 2 + intX, 170 / 7 * 2 + intY);
    vertex(99 / 7 * 2 + intX, 125 / 7 * 2 + intY);
    vertex(130 / 7 * 2 + intX, 80 / 7 * 2 + intY);
    vertex(161 / 7 * 2 + intX, 125 / 7 * 2 + intY);
    endShape(CLOSE);
    rect(115 / 7 * 2 + intX, 102 / 7 * 2 + intY, 30 / 7 * 2, 46 / 7 * 2);
    beginShape();
    vertex(130 / 7 * 2 + intX, 102 / 7 * 2 + intY);
    vertex(115 / 7 * 2 + intX, 125 / 7 * 2 + intY);
    vertex(130 / 7 * 2 + intX, 148 / 7 * 2 + intY);
    vertex(145 / 7 * 2 + intX, 125 / 7 * 2 + intY);
    endShape(CLOSE);
    rect(123 / 7 * 2 + intX, 114 / 7 * 2 + intY, 15 / 7 * 2, 21 / 7 * 2); 
    
    // Right Eye
    rect(247 / 7 * 2 + intX, 95 / 7 * 2 + intY, 46 / 7 * 2, 60 / 7 * 2);
    beginShape();
    vertex(270 / 7 * 2 + intX, 170 / 7 * 2 + intY);
    vertex(239 / 7 * 2 + intX, 125 / 7 * 2 + intY);
    vertex(270 / 7 * 2 + intX, 80 / 7 * 2 + intY);
    vertex(301 / 7 * 2 + intX, 125 / 7 * 2 + intY);
    endShape(CLOSE);
    rect(255 / 7 * 2 + intX, 102 / 7 * 2 + intY, 30 / 7 * 2, 46 / 7 * 2);
    beginShape();
    vertex(270 / 7 * 2 + intX, 102 / 7 * 2 + intY);
    vertex(255 / 7 * 2 + intX, 125 / 7 * 2 + intY);
    vertex(270 / 7 * 2 + intX, 148 / 7 * 2 + intY);
    vertex(285 / 7 * 2 + intX, 125 / 7 * 2 + intY);
    endShape(CLOSE);  
    rect(263 / 7 * 2 + intX, 114 / 7 * 2 + intY, 15 / 7 * 2, 21 / 7 * 2);  
  }
  
  /**
   * determins how many times to print a given image and with how much spacing
   * @param width of design
   * @param height of design
   * @param min gap in height
   * @param min gap in x
   * @param returns desired values encoded in a float
   * @param Created by George D.
   */
  private double spacing(int intWidth, int intHeight, int intMinGapX, int intMinGapY){
    // Declare Variables
    int column; // number of columns
    int row; // number of columns
    int columnGap; // ideal gap between columns
    int rowGap; // ideal gap between rows
    double answer; // encoded return value

    // Calculation area
    column = (int)((width - intMinGapX) / (intWidth + intMinGapX));
    row = (int)((height - intMinGapY) / (intHeight + intMinGapY));
    columnGap = (int)((width - (column * intWidth)) / (column + 1.0));
    rowGap = (int)((height - row * intHeight) / (row + 1.0));

    // Stores calculations in a float
    answer = row / 1000000. + column / 1000. + rowGap + columnGap * 10000.;
    return answer;
  }
  
  /**
   * prints a number in a seven segment display at a specified coordinate
   * @param intDigitX x coordinate
   * @param intDigitY y coordinate
   * @param intDigit digit to print
   * @author George D.
   */
  private void time(int intDigitX, int intDigitY, int intDigit){ // prints out a digit
    // Sets color to black
    fill(255 - intDigitX * 255 / width, 255 - intDigitY * 255 / height, intDigitX * 255 / height);
    // Sets outline to blue
    stroke(intDigitX * 255 / width, intDigitY * 255 / height, intDigitX * 255 / height);
    // top segment
    if ((intDigit != 1) && (intDigit != 4)){
      beginShape();
      vertex(intDigitX + 5, intDigitY);
      vertex(intDigitX + 55, intDigitY);
      vertex(intDigitX + 50, intDigitY + 5);
      vertex(intDigitX + 10, intDigitY + 5);
      endShape(CLOSE);
    }
    // left top segment
    if (((intDigit != 1) && (intDigit != 2)) && ((intDigit != 3) && ( intDigit != 7))){
      beginShape();
      vertex(intDigitX, intDigitY + 5);
      vertex(intDigitX, intDigitY + 55);
      vertex(intDigitX + 5, intDigitY + 50);
      vertex(intDigitX + 5, intDigitY + 10);
      endShape(CLOSE);
    }
    // right top segment
    if ((intDigit != 5) && (intDigit !=  6)){
      beginShape();
      vertex(intDigitX + 60, intDigitY + 5);
      vertex(intDigitX + 60, intDigitY + 55);
      vertex(intDigitX + 55, intDigitY + 50);
      vertex(intDigitX + 55, intDigitY + 10);
      endShape(CLOSE);
    }
    // left bottom segment
    if (((intDigit == 2) || (intDigit == 6)) || ((intDigit == 8) || ( intDigit == 0))){
      beginShape();
      vertex(intDigitX, intDigitY + 65);
      vertex(intDigitX, intDigitY + 115);
      vertex(intDigitX + 5, intDigitY + 110);
      vertex(intDigitX + 5, intDigitY + 70);
      endShape(CLOSE);
    }
    // right bottom segment
    if (intDigit != 2){
      beginShape();
      vertex(intDigitX + 60, intDigitY + 65);
      vertex(intDigitX + 60, intDigitY + 115);
      vertex(intDigitX + 55, intDigitY + 110);
      vertex(intDigitX + 55, intDigitY + 70);
      endShape(CLOSE);
    }
    // bottom segment
    if (((intDigit != 1) && (intDigit != 4)) && ((intDigit != 7) && ( intDigit != 9))){
      beginShape();
      vertex(intDigitX + 5, intDigitY + 120);
      vertex(intDigitX + 55, intDigitY + 120);
      vertex(intDigitX + 50, intDigitY + 115);
      vertex(intDigitX + 10, intDigitY + 115);
      endShape(CLOSE);
    }
    // middle segment
    if ((intDigit != 1) && ((intDigit != 7) && ( intDigit != 0))){
      beginShape();
      vertex(intDigitX + 5, intDigitY + 60);
      vertex(intDigitX + 10, intDigitY + 65);
      vertex(intDigitX + 50, intDigitY + 65);
      vertex(intDigitX + 55, intDigitY + 60);
      vertex(intDigitX + 50, intDigitY + 55);
      vertex(intDigitX + 10, intDigitY + 55);
      endShape(CLOSE);
    }    
  }
  
  /**
   * prints the current time at a specified coordinate
   * @param intX x coordinate
   * @param intY y coordinate
   * @author George D.
   */
  private void clock(int intX, int intY){     // Prints out a clock at a specified coordinate
    time(intX, intY, hour() / 10);
    time(intX + 75, intY, hour() % 10);
    ellipse(intX + 155, intY + 30, 6, 6);
    ellipse(intX + 155, intY + 90, 6, 6);
    time(intX + 175, intY, minute() / 10);
    time(intX + 250, intY, minute() % 10);
    ellipse(intX + 330, intY + 30, 6, 6);
    ellipse(intX + 330, intY + 90, 6, 6);
    time(intX + 350, intY, second() / 10);
    time(intX + 425, intY, second() % 10);
  }
  
}