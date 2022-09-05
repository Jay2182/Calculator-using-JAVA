import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {
    public static void main(String args[]) {
        new CalcFrame();
    }
}

class CalcFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	JTextField display;
    JLabel name;
	JButton btn[];
    JButton btnop[];
    JButton btnans;
    JButton btndot, btnce, btndel;

    String num1 = "";
    String num2 = "";
    String str = "";
    char operator = '#';
    boolean dotSet = false;
    
    public CalcFrame() {
        setComponents();
        setFrame();
        setBtnEvent();
    }

    public void setFrame() {
        // setLayout(new FlowLayout(FlowLayout.RIGHT,10,50));
        setLayout(null);
        setSize(300,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setComponents() {
        // component initialization
        display = new JTextField();
        name = new JLabel("By: Jay Kanjia");
        btn = new JButton[10];
        btnop = new JButton[4];

        btnans = new JButton("=");
        btndot = new JButton(".");
        btnce = new JButton("CE");
        btndel = new JButton("DEL");

        btnop[0] = new JButton("/");
        btnop[1] = new JButton("*");
        btnop[2] = new JButton("-");
        btnop[3] = new JButton("+");

        for(int i = 0; i < btn.length; i++) {
            btn[i] = new JButton(String.valueOf(i));
        }
        // end component initialization
        
        // set components
        display.setBounds(10,20,280,60);
		display.setFont(new Font("Arial", Font.BOLD, 30));
		display.setEditable(false);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		add(display);

        // row 1
        btnce.setBounds(10,100,130,60);
		add(btnce);
        btndel.setBounds(150,100,60,60);
		add(btndel);

        btnop[0].setBounds(230,100,60,60);
		add(btnop[0]);

        // row 2
        btn[7].setBounds(10,170,60,60);
		add(btn[7]);
        btn[8].setBounds(80,170,60,60);
		add(btn[8]);
        btn[9].setBounds(150,170,60,60);
		add(btn[9]);
        btnop[1].setBounds(230,170,60,60);
		add(btnop[1]);

        // row 3
        btn[4].setBounds(10,240,60,60);
		add(btn[4]);
        btn[5].setBounds(80,240,60,60);
		add(btn[5]);
        btn[6].setBounds(150,240,60,60);
		add(btn[6]);
        btnop[2].setBounds(230,240,60,60);
		add(btnop[2]);

        // row 4
        btn[1].setBounds(10,310,60,60);
		add(btn[1]);
        btn[2].setBounds(80,310,60,60);
		add(btn[2]);
        btn[3].setBounds(150,310,60,60);
		add(btn[3]);
        btnop[3].setBounds(230,310,60,60);
		add(btnop[3]);

        // row 5
        btndot.setBounds(10,380,60,60);
		add(btndot);
        btn[0].setBounds(80,380,60,60);
		add(btn[0]);

        btnans.setBounds(150,380,140,60);
		add(btnans);

        // name
        name.setBounds(200,440,100,30);
        add(name);
        // end set components
    }

    public void setBtnEvent() {
        btnce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                display.setText("");
                str = "";
                num1 = "";
                num2 = "";
                dotSet = false;
            }
        });
        btndel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(str.length() > 0) {
                    char last = str.charAt(str.length()-1);
                    if(last == '.')
                        dotSet = false;
                    str = str.substring(0,str.length()-1);
                    
                    if(last != '+' || last != '-' || last != '*' || last != '/')
                        num2 = num2.substring(0,num2.length()-1);
                    display.setText(str);
                }
            }
        });
        btn[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                str = str+"0";
                num2 = num2+"0";
                display.setText(str);
            }
        });
        btn[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                str = str+"1";
                num2 = num2+"1";
                display.setText(str);
            }
        });
        btn[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                str = str+"2";
                num2 = num2+"2";
                display.setText(str);
            }
        });
        btn[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                str = str+"3";
                num2 = num2+"3";
                display.setText(str);
            }
        });
        btn[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                str = str+"4";
                num2 = num2+"4";
                display.setText(str);
            }
        });
        btn[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                str = str+"5";
                num2 = num2+"5";
                display.setText(str);
            }
        });
        btn[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                str = str+"6";
                num2 = num2+"6";
                display.setText(str);
            }
        });
        btn[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                str = str+"7";
                num2 = num2+"7";
                display.setText(str);
            }
        });
        btn[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                str = str+"8";
                num2 = num2+"8";
                display.setText(str);
            }
        });
        btn[9].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                str = str+"9";
                num2 = num2+"9";
                display.setText(str);
            }
        });
        btndot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(!dotSet) {
                    str = str+".";
                    num2 = num2+".";
                    dotSet = true;
                }
                display.setText(str);
            }
        });
        btnop[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(str != "") {
                    operator = '/';
                    addOperator();
                    str = str+"/";
                    display.setText(str);
                    calculateAns();
                }
            }
        });
        btnop[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(str != "") {
                    operator = '*';
                    addOperator();
                    str = str+"*";
                    display.setText(str);
                    calculateAns();
                }
            }
        });
        btnop[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(str != "") {
                    operator = '-';
                    addOperator();
                    str = str+"-";
                    display.setText(str);
                    calculateAns();
                }
                else {
                    str = "-";
                }
            }
        });
        btnop[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(str != "") {
                    operator = '+';
                    addOperator();
                    str = str+"+";
                    display.setText(str);
                    calculateAns();
                }
            }
        });
        btnans.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculateAns();
            }
        });
    }

    public void addOperator() {
        char last = str.charAt(str.length()-1);
        if(last == '+' || last == '-' || last == '*' || last == '/') {
            str = str.substring(0,str.length()-1);
        }
        num1 = num2;
        num2 = "";
    }

    public void calculateAns() {
        double ans = 0;
        if(num1 != "" && num2 != "") {
            if(operator == '/') {
                ans = Double.parseDouble(num1) / Double.parseDouble(num2);
            }
            else if(operator == '*') {
                ans = Double.parseDouble(num1) * Double.parseDouble(num2);
            }
            else if(operator == '-') {
                ans = Double.parseDouble(num1) - Double.parseDouble(num2);
            }
            else if(operator == '+') {
                ans = Double.parseDouble(num1) + Double.parseDouble(num2);
            }
            if(ans == 0) {
                str = "0";
                num1 = "";
                num2 = "";
            }
            else {
                str = String.valueOf(ans);
                num1 = str;
                num2 = str;
            }
            display.setText(str);
        }
    }
}