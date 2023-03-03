package medios_Cuadrados;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author yolotl
 */
public class CuadradoMedio extends javax.swing.JFrame {

    DefaultTableModel modelo;
// Constructor de la clase CuadradoMedio
    public CuadradoMedio() {
// Inicializa los componentes visuales de la interfaz gráfica
        initComponents();
// Crea un nuevo modelo de tabla por defecto
        modelo = new DefaultTableModel();

// Crea un arreglo de Strings con los nombres de las columnas
        String[] columns = {"n", "x0", "Operacion", "Caracteres"};

// Asigna los nombres de las columnas al modelo de tabla
        modelo.setColumnIdentifiers(columns);

// Asigna el modelo de tabla a la tablaValores presente en la interfaz gráfica
        tablaValores.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSemillas = new javax.swing.JTextField();
        btnGenerarNumeros = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaValores = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CUADRADO MEDIO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Número semilla:");

        txtSemillas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSemillas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSemillasKeyTyped(evt);
            }
        });

        btnGenerarNumeros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerarNumeros.setText("Generar números");
        btnGenerarNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNumerosActionPerformed(evt);
            }
        });

        tablaValores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaValores);

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtSemillas, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGenerarNumeros))
                            .addComponent(btnNuevo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSemillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarNumeros))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarNumerosActionPerformed
        // TODO add your handling code here:
        // Obtiene el número de dígitos de la semilla ingresada en el cuadro de texto txtSemillas.
        int nDigitos = txtSemillas.getText().trim().length();

// Convierte la semilla ingresada en el cuadro de texto txtSemillas en un número entero y lo almacena en la variable nSemilla.
        int nSemilla = Integer.parseInt(txtSemillas.getText().trim());
