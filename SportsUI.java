package sportsui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Sports {
    private long SCode;
    private String SName;
    private int fees, duration;

    public Sports() {
        this.SCode = 1001;
        this.SName = "Cricket";
        this.fees = 500;
        this.duration = 70;
    }

    public Sports(long SCode, String SName, int duration) {
        this.SCode = SCode;
        this.SName = SName;
        if (SName.equalsIgnoreCase("table tennis"))
            this.fees = 5000;
        else if (SName.equalsIgnoreCase("Swimming"))
            this.fees = 6000;
        else if (SName.equalsIgnoreCase("football"))
            this.fees = 3000;
        this.duration = duration;
    }

    public long getSCode() {
        return SCode;
    }

    public void setSCode(long SCode) {
        this.SCode = SCode;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    void showSport() {
        System.out.println("SCode: " + this.getSCode());
        System.out.println("SName: " + this.getSName());
        System.out.println("Fees: " + this.getFees());
        System.out.println("Duration: " + this.getDuration());
    }

}

public class SportsUI extends JFrame implements ActionListener {
    JFrame frame =new JFrame();
    Container c;
    JLabel scode;
    JTextField scode_field;
    JLabel sname;
    JTextField sname_field;
    JLabel duration;
    JTextField duration_field;
    JButton button1;
    JLabel dharshan;
    JLabel credits;
    
    public static void main(String[] args) {
        new SportsUI().method1();
    }

    public void method1() {
        setTitle("Form1");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c = getContentPane();
        c.setLayout(null);
        dharshan =new JLabel("CREATED BY DHARSHAN");
        dharshan.setFont(new Font("Arial",Font.BOLD,20));
        dharshan.setSize(300,100);
        dharshan.setLocation(150,10);
        c.add(dharshan);
        
        scode = new JLabel("SCODE");
        scode.setFont(new Font("Arial", Font.BOLD, 20));
        scode.setToolTipText("SCODE");
        scode.setSize(100, 20);
        scode.setLocation(100, 100);
        c.add(scode);
       

        scode_field = new JTextField();
        scode_field.setFont(new Font("Arial", Font.PLAIN, 15));
        scode_field.setToolTipText("ENTER THE CODE PROPERLY");
        scode_field.setSize(190, 20);
        scode_field.setLocation(300, 100);
        c.add(scode_field);

        sname = new JLabel("SNAME");
        sname.setFont(new Font("Arial", Font.BOLD, 20));
        sname.setToolTipText("SNAME");
        sname.setSize(100, 20);
        sname.setLocation(100, 150);
        c.add(sname);


        sname_field = new JTextField();
        sname_field.setFont(new Font("Arial", Font.PLAIN, 15));
        sname_field.setToolTipText("ENTER THE SNAME PROPERLY");
        sname_field.setSize(150, 20);
        sname_field.setLocation(300, 150);
        c.add(sname_field);


        duration = new JLabel("DURATION");
        duration.setFont(new Font("Arial", Font.BOLD, 20));
        duration.setToolTipText("DURATION");
        duration.setSize(200, 20);
        duration.setLocation(100, 200);
        c.add(duration);


        duration_field = new JTextField();
        duration_field.setFont(new Font("Arial", Font.BOLD, 15));
        duration_field.setToolTipText("ENTER THE DURATION PROPERLY");
        duration_field.setSize(150, 20);
        duration_field.setLocation(300, 200);
        c.add(duration_field);


        button1 = new JButton("Button1");
        button1.setFont(new Font("Arial", Font.BOLD, 20));
        button1.setToolTipText("CREATED BY DHARSHAN-B");
        button1.setSize(200, 50);
        button1.setBackground(Color.RED);
        button1.setLocation(150, 290);
        button1.addActionListener(this);
        c.add(button1);
        
        credits =new JLabel("For More Follow @github-https://github.com/Dharshan-B");
        credits.setFont(new Font("Arial",Font.BOLD,20));
        credits.setSize(600,100);
        credits.setLocation(300,200);
        c.add(credits);
        getContentPane().setBackground(new Color(55,200,55));
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Sports sports;
        if (e.getSource() == button1) {
            if (scode_field.getText().length() > 0 && sname_field.getText().length() > 0 && duration_field.getText().length() > 0) {
                Long scode = Long.parseLong(scode_field.getText());
                String sname = sname_field.getText();
                int duration = Integer.parseInt(duration_field.getText());
                sports = new Sports(scode, sname, duration);
            } else {
                sports = new Sports();
            }
            sports.showSport();
        }
    }
}
