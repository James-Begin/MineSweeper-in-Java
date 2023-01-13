import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javafx.scene.layout.*;

public class sequenceGameInterface extends JFrame implements ActionListener
{
    sequenceGameCheck check = new sequenceGameCheck();
    
    JFrame frame = new JFrame();
    
    boolean started = false;
    JButton[] startButtons = new JButton[2];

    JButton[][] buttonGrid = new JButton[3][3];
    
    public void graphicInterface(){
        System.out.println(started);
        frame.setVisible(true);
        if(started == false){
            
            startButtons[0] = new JButton("Start");
            startButtons[1] = new JButton("Exit");
            
            
            startButtons[0].setBounds(300,300,200,200);
            startButtons[0].setBackground(new Color(37, 115, 193));
            startButtons[0].setBorderPainted(false);
            frame.add(startButtons[0]);
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800,825);
            frame.getContentPane().setBackground(new Color(43, 135, 209));
            frame.setLayout(null);
            frame.setVisible(true);
            
            startButtons[0].addActionListener(this);
            
        } else if(started == true){  
            startButtons[0].setVisible(false);
            
            for(int i = 0; i < buttonGrid.length; i++){
                for(int j = 0; j < buttonGrid.length; j++){
                    buttonGrid[i][j] = new JButton("");
                    buttonGrid[i][j].setBounds((j*250)+50,(i*250)+50,200,200);
                    buttonGrid[i][j].setBackground(new Color(37, 115, 193));
                    buttonGrid[i][j].setBorderPainted(false);
                    frame.add(buttonGrid[i][j]);
                    buttonGrid[i][j].addActionListener(this);
                }
            }
            
            frame.setSize(800,825);
            frame.getContentPane().setBackground(new Color(43, 135, 209));
            frame.setVisible(false);
            frame.setVisible(true);
        }
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startButtons[0]){
            started = true;
            graphicInterface();
        }
        int count = 1;
        for(int i = 0; i < buttonGrid.length; i++){
            for(int j = 0; j < buttonGrid.length; j++){
                if(e.getSource() == buttonGrid[i][j]){
                    check.check(count);
                }
                count += 1;
            }
        }
    }
   
    public void animation(ArrayList<Integer> order){
        
        for(int i = 0; i < order.size(); i++){
            
            switch(order.get(i)){
                case 1:
                    buttonGrid[0][0].setBackground(new Color(255, 255, 255));
                    break;
                case 2:
                    buttonGrid[0][1].setBackground(new Color(255, 255, 255));
                    break;
                case 3:
                    buttonGrid[0][2].setBackground(new Color(255, 255, 255));
                    break;
                case 4:
                    buttonGrid[1][0].setBackground(new Color(255, 255, 255));
                    break;
                case 5:
                    buttonGrid[1][1].setBackground(new Color(255, 255, 255));
                    break;
                case 6:
                    buttonGrid[1][2].setBackground(new Color(255, 255, 255));
                    break;
                case 7:
                    buttonGrid[2][0].setBackground(new Color(255, 255, 255));
                    break;
                case 8:
                    buttonGrid[2][1].setBackground(new Color(255, 255, 255));
                    break;
                case 9:
                    buttonGrid[2][2].setBackground(new Color(255, 255, 255));
                    break;
                }
            
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
                
                
                switch(order.get(i)){
                    case 1:
                        buttonGrid[0][0].setBackground(new Color(37, 115, 193));
                        break;
                    case 2:
                        buttonGrid[0][1].setBackground(new Color(37, 115, 193));
                        break;
                    case 3:
                        buttonGrid[0][2].setBackground(new Color(37, 115, 193));
                        break;
                    case 4:
                        buttonGrid[1][0].setBackground(new Color(37, 115, 193));
                        break;
                    case 5:
                        buttonGrid[1][1].setBackground(new Color(37, 115, 193));
                        break;
                    case 6:
                        buttonGrid[1][2].setBackground(new Color(37, 115, 193));
                        break;
                    case 7:
                        buttonGrid[2][0].setBackground(new Color(37, 115, 193));
                        break;
                    case 8:
                        buttonGrid[2][1].setBackground(new Color(37, 115, 193));
                        break;
                    case 9:
                        buttonGrid[2][2].setBackground(new Color(37, 115, 193));
                        break;
                }
            }
            
    }
   
}
