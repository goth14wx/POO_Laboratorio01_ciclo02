/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesAnimales;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import runnable.jOptionp;

/**
 *
 * @author monica
 */
public class Animal {
    
    public String nombre;
    public String color;
    public String especie;
    
    public void moverse(){
        JOptionPane.showMessageDialog(null,"MOVIENDOSE, si el animal tiene locomocion");
    }
    
    public void hacerRuido(String pathFile){
        //https://stackoverflow.com/questions/6045384/playing-mp3-and-wav-in-java
        jOptionp optionPaneCustomRunnable = new jOptionp(this.nombre);
        Thread optionPaneThread = new Thread(optionPaneCustomRunnable);
        optionPaneThread.start(); // el thread es para que se pueda mostrar el jOptionPane y para que el condigo sea asincronico
        //https://ricardogeek.com/como-definir-y-ejecutar-threads-en-java/
        try {
            Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
            File file = new File(path + pathFile);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
        
        }
    }
    
}
