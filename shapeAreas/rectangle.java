/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeareas;

public class rectangle extends abstractShape {

    public rectangle(double height, double base) {
        super(height, base);
    }
    
    @Override
    public double getArea() {
        return height * base;
    }
    
}
