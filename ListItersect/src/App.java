import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

public class App {
    private JPanel panelMain;
    private JButton runButton;
    private JTextField numElemSetA;
    private JTextField maxNumberSetA;
    private JTextField numElemSetB;
    private JTextField maxNumberSetB;
    private JComboBox comboBox1;
    private JTextArea matchedTextArea;
    private JTextArea executionTextArea;
    private IntersectHelper myIntersect;

    public App() {

        comboBox1.addItem("Set A");
        comboBox1.addItem("Set B");
        numElemSetA.setText("10000");
        numElemSetB.setText("10000");
        maxNumberSetA.setText("50000");
        maxNumberSetB.setText("50000");

        myIntersect = new IntersectHelper();

        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int nSetA, nSetB, maxSetA, maxSetB;
                nSetA = nSetB = maxSetA = maxSetB = -1;
                String setToBeHashed = "";
                try {
                    nSetA = Integer.parseInt(numElemSetA.getText());
                    nSetB = Integer.parseInt(numElemSetB.getText());
                    maxSetA = Integer.parseInt(maxNumberSetA.getText());
                    maxSetB = Integer.parseInt(maxNumberSetB.getText());
                    setToBeHashed = comboBox1.getSelectedItem().toString();
                }

                catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please, set the numbers properly!");
                    return;
                }

                // In this case, the set A will be our hashSet and set B will be our Array
                if (setToBeHashed.equals("Set A")) {
                    myIntersect.fillArray(nSetB,maxSetB);
                    myIntersect.fillHashset(nSetA,maxSetA);
                }
                // The opposite
                else {
                    myIntersect.fillHashset(nSetB,maxSetB);
                    myIntersect.fillArray(nSetA,maxSetA);
                }

                long execTime = myIntersect.calcIntersection();
                HashSet myHashSetInter = myIntersect.getResultIntersect();

                matchedTextArea.setText("There are " + myHashSetInter.size() + " numbers that are in both sets");
                executionTextArea.setText("It took " + execTime + " milliseconds");

                myIntersect.reset();

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
