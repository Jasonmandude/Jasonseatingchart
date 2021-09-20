import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * JasonZhang class for student Jason
 *
 * @author Jason
 * @v1 9/9/2021
 */

/** ========= add to classroom class ==========
JasonZhang jasonzhang = new JasonZhang();
addObject(jasonzhang,9,10);
jasonzhang.assignSeat();
===============================================
**/

public class JasonZhang extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the class.
     */
    public JasonZhang(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".png";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+lastName.toLowerCase()+"-standing.png";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public JasonZhang() {
        firstName="Jason";
        lastName="Zhang";
        mySeatX=1;
        mySeatY=1;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".png";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.png";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }

     /**
     * Act - do whatever the actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                sitting=false;
                setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
                myHobby("I like cars :)");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
                moveIt();  // special method
                sitDown();
            }

    }

    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    /**
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */


    /**
     * This is a local method specific to the KilgoreTrout class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
     public void moveIt(){
         run();
         run();
         run();
         returnToSeat();
     }
     /**
     * myHobby is one of the interfaces provided.
     * An interface is just a contract for the methods that you will implement in your code.  The College Board no longer
     * tests on abstract classes and interfaces, but it is good to know about them
     */
     private void run() {
       int x1 = getX();
       int x2 = getY();
       int xpos = getWorld().getWidth()/2;
       int ypos = getWorld().getHeight()/2;
       setLocation(xpos, ypos);
       // move right
       for (int i=1;i<=3;i++){
           setLocation(getX() + 1, getY());
           Greenfoot.delay(1);
       }
       // move down
       for (int i=1;i<=3;i++){
           setLocation(getX(), getY() + 1);
           Greenfoot.delay(1);
       }
       //move left
       for (int i=1;i<=3;i++){
           setLocation(getX() - 1, getY());
           Greenfoot.delay(1);
       }
       //move up
       for (int i=1;i<=3;i++){
           setLocation(getX(), getY() - 1);
           Greenfoot.delay(1);
       }
       //inverse of ^
       for (int i=1;i<=3;i++){
           setLocation(getX() - 1, getY());
           Greenfoot.delay(1);
       }
       for (int i=1;i<=3;i++){
           setLocation(getX(), getY() + 1);
           Greenfoot.delay(1);
       }
       for (int i=1;i<=3;i++){
           setLocation(getX() + 1, getY());
           Greenfoot.delay(1);
       }
       for (int i=1;i<=3;i++){
           setLocation(getX(), getY() - 1);
           Greenfoot.delay(1);
       }
       //move up & back
       for (int i=1;i<=5;i++){
           setLocation(getX(), getY() - 1);
           Greenfoot.delay(1);
       }
       for (int i=1;i<=5;i++){
           setLocation(getX(), getY() + 1);
           Greenfoot.delay(1);
       }
       Greenfoot.delay(10);
       setLocation(x1, x2);
       Greenfoot.delay(10);
     }
     public void myHobby(String s) {
         System.out.println(s);
}

}
