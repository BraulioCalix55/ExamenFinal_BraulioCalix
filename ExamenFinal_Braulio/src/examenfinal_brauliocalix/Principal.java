/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_brauliocalix;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principla
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_planeta = new javax.swing.JDialog();
        pa_nombre = new javax.swing.JTextField();
        pa_temp = new javax.swing.JSpinner();
        pa_anillo = new javax.swing.JComboBox<>();
        pa_super = new javax.swing.JTextField();
        pa_dist = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Crea_planeta = new javax.swing.JButton();
        JD_astro = new javax.swing.JDialog();
        as_nombre = new javax.swing.JTextField();
        as_nacio = new javax.swing.JTextField();
        as_sueldo = new javax.swing.JTextField();
        as_exp = new javax.swing.JSpinner();
        as_genero = new javax.swing.JComboBox<>();
        as_peso = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        crea_astr = new javax.swing.JButton();
        JD_naves = new javax.swing.JDialog();
        na_serie = new javax.swing.JTextField();
        na_destino = new javax.swing.JComboBox<>();
        na_velocidad = new javax.swing.JSpinner();
        na_tipo = new javax.swing.JComboBox<>();
        na_crea = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        JD_sonda = new javax.swing.JDialog();
        son_material = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        son_crea = new javax.swing.JButton();
        son_peso = new javax.swing.JSpinner();
        JD_tripulado = new javax.swing.JDialog();
        Tri_despegue = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tri_combo = new javax.swing.JComboBox<>();
        agrega_as = new javax.swing.JButton();
        crea_tripu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_astros = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_exp = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        T_planetas = new javax.swing.JTable();
        C_planeta = new javax.swing.JButton();
        C_astro = new javax.swing.JButton();
        C_naves = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cb_naves = new javax.swing.JComboBox<>();
        actualizar = new javax.swing.JButton();

        JD_planeta.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JD_planeta.getContentPane().add(pa_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, 59, -1));

        pa_temp.setModel(new javax.swing.SpinnerNumberModel(0, -100, 100, 1));
        JD_planeta.getContentPane().add(pa_temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 88, 59, -1));

        pa_anillo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Si", "No" }));
        JD_planeta.getContentPane().add(pa_anillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 162, 59, -1));
        JD_planeta.getContentPane().add(pa_super, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, 69, -1));

        pa_dist.setModel(new javax.swing.SpinnerNumberModel(19.0d, 19.0d, 109.0d, 1.0d));
        JD_planeta.getContentPane().add(pa_dist, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 269, 69, -1));

        jLabel4.setText("Nombre");
        JD_planeta.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 27, -1, -1));

        jLabel5.setText("Distancia");
        JD_planeta.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 272, -1, -1));

        jLabel6.setText("Superficie");
        JD_planeta.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 220, -1, -1));

        jLabel7.setText("Teperatura");
        JD_planeta.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel8.setText("Anillos");
        JD_planeta.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 165, -1, -1));

        Crea_planeta.setText("Crear Planeta");
        Crea_planeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Crea_planetaMouseClicked(evt);
            }
        });
        JD_planeta.getContentPane().add(Crea_planeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        JD_astro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JD_astro.getContentPane().add(as_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 34, 83, -1));
        JD_astro.getContentPane().add(as_nacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 91, 83, -1));
        JD_astro.getContentPane().add(as_sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 154, 83, -1));

        as_exp.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        JD_astro.getContentPane().add(as_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 220, 83, -1));

        as_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Femenino", "Masculino" }));
        JD_astro.getContentPane().add(as_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 279, -1, -1));

        as_peso.setModel(new javax.swing.SpinnerNumberModel(50, 50, 150, 1));
        JD_astro.getContentPane().add(as_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 341, 83, -1));

        jLabel9.setText("Nombre");
        JD_astro.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 37, -1, -1));

        jLabel10.setText("Nacionalidad");
        JD_astro.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 94, -1, -1));

        jLabel11.setText("sueldo");
        JD_astro.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 157, -1, -1));

        jLabel12.setText("Años de Experiencia");
        JD_astro.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 223, -1, -1));

        jLabel13.setText("Genero");
        JD_astro.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 282, -1, -1));

        jLabel14.setText("Peso");
        JD_astro.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 344, -1, -1));

        crea_astr.setText("CREAR ASTRONAUTA");
        crea_astr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crea_astrMouseClicked(evt);
            }
        });
        JD_astro.getContentPane().add(crea_astr, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        na_velocidad.setModel(new javax.swing.SpinnerNumberModel(30.0d, 30.0d, 130.0d, 1.0d));

        na_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Sonda", "Tripulada" }));

        na_crea.setText("Continuar Creacion de nave");
        na_crea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                na_creaMouseClicked(evt);
            }
        });

        jLabel15.setText("SERIE");

        jLabel16.setText("Velocidad");

        jLabel17.setText("Planeta Destino");

        jLabel18.setText("tipo de nave");

        javax.swing.GroupLayout JD_navesLayout = new javax.swing.GroupLayout(JD_naves.getContentPane());
        JD_naves.getContentPane().setLayout(JD_navesLayout);
        JD_navesLayout.setHorizontalGroup(
            JD_navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_navesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JD_navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_navesLayout.createSequentialGroup()
                        .addGroup(JD_navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(na_serie)
                            .addComponent(na_destino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(na_velocidad)
                            .addComponent(na_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(JD_navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)))
                    .addComponent(na_crea))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JD_navesLayout.setVerticalGroup(
            JD_navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_navesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(JD_navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(na_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(31, 31, 31)
                .addGroup(JD_navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(na_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(35, 35, 35)
                .addGroup(JD_navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(na_velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(36, 36, 36)
                .addGroup(JD_navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(na_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(na_crea)
                .addGap(31, 31, 31))
        );

        jLabel19.setText("Material");

        jLabel20.setText("peso");

        son_crea.setText("Crear Sonda");
        son_crea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                son_creaMouseClicked(evt);
            }
        });

        son_peso.setModel(new javax.swing.SpinnerNumberModel(10, null, 100, 1));

        javax.swing.GroupLayout JD_sondaLayout = new javax.swing.GroupLayout(JD_sonda.getContentPane());
        JD_sonda.getContentPane().setLayout(JD_sondaLayout);
        JD_sondaLayout.setHorizontalGroup(
            JD_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_sondaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JD_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(son_material)
                    .addComponent(son_peso, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JD_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(30, 30, 30))
            .addGroup(JD_sondaLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(son_crea)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        JD_sondaLayout.setVerticalGroup(
            JD_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_sondaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(JD_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(son_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(35, 35, 35)
                .addGroup(JD_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(son_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(son_crea)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        JD_tripulado.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JD_tripulado.getContentPane().add(Tri_despegue, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, 98, -1));

        jLabel21.setText("Lugar de despegue");
        JD_tripulado.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 26, 221, -1));

        JD_tripulado.getContentPane().add(tri_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 86, 98, -1));

        agrega_as.setText("agregar astronauta ");
        agrega_as.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agrega_asMouseClicked(evt);
            }
        });
        JD_tripulado.getContentPane().add(agrega_as, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 85, -1, -1));

        crea_tripu.setText("Crear ");
        crea_tripu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crea_tripuMouseClicked(evt);
            }
        });
        JD_tripulado.getContentPane().add(crea_tripu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T_astros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Nacion", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(T_astros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 164, -1, 98));

        T_exp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nave", "Planeta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(T_exp);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 300, -1, 98));

        T_planetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Temperatura", "Anillos", "superficie", "Distancia"
            }
        ));
        jScrollPane3.setViewportView(T_planetas);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 29, -1, 98));

        C_planeta.setText("CREAR PLANETAS");
        C_planeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C_planetaMouseClicked(evt);
            }
        });
        getContentPane().add(C_planeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 38, 165, -1));

        C_astro.setText("CREAR ASTRONAUTAS");
        C_astro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C_astroMouseClicked(evt);
            }
        });
        getContentPane().add(C_astro, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 102, -1, -1));

        C_naves.setText("CREAR NAVES");
        C_naves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C_navesMouseClicked(evt);
            }
        });
        getContentPane().add(C_naves, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 156, 165, -1));

        jLabel1.setText("Planetas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel2.setText("Expedicones completadas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel3.setText("Astronautas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jButton1.setText("INICIAR EXPEDICION");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 20));

        getContentPane().add(cb_naves, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 110, -1));

        actualizar.setText("actualizar tablas");
        actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarMouseClicked(evt);
            }
        });
        getContentPane().add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Crea_planetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Crea_planetaMouseClicked
        // TODO add your handling code here:
        AdminPlanetas AP = new AdminPlanetas("./planetas.txt");
        AP.cargarArchivo();
        AP.getListaPlanetas();
        String pla_nomb = pa_nombre.getText();
        //pa_nombre.setText("");
        String temp = pa_temp.getValue().toString();
        int si = 1;
        if (pa_anillo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(JD_planeta, "no ingreso si tiene anillos o no");
            si = 0;
        }//String Nombre, String tem, String anillos, String superficie, double distancia
        if (si == 1) {
            String superficie = pa_super.getText();
            double dist = (double) pa_dist.getValue();
            AP.setPlaneta(new Planeta(pla_nomb, temp, pla_nomb, superficie, dist));
        }
        AP.escribirArchivo();
        JD_planeta.dispose();

    }//GEN-LAST:event_Crea_planetaMouseClicked

    private void crea_astrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crea_astrMouseClicked

        AdminAstronautas ad = new AdminAstronautas("./astronautas.txt");
        ad.cargarArchivo();
        String nombre = as_nombre.getText();
        String nacion = as_nacio.getText();
        String sueldo = as_sueldo.getText();
        String genero = as_genero.getSelectedItem().toString();
        int peso = (int) as_peso.getValue();
        int exp = (int) as_exp.getValue();
        //String nombre, String nacion, String sueldo, int exp, int sexo, int peso
        // astros.add(new Astronauta(nombre, nacion, sueldo, exp, genero, peso));
        ad.setAstronauta(new Astronauta(nombre, nacion, sueldo, exp, genero, peso));
        ad.escribirArchivo();
        JD_astro.dispose();

    }//GEN-LAST:event_crea_astrMouseClicked

    private void na_creaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_na_creaMouseClicked
        // TODO add your handling code here:
        AdminPlanetas ap= new AdminPlanetas("./planetas.txt");
        ap.cargarArchivo();
        serie = na_serie.getText();
        destino = ap.getListaPlanetas().get(na_destino.getSelectedIndex());
        velo = (double) na_velocidad.getValue();
        int pos = na_tipo.getSelectedIndex();
        if (pos == 0) {
            JOptionPane.showMessageDialog(JD_naves, "no ha elegido un tipo correcto de nave");
        } else if (pos == 1) {
            JD_sonda.setModal(true);
            JD_sonda.pack();
            JD_sonda.setVisible(true);
        } else if (pos == 2) {
            JD_tripulado.setModal(true);
            JD_tripulado.pack();
            JD_tripulado.setVisible(true);
        }
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(astros.toArray());
        tri_combo.setModel(modelo);
    }//GEN-LAST:event_na_creaMouseClicked

    private void son_creaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_son_creaMouseClicked
        String mate = son_material.getText();
        int peso = (int) son_peso.getValue();
        //String material, double peso, int serie, Planeta dest, double velocidad
        //nave.add(new Sonda(mate, peso, serie, destino, velo));
        nave.add(new Sonda(mate, peso, T_exp, serie, destino, velo));
        JD_naves.dispose();
        JD_sonda.dispose();
    }//GEN-LAST:event_son_creaMouseClicked

    private void crea_tripuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crea_tripuMouseClicked
        // TODO add your handling code here:

        String despe = Tri_despegue.getText();
        int pos = tri_combo.getSelectedIndex();
        //String despeje, ArrayList tripulacion, String serie, Planeta dest, double velocidad
        //nave.add(new Tripulada(despe, agarra, serie, destino, velo));
        nave.add(new Tripulada(despe, agarra, serie, destino, velo, T_exp));
        JD_tripulado.dispose();
        JD_naves.dispose();

    }//GEN-LAST:event_crea_tripuMouseClicked

    private void agrega_asMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agrega_asMouseClicked
        // TODO add your handling code here:\
        AdminAstronautas AA = new AdminAstronautas("./astronautas.txt");
        AA.cargarArchivo();
        agarra.addAll(astros);
        selec = agarra.get(tri_combo.getSelectedIndex());
        agarra.remove(tri_combo.getSelectedIndex());
    }//GEN-LAST:event_agrega_asMouseClicked

    private void actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMouseClicked
        // TODO add your handling code here:
        AdminPlanetas AP = new AdminPlanetas("./planetas.txt");
        AdminAstronautas AA = new AdminAstronautas("./astronautas.txt");
        AA.cargarArchivo();
        AP.cargarArchivo();

        DefaultComboBoxModel modelo = new DefaultComboBoxModel(nave.toArray());
        cb_naves.setModel(modelo);
        T_astros.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre", "Nacion", "Sexo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        for (Astronauta t : AA.getListaAstronautas()) {
            Object row[] = {t.getNombre(), t.getNacion(), t.getSexo()};
            DefaultTableModel m = (DefaultTableModel) T_astros.getModel();
            m.addRow(row);
            T_astros.setModel(m);
        }
        T_planetas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre", "Temperatura", "Anillos", "superficie", "Distancia"
                }
        ));
        for (Planeta t : AP.getListaPlanetas()) {
            Object row2[] = {t.getNombre(), t.getTem(), t.getAnillos(), t.getSuperficie(), t.getDistancia()};
            DefaultTableModel m = (DefaultTableModel) T_planetas.getModel();
            m.addRow(row2);
            T_planetas.setModel(m);
        }
        DefaultComboBoxModel modelo2 = new DefaultComboBoxModel(AP.getListaPlanetas().toArray());
        na_destino.setModel(modelo2);

    }//GEN-LAST:event_actualizarMouseClicked

    private void C_planetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C_planetaMouseClicked
        // TODO add your handling code here:
        JD_planeta.setModal(true);
        JD_planeta.pack();
        JD_planeta.setVisible(true);
    }//GEN-LAST:event_C_planetaMouseClicked

    private void C_astroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C_astroMouseClicked
        // TODO add your handling code here:
        JD_astro.setModal(true);
        JD_astro.pack();
        JD_astro.setVisible(true);

    }//GEN-LAST:event_C_astroMouseClicked

    private void C_navesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C_navesMouseClicked
        // TODO add your handling code here:
        AdminAstronautas aa = new AdminAstronautas("./astronautas.txt");
        AdminPlanetas ap = new AdminPlanetas("./astronatuas.txt");
        ap.cargarArchivo();
        aa.cargarArchivo();
        for (int i = 0; i < ap.getListaPlanetas().size(); i++) {
            System.out.println(ap.getListaPlanetas().get(i).getNombre());
        }
        if (aa.getListaAstronautas().isEmpty()) {
            JOptionPane.showMessageDialog(JD_naves, "debe crear al menos dos astronautas");
        } else {

            JD_naves.setModal(true);
            JD_naves.pack();
            JD_naves.setVisible(true);
        }
    }//GEN-LAST:event_C_navesMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if (nave.size() != 0) {
            int pos = cb_naves.getSelectedIndex();
            ArrayList datps = nave.get(pos).calculartiempo(nave.get(pos), nave.get(pos).getDest());
            nave.get(pos).expedicion(nave.get(pos),nave.get(pos).getDest(), T_exp);
            System.out.println(datps);
        }else{
            System.out.println("si esntro");
        }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C_astro;
    private javax.swing.JButton C_naves;
    private javax.swing.JButton C_planeta;
    private javax.swing.JButton Crea_planeta;
    private javax.swing.JDialog JD_astro;
    private javax.swing.JDialog JD_naves;
    private javax.swing.JDialog JD_planeta;
    private javax.swing.JDialog JD_sonda;
    private javax.swing.JDialog JD_tripulado;
    private javax.swing.JTable T_astros;
    private javax.swing.JTable T_exp;
    private javax.swing.JTable T_planetas;
    private javax.swing.JTextField Tri_despegue;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agrega_as;
    private javax.swing.JSpinner as_exp;
    private javax.swing.JComboBox<String> as_genero;
    private javax.swing.JTextField as_nacio;
    private javax.swing.JTextField as_nombre;
    private javax.swing.JSpinner as_peso;
    private javax.swing.JTextField as_sueldo;
    private javax.swing.JComboBox<String> cb_naves;
    private javax.swing.JButton crea_astr;
    private javax.swing.JButton crea_tripu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton na_crea;
    private javax.swing.JComboBox<String> na_destino;
    private javax.swing.JTextField na_serie;
    private javax.swing.JComboBox<String> na_tipo;
    private javax.swing.JSpinner na_velocidad;
    private javax.swing.JComboBox<String> pa_anillo;
    private javax.swing.JSpinner pa_dist;
    private javax.swing.JTextField pa_nombre;
    private javax.swing.JTextField pa_super;
    private javax.swing.JSpinner pa_temp;
    private javax.swing.JButton son_crea;
    private javax.swing.JTextField son_material;
    private javax.swing.JSpinner son_peso;
    private javax.swing.JComboBox<String> tri_combo;
    // End of variables declaration//GEN-END:variables
    ArrayList<Planeta> planets = new ArrayList();
    ArrayList<Naves> nave = new ArrayList();
    ArrayList<Astronauta> astros = new ArrayList();
    Planeta destino;
    String serie;
    double velo;
    ArrayList<Astronauta> temp = new ArrayList();
    int pos;
    Astronauta selec;
    ArrayList<Astronauta> agarra = new ArrayList<>();
    ArrayList<Expedicion> exps = new ArrayList<>();
}
