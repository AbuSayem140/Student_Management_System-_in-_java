import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Admin extends JFrame implements ActionListener {
    private Container c;
    private Font f;
    private JLabel label;
    private JTable table;
    private JScrollPane jscp;
    private DefaultTableModel model;

    private JScrollPane scl;
    private String[] columns = {"First Name","Last Name","Intake","Section","ID","User_Name","Gender","Password","Phone"};
    private String[] rows = new String[9];

    Admin()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(400,80,830,600);
        this.setTitle("Admin Panel");
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

        f = new Font("Arial", Font.BOLD, 18);

        
        table = new JTable();

        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(f);
        table.setSelectionBackground(Color.PINK);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);

        jscp = new JScrollPane(table);
        jscp.setBounds(10,40,800,480);
        c.add(jscp);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        


    }



    public static void main(String[] args) {
        Admin fAdmin = new Admin();
        fAdmin.setVisible(true);
    }
  
    
}
