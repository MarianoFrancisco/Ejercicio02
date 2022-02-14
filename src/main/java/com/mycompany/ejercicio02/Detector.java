/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio02;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/**
 *
 * @author Mariano
 */
public class Detector extends javax.swing.JFrame {

    /**
     * Creates new form Detector
     */
    codigoVocalesNumeros analizadorVocalesNumeros;
    public Detector() {
        initComponents();//iniciamos componentes
        this.setLocationRelativeTo(null);//Centramos nuestro frame
        estancia(filaA,columnaA,TextoA);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        analizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextoR = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextoA = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        columnaA = new javax.swing.JLabel();
        filaA = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador de palabras con estructura alfanúmerica.");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        analizar.setBackground(new java.awt.Color(255, 255, 0));
        analizar.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        analizar.setForeground(new java.awt.Color(0, 0, 0));
        analizar.setText("Analizar");
        analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizarActionPerformed(evt);
            }
        });

        TextoR.setColumns(20);
        TextoR.setRows(5);
        jScrollPane1.setViewportView(TextoR);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Introduce tu texto a analizar");

        TextoA.setColumns(20);
        TextoA.setRows(5);
        jScrollPane2.setViewportView(TextoA);

        jLabel2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Resultado de análicis");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));

        columnaA.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        columnaA.setForeground(new java.awt.Color(0, 0, 0));
        columnaA.setText("Columna actual: 1");

        filaA.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        filaA.setForeground(new java.awt.Color(0, 0, 0));
        filaA.setText("Fila actual: 1");

        jLabel6.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Información texto Ingresado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(filaA))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(columnaA)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filaA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(columnaA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(analizar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(154, 154, 154))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(analizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizarActionPerformed
        String texto= TextoA.getText();//llamamos nuestro texto
        //verificamos si esta vacio
        if(texto.isEmpty()){
            TextoR.setText("");
            //mensaje error
            JOptionPane.showMessageDialog(null, "Primero ingresa algo en el texto a analizar");
        }else{
            Reader reader = new StringReader(texto);//lector
            analizadorVocalesNumeros = new codigoVocalesNumeros(reader);//asignamos valor
        try {
            int output = analizadorVocalesNumeros.yylex();
            while (output != codigoVocalesNumeros.YYEOF) {//tomamos valores
                analizadorVocalesNumeros.yylex();
            }
            if (analizadorVocalesNumeros.getError()==0) {//si no tenemos error imprimimos resultados
                TextoR.setText("");
                //vocales
                TextoR.setText(TextoR.getText() + "------------>Palabras con determinada cantidad de vocales :\n");
                TextoR.setText(TextoR.getText() + "Cantidad de palabras que tienen 1 vocal:" + analizadorVocalesNumeros.getIncrementarContador1() + " palabras\n");
                TextoR.setText(TextoR.getText() + "Cantidad de palabras que tienen 2 vocales:" + analizadorVocalesNumeros.getIncrementarContador2() + " palabras\n");
                TextoR.setText(TextoR.getText() + "Cantidad de palabras que tienen 3 vocales:" + analizadorVocalesNumeros.getIncrementarContador3() + " palabras\n");
                TextoR.setText(TextoR.getText() + "Cantidad de palabras que tienen 4 vocales:" + analizadorVocalesNumeros.getIncrementarContador4() + " palabras\n");
                TextoR.setText(TextoR.getText() + "Cantidad de palabras que tienen 5 vocales:" + analizadorVocalesNumeros.getIncrementarContador5() + " palabras\n");
                //numeros
                TextoR.setText(TextoR.getText() + "------------>Numeros Encontrados :\n");
                //recorremos posiciones de array
                for (int i = 0; i < analizadorVocalesNumeros.getNumerosEncontrados().size(); i++) {
                    TextoR.setText(TextoR.getText() + analizadorVocalesNumeros.getNumerosEncontrados().get(i) + "\n");
                }
            }else{
                TextoR.setText("");
                JOptionPane.showMessageDialog(null, "Error ingresó un caracter que no es alfanumerico");
            }
        } catch (IOException e) {
            TextoR.setText("Error");
        }
        }
        
    }//GEN-LAST:event_analizarActionPerformed
    public void estancia(JLabel filaA,JLabel columnaA,JTextArea carga){
        carga.addCaretListener(new CaretListener() {//para ver la posicion
            @Override
            public void caretUpdate(CaretEvent e) {//caret es para verificar si hay cambio click
                JTextArea editar = (JTextArea) e.getSource();
                int filaActual = 1,columnaReciente=1;
                try {
                    int caretpos = editar.getCaretPosition();// editamos el área
                    filaActual = editar.getLineOfOffset(caretpos);
                    //columna debe ser 1 al inicio
                    columnaReciente = caretpos - editar.getLineStartOffset(filaActual)+1;
                    filaActual += 1;//cuando avance un se le sumara uno a la linea
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
                //reevisamos nuevamente
                filaA.setText("F "
                        + ""
                        + "ILA ACTUAL: "+filaActual);
                columnaA.setText("COLUMNA ACTUAL: "+columnaReciente);
            }
        });
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);//salimos
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextoA;
    private javax.swing.JTextArea TextoR;
    private javax.swing.JButton analizar;
    private javax.swing.JLabel columnaA;
    private javax.swing.JLabel filaA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
