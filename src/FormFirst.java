import javax.swing.*;

public class FormFirst {
    private JTextField nama;
    private JTextField nim;
    private JTextField prodi;
    private JPanel mainPanel;

    public static void main(String[] args) {
        FormFirst formFirst = new FormFirst();

        JFrame jFrame = new JFrame("FormFirst");
        jFrame.setContentPane(formFirst.mainPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
