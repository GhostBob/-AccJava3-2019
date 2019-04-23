/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notservlets;

public class Calculator {
    private double total = 0.0;
    
    public void add(double value) {
        total += value;
    }
    
    public void subtract(double value) {
        total -= value;
    }
    
    public void multiply(double value) {
        total *= value;
    }
    
    public void divide(double value) {
        total /= value;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
