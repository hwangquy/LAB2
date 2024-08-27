/*
 * @(#) Exer1.java 1.0 27/08/2024
 *
 * Copyright (c) 2024 IUH
 */

package iuh.fit.se;

/*
 * @description: This class represents a bank with many bank accounts
 * @author : Nguyen Huy Hoang
 * @version 1.0
 * @created :27-Aug-2024 10:41:50 AM
 */
public class TestRectangle {
    public static void main(String[] args) {
        //Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20.5,5.0);
        System.out.println("Length r2: "+r2.getLength());
        System.out.println("Width  r2: "+r2.getWidth());
        System.out.println("Area  r2: "+r2.getArea());
        System.out.println("Perimeter r2: "+r2.getPerimeter());
    }
}
