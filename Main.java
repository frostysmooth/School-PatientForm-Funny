/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mirabalp4;

/**
 *
 * @author Frostysmooth aka Justin Mirabal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private PatientForm frame;

     public Main()
     {
        frame = new PatientForm();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
     }

    public static void main(String[] args) {
        // TODO code application logic here
        Main app = new Main();
    }

}
