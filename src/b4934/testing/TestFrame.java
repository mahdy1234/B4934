package b4934.testing;

import b4934.systemutils.GameObject;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame extends JFrame {
    
    JButton play;
    JButton stop;
    GameObject player;
    
    public TestFrame() {
        setBackground(Color.yellow);
        setSize(800, 400);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        
    }
    
    private void initComponents() {
        play = new JButton("Play");
        play.setLocation(400, 50);
        play.setSize(100, 100);
        play.setPreferredSize(new Dimension(100, 100));
        play.addActionListener((al) -> {
            player.setIsMoving(true);
        });
        add(play);
        
        stop = new JButton("Stop");
        stop.setLocation(400, 200);
        stop.setSize(60, 60);
        stop.setPreferredSize(new Dimension(100, 100));
        stop.addActionListener((al) -> {
            player.setIsMoving(false);
        });
        add(stop);
        
        player = new GameObject(308, 538, "player/", 10);
        player.setLocation(50, 50);
        add(player);
    }
    
}
