/**
 * Clase que carga la interfaz grafica y realiza los procesos de validacion 
 * de los tokens generados.
 */

package GUI;

import Lexico.Identificador;
import Lexico.Token;
import static Lexico.Token.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;


public class GUI_inter extends javax.swing.JFrame {

    /**
     * Listado de tokens
     */
    List<Identificador> tokenslist;
    
    
    public GUI_inter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtEcuacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtVarReemp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        btnAnalizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaResultadoComp = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtEcuacion.setText("5x^3+x");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Ecuacion");

        txtVarReemp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVarReemp.setText("2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Valor variable a reeemplazar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Resultado de la ecuacion");

        txtResultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado.setText("0");

        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado compilador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jtaResultadoComp.setColumns(20);
        jtaResultadoComp.setRows(5);
        jScrollPane2.setViewportView(jtaResultadoComp);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(11, 11, 11)
                                .addComponent(txtEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtResultado)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVarReemp)
                            .addComponent(btnAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtVarReemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Integrantes.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Oscar Javier Oviedo.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Anderson Gutierrez.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("John Freddy Rivera.");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Compiladores");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Proyecto 1");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Analizador Lexico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(214, 214, 214)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        try{            
            probarLexerFile();
            calcularEcu();
        }
        catch (IOException ex){
            JOptionPane.showMessageDialog(rootPane, "Error: " + ex.getMessage(), "Error de lectura", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAnalizarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_inter().setVisible(true);
            }
        });
    }
    
    /**
     * Metodo que realizar la comprobacion de los tokens.
     * 
     * @throws IOException 
     */
    public void probarLexerFile() throws IOException{
        
        int iContadorVar=0;
        
        tokenslist = new LinkedList<Identificador>();
        
        /**
         * Se genera un archivo ya que la entrada del lexer en un 
         * BufferReader.
         */
        File objFile = new File ("file.txt");
        
        PrintWriter objWriter;
        
        
        /**
         * Se crea el archivo con la ecuacion.
         */
        try {
            objWriter = new PrintWriter(objFile);
            objWriter.print(txtEcuacion.getText());
            objWriter.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + ex.getMessage(), "Error de lectura", JOptionPane.ERROR_MESSAGE);
        }
        
        
        /**
         * Se le envian los parametros al Lexer.
         */
        Reader objReader = new BufferedReader(new FileReader("file.txt"));
        Lexer objLexer = new Lexer (objReader);
        
        String sCadenaImpresionToken = "";
        String sCadenaImpresionReviEcu = "";

        /**
         * Se evaluar el token.
         */
        while (true){
            
            Token objToken = objLexer.yylex();
            
            if (objToken == null){
                
                /**
                 * Impresiones varias.
                 */
                jtaResultadoComp.append("\n\nEcuacion analizada.\n");
                jtaResultadoComp.append("--------------------------------------------\n");
                jtaResultadoComp.append(sCadenaImpresionToken);
                
                return;
            }
            
            /**
             * Se evaluar cada caracter para determinar de que tipo es.
             */
            switch (objToken){
                case VAR:
                    sCadenaImpresionReviEcu = sCadenaImpresionReviEcu + "TOKEN\t" + objToken + "\t" + objLexer.lexeme + "\n";
                    break;
                case INT:
                    sCadenaImpresionReviEcu = sCadenaImpresionReviEcu + "TOKEN\t" + objToken + "\t" + objLexer.lexeme + "\n";
                    break;
                case FLOAT:
                    sCadenaImpresionReviEcu = sCadenaImpresionReviEcu + "TOKEN\t" + objToken + "\t" + objLexer.lexeme + "\n";
                    break;
                case SUMA:
                    sCadenaImpresionReviEcu = sCadenaImpresionReviEcu + "TOKEN\t" + objToken + "\t" + "+" + "\n";
                    break;
                case RESTA:
                    sCadenaImpresionReviEcu = sCadenaImpresionReviEcu + "TOKEN\t" + objToken + "\t" + "-" + "\n";
                    break;
                case MULT:
                    sCadenaImpresionReviEcu = sCadenaImpresionReviEcu + "TOKEN\t" + objToken + "\t" + "*" + "\n";
                    break;
                case DIV:
                    sCadenaImpresionReviEcu = sCadenaImpresionReviEcu + "TOKEN\t" + objToken + "\t" + "/" + "\n";
                    break;
                case EXPO:
                    sCadenaImpresionReviEcu = sCadenaImpresionReviEcu + "TOKEN\t" + objToken + "\t" + "^" + "\n";
                    break;
                case PAREN_I:
                    sCadenaImpresionReviEcu = sCadenaImpresionReviEcu + "TOKEN\t" + objToken + "\t" + "(" + "\n";
                    break;
                case PAREN_F:
                    sCadenaImpresionReviEcu = sCadenaImpresionReviEcu + "TOKEN\t" + objToken + "\t" + ")" + "\n";
                    break;
                default:
                    sCadenaImpresionReviEcu = sCadenaImpresionReviEcu + "TOKEN\t" + objToken + "\t" + "simbolo no reconocido" + "\n";
                    break;
            }
            
            jtaResultadoComp.setText(sCadenaImpresionReviEcu);
                
            
            switch (objToken){
                case PAREN_I:
                    sCadenaImpresionToken=sCadenaImpresionToken+ "<(>";
                    break;
                case PAREN_F:
                    sCadenaImpresionToken=sCadenaImpresionToken+ "<)>";
                    break;
                case SUMA:
                    sCadenaImpresionToken=sCadenaImpresionToken+ "<+>";
                    break;
                case EXPO:
                    sCadenaImpresionToken=sCadenaImpresionToken+ "<^>";
                    break;
                case RESTA:
                    sCadenaImpresionToken=sCadenaImpresionToken+ "<->";
                    break;
                case MULT:
                    sCadenaImpresionToken=sCadenaImpresionToken+ "<*>";
                    break;
                case DIV:
                    sCadenaImpresionToken=sCadenaImpresionToken+ "</>";
                    break;
                case ASSIGN:
                    sCadenaImpresionToken=sCadenaImpresionToken+ "<=>";
                    break;
                case ERROR:
                    sCadenaImpresionToken=sCadenaImpresionToken+ "Error, simbolo no reconocido ";
                    break;
                case VAR: {
                    iContadorVar++;
                    Identificador tokenitem=new Identificador();
                    tokenitem.NOMBRE=objLexer.lexeme;
                    tokenitem.VAR=iContadorVar;
                    tokenslist.add(tokenitem);
                    sCadenaImpresionToken=sCadenaImpresionToken+ "<VAR" + iContadorVar + ">";
                    break;
                }
                case INT:
                    sCadenaImpresionToken=sCadenaImpresionToken+ "<" + objLexer.lexeme + "> ";
                    break;
                case FLOAT:
                    sCadenaImpresionToken=sCadenaImpresionToken+ "<" + objLexer.lexeme + "> ";
                    break;
                default:
                    sCadenaImpresionToken=sCadenaImpresionToken+ "<"+ objLexer.lexeme + "> ";
            }
        }
 }
    
    
    /**
     * Metodo que realiza el calculo de la ecuacion.
     */
    private void calcularEcu(){
        
        /**
         * Cadena Optenida de la ecuacion
         */
        String sCadena = txtEcuacion.getText().trim().toUpperCase();
        
        /**
         * Criterios de reemplazo
         */
        sCadena = sCadena.replace("+", "<sp>+<sp>");
        sCadena = sCadena.replace("-", "<sp>-<sp>");
        
        
        String[] a_sCadenaReem = sCadena.split("<sp>");
        int iValorReemplazo = Integer.parseInt(txtVarReemp.getText().trim());
                
        ArrayList arrayTMP = new ArrayList();
        arrayTMP.addAll(Arrays.asList(a_sCadenaReem));
        
        /**
         * Se eliminan espacios en blanco.
         */
        arrayTMP.remove("");
        
        for (int i = 0; i < arrayTMP.size(); i++) {
            
            if(arrayTMP.get(i).toString().trim().contains("^")){
                String[] a_sTMP = arrayTMP.get(i).toString().trim().split("");
                
                
                if(!a_sTMP[1].equals("")){
                    if(a_sTMP[1].matches("[0-9]*")){

                        int iVal1 = Integer.parseInt(a_sTMP[1]);
                        int iExponente = Integer.parseInt(a_sTMP[4]);
                        double resp = (iVal1*(Math.pow(Double.parseDouble(iValorReemplazo + ""), Double.parseDouble(iExponente + ""))));
                        arrayTMP.set(i, resp);
                        //System.out.println("Sol 1: " + resp);
                    }else if(a_sTMP[1].toUpperCase().equals("X")){
                        
                        String stringArreglo = "1";
                        
                        for (int j = 0; j < a_sTMP.length; j++) {
                            stringArreglo += "," + a_sTMP[j];                            
                        }
                        
                        stringArreglo = stringArreglo.replace(",,", ",");
                        
                        String[] a_sTMP_a = stringArreglo.split(",");
                        
                        int iVal1 = Integer.parseInt(a_sTMP_a[0]);
                        int iExponente = Integer.parseInt(a_sTMP_a[3]);
                        double resp = (iVal1*(Math.pow(Double.parseDouble(iValorReemplazo + ""), Double.parseDouble(iExponente + ""))));
                        arrayTMP.set(i, resp);
                        
                        
                    }
                }
            }
            
            if(arrayTMP.get(i).toString().trim().contains("X")){
                String[] a_sTMP = arrayTMP.get(i).toString().trim().split("X");
                
                if(a_sTMP.length > 1){
                    
                    int iTmp = 0;
                    
                    for (int j = 0; j < a_sTMP.length; j++) {
                        iTmp += Integer.parseInt(a_sTMP[j]);                        
                    }
                    
                    iTmp += iValorReemplazo;                    
                    arrayTMP.set(i, iTmp);
                }else{
                    arrayTMP.set(i, iValorReemplazo);
                }
            }
        }
        
        int iResultadoFinal = 0;
        
        for (int i = 0; i < arrayTMP.size(); i++) {
            Object object = arrayTMP.get(i);
            arrayTMP.set(i, object.toString().replace(".", ""));
        }
    
        
        iResultadoFinal = new Double(arrayTMP.get(0).toString()).intValue();
        

        if(arrayTMP.get(1).equals("+")){
            iResultadoFinal = iResultadoFinal + Integer.parseInt(arrayTMP.get(2).toString());            
        }else{
            iResultadoFinal = iResultadoFinal + Integer.parseInt(arrayTMP.get(2).toString());
        }

        txtResultado.setText(iResultadoFinal + "");
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jtaResultadoComp;
    private javax.swing.JTextField txtEcuacion;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtVarReemp;
    // End of variables declaration//GEN-END:variables

}
