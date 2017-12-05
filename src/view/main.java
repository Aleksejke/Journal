package view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import program.*;

public class main extends javax.swing.JFrame {

    public int enOrLt = 1;
    public ArrayList <PointsDB> pointsInfo = new ArrayList();
    public ArrayList <StudentDB> studentsInfo = new ArrayList();
    private Connect data;
    private Connection conn;
    private boolean choosed = false;
    /**
     * Creates new form main
     */
    public main() throws ClassNotFoundException, SQLException {
        initComponents();
        data = new Connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ChoosingLanguage = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ChoosingStudent = new javax.swing.JLabel();
        NoOfStudent = new javax.swing.JComboBox<>();
        DateFrom = new javax.swing.JLabel();
        EnterDateFrom = new javax.swing.JTextField();
        EnterDateTo = new javax.swing.JTextField();
        DateTo = new javax.swing.JLabel();
        Filter = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Connection = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Data = new javax.swing.JMenu();
        Group = new javax.swing.JMenuItem();
        Student = new javax.swing.JMenuItem();
        Points = new javax.swing.JMenuItem();
        Ln = new javax.swing.JMenu();
        En = new javax.swing.JRadioButtonMenuItem();
        Lt = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Group, Name, Surname", "Date", "Points", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(40);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
            jTable1.getColumnModel().getColumn(1).setMinWidth(170);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(170);
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(3).setMinWidth(60);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(60);
        }

        ChoosingStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChoosingStudent.setText("Student:");

        NoOfStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        DateFrom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DateFrom.setText("Date from:");

        DateTo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DateTo.setText("Date to:");

