package IMG;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author Luis
 */
public class Fondo extends javax.swing.JLabel {
    int x, y;
    
    public Fondo(JPanel Fondo) {
        this.x = Fondo.getWidth();
        this.y = Fondo.getHeight();
        this.setSize(x, y);
    }
    
    @Override
    public void paint(Graphics g) {
        ImageIcon Img = new ImageIcon(getClass().getResource("/IMG/fondo.jpg"));
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
    } 
}
