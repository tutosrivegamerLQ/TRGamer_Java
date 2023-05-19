/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.trg.calculadora;

import com.sun.source.tree.CaseTree;

/**
 *
 * @author PortGamer
 */
public class calc extends javax.swing.JFrame {

//Para las operaciones matemáticas:
    
    public float numberOne; //Número antes del operador
    public float numberTwo; //Número después del operador
    public String operator; //Operador
//FIn operaciones
    
    public calc() {
        initComponents();
        
     //Para que la interfaz aparezaca en el centro de la pantalla cuandos se ejecuta
     this.setLocationRelativeTo(null);
     //Fin 
     
     this.setSize(262, 384); //Pondrá un tamaño constante
     this.setResizable(false); //Bloqueará la opción de maximizar
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        jColorChooser1 = new javax.swing.JColorChooser();
        Calculadora = new javax.swing.JPanel();
        copyright = new javax.swing.JLabel();
        btn_multiply = new javax.swing.JButton();
        btn_n9 = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_split = new javax.swing.JButton();
        btn_point = new javax.swing.JButton();
        btn_n3 = new javax.swing.JButton();
        btn_equal = new javax.swing.JButton();
        btn_more = new javax.swing.JButton();
        btn_menos = new javax.swing.JButton();
        btn_n6 = new javax.swing.JButton();
        btn_n2 = new javax.swing.JButton();
        btn_n1 = new javax.swing.JButton();
        btn_n4 = new javax.swing.JButton();
        btn_n5 = new javax.swing.JButton();
        btn_n8 = new javax.swing.JButton();
        btn_n7 = new javax.swing.JButton();
        btn_n0 = new javax.swing.JButton();
        screeN = new javax.swing.JLabel();
        btn_bracket_close = new javax.swing.JButton();
        btn_bracket_open = new javax.swing.JButton();

        textField1.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        textField1.setText("textField1");
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator TRG");

        Calculadora.setBackground(new java.awt.Color(51, 51, 51));
        Calculadora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 102, 102)));
        Calculadora.setForeground(new java.awt.Color(60, 63, 65));

        copyright.setBackground(new java.awt.Color(255, 255, 255));
        copyright.setFont(new java.awt.Font("Ravie", 0, 12)); // NOI18N
        copyright.setForeground(new java.awt.Color(0, 255, 0));
        copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyright.setText("BY Tutos Rive Gamer");
        copyright.setAlignmentX(0.5F);
        copyright.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        copyright.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        copyright.setName("copyright"); // NOI18N

        btn_multiply.setBackground(new java.awt.Color(0, 0, 0));
        btn_multiply.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_multiply.setForeground(new java.awt.Color(0, 255, 0));
        btn_multiply.setText("x");
        btn_multiply.setFocusPainted(false);
        btn_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplyActionPerformed(evt);
            }
        });

        btn_n9.setBackground(new java.awt.Color(0, 0, 0));
        btn_n9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_n9.setForeground(new java.awt.Color(0, 255, 0));
        btn_n9.setText("9");
        btn_n9.setFocusPainted(false);
        btn_n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_n9ActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(0, 0, 0));
        btn_delete.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(0, 255, 0));
        btn_delete.setText("C");
        btn_delete.setFocusPainted(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_split.setBackground(new java.awt.Color(0, 0, 0));
        btn_split.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_split.setForeground(new java.awt.Color(0, 255, 0));
        btn_split.setText("÷");
        btn_split.setFocusPainted(false);
        btn_split.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_splitActionPerformed(evt);
            }
        });

        btn_point.setBackground(new java.awt.Color(0, 0, 0));
        btn_point.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_point.setForeground(new java.awt.Color(0, 255, 0));
        btn_point.setText(".");
        btn_point.setFocusPainted(false);
        btn_point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pointActionPerformed(evt);
            }
        });

        btn_n3.setBackground(new java.awt.Color(0, 0, 0));
        btn_n3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_n3.setForeground(new java.awt.Color(0, 255, 0));
        btn_n3.setText("3");
        btn_n3.setFocusPainted(false);
        btn_n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_n3ActionPerformed(evt);
            }
        });

        btn_equal.setBackground(new java.awt.Color(0, 0, 0));
        btn_equal.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_equal.setForeground(new java.awt.Color(0, 255, 0));
        btn_equal.setText("=");
        btn_equal.setFocusPainted(false);
        btn_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalActionPerformed(evt);
            }
        });

        btn_more.setBackground(new java.awt.Color(0, 0, 0));
        btn_more.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_more.setForeground(new java.awt.Color(0, 255, 0));
        btn_more.setText("+");
        btn_more.setFocusPainted(false);
        btn_more.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moreActionPerformed(evt);
            }
        });

        btn_menos.setBackground(new java.awt.Color(0, 0, 0));
        btn_menos.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_menos.setForeground(new java.awt.Color(0, 255, 0));
        btn_menos.setText("-");
        btn_menos.setFocusPainted(false);
        btn_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosActionPerformed(evt);
            }
        });

        btn_n6.setBackground(new java.awt.Color(0, 0, 0));
        btn_n6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_n6.setForeground(new java.awt.Color(0, 255, 0));
        btn_n6.setText("6");
        btn_n6.setFocusPainted(false);
        btn_n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_n6ActionPerformed(evt);
            }
        });

        btn_n2.setBackground(new java.awt.Color(0, 0, 0));
        btn_n2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_n2.setForeground(new java.awt.Color(0, 255, 0));
        btn_n2.setText("2");
        btn_n2.setFocusPainted(false);
        btn_n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_n2ActionPerformed(evt);
            }
        });

        btn_n1.setBackground(new java.awt.Color(0, 0, 0));
        btn_n1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_n1.setForeground(new java.awt.Color(0, 255, 0));
        btn_n1.setText("1");
        btn_n1.setFocusPainted(false);
        btn_n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_n1ActionPerformed(evt);
            }
        });

        btn_n4.setBackground(new java.awt.Color(0, 0, 0));
        btn_n4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_n4.setForeground(new java.awt.Color(0, 255, 0));
        btn_n4.setText("4");
        btn_n4.setFocusPainted(false);
        btn_n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_n4ActionPerformed(evt);
            }
        });

        btn_n5.setBackground(new java.awt.Color(0, 0, 0));
        btn_n5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_n5.setForeground(new java.awt.Color(0, 255, 0));
        btn_n5.setText("5");
        btn_n5.setFocusPainted(false);
        btn_n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_n5ActionPerformed(evt);
            }
        });

        btn_n8.setBackground(new java.awt.Color(0, 0, 0));
        btn_n8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_n8.setForeground(new java.awt.Color(0, 255, 0));
        btn_n8.setText("8");
        btn_n8.setFocusPainted(false);
        btn_n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_n8ActionPerformed(evt);
            }
        });

        btn_n7.setBackground(new java.awt.Color(0, 0, 0));
        btn_n7.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_n7.setForeground(new java.awt.Color(0, 255, 0));
        btn_n7.setText("7");
        btn_n7.setFocusPainted(false);
        btn_n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_n7ActionPerformed(evt);
            }
        });

        btn_n0.setBackground(new java.awt.Color(0, 0, 0));
        btn_n0.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_n0.setForeground(new java.awt.Color(0, 255, 0));
        btn_n0.setText("0");
        btn_n0.setFocusPainted(false);
        btn_n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_n0ActionPerformed(evt);
            }
        });

        screeN.setBackground(new java.awt.Color(0, 0, 0));
        screeN.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 14)); // NOI18N
        screeN.setForeground(new java.awt.Color(0, 255, 0));
        screeN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        screeN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        screeN.setOpaque(true);

        btn_bracket_close.setBackground(new java.awt.Color(0, 0, 0));
        btn_bracket_close.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_bracket_close.setForeground(new java.awt.Color(0, 255, 0));
        btn_bracket_close.setText(")");
        btn_bracket_close.setFocusPainted(false);
        btn_bracket_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bracket_closeActionPerformed(evt);
            }
        });

        btn_bracket_open.setBackground(new java.awt.Color(0, 0, 0));
        btn_bracket_open.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_bracket_open.setForeground(new java.awt.Color(0, 255, 0));
        btn_bracket_open.setText("(");
        btn_bracket_open.setFocusPainted(false);
        btn_bracket_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bracket_openActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CalculadoraLayout = new javax.swing.GroupLayout(Calculadora);
        Calculadora.setLayout(CalculadoraLayout);
        CalculadoraLayout.setHorizontalGroup(
            CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(screeN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(copyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CalculadoraLayout.createSequentialGroup()
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CalculadoraLayout.createSequentialGroup()
                                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CalculadoraLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btn_n4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_n5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_n0, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(CalculadoraLayout.createSequentialGroup()
                                            .addComponent(btn_n1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_n9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_n6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btn_point, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_n3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_more, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CalculadoraLayout.createSequentialGroup()
                                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CalculadoraLayout.createSequentialGroup()
                                        .addComponent(btn_bracket_open, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_bracket_close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CalculadoraLayout.createSequentialGroup()
                                        .addComponent(btn_n7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_n8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_split, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CalculadoraLayout.setVerticalGroup(
            CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(copyright, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(screeN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_split, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bracket_close, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bracket_open, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CalculadoraLayout.createSequentialGroup()
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_n9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_n8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_more, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_n6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_n5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_n4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CalculadoraLayout.createSequentialGroup()
                        .addComponent(btn_n7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_n1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_n3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_n0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_point, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );

        copyright.getAccessibleContext().setAccessibleName("copyright");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_n5ActionPerformed
        this.screeN.setText(this.screeN.getText()+"5");
    }//GEN-LAST:event_btn_n5ActionPerformed

    private void btn_n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_n1ActionPerformed
        this.screeN.setText(this.screeN.getText()+"1");
    }//GEN-LAST:event_btn_n1ActionPerformed

    private void btn_n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_n2ActionPerformed
        this.screeN.setText(this.screeN.getText()+"2");
    }//GEN-LAST:event_btn_n2ActionPerformed

    private void btn_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menosActionPerformed
        this.numberTwo = Float.parseFloat(this.screeN.getText());
        this.operator = "-";
        this.screeN.setText("");
    }//GEN-LAST:event_btn_menosActionPerformed

    private void btn_moreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moreActionPerformed
        this.numberOne = Float.parseFloat(this.screeN.getText());
        this.operator="+";
        this.screeN.setText("");
    }//GEN-LAST:event_btn_moreActionPerformed

    @SuppressWarnings("fallthrough")
    private void btn_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalActionPerformed
        this.numberTwo = Float.parseFloat(this.screeN.getText());
        
        switch (this.operator) {
            case "+":this.screeN.setText(NoZero(this.numberOne+this.numberTwo));
            break;
                
            case "-":this.screeN.setText(NoZero(this.numberOne-this.numberTwo));
            break;
            
            case "*":this.screeN.setText(NoZero(this.numberOne*this.numberTwo));
            break;
            case "/":this.screeN.setText(NoZero(this.numberOne/this.numberTwo));
            break;
        }
    }//GEN-LAST:event_btn_equalActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        
    }//GEN-LAST:event_textField1ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        this.screeN.setText("");
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_bracket_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bracket_closeActionPerformed
        this.screeN.setText(this.screeN.getText()+")");
    }//GEN-LAST:event_btn_bracket_closeActionPerformed

    private void btn_bracket_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bracket_openActionPerformed
        this.screeN.setText(this.screeN.getText()+"(");
    }//GEN-LAST:event_btn_bracket_openActionPerformed

    private void btn_n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_n0ActionPerformed
        this.screeN.setText(this.screeN.getText()+"0");
    }//GEN-LAST:event_btn_n0ActionPerformed

    private void btn_pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pointActionPerformed
        if (!(this.screeN.getText().contains("."))){
            this.screeN.setText(this.screeN.getText()+".");
        }
    }//GEN-LAST:event_btn_pointActionPerformed

    private void btn_n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_n3ActionPerformed
        this.screeN.setText(this.screeN.getText()+"3");
    }//GEN-LAST:event_btn_n3ActionPerformed

    private void btn_n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_n6ActionPerformed
        this.screeN.setText(this.screeN.getText()+"6");
    }//GEN-LAST:event_btn_n6ActionPerformed

    private void btn_n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_n4ActionPerformed
        this.screeN.setText(this.screeN.getText()+"4");
    }//GEN-LAST:event_btn_n4ActionPerformed

    private void btn_n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_n9ActionPerformed
        this.screeN.setText(this.screeN.getText()+"9");
    }//GEN-LAST:event_btn_n9ActionPerformed

    private void btn_n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_n8ActionPerformed
        this.screeN.setText(this.screeN.getText()+"8");
    }//GEN-LAST:event_btn_n8ActionPerformed

    private void btn_n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_n7ActionPerformed
        this.screeN.setText(this.screeN.getText()+"7");
    }//GEN-LAST:event_btn_n7ActionPerformed

    private void btn_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplyActionPerformed
        this.numberTwo = Float.parseFloat(this.screeN.getText());
        this.operator = "*";
        this.screeN.setText("");
    }//GEN-LAST:event_btn_multiplyActionPerformed

    private void btn_splitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_splitActionPerformed
        this.numberTwo = Float.parseFloat(this.screeN.getText());
        this.operator = "/";
        this.screeN.setText("");
    }//GEN-LAST:event_btn_splitActionPerformed

    
    public String NoZero (float result){
    String Return = "";
    Return = Float.toString(result);
    if (result%1==0){
        Return = Return.substring(0, Return.length()-2);
    }
    
    
    return Return;
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
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Calculadora;
    private javax.swing.JButton btn_bracket_close;
    private javax.swing.JButton btn_bracket_open;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_equal;
    private javax.swing.JButton btn_menos;
    private javax.swing.JButton btn_more;
    private javax.swing.JButton btn_multiply;
    private javax.swing.JButton btn_n0;
    private javax.swing.JButton btn_n1;
    private javax.swing.JButton btn_n2;
    private javax.swing.JButton btn_n3;
    private javax.swing.JButton btn_n4;
    private javax.swing.JButton btn_n5;
    private javax.swing.JButton btn_n6;
    private javax.swing.JButton btn_n7;
    private javax.swing.JButton btn_n8;
    private javax.swing.JButton btn_n9;
    private javax.swing.JButton btn_point;
    private javax.swing.JButton btn_split;
    private javax.swing.JLabel copyright;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel screeN;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
