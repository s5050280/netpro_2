
package network.programming;
import java.util.*;
import java.net.*;

public class App3 extends javax.swing.JFrame {

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App3().setVisible(true);
            }
        });
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
    }
    public App3() {
        initComponents();
        setTitle("Thitiya Chanchai s5050280@kmitl.ac.th - Java Web Browser (Network Programming Class Assignment)");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("GO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.getAccessibleContext().setAccessibleDescription("");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jScrollPane3.setViewportView(jEditorPane1);

        jScrollPane4.setViewportView(jEditorPane2);

        jLabel1.setText("URL 1 :");

        jLabel2.setText("URL 2 :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Thread thread1; 
        thread1 = new Thread(new Runnable(){
            private Map<String, java.util.List<String>> map;
        @Override
        public void run(){  
           
            try
            {
                
                jTextArea1.append("Thread A : Start \n");
                jTextArea1.append("Thread A : Getpage url = "+jTextField1.getText()+"\n");
                jEditorPane1.setPage(jTextField1.getText());
                     
                //HTTP response header      
                try {                    
                    URL obj;
                    obj = new URL(jTextField1.getText());
                    URLConnection conn = obj.openConnection();
                    Map<String, List<String>> map = conn.getHeaderFields();
 
                    jTextArea1.append("- - - - - - - - - - - - - - - \nThread A: Response Header\n");
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        jTextArea1.append("Thread A : " + entry.getKey() 
                           + " : " + entry.getValue()+"\n");
                    }
 
                jTextArea1.append("Get Response Header By Thread A :...\n");
                String server = conn.getHeaderField("Server");
 
                if (server == null) {
                    jTextArea1.append("Thread A: 'Server' is not found!\n");
                } else {
		jTextArea1.append("Server - " + server+"\n");
                }
 
                jTextArea1.append("Done\n");
 
                } catch (Exception e) {
                    e.printStackTrace();
                }

                jTextArea1.append("Thread A : Finished \n");
           }
                catch(Exception e){
                    jEditorPane1.setText("Error: " +e);
                }
      } 
   });
        thread1.start(); 
        
      
       Thread thread2; 
        thread2 = new Thread(new Runnable(){
        @Override
        public void run(){
           
            try
            {
                jTextArea2.append("Thread B: Start \n");
                jTextArea2.append("Thread B : Getpage url = "+jTextField2.getText()+"\n");
                jEditorPane2.setPage(jTextField2.getText());
                     
                    
                try {
                    URL obj = new URL(jTextField2.getText());
                    URLConnection conn = obj.openConnection();
                    Map<String, List<String>> map = conn.getHeaderFields();
 
                    jTextArea2.append("- - - - - - - - - - - - - - -\nThread B : Response Header\n");
 
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        jTextArea2.append("Thread B : " + entry.getKey() 
                           + " : " + entry.getValue()+"\n");
                    }
 
                jTextArea2.append("Get Response Header By Thread B ...\n");
                String server = conn.getHeaderField("Server");
 
                if (server == null) {
                    jTextArea2.append("Thread B 'Server' is not found!\n");
                } else {
		jTextArea2.append("Server - " + server+"\n");
                }
 
                jTextArea2.append("Done\n");
 
                } catch (Exception e) {
                    e.printStackTrace();
                }
              
                jTextArea2.append("Thread B : Finished \n");
           }
                catch(Exception e){
                    jEditorPane2.setText("Error: " +e);
                }
      } 
   });
        thread2.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
      
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
