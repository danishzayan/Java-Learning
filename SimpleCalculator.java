import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {
  TextField textField1, textField2, textField3;
  Button btn1, btn2, btn3, btn4;
  Label label1, labe2, label3;

  SimpleCalculator() {

    setTitle("Simple Calculator");

    Color c1 = new Color(245,245,245);
    Color c2 = new Color(0,255,255);
    Color c3 = new Color	(255,215,0);
    Color c4 = new Color(144, 238, 144);
    Color c5 = new Color(139,69,19);

    textField1 = new TextField();
    textField1.setFont(new Font("Raleway", Font.BOLD, 20));
    textField1.setBounds(50, 50, 150, 30);
    textField1.setBackground(c1);

    textField2 = new TextField();
    textField2.setFont(new Font("Raleway", Font.BOLD, 20));
    textField2.setBounds(50, 100, 150, 30);
    textField2.setBackground(c1);

    textField3 = new TextField();
    textField3.setFont(new Font("Raleway", Font.BOLD, 20));
    textField3.setBounds(50, 150, 150, 30);
    textField3.setEditable(false);

    btn1 = new Button("+");
    btn1.setFont(new Font("Raleway", Font.BOLD, 20));
    btn1.setBounds(50, 200, 60, 30);
    btn1.setBackground(c2);

    btn2 = new Button("-");
    btn2.setFont(new Font("Raleway", Font.BOLD, 20));
    btn2.setBounds(120, 200, 60, 30);
    btn2.setBackground(c4);

    btn3 = new Button("x");
    btn3.setFont(new Font("Raleway", Font.BOLD, 20));
    btn3.setBounds(50, 260, 60, 30);
    btn3.setBackground(c3);

    btn4 = new Button("/");
    btn4.setFont(new Font("Raleway", Font.BOLD, 20));
    btn4.setBounds(120, 260, 60, 30);
    btn4.setBackground(c5);

    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    btn4.addActionListener(this);

    add(textField1);
    add(textField2);
    add(textField3);
    add(btn1);
    add(btn2);
    add(btn3);
    add(btn4);

    setSize(300, 300);
    setLayout(null);
    setVisible(true);

    Color bg = new Color(255,0,255);
    setBackground(bg);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        dispose();
      }
    });

  }

  public void actionPerformed(ActionEvent e) {
    String s1 = textField1.getText();
    String s2 = textField2.getText();

    int a = Integer.parseInt(s1);
    int b = Integer.parseInt(s2);
    int c = 0;

    if (e.getSource() == btn1) {
      c = a + b;
    } else if (e.getSource() == btn2) {
      c = a - b;
    }
    else if (e.getSource() == btn3) {
      c = a * b;
    }
    else if (e.getSource() == btn4) {
      c = a / b;
    }
    String result = String.valueOf(c);
    textField3.setText(result);
  }

  public static void main(String[] args) {
    new SimpleCalculator();
  }
}