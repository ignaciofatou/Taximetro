/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import es.javiergarbedo.coordinateslib.CoordinatesConverter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.validator.routines.CreditCardValidator;

/**
 *
 * @author Ignacio
 */
public class Ventana extends javax.swing.JFrame {

    int contadorTicket   = 0;
    long iniMilisegundos = 0;
    final double TARIFA  = 0.50;
    final double IVA     = 0.21;
    
    public Ventana() {
        initComponents();
        
        jButtonBandera.setEnabled(true);
        jButtonFin.setEnabled(false);
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
        jTextLatitud = new javax.swing.JTextField();
        jTextLongitud = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLLatitud = new javax.swing.JLabel();
        jLLongitud = new javax.swing.JLabel();
        jLabelIcono = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextDestino = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextTarjeta = new javax.swing.JTextField();
        jButtonComprobar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTicket = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabelMapaRuta = new javax.swing.JLabel();
        jButtonBandera = new javax.swing.JButton();
        jButtonFin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taxímetro");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Posición GPS Inicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jTextLatitud.setText("36.6750169");

        jTextLongitud.setText("-5.4465834");

        jLabel1.setText("Latitud");

        jLabel2.setText("Longitud");

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SatCar.jpg"))); // NOI18N
        jLabelIcono.setPreferredSize(new java.awt.Dimension(329, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextLatitud, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jTextLongitud))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLLongitud)
                    .addComponent(jLLatitud))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLLatitud))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLLongitud))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del trayecto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jLabel3.setText("Destino");

        jTextDestino.setText("Sevilla");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextDestino)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tarjeta de crédito", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jButtonComprobar.setText("Comprobar");
        jButtonComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprobarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTextTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonComprobar))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonComprobar))
        );

        jTextAreaTicket.setEditable(false);
        jTextAreaTicket.setColumns(20);
        jTextAreaTicket.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTicket);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mapa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMapaRuta, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelMapaRuta, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonBandera.setBackground(new java.awt.Color(0, 153, 51));
        jButtonBandera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBandera.setText("START");
        jButtonBandera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBanderaActionPerformed(evt);
            }
        });

        jButtonFin.setBackground(new java.awt.Color(204, 0, 0));
        jButtonFin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonFin.setText("FINISH");
        jButtonFin.setEnabled(false);
        jButtonFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButtonBandera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFin))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonFin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBandera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBanderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBanderaActionPerformed
        
        //Incremento el Numero de Ticket
        contadorTicket++;
        DecimalFormat formato = new DecimalFormat("00000");        
        
        jTextAreaTicket.setText("");
        jTextAreaTicket.append("TICKET\n======\n");
        jTextAreaTicket.append("Nº ticket: " + formato.format(contadorTicket) + "\n");
        
        // Obtenenmos la Fecha Actual
        formato.applyPattern("00");
        Calendar rightNow = Calendar.getInstance();
        iniMilisegundos = rightNow.getTimeInMillis();

        //Mostramos la Fecha en formato DD-MM-YYYY
        SimpleDateFormat horaActual = new SimpleDateFormat("d-M-y");
        jTextAreaTicket.append("Fecha: " + horaActual.format(rightNow.getTime()) + "\n\n");

        //Mostramos la Hora en formato HH:MI:SS
        horaActual.applyPattern("HH:mm:ss");
        jTextAreaTicket.append("Hora bajada de bandera: " +  horaActual.format(rightNow.getTime()) + "\n");
        
        //Ponemos las coordenadas
        muestraCoordenadas();
        
        // Cambiamos de orden la habilitacion de botones
        jButtonBandera.setEnabled(false);
        jButtonFin.setEnabled(true);
    }//GEN-LAST:event_jButtonBanderaActionPerformed

    private void muestraCoordenadas(){
        
        //Latitud
        System.out.println("latitud: " + jTextLatitud.getText());
        if (!jTextLatitud.getText().equals("")){
            jTextLatitud.setText(jTextLatitud.getText().replace(",", "."));
            jLLatitud.setText(CoordinatesConverter.decimalToDMS(Double.valueOf(jTextLatitud.getText())));
        }            
        else
            jLLatitud.setText("");
        System.out.println("latitud: " + jTextLatitud.getText());

        //Longitud
        if (!jTextLongitud.getText().equals("")){
            jTextLongitud.setText(jTextLongitud.getText().replace(",", "."));
            jLLongitud.setText(CoordinatesConverter.decimalToDMS(Double.valueOf(jTextLongitud.getText())));
        }
        else
            jLLongitud.setText("");
    }
    
    private void jButtonFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinActionPerformed
        
        // Obtenenmos la Fecha Final
        Calendar rightNow     = Calendar.getInstance();
        long finMilisegundos  = rightNow.getTimeInMillis();
        
        //Mostramos la Hora en formato HH:MI:SS
        SimpleDateFormat horaActual = new SimpleDateFormat("HH:mm:ss");
        jTextAreaTicket.append("Hora fin trayecto: " +  horaActual.format(rightNow.getTime()) + "\n");
        
        //Calculamos el Tiempo total
        long segTotales = (finMilisegundos  - iniMilisegundos) / 1000;

        //Mostramos la Duración del Viaje
        jTextAreaTicket.append("Duración trayecto: " + DurationFormatUtils.formatDuration(segTotales * 1000, "H:mm:ss") + "\n");
        
        //Calculamos y Mostramos los Importes
        calculaImportes(segTotales);
        
        //Mostramos el Recorrido en el Mapa
        muestraRecorridoMapa();
        
        // Cambiamos de orden la habilitacion de botones
        jButtonBandera.setEnabled(true);
        jButtonFin.setEnabled(false);
    }//GEN-LAST:event_jButtonFinActionPerformed

    private void jButtonComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprobarActionPerformed
        
        // Validamos la Tarjeta de Credito
        if (!jTextTarjeta.getText().equals("")){

            CreditCardValidator validaTarjeta = new CreditCardValidator();
        
            if (validaTarjeta.isValid(jTextTarjeta.getText()))
                JOptionPane.showMessageDialog(
                this, 
                "Tarjeta Válida", 
                "Correcto", 
                JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(
                this, 
                "Tarjeta Inválida", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonComprobarActionPerformed
    
    private void calculaImportes(long segundos)
    {
        //Mostramos la Tarifa por Minuto
        jTextAreaTicket.append("Tarifa por minuto: " + TARIFA + " €" + "\n" + "\n");
        
        double importe = (segundos * TARIFA) / 60;
        double importeIVA = (importe * IVA);
        double importeTotal = importe + importeIVA;
        
        //Establecemos el Formato para Redondear a 2 decimales
        DecimalFormat formato = new DecimalFormat("#.##"); 
        
        jTextAreaTicket.append("Importe: " + formato.format(importe) + " €" + "\n");
        jTextAreaTicket.append("IVA: " + formato.format(importeIVA) + " €" + "\n");
        jTextAreaTicket.append("Importe total: " + formato.format(importeTotal) + " €");
    }
    
    private void muestraRecorridoMapa(){
        //Cambia los siguientes valores por las direciones de origen y destino deseadas
        String origen = jTextLatitud.getText() + "," + jTextLongitud.getText();
        String destino = jTextDestino.getText();

        //Hay que sustituir los espacios por el carácter %20 para que se
        //  interprete bien la URL que se generará
        destino = destino.replaceAll(" ", "%20");

        //Cambia el nombre [etiqueta] por el nombre de un objeto JLabel (etiqueta) que
        //  has debido colocar antes en el formulario y que será donde se muestre el mapa.
        //  Deja la etiqueta del formulario sin ningún texto en el diseño.
        javax.swing.JLabel jLabelMapa = jLabelMapaRuta;

        //Indica aquí el tamaño que desees para el mapa
        int tamHorizontal = 200;
        int tamVertical = 200;
        //Puedes encontrar más información sobre el uso de mapas estáticos de Google Maps aquí:
        //  http://code.google.com/intl/es-ES/apis/maps/documentation/staticmaps/

        //A partir de aquí no hace falta cambiar nada
        try {
            String txtDireccionImagenMapa = "http://maps.google.com/maps/api/staticmap?path="
                    + origen + "|" + destino + "&size=" + tamHorizontal + "x" + tamVertical
                    + "&language=ES&sensor=false";
            System.out.println(txtDireccionImagenMapa);
            java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
            java.awt.Image imagenMapa = toolkit.getImage(new java.net.URL(txtDireccionImagenMapa));
            jLabelMapa.setIcon(new javax.swing.ImageIcon(imagenMapa));
        } catch (java.net.MalformedURLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "La dirección de imagen indicada no es correcta");
        }
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBandera;
    private javax.swing.JButton jButtonComprobar;
    private javax.swing.JButton jButtonFin;
    private javax.swing.JLabel jLLatitud;
    private javax.swing.JLabel jLLongitud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelMapaRuta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaTicket;
    private javax.swing.JTextField jTextDestino;
    private javax.swing.JTextField jTextLatitud;
    private javax.swing.JTextField jTextLongitud;
    private javax.swing.JTextField jTextTarjeta;
    // End of variables declaration//GEN-END:variables
}
