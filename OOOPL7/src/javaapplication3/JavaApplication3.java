/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author xszel
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punkt2D pierwszy = new Punkt2D();
        pierwszy.losowanie();
        System.out.println("" + pierwszy.toString());

        Punkt3D drugi = new Punkt3D();
        drugi.losowanie();
        System.out.println("" + drugi.toString());

        Punkt2D[] array2D = new Punkt2D[100];
        Punkt3D[] array3D = new Punkt3D[100];
        for (int i = 0; i < array2D.length; i++) {
            array2D[i] = new Punkt2D();
            array2D[i].losowanie();
            array3D[i] = new Punkt3D();
            array3D[i].losowanie();
        }
        // TODO code application logic here
    }

}
