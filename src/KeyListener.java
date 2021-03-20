import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class KeyListener implements java.awt.event.KeyListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    public KeyListener(){

        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel("Morse Practice  @ = ', ? = Shift");

        frame.addKeyListener(this);
        frame.setSize(400,100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.add(label);
        frame.setVisible(true);

    }

    @Override
    public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

        System.out.println(key);

        switch (key){

            //Punctuation marks
            case 44:
                play(",.wav");
                break;
            case 46:
                play("..wav");
                break;
            case 47:
                play("Slash.wav");
                break;
            case 222:
                play("@.wav");
                break;
            case 16:
                play("QMark.wav");
                break;
            case 61:
                play("=.wav");
                break;


            //Numbers
            case 48:
                play("0.wav");
                break;
            case 49:
                play("1.wav");
                break;
            case 50:
                play("2.wav");
                break;
            case 51:
                play("3.wav");
                break;
            case 52:
                play("4.wav");
                break;
            case 53:
                play("5.wav");
                break;
            case 54:
                play("6.wav");
                break;
            case 55:
                play("7.wav");
                break;
            case 56:
                play("8.wav");
                break;
            case 57:
                play("9.wav");
                break;




            //Letters
            case 65:
                play("A.wav");
                break;
            case 66:
                play("B.wav");
                break;
            case 67:
                play("C.wav");
                break;
            case 68:
                play("D.wav");
                break;
            case 69:
                play("E.wav");
                break;
            case 70:
                play("F.wav");
                break;
            case 71:
                play("G.wav");
                break;
            case 72:
                play("H.wav");
                break;
            case 73:
                play("I.wav");
                break;
            case 74:
                play("J.wav");
                break;
            case 75:
                play("K.wav");
                break;
            case 76:
                play("L.wav");
                break;
            case 77:
                play("M.wav");
                break;
            case 78:
                play("N.wav");
                break;
            case 79:
                play("O.wav");
                break;
            case 80:
                play("P.wav");
                break;
            case 81:
                play("Q.wav");
                break;
            case 82:
                play("R.wav");
                break;
            case 83:
                play("S.wav");
                break;
            case 84:
                play("T.wav");
                break;
            case 85:
                play("U.wav");
                break;
            case 86:
                play("V.wav");
                break;
            case 87:
                play("W.wav");
                break;
            case 88:
                play("X.wav");
                break;
            case 89:
                play("Y.wav");
                break;
            case 90:
                play("Z.wav");
                break;

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void play(String filename)
    {
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(filename)));
            clip.start();
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }
}
