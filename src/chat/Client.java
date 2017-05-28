package chat;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.*;

public class Client extends javax.swing.JFrame {

    public static final int PORT = 4444;
    public static final String IP = "127.0.0.1";

    public Client() {
        initComponents();
        initUserList();
    }

    private void initUserList() {
        JFrame userListFrame = new JFrame("User list");
        JPanel userPanel = new JPanel();
        JLabel activeUsersLabel = new JLabel("Active users");

        activeUsersLabel.setForeground(Color.lightGray);
        activeUsersLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        userPanel.setLayout(new BoxLayout(userPanel, BoxLayout.Y_AXIS));
        userPanel.setBackground(new Color(51, 51, 51));
        userPanel.add(activeUsersLabel);


        userPanel.setVisible(true);
        userListFrame.setSize(250, 250);
        userListFrame.getContentPane().add(userPanel);
        userListFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        userListFrame.pack();   // to resize or to not resize?

        userListFrame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 27)        // hide on escape
                    userListFrame.setVisible(false);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        currentUser.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.isShiftDown() && e.isControlDown() && !userListFrame.isVisible()) {
                    userListFrame.setVisible(true);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        currentUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgArea = new javax.swing.JTextArea();
        msgText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        receiverUser = new javax.swing.JTextField();
        send = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel3.setText("Username:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        login.setBackground(new java.awt.Color(51, 51, 51));
        login.setForeground(new java.awt.Color(204, 204, 204));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        currentUser.setBackground(new java.awt.Color(102, 102, 102));
        currentUser.setForeground(new java.awt.Color(204, 204, 204));
        currentUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentUserActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Username:");

        jScrollPane1.setForeground(new java.awt.Color(102, 102, 102));

        msgArea.setEditable(false);
        msgArea.setBackground(new java.awt.Color(102, 102, 102));
        msgArea.setColumns(20);
        msgArea.setForeground(new java.awt.Color(204, 204, 204));
        msgArea.setRows(5);
        jScrollPane1.setViewportView(msgArea);

        msgText.setBackground(new java.awt.Color(102, 102, 102));
        msgText.setForeground(new java.awt.Color(204, 204, 204));
        msgText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgTextActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Send a message to:");

        receiverUser.setBackground(new java.awt.Color(102, 102, 102));
        receiverUser.setForeground(new java.awt.Color(204, 204, 204));

        send.setBackground(new java.awt.Color(51, 51, 51));
        send.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        send.setForeground(new java.awt.Color(204, 204, 204));
        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(currentUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(msgText, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(send, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(receiverUser, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(currentUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(receiverUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(msgText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //buton de send
    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed

        String mesajClient = msgText.getText(); //citesc ce scrie in dreptunghiul msgText
        if (!mesajClient.equals("")) {
            msgArea.append(currentUser.getText() + ": " + mesajClient + "\n"); //scriu in msgArea
            out.println(receiverUser.getText() + ":" + mesajClient); //trimit mesajul si catre destinatar
            msgText.setText("");                                     //(il trimit catre server, care il trimite catre destinatar)
        }
    }//GEN-LAST:event_sendActionPerformed

    private void msgTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgTextActionPerformed

    }//GEN-LAST:event_msgTextActionPerformed

    private void currentUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentUserActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        //clientul incearca sa se conecteze la server
        try {
            Socket socket = new Socket(IP, PORT);

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            for (int i = 0; i < 2; i++) {
                //clientul citeste mesajul de la server
                String mesajServer = in.readLine();

                //clientul citeste de la tastatura si transmite server-ului un nume de utilizator
                //pana cand numele transmis este diferit de numele tuturor utilizatorilor conectati in acel moment
                if (mesajServer.startsWith("Nume utilizator?")) {
                    String nume = currentUser.getText();
                    out.println(nume);
                } //server-ul ii transmite clientului faptul ca numele de utilizator a fost acceptat
                else {
                    if (mesajServer.startsWith("Nume acceptat!")) {
                        JOptionPane.showMessageDialog(this, "Login successful! Username: " + currentUser.getText());
                        currentUser.setEditable(false);
                        break;
                    } else {
                        JOptionPane.showMessageDialog(this, "Username-ul " + currentUser.getText() + " deja exista!");
                    }
                }
            }

            //Incepe sa primesti mesaje - am facut un thread separat pentru ca un utilizator sa poata
            //trimite si primi mesaje in acelasi timp
            ReceiveMessage rcvMsg = new ReceiveMessage();
            rcvMsg.start();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Conectare esuata la server!");
        }
    }//GEN-LAST:event_loginActionPerformed

    BufferedReader in;
    PrintWriter out;

    public class ReceiveMessage extends Thread {

        @Override
        public void run() {
            while (true) {
                String mesajServer;
                try {
                    mesajServer = in.readLine();
                    if (mesajServer.equals("Nume incorect!")) {
                        msgArea.append("Utilizatorul nu exista!" + "\n");
                    } else {
                        if (mesajServer != null) {
                            msgArea.append(mesajServer + "\n");
                        }
                    }
                } catch (IOException ex) {
                    System.out.println("Error in receiveMessage class");
                }
            }

        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField currentUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton login;
    private javax.swing.JTextArea msgArea;
    private javax.swing.JTextField msgText;
    private javax.swing.JTextField receiverUser;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables
}