/*La siguiente condición verifica si la variable nDigitos es igual a 4 y si la 
        variable nSemilla está en el rango de 1000 a 9999 (incluyendo el límite inferior 
        pero no el límite superior). Si ambas condiciones se cumplen, el bloque de código dentro de esta condición se ejecutará.
        */
        if (nDigitos == 4 && nSemilla >= 1000 && nSemilla < 10000) {
          // inicialización de variables
            int x0 = 0; // semilla
            int operacion = 0; // operación realizada en la iteración
            int n = 1; // número de iteración

            for (int i = 0; i < n; i++) {
                if (n == 1) {
                    x0 = nSemilla; // Asigna la semilla ingresada a la variable x0
                    operacion = x0 * x0; //Realiza la operación del método del cuadrado medio

                    String cadena = "" + operacion; // Convierte el resultado de la operación a un string
                    float opc = cadena.length() / 2; // Divide la longitud del string entre 2 y lo almacena como un número flotante
                    int op = (int) opc; // Convierte el número flotante a un número entero
                    if (cadena.length() >= 4) {  // Si el string resultante es mayor o igual a 4 caracteres
                        modelo.addRow(new Object[]{n, x0, operacion, cadena.substring(op - 2, op + 2)});  // Agrega una nueva fila a la tabla con los valores correspondientes
                        n = n + 1; // Incrementa el valor de n para la próxima iteración
/*en el siguiente else if se ejecuta cuando el número generado tiene menos de 4 dígitos. Se procede a agregar ceros
      a la izquierda hasta completar los 4 dígitos necesarios. Luego se agrega la fila con el número 
                        generado con los ceros agregados y se incrementa el contador de filas generadas.*/
                        } else if (cadena.length() < 4) {
                        int sn = 4 - (cadena.length());//Se calcula la cantidad de ceros que se deben agregar al número generado.
                        String c = ""; //Se inicializa una cadena vacía para ir agregando los ceros necesarios.
                        for (int j = 0; j < sn; j++) { //Se realiza un ciclo for para agregar los ceros necesarios a la cadena c.
                            String a = c + ""; //Se crea una copia de la cadena c.
                            String b = "0"; // Se inicializa una cadena con un cero.
                            c = a + b + ""; //Se concatenan las cadenas a y b, y se asigna el resultado a c.
                        }
                        String cadenas = c + cadena;//Se concatenan las cadenas c y cadena (el número generado con menos de 4 dígitos).
//en modelo.addRow se agrega la fila a la tabla con el número generado con los ceros agregados.
                        modelo.addRow(new Object[]{n, x0, operacion, cadenas});
                        n = n + 1;
                    }
                } else {
                    x0 = Integer.parseInt(modelo.getValueAt(n - 2, 3) + "");
                    int xn=0;
                    if (x0 == 0) {
                        JOptionPane.showMessageDialog(rootPane, "La operación se termina en " + (n - 1));
                    } else {
                        int cpr = 0;
                        int dato = 0;
                        for (int j = 0; j < tablaValores.getRowCount(); j++) {
                            if (x0 == Integer.parseInt(modelo.getValueAt(j, 1).toString())) {
                                cpr = 1;
                                dato=Integer.parseInt(modelo.getValueAt(j, 1).toString());
                                xn=Integer.parseInt(modelo.getValueAt(j, 0).toString());
                                break;
                            }
                        }
                        if (cpr == 0) {
                            // Usar Math.random para obtener un número pseudoaleatorio
                    double random = Math.random();
                    operacion = (int) (random * 10000); // Multiplicar por 10000 para obtener un número de 4 dígitos

                    // Usar el principio de medios cuadrados
                            String cadena = "" + operacion;
                            float opc = cadena.length() / 2;
                            int op = (int) opc;
                            if (cadena.length() >= 4) {
                                modelo.addRow(new Object[]{n, x0, operacion, cadena.substring(op - 2, op + 2)});
                                n = n + 1;
                            } else if (cadena.length() < 4) {
                                int sn = 4 - (cadena.length());
                                String c = "";
                                for (int j = 0; j < sn; j++) {
                                    String a = c + "";
                                    String b = "0";
                                    c = a + b + "";
                                }
                                String cadenas = c + cadena;
                                modelo.addRow(new Object[]{n, x0, operacion, cadenas});
                                n = n + 1;
                            }
                        } else if (cpr > 0) {
                            JOptionPane.showMessageDialog(rootPane, "La semilla " +xn+"="+ x0 +" se repite en " + (n - 1)+": "+dato);
                        }
                    }
                }
            }
            /* Si el campo de semillas está vacío, se muestra un mensaje de advertencia en un cuadro de diálogo.
    Si el campo de semillas tiene una longitud diferente a 4, se muestra un mensaje de advertencia en un cuadro de diálogo.
    En cualquier otro caso, se genera la secuencia de números aleatorios a través del método del cuadrado medio
    y se agregan los valores generados a una tabla en la interfaz gráfica. */
        } else if (nDigitos == 0) {
            JOptionPane.showMessageDialog(rootPane, "El campo de semillas no debe estar vacío!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Solo debe ser de 4 digitos!");
        }
        
        // Si el modelo tiene al menos una fila
        if (modelo.getRowCount() != 0) {
            // Habilitar el botón "Nuevo" y deshabilitar el botón "Generar números"
            btnNuevo.setEnabled(true);
            btnGenerarNumeros.setEnabled(false);
        }
    }//GEN-LAST:event_btnGenerarNumerosActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // Eliminar todos los elementos del modelo de datos
        modelo.getDataVector().removeAllElements();

        // Actualizar la interfaz de usuario para reflejar los cambios
        tablaValores.updateUI();

        // Desactivar el botón "Nuevo"
        btnNuevo.setEnabled(false);

        // Activar el botón "Generar números"
        btnGenerarNumeros.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtSemillasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSemillasKeyTyped
        // TODO add your handling code here:
        // Obtenemos el caracter presionado por el usuario
        Character c = evt.getKeyChar();
        // Verificamos si es una letra
        if (Character.isLetter(c)) {
            // Si es una letra, consumimos el evento para evitar que se procese
            evt.consume();
        }
    }//GEN-LAST:event_txtSemillasKeyTyped

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
            java.util.logging.Logger.getLogger(CuadradoMedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuadradoMedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuadradoMedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuadradoMedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuadradoMedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarNumeros;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaValores;
    private javax.swing.JTextField txtSemillas;
    // End of variables declaration//GEN-END:variables
}
