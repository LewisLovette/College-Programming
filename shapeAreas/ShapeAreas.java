/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeareas;

/**
 *
 * @author lewis
 */
public class ShapeAreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rectangle r1 = new rectangle(4.5, 3);
        
        System.out.println("The area of the rectangle is: "+r1.getArea());
    }
    
}
