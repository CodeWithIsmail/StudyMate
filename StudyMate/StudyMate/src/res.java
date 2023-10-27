
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class res extends JFrame implements ActionListener {
    JPanel p1, p2, p3, p4;
    JLabel l1, l2, l3, l4, l5, l6;
    JComboBox comboBox;
    JButton b1;

    public res() {
        super("Grade report");
        this.setSize(1366, 768);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        p1 = new JPanel();
        p1.setBounds(186, 136, 982, 462);
        p1.setLayout(null);

        p2 = new JPanel();
        p2.setBackground(new Color(0, 128, 255));
        p2.setBounds(80, 124, 811, 65);
        p1.add(p2);
        p2.setLayout(null);

        l1 = new JLabel("Math");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        l1.setBounds(31, 11, 129, 43);
        p2.add(l1);

        l2 = new JLabel("(Total mark: 100, Pass mark: 33)");
        l2.setFont(new Font("Tahoma", Font.ITALIC, 14));
        l2.setBounds(92, 31, 373, 14);
        p2.add(l2);

        l3 = new JLabel("Select Subject: ");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 24));
        l3.setBounds(80, 45, 165, 48);
        p1.add(l3);

        String items[] = new String[]{"Math", "English", "Bangla", "Science", "Social Science", "Religious studies"};
        comboBox = new JComboBox(items);
        comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
        comboBox.setBounds(255, 52, 239, 41);
        comboBox.setSelectedIndex(0);
        comboBox.addActionListener(this);
        p1.add(comboBox);

        p3 = new JPanel();
        p3.setBackground(new Color(192, 192, 192));
        p3.setBounds(90, 200, 791, 48);
        p1.add(p3);
        p3.setLayout(null);

        l4 = new JLabel("MID TERM");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 24));
        l4.setBounds(10, 11, 132, 26);
        p3.add(l4);

        p4 = new JPanel();
        p4.setBackground(Color.LIGHT_GRAY);
        p4.setBounds(90, 259, 791, 48);
        p1.add(p4);
        p4.setLayout(null);

        l5 = new JLabel("FINAL TERM");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 24));
        l5.setBounds(10, 11, 152, 26);
        p4.add(l5);

        b1 = new JButton("Back");
        b1.setFont(new Font("Tahoma", Font.BOLD, 18));
        b1.setBounds(684, 364, 126, 41);
        b1.addActionListener(this);
        p1.add(b1);

        l6 = new JLabel("");
        l6.setIcon(new ImageIcon("C:\\Users\\Hasan Mahmud Shanto\\Downloads\\3d-render-low-poly-plexus-design-network-communications.jpg"));
        l6.setBounds(0, 0, 1350, 729);
        this.add(l6);


        l6.add(p1);
    }

    public void actionPerformed(ActionEvent a) {
//        if (a.getSource() == comboBox) {
//
//            if (comboBox.getSelectedItem() == "English") {
//                Engreport pg = new Engreport();
//                this.setVisible(false);
//                pg.setVisible(true);
//            } else if (comboBox.getSelectedItem() == "Bangla") {
//                banreport pg = new banreport();
//                this.setVisible(false);
//                pg.setVisible(true);
//            } else if (comboBox.getSelectedItem() == "Science") {
//                Scireport pg = new Scireport();
//                this.setVisible(false);
//                pg.setVisible(true);
//            } else if (comboBox.getSelectedItem() == "Social Science") {
//                socioscireport pg = new socioscireport();
//                this.setVisible(false);
//                pg.setVisible(true);
//            } else if (comboBox.getSelectedItem() == "Religious studies") {
//                religiousreport pg = new religiousreport();
//                this.setVisible(false);
//                pg.setVisible(true);
//            }
//        } else if (a.getSource() == b1) {
//            StudentPortal pg = new StudentPortal();
//            this.setVisible(false);
//            pg.setVisible(true);
//        }

    }
}
