/*RecSub
 This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 12

# Problem: 1

# Date: 11/24/21 

# Summary: Rectangle

#  	Problem 1
	Write a superclass encapsulating a rectangle. A rectangle has two attributes
	representing the width and the height of the rectangle. It has methods returning
	the perimeter and the area of the rectangle. This class has a subclass, encapsulating
	a parallelepiped, or box. A parallelepiped has a rectangle as its base, and
	another attribute, its length; it has two methods that calculate and return
	its area and volume. You also need a client class to test these two classes. (10 points)


*/
package Rectangle;
import java.util.Scanner;
//parallelepiped or Rhombohedron or box all are equivalent to a degree but a parallelipid is indeed a fancy term for a rhombohedron 
public class Rhombohedron extends Rectangle
{
    public double length;
    
    public double surfaceArea(double width, double height,double length)
    {
        double area = (2*width*height) + (2*width*length) + (2*height*length);
        return area;
    }
    public double volume(double width,double height,double length)
    {
        double volume = width*height*length;
        return volume;
    }
}