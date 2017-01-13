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
public abstract class abstractShape {
    double height;
    double base;
    
    public abstractShape(double height, double base){
        this.height = height;
        this.base = base;
    }
    
    public abstract double getArea();
    
}
