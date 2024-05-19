import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;



public class StudntMang extends JFrame implements ActionListener {
    private Container c;
    private JLabel jl1,jl2,jl3,jl4,jl5, usLabel,passJLabel,phone,jlID;
    private JTextField jf1,jf2,jf3,jf4,jf5,jf6,jfID;
    private JButton bt1,bt2,bt3,bt4,bt5;
    private Font f,f2;
    private JTable tb;
    private DefaultTableModel model;
    private JMenuBar menuBar;
    private ButtonGroup grp;
    private JMenu edit,help;
    private JMenuItem lightMode,DarkMode,info;
    private JRadioButton male,female;
    private JPasswordField pf;


    private JScrollPane scl;
    private String[] columns = {"First Name","Last Name","Intake","Section","ID"};
    private String[] rows = new String[5];
    


    StudntMang()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,800,790);
        this.setLocationRelativeTo(null);
        this.setTitle("Student Management");
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

        f = new Font("Arial", Font.BOLD, 30);
        f2 = new Font("Arial", Font.BOLD, 18);


        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        edit = new JMenu("Theme");
        help = new JMenu("Help");
        menuBar.add(edit);
        menuBar.add(help);

        lightMode = new JMenuItem("Default");
        DarkMode = new JMenuItem("Light Gray");
        info = new JMenuItem("Information");


        edit.add(lightMode);
        edit.addSeparator();
        edit.add(DarkMode);
        help.add(info);

        info.addActionListener(this);
        DarkMode.addActionListener(this);
        lightMode.addActionListener(this);
    
        //......Label........

        jl1 = new JLabel("Student Management");
        jl1.setBounds(240,10,350,50);
        jl1.setFont(f);
        c.add(jl1);

        jl2 = new JLabel("First Name : ");
        jl2.setBounds(30,80,200,30);
        jl2.setFont(f2);
        c.add(jl2);

        jl3 = new JLabel("Last Name : ");
        jl3.setBounds(30,120,200,30);
        jl3.setFont(f2);
        c.add(jl3);

        jl4 = new JLabel("Intake : ");
        jl4.setBounds(30,160,100,30);
        jl4.setFont(f2);
        c.add(jl4);

        jl5 = new JLabel("Section : ");
        jl5.setBounds(30,200,100,30);
        jl5.setFont(f2);
        c.add(jl5);

        jlID = new JLabel("ID : ");
        jlID.setBounds(30,235,100,30);
        jlID.setFont(f2);
        c.add(jlID);

        phone = new JLabel("Phone : ");
        phone.setBounds(30,400,100,30);
        phone.setFont(f2);
        c.add(phone);

        usLabel = new JLabel("User_Name:");
        usLabel.setFont(f2);
        usLabel.setBounds(30, 330, 120, 30);
        c.add(usLabel);    

        passJLabel = new JLabel("Password:");
        passJLabel.setFont(f2);
        passJLabel.setBounds(30, 366, 100, 30);
        c.add(passJLabel);

        //.......TextField.....

        jf1 = new JTextField();
        jf1.setBounds(170,80,140,30);
        jf1.setFont(f2);
        c.add(jf1);

        jf2 = new JTextField();
        jf2.setBounds(170,120,140,30);
        jf2.setFont(f2);
        c.add(jf2);

        jf3 = new JTextField();
        jf3.setBounds(170,160,140,30);
        jf3.setFont(f2);
        c.add(jf3);

        jf4 = new JTextField();
        jf4.setBounds(170,200,140,30);
        jf4.setFont(f2);
        c.add(jf4);
        
        jf5 = new JTextField("");
        jf5.setBounds(170,330 ,140,30);
        jf5.setFont(f2);
        c.add(jf5);

        jf6 = new JTextField();
        jf6.setBounds(170,400,140,30);
        jf6.setFont(f2);
        c.add(jf6);

        jfID = new JTextField();
        jfID.setBounds(170,240,140,30);
        jfID.setFont(f2);
        c.add(jfID);

        pf = new JPasswordField();
        pf.setForeground(Color.BLACK);
        pf.setBackground(Color.WHITE);
        pf.setBounds(170, 365, 140, 30);
        pf.setFont(f2);
        pf.setEchoChar('*');
        c.add(pf);

        
        //=====Gender Selection
        
        grp = new ButtonGroup();

        male=new JRadioButton("Male");
        male.setBounds(60,275,100,50);
        male.setBackground(null);
        male.setFont(f2);
        c.add(male);
    
        female=new JRadioButton("Female");
        female.setBounds(160,275,100,50);
        female.setBackground(null);
        female.setFont(f2);
        c.add(female);
        grp.add(male);
        grp.add(female);


        // .........Button.........

        bt1 = new JButton("Add");
        bt1.setBounds(380,80,100,25);
        bt1.setFont(f2);
        c.add(bt1);

        bt2 = new JButton("Update");
        bt2.setBounds(380,120,100,25);
        bt2.setFont(f2);
        c.add(bt2);

        bt3 = new JButton("Delete");
        bt3.setBounds(380,160,100,25);
        bt3.setFont(f2);
        c.add(bt3);

        bt4 = new JButton("Clear");
        bt4.setBounds(380,200,100,25);
        bt4.setFont(f2);
        c.add(bt4);

        bt5 = new JButton("Admin");
        bt5.setBounds(380,240,100,25);
        bt5.setFont(f2);
        c.add(bt5);

        tb = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        tb.setModel(model);
        tb.setFont(f2);
        tb.setSelectionBackground(Color.pink);
        tb.setBackground(Color.WHITE);
        tb.setRowHeight(30);

        scl = new JScrollPane(tb);
        scl.setBounds(20,440,740,265);
        c.add(scl);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);

        tb.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me)
            {
                int numrow = tb.getSelectedRow();

                String f_name = model.getValueAt(numrow, 0).toString();
                String l_name = model.getValueAt(numrow, 1).toString();
                String intakee = model.getValueAt(numrow,2).toString();
                String sectionn = model.getValueAt(numrow,3).toString();
                String id = model.getValueAt(numrow, 4).toString();


                jf1.setText(f_name);
                jf2.setText(l_name);
                jf3.setText(intakee);
                jf4.setText(sectionn);
                jfID.setText(id);

            }
        });


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==bt1)
        {
            rows[0] = jf1.getText();
            rows[1] = jf2.getText();
            rows[2] = jf3.getText();
            rows[3] = jf4.getText();
            rows[4] = jfID.getText();
            model.addRow(rows);
        }
        
        else if(e.getSource()==bt4)
        {
            jf1.setText("");
            jf2.setText("");
            jf3.setText("");
            jf4.setText("");
            jf5.setText("");
            pf.setText("");
            jf6.setText("");
            jfID.setText("");

        }

        else if(e.getSource()==bt3)
        {
           int numrow = tb.getSelectedRow();
           if(numrow >= 0)
           {
            model.removeRow(numrow);
           }
           else {JOptionPane.showMessageDialog(null, "No row has been seleted"); }
        }

        else if(e.getSource()==bt2)
        {
            int numrow = tb.getSelectedRow();

            String fn=jf1.getText();
            String ln=jf2.getText();
            String itk=jf3.getText();
            String sect=jf4.getText();
            String idd = jfID.getText();

            model.setValueAt(fn,numrow,0);
            model.setValueAt(ln,numrow,1);
            model.setValueAt(itk,numrow,2);
            model.setValueAt(sect,numrow,3);
            model.setValueAt(idd, numrow, 4);
        }

        else if(e.getSource()==bt5)
        {
            Admin f = new Admin();
            f.setVisible(true);
        }

        if(e.getSource()==info)
        {
            JAbout frame = new JAbout();
               frame.setVisible(true);
        }
        else if(e.getSource()==DarkMode)
        {
            c.setBackground(Color.LIGHT_GRAY);
        }
        if(e.getSource()==lightMode)
        {
            c.setBackground(Color.CYAN);
        }
    }


    public static void main(String[] args) {
        StudntMang frMang = new StudntMang();
        frMang.setVisible(true);
        
    }
   
}