/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stock;

import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Narcis
 */
public class order extends javax.swing.JFrame {

    /**
     * Creates new form order
     */
    public order() {
            initComponents();
//        Connect();
//        load();
//        CurrentDate();
    }
    
//    Connection con;
//    PreparedStatement pst;
//    DefaultTableModel df;
//    
//      
//        /*Conectarea la baza de date localhost cu jdbc connection*/
//    public void Connect()
//    {
//        try {
//            //Prin urmatoarele doua randuri trimitem queryului unde poate gasi baza de date si ne conectam cu
//            //username-ul si parola
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/stockmanagment", "root","");
//            //Altfel arumcam erori.
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(vanzatori.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(vanzatori.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    
//    /*Adauga la tabelul din aplicatie toate datele continute in baza de date vanzator*/
//    public void load()
//    {
//        int a;
//        try {
//            /*Selecteaza tot continutul bazei de date vanzator si executa query-ul*/
//            pst = con.prepareStatement("select * from produse");
//            ResultSet rs = pst.executeQuery();
//            
//            /*Obtine numarul de coloane din baza de date si seteaza numarul default din program pe 0*/
//            ResultSetMetaData rd = rs.getMetaData();
//            a = rd.getColumnCount();
//            df = (DefaultTableModel)jTable1.getModel();
//            df.setRowCount(0);
//            
//            /*Cat timp exista un rand urmator, Vectoul v2 citeste fiecare detaliu despre rand (id,name,phone,email,address)*/
//            while(rs.next())
//            {
//                //Creem un nou vector
//                Vector v2 = new Vector();
//                for(int i=1; i<=a; i++)
//                {
//                    //Adaugam pe rand Vectorului creat id-ul, numele,descrierea, codul de bare, pretul de cumparare, pretul de vanzare
//                    //si cantitatea produsului
//                    v2.add(rs.getString("id"));
//                    v2.add(rs.getString("pname"));
//                    v2.add(rs.getString("description"));
//                    v2.add(rs.getString("barcode"));
//                    v2.add(rs.getString("cprice"));
//                    v2.add(rs.getString("rprice"));
//                    v2.add(rs.getString("qty"));
//                }
//                //Adaugam in tabelul existent datele din Vector care sunt preluate din baza de date
//                df.addRow(v2);
//            }
//            //aruncam erori
//        } catch (SQLException ex) {
//            Logger.getLogger(vanzatori.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    
//    
//           //Funtia CurrentDate ne trimite din interiorul pc-ului datele despre zi, luna, an, minut, ora
//       public void CurrentDate()
//    {
//        //Se creeaza un now Thread
//        Thread CurrentDate = new Thread()
//                {
//                    public void run()
//                {
//                        try {
//                            for(;;){
//                               //Cu ajutorul functiei GregorianCalendar, putem obtine din sistemul calculatorului toate datele 
//                               //necesare pentru luna,an,zi, minut, ora.
//                            Calendar cal = new GregorianCalendar();
//                             int month = cal.get(Calendar.MONTH);
//                             int year = cal.get(Calendar.YEAR);
//                             int day = cal.get(Calendar.DAY_OF_MONTH);
//                             //Setam pe label-ul txtdate data actuala creeata din cele trei valori diferite.
//                             txtdate.setText("Data: " + year + "/" + (month+1) + "/" + day);
//                             int minute = cal.get(Calendar.MINUTE);
//                             int hour = cal.get(Calendar.HOUR_OF_DAY);
//                             
//                             
//                             
//                                  if(minute >= 1 && minute <=9)
//                                date.setText(year + "/" + (month+1) + "/" + day + " " +  hour + ":" + "0" + (minute));
//                                  else
//                                date.setText(year + "/" + (month+1) + "/" + day + " " + hour + ":" + (minute));
//
//                                  
//                                  
//                             
//                             //Setam pe label-ul txttime, timpul actual creeat din cele doua valori diferite.
//                             if(minute >= 1 && minute <=9)
//                                txttime.setText("Ora: " + hour + ":" + "0" + (minute));
//                             else
//                                txttime.setText("Ora: " + hour + ":" + (minute));
//                             //Functia lucreaza in timp ce programul este pornit cu un timer de 60 sec intre intervalele apelari lui.
//                            sleep(60000);
//                        }
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(produs.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                }
//                };
//        
//        CurrentDate.start();
//        
//        
//            
//        
//    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int flag = 0;
    int i = 1, tot = 0, total;

    String pret, Prodname, barcode,total2;
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
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
