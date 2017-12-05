/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import javax.swing.JFrame;

/**
 *
 * @author spardo
 */
public class ViewManager {
    
    private static JFrame currentView;

    public static void changeView(JFrame view) {
        view.setVisible(true);
        currentView.dispose();
        currentView = view;
    }

    public static void setVisible(JFrame view) {
        view.setVisible(true);
        currentView = view;
    } 
    
    public static void close(){
        currentView.dispose();
    }
    
}
