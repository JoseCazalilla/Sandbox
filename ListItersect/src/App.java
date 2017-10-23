import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel panelMain;
    private JButton runButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JTextArea matchedTextArea;
    private JTextArea executionTextArea;
    private JButton buttonRun;

    public App() {

        comboBox1.addItem("Set A");
        comboBox1.addItem("Set B");

        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                matchedTextArea.setText(comboBox1.getSelectedItem().toString());
            }
        });
    }

    public static void main(String[] args) {



        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,400);
        frame.setVisible(true);
    }
}