        Filter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Filter.setText("Filter");
        Filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterActionPerformed(evt);
            }
        });

        File.setText("File");

        Connection.setText("Connect to Database");
        Connection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectionActionPerformed(evt);
            }
        });
        File.add(Connection);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        jMenuBar1.add(File);

        Data.setText("Data");

        Group.setText("Add a new group");
        Group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupActionPerformed(evt);
            }
        });
        Data.add(Group);

        Student.setText("Add a new student");
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });
        Data.add(Student);

        Points.setText("Add an activity points");
        Points.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointsActionPerformed(evt);
            }
        });
        Data.add(Points);

        jMenuBar1.add(Data);

        Ln.setText("Language");

        ChoosingLanguage.add(En);
        En.setSelected(true);
        En.setText("English");
        En.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnActionPerformed(evt);
            }
        });
        Ln.add(En);

        ChoosingLanguage.add(Lt);
        Lt.setText("Lithuanian");
        Lt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LtActionPerformed(evt);
            }
        });
        Ln.add(Lt);

        jMenuBar1.add(Ln);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ChoosingStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoOfStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DateFrom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnterDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DateTo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EnterDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChoosingStudent)
                    .addComponent(NoOfStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateFrom)
                    .addComponent(EnterDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateTo)
                    .addComponent(Filter))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void LanguageSettings() {
        Language language = new Language();
        if (enOrLt == 1) {
            jTable1.getTableHeader().getColumnModel().getColumn(0).setHeaderValue("No");
            jTable1.getTableHeader().getColumnModel().getColumn(1).setHeaderValue("Group, Name, Surname");
            jTable1.getTableHeader().getColumnModel().getColumn(2).setHeaderValue("Date");
            jTable1.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("Points");
            jTable1.getTableHeader().getColumnModel().getColumn(4).setHeaderValue("Description");
            this.repaint();
            File.setText(language.English[0]);
            Exit.setText(language.English[1]);
            Data.setText(language.English[2]);
            Group.setText(language.English[3]);
            Student.setText(language.English[4]);
            Points.setText(language.English[5]);
            Ln.setText(language.English[23]);
            En.setText(language.English[6]);
            Lt.setText(language.English[7]);
            ChoosingStudent.setText(language.English[8]);
            DateFrom.setText(language.English[9]);
            DateTo.setText(language.English[10]);
            Filter.setText(language.English[11]);
            Connection.setText(language.English[24]);
        } else {
            jTable1.getTableHeader().getColumnModel().getColumn(0).setHeaderValue("No");
            jTable1.getTableHeader().getColumnModel().getColumn(1).setHeaderValue("Grupė, Vardas, Pavardė");
            jTable1.getTableHeader().getColumnModel().getColumn(2).setHeaderValue("Data");
            jTable1.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("Balai");
            jTable1.getTableHeader().getColumnModel().getColumn(4).setHeaderValue("Aprašymas");
            this.repaint();
            File.setText(language.Lithuanian[0]);
            Exit.setText(language.Lithuanian[1]);
            Data.setText(language.Lithuanian[2]);
            Group.setText(language.Lithuanian[3]);
            Student.setText(language.Lithuanian[4]);
            Points.setText(language.Lithuanian[5]);
            Ln.setText(language.Lithuanian[23]);
            En.setText(language.Lithuanian[6]);
            Lt.setText(language.Lithuanian[7]);
            ChoosingStudent.setText(language.Lithuanian[8]);
            DateFrom.setText(language.Lithuanian[9]);
            DateTo.setText(language.Lithuanian[10]);
            Filter.setText(language.Lithuanian[11]);
            Connection.setText(language.Lithuanian[24]);
        }
    }  
    
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void GroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupActionPerformed
        Group group = new Group(this, true, data);
        group.LanguageSettings(enOrLt);
        if (choosed == true)
            group.setVisible(true);
    }//GEN-LAST:event_GroupActionPerformed

    private void StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentActionPerformed
        Student student = new Student(this, true, data);
        student.LanguageSettings(enOrLt);
        if (choosed == true) {
            student.setVisible(true);
            if (student.isEntered()) {
                studentsInfo.add(student.getPerson());
                jTable1.repaint();
            }
        }
        
    }//GEN-LAST:event_StudentActionPerformed

    private void PointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointsActionPerformed
        Points points = new Points(this, true, data);
        points.LanguageSettings(enOrLt);
        points.showProperties(studentsInfo);
        if (choosed == true) {
            points.setVisible(true);
            if (points.isEntered()) {
                pointsInfo.add(points.getSomeone());
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                for (int i = model.getRowCount() - 1; i >= 0; i--)
                        model.removeRow(i);
                for (PointsDB s : pointsInfo)
                    model.addRow(new Object[]{pointsInfo.indexOf(s)+1, s.getStudent(), s.getDate(), s.getPoints(), s.getDescription()});
            }
        }
    }//GEN-LAST:event_PointsActionPerformed

    private void EnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnActionPerformed
        enOrLt = 1;
        LanguageSettings();
    }//GEN-LAST:event_EnActionPerformed

    private void LtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LtActionPerformed
        enOrLt = 2;
        LanguageSettings();
    }//GEN-LAST:event_LtActionPerformed

    private void ConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectionActionPerformed
        if (choosed == false) {
            try {
                Object Stud, Date, Pts, Description, Grp, Name, Surname, Number;
                String date;
                PointsDB someone;
                StudentDB person;
                ResultSet result;
                choosed = true;
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();           
                result = data.query("SELECT * FROM Points");
                while (result.next()) {
                    someone = new PointsDB();
                    Stud = result.getObject(2);
                    someone.setStudent(Stud.toString());
                    Date = result.getObject(3);
                    date = Date.toString();
                    Date = date.substring(0, 10);
                    someone.setDate(Date.toString());
                    Pts = result.getObject(4);
                    someone.setPoints(Integer.parseInt(Pts.toString()));
                    Description = result.getObject(5);
                    someone.setDescription(Description.toString());
                    pointsInfo.add(someone);
                }
                for (PointsDB s : pointsInfo)
                    model.addRow(new Object[]{pointsInfo.indexOf(s)+1, s.getStudent(), s.getDate(), s.getPoints(), s.getDescription()});
                result = data.query("SELECT * FROM Student");
                while (result.next()) {
                    person = new StudentDB();
                    Grp = result.getObject(2);
                    person.setGroup(Grp.toString());
                    Name = result.getObject(3);
                    person.setName(Name.toString());
                    Surname = result.getObject(4);
                    person.setSurname(Surname.toString());
                    Number = result.getObject(5);
                    person.setNumber(Integer.parseInt(Number.toString()));
                    studentsInfo.add(person);
                }
                String[] combobox = new String[studentsInfo.size()];
                for (int i = 0; i < studentsInfo.size(); i++)
                    combobox[i] = studentsInfo.get(i).getGroup() + " " + studentsInfo.get(i).getName() + " " + studentsInfo.get(i).getSurname();
                NoOfStudent.setModel(new javax.swing.DefaultComboBoxModel(combobox));
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ConnectionActionPerformed

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int rowCount = model.getRowCount();
            int count = 0;
            String dateFrom, dateTo, student;
            String yearF, monthF, dayF, yearT, monthT, dayT;
            dateFrom = EnterDateFrom.getText();
            dateTo = EnterDateTo.getText();
            if ((dateFrom.isEmpty()) && (dateTo.isEmpty())) {
                if (count == 0) {
                    for (int i = rowCount - 1; i >= 0; i--)
                        model.removeRow(i);
                    for (PointsDB s : pointsInfo) {
                        model.addRow(new Object[]{pointsInfo.indexOf(s)+1, s.getStudent(), 
                            s.getDate(), s.getPoints(), s.getDescription()});
                    }
                    count = 1;
                }
            }
            else if ((!dateFrom.matches("([0-9]{4})-([0-9]{2})-([0-9]{2})") || !dateTo.matches("([0-9]{4})-([0-9]{2})-([0-9]{2})")) || ((dateFrom.length() > 10) || (dateTo.length() > 10)))
                    throw new Exception();
                else { 
                    rowCount = model.getRowCount();
                    for (int i = rowCount - 1; i >= 0; i--)
                        model.removeRow(i);
                    student = NoOfStudent.getSelectedItem().toString();
                    yearF = dateFrom.substring(0,4);
                    monthF = dateFrom.substring(5,7);
                    dayF = dateFrom.substring(8,10);
                    yearT = dateTo.substring(0,4);
                    monthT = dateTo.substring(5,7);
                    dayT = dateTo.substring(8,10);
                    for (PointsDB s : pointsInfo) {
                        if (student.equals(s.getStudent())) {
                        if ((Integer.parseInt(s.getDate().substring(0,4)) >= Integer.parseInt(yearF) &&
                            (Integer.parseInt(s.getDate().substring(0,4)) <= Integer.parseInt(yearT)))) {
                            if ((Integer.parseInt(s.getDate().substring(5,7)) > Integer.parseInt(monthF) &&
                                (Integer.parseInt(s.getDate().substring(5,7)) < Integer.parseInt(monthT))))
                                model.addRow(new Object[]{pointsInfo.indexOf(s)+1, s.getStudent(), 
                                    s.getDate(), s.getPoints(), s.getDescription()});
                            if ((Integer.parseInt(s.getDate().substring(5,7)) > Integer.parseInt(monthF) &&
                                (Integer.parseInt(s.getDate().substring(5,7)) == Integer.parseInt(monthT)))) {
                                    if (Integer.parseInt(s.getDate().substring(8,10)) <= Integer.parseInt(dayT))
                                        model.addRow(new Object[]{pointsInfo.indexOf(s)+1, s.getStudent(), 
                                                        s.getDate(), s.getPoints(), s.getDescription()});
                            }
                            if ((Integer.parseInt(s.getDate().substring(5,7)) == Integer.parseInt(monthF) &&
                                (Integer.parseInt(s.getDate().substring(5,7)) == Integer.parseInt(monthT)))) {
                                    if ((Integer.parseInt(s.getDate().substring(8,10)) >= Integer.parseInt(dayF) &&
                                        (Integer.parseInt(s.getDate().substring(8,10)) <= Integer.parseInt(dayT))))
                                        model.addRow(new Object[]{pointsInfo.indexOf(s)+1, s.getStudent(), 
                                                        s.getDate(), s.getPoints(), s.getDescription()});
                            }
                            if ((Integer.parseInt(s.getDate().substring(5,7)) == Integer.parseInt(monthF) &&
                                (Integer.parseInt(s.getDate().substring(5,7)) < Integer.parseInt(monthT)))) {
                                    if ((Integer.parseInt(s.getDate().substring(8,10)) >= Integer.parseInt(dayF)))
                                        model.addRow(new Object[]{pointsInfo.indexOf(s)+1, s.getStudent(), 
                                                        s.getDate(), s.getPoints(), s.getDescription()});
                            }
                        }
                        }
                    }
            }
            
       } catch (Exception e) {
            if (enOrLt == 1)
                JOptionPane.showMessageDialog(this, "You inputted wrong Date!\nYou must fill both fields!\nFormat should be yyyy-mm-dd", "Error", JOptionPane.ERROR_MESSAGE);
            else JOptionPane.showMessageDialog(this, "Jūs įvedėte neteisingą Datą!\nReikia užpildyti visus laukus!\nFormatas turi atrodyti yyyy-mm-dd", "Klaida", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_FilterActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int index = jTable1.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int which = Integer.parseInt(model.getValueAt(index, 0).toString());
            int response = 0;
            if (enOrLt == 1)
                response = JOptionPane.showConfirmDialog(null, "Do you really want to change?", "Confirm",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            else
                response = JOptionPane.showConfirmDialog(null, "Ar tikrai norite pakeisti?", "Patvirtinti",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                Update up = new Update(this, true);
                up.LanguageSettings(enOrLt);
                up.setVisible(true);
                int p = up.getP();
                model.setValueAt(p, index, 3);
                String description = up.getD();
                model.setValueAt(description, index, 4);
                String sql = String.format("UPDATE Points SET Points = %s, Description = '%s' WHERE ID = %s;", p, description, which);
                data.execute(sql);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    public ArrayList<PointsDB> getPointsInfo() {
        return pointsInfo;
    }

    public ArrayList<StudentDB> getStudentsInfo() {
        return studentsInfo;
    }

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new main().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ChoosingLanguage;
    private javax.swing.JLabel ChoosingStudent;
    private javax.swing.JMenuItem Connection;
    private javax.swing.JMenu Data;
    private javax.swing.JLabel DateFrom;
    private javax.swing.JLabel DateTo;
    private javax.swing.JRadioButtonMenuItem En;
    private javax.swing.JTextField EnterDateFrom;
    private javax.swing.JTextField EnterDateTo;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File;
    private javax.swing.JButton Filter;
    private javax.swing.JMenuItem Group;
    private javax.swing.JMenu Ln;
    private javax.swing.JRadioButtonMenuItem Lt;
    private javax.swing.JComboBox<String> NoOfStudent;
    private javax.swing.JMenuItem Points;
    private javax.swing.JMenuItem Student;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
