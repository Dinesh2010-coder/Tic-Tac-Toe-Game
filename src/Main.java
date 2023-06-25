import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    JFrame jf;
    JButton jb1;
    JButton jb2;
    JButton jb3;
    JButton jb4;
    JButton jb5;
    JButton jb6;
    JButton jb7;
    JButton jb8;
    JButton jb9;
    int count = 0;
    String str = "";
    boolean flag = false;
    Main(){
        jf = new JFrame("Tic Tac Toe Game By Dinesh");
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);   // it will open the jframe window in center of the screen
        jf.setLayout(new GridLayout(3,3));    // it will automatically set all the buttons in rows and cols format

        jf.setVisible(true);

        jb1 = new JButton();
        jb1.addActionListener(this);
        jf.add(jb1);

        jb2 = new JButton();
        jb2.addActionListener(this);
        jf.add(jb2);

        jb3 = new JButton();
        jb3.addActionListener(this);
        jf.add(jb3);

        jb4 = new JButton();
        jb4.addActionListener(this);
        jf.add(jb4);

        jb5 = new JButton();
        jb5.addActionListener(this);
        jf.add(jb5);

        jb6 = new JButton();
        jb6.addActionListener(this);
        jf.add(jb6);

        jb7 = new JButton();
        jb7.addActionListener(this);
        jf.add(jb7);

        jb8 = new JButton();
        jb8.addActionListener(this);
        jf.add(jb8);

        jb9 = new JButton();
        jb9.addActionListener(this);
        jf.add(jb9);
    }
    public static void main(String[] args) {
        new Main();
    }

    public void actionPerformed(ActionEvent e){
        count = count + 1 ;
        if (count%2 == 0){
            str = "X";
        }else{
            str = "0";
        }

        if(e.getSource() == jb1){
            jb1.setText(str);
            jb1.setFont(new Font("Arial", 1, 30));
            jb1.setEnabled(false);
        }

        if (e.getSource() == jb2){
            jb2.setText(str);
            jb2.setFont(new Font("Arial", 1, 30));
            jb2.setEnabled(false);
        }

        if (e.getSource() == jb3){
            jb3.setText(str);
            jb3.setFont(new Font("Arial", 1, 30));
            jb3.setEnabled(false);
        }

        if (e.getSource() == jb4){
            jb4.setText(str);
            jb4.setFont(new Font("Arial", 1, 30));
            jb4.setEnabled(false);
        }

        if (e.getSource() == jb5){
            jb5.setText(str);
            jb5.setFont(new Font("Arial", 1, 30));
            jb5.setEnabled(false);
        }

        if (e.getSource() == jb6){
            jb6.setText(str);
            jb6.setFont(new Font("Arial", 1, 30));
            jb6.setEnabled(false);
        }

        if (e.getSource() == jb7){
            jb7.setText(str);
            jb7.setFont(new Font("Arial", 1, 30));
            jb7.setEnabled(false);
        }

        if (e.getSource() == jb8){
            jb8.setText(str);
            jb8.setFont(new Font("Arial", 1, 30));
            jb8.setEnabled(false);
        }

        if (e.getSource() == jb9){
            jb9.setText(str);
            jb9.setFont(new Font("Arial", 1, 30));
            jb9.setEnabled(false);
        }

        winningPossibilities();
        whoWins();
    }

    void winningPossibilities(){
        if (jb1.getText() == jb2.getText() && jb2.getText() == jb3.getText() && jb1.getText()!=""){
            flag = true;
        }
        else if (jb4.getText() == jb5.getText() && jb5.getText() == jb6.getText() && jb4.getText()!=""){
            flag = true;
        }
        else if (jb7.getText() == jb8.getText() && jb8.getText() == jb9.getText() && jb7.getText()!=""){
            flag = true;
        }

        else if (jb1.getText() == jb4.getText() && jb4.getText() == jb7.getText() && jb1.getText()!=""){
            flag = true;
        }
        else if (jb2.getText() == jb5.getText() && jb5.getText() == jb8.getText() && jb2.getText()!=""){
            flag = true;
        }
        else if (jb3.getText() == jb6.getText() && jb6.getText() == jb9.getText() && jb3.getText()!=""){
            flag = true;
        }
        else if (jb1.getText() == jb5.getText() && jb5.getText() == jb9.getText() && jb1.getText()!=""){
            flag = true;
        }
        else if (jb3.getText() == jb5.getText() && jb5.getText() == jb7.getText() && jb3.getText()!=""){
            flag = true;
        }else{
            flag = false;
        }
    }

    void whoWins(){
        if (flag == true){
            JOptionPane.showMessageDialog(jf, str+ " wins");
            restartGame();
        }
        else if (count == 9){
            JOptionPane.showMessageDialog(jf, "Game is a Draw");
            restartGame();
        }
    }

    void restartGame(){
        int i = JOptionPane.showConfirmDialog(jf, "Do you want to restart the game? ");
        if (i==0){             // Yes
            jb1.setText("");
            jb1.setEnabled(true);

            jb2.setText("");
            jb2.setEnabled(true);

            jb3.setText("");
            jb3.setEnabled(true);

            jb4.setText("");
            jb4.setEnabled(true);

            jb5.setText("");
            jb5.setEnabled(true);

            jb6.setText("");
            jb6.setEnabled(true);

            jb7.setText("");
            jb7.setEnabled(true);

            jb8.setText("");
            jb8.setEnabled(true);

            jb9.setText("");
            jb9.setEnabled(true);

            count = 0;
            str = "";
            flag = false;
        }
        else if(i==1){             // No
            System.exit(0);         // it will close the JVM
        }

        else{                      // Cancel
            jb1.setEnabled(false);
            jb2.setEnabled(false);
            jb3.setEnabled(false);
            jb4.setEnabled(false);
            jb5.setEnabled(false);
            jb6.setEnabled(false);
            jb7.setEnabled(false);
            jb8.setEnabled(false);
            jb9.setEnabled(false);

        }
    }
}