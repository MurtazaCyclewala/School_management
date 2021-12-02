
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Murtaza
 */
public class GradeStu extends javax.swing.JFrame {
    private static String TID;
    /**
     * Creates new form GradeStu
     * @param a
     */
    public GradeStu(String a) {
        initComponents();
        TID = a;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SIDCom = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Find = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Eng = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Maths = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Sci = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        SS = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Hindi = new javax.swing.JComboBox<>();
        Update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Grading Students");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Select SID:");

        SIDCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        SIDCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDComActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Name:");

        Name.setEnabled(false);

        Find.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        Find.setText("Find");
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("English:");

        Eng.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "B+", "B", "C+", "C", "D", "F" }));
        Eng.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Maths:");

        Maths.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "B+", "B", "C+", "C", "D", "F" }));
        Maths.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Science:");

        Sci.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "B+", "B", "C+", "C", "D", "F" }));
        Sci.setEnabled(false);
        Sci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SciActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Social Science:");

        SS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "B+", "B", "C+", "C", "D", "F" }));
        SS.setEnabled(false);
        SS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Hindi:");

        Hindi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "B+", "B", "C+", "C", "D", "F" }));
        Hindi.setEnabled(false);
        Hindi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HindiActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        Update.setText("Update");
        Update.setEnabled(false);
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Sci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Eng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Maths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hindi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Eng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(SS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Maths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(Hindi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Sci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SIDCom, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SIDCom, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private PreparedStatement ps;
    private PreparedStatement ps2;
    private Connection con;
    private ResultSet rs;
    private ResultSet rs2;
    
    private String Decrypt(String pass)
    {
        String ans = "";
        for(int i=0;i<pass.length();i++)
        {
            int a = pass.charAt(i);
            a = a-i;
            while(a<0)
            {
                a = a+127;
            }
            ans = ans +""+ (char)a;
        }
        return ans;
    }

    private String Encrypt(String pass)
    {
        String ans = "";
        for(int i=0;i<pass.length();i++)
        {
            int a = pass.charAt(i);
            a = a+i;
            while(a>127)
            {
                a = a-127;
            }
            ans = ans +""+ (char)a;
        }
        return ans;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            ps = con.prepareStatement("Select * from teacher where TID = ?;");
            ps.setString(1,TID);
            rs = ps.executeQuery();
            rs.next();
            this.dispose();
            TeacherFrame as = new TeacherFrame(TID);
            as.LName.setText("Welcome "+Decrypt(rs.getString("Name")));
            as.setVisible(true);
            
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE );
        }
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindActionPerformed
        String name = Name.getText();
        if(name.isEmpty()) 
        {
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            ps = con.prepareStatement("Select * from teacher where TID = ?;");
            ps.setString(1, TID);
            rs = ps.executeQuery();
            rs.next();
            if(Decrypt(rs.getString("Type")).equals("Primary"))
                {
                    ps2  = con.prepareStatement("Select * from student;");
                    rs2 = ps2.executeQuery();
                    while(rs2.next())
                    {
                        if(rs2.getInt("Stan")<=5)
                        {
                            SIDCom.addItem(Decrypt(rs2.getString("SID")));
                        }
                    }
                }
            else
                {
                    ps2  = con.prepareStatement("Select * from student;");
                    rs2 = ps2.executeQuery();
                    while(rs2.next())
                    {
                        if(rs2.getInt("Stan")>5)
                        {
                            SIDCom.addItem(Decrypt(rs2.getString("SID")));
                        }
                    }
                }
            }
            catch(ClassNotFoundException | SQLException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE );
            }
        }
        else
        {
            String ID = (String)SIDCom.getSelectedItem();
            Eng.setEnabled(true);
            Maths.setEnabled(true);
            Hindi.setEnabled(true);
            SS.setEnabled(true);
            Sci.setEnabled(true);
            Update.setEnabled(true);
            
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
                ps = con.prepareStatement("Select * from grades where SID = ?;");
                ps.setString(1, Encrypt(ID));
                rs = ps.executeQuery();
                if(rs.next())
                {
                    Eng.setSelectedItem((String)rs.getString("English"));
                    Maths.setSelectedItem((String)rs.getString("Maths"));
                    Hindi.setSelectedItem((String)rs.getString("Hindi"));
                    SS.setSelectedItem((String)rs.getString("SS"));
                    Sci.setSelectedItem((String)rs.getString("Science"));
                }
            }
            catch(ClassNotFoundException | SQLException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE );
            } 
        }// TODO add your handling code here:
    }//GEN-LAST:event_FindActionPerformed

    private void SciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SciActionPerformed

    private void SSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SSActionPerformed

    private void HindiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HindiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HindiActionPerformed

    private void SIDComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDComActionPerformed
        String ID = (String)SIDCom.getSelectedItem();
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
                ps = con.prepareStatement("Select * from student where SID = ?;");
                ps.setString(1, Encrypt(ID));
                rs = ps.executeQuery();
                rs.next();
                Name.setText(Decrypt(rs.getString("Name")));
                Eng.setEnabled(false);
                Maths.setEnabled(false);
                Hindi.setEnabled(false);
                SS.setEnabled(false);
                Sci.setEnabled(false);
                Update.setEnabled(false);
            }
            catch(ClassNotFoundException | SQLException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE );
            }        // TODO add your handling code here:
    }//GEN-LAST:event_SIDComActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        String ID = (String)SIDCom.getSelectedItem();
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
                ps = con.prepareStatement("Select * from grades where SID = ?;");
                ps.setString(1, Encrypt(ID));
                rs = ps.executeQuery();
                if(rs.next())
                {
                    ps2 = con.prepareStatement("UPDATE `grades` SET `English`=?,`Hindi`=?,`Science`=?,`SS`=?,`Maths`=? WHERE SID =?");
                    ps2.setString(6, Encrypt(ID));
                    ps2.setString(1, (String)Eng.getSelectedItem());
                    ps2.setString(2, (String)Hindi.getSelectedItem());
                    ps2.setString(3, (String)Sci.getSelectedItem());
                    ps2.setString(4, (String)SS.getSelectedItem());
                    ps2.setString(5, (String)Maths.getSelectedItem());
                    ps2.execute();
                    JOptionPane.showMessageDialog(this, "Data Entry Updated" );
                }
                else
                {
                    ps2 = con.prepareStatement("INSERT INTO `grades`(`SID`, `English`, `Hindi`, `Science`, `SS`, `Maths`) VALUES (?,?,?,?,?,?)");
                    ps2.setString(1, Encrypt(ID));
                    ps2.setString(2, (String)Eng.getSelectedItem());
                    ps2.setString(3, (String)Hindi.getSelectedItem());
                    ps2.setString(4, (String)Sci.getSelectedItem());
                    ps2.setString(5, (String)SS.getSelectedItem());
                    ps2.setString(6, (String)Maths.getSelectedItem());
                    ps2.execute();
                    JOptionPane.showMessageDialog(this, "Data Entry Successful" );
                }
            }
            catch(ClassNotFoundException | SQLException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE );
            }        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GradeStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeStu(TID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Eng;
    public javax.swing.JButton Find;
    private javax.swing.JComboBox<String> Hindi;
    private javax.swing.JComboBox<String> Maths;
    private javax.swing.JTextField Name;
    private javax.swing.JComboBox<String> SIDCom;
    private javax.swing.JComboBox<String> SS;
    private javax.swing.JComboBox<String> Sci;
    private javax.swing.JButton Update;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}