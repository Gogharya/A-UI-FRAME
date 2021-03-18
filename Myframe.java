import java.awt.*;
import java.awt.event.*;
class Gui extends Frame{
    public static void main(String args[]){
        //creating a frame
        Frame frame = new Frame();
        frame.setTitle("my first frame");
        frame.setSize(420,420);
        frame.setBackground(Color.getHSBColor(34,7,3));
        frame.setVisible(true);
        frame.addWindowListener(new Myclass());
    }
}
class Myclass implements WindowListener{
    public void windowActivated(WindowEvent e){}
    public void windowClosed (WindowEvent e){}
    public void windowClosing (WindowEvent e){
        System.exit(0);
    }
    public void windowDeactivated(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
}