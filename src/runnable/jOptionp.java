/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnable;

import javax.swing.JOptionPane;

/**
 *
 * @author monica
 */
public class jOptionp implements Runnable{

    public String name;
    
    @Override
    public void run() {
        JOptionPane.showMessageDialog(null,"Haciendo sonidos el animal: "+this.name);
    }

    public jOptionp(String name) {
     this.name = name;
    }
    
    
    
}
