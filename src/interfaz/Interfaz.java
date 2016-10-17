/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan
 */
public class Interfaz extends JFrame implements KeyListener {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
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

        panelContenedor = new javax.swing.JPanel();
        posicion_11 = new javax.swing.JButton();
        posicion_12 = new javax.swing.JButton();
        posicion_13 = new javax.swing.JButton();
        posicion_21 = new javax.swing.JButton();
        posicion_22 = new javax.swing.JButton();
        posicion_23 = new javax.swing.JButton();
        posicion_31 = new javax.swing.JButton();
        posicion_32 = new javax.swing.JButton();
        posicion_33 = new javax.swing.JButton();
        panelAdministrador = new javax.swing.JPanel();
        reloj = new javax.swing.JLabel();
        botonReiniciar = new javax.swing.JButton();
        botonMusica = new javax.swing.JButton();
        botonEmpezarPausar = new javax.swing.JButton();
        labelTiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Puzzle - Version 1.0");
        setMinimumSize(new java.awt.Dimension(537, 360));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelContenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelContenedor.setLayout(new java.awt.GridLayout(3, 3));

        posicion_11.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        posicion_11.setName("posicion_11"); // NOI18N
        panelContenedor.add(posicion_11);

        posicion_12.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        posicion_12.setName("posicion_12"); // NOI18N
        panelContenedor.add(posicion_12);

        posicion_13.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        posicion_13.setName("posicion_13"); // NOI18N
        panelContenedor.add(posicion_13);

        posicion_21.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        posicion_21.setName("posicion_21"); // NOI18N
        panelContenedor.add(posicion_21);

        posicion_22.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        posicion_22.setName("posicion_22"); // NOI18N
        panelContenedor.add(posicion_22);

        posicion_23.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        posicion_23.setName("posicion_23"); // NOI18N
        panelContenedor.add(posicion_23);

        posicion_31.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        posicion_31.setName("posicion_31"); // NOI18N
        panelContenedor.add(posicion_31);

        posicion_32.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        posicion_32.setName("posicion_32"); // NOI18N
        panelContenedor.add(posicion_32);

        posicion_33.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        posicion_33.setName("posicion_33"); // NOI18N
        panelContenedor.add(posicion_33);

        panelAdministrador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        reloj.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        reloj.setText("00:00");

        botonReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reiniciar.png"))); // NOI18N
        botonReiniciar.setEnabled(false);
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
            }
        });

        botonMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sonido.png"))); // NOI18N
        botonMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMusicaActionPerformed(evt);
            }
        });

        botonEmpezarPausar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play.png"))); // NOI18N
        botonEmpezarPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpezarPausarActionPerformed(evt);
            }
        });

        labelTiempo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelTiempo.setText("Tiempo:");

        javax.swing.GroupLayout panelAdministradorLayout = new javax.swing.GroupLayout(panelAdministrador);
        panelAdministrador.setLayout(panelAdministradorLayout);
        panelAdministradorLayout.setHorizontalGroup(
            panelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdministradorLayout.createSequentialGroup()
                        .addComponent(botonReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAdministradorLayout.createSequentialGroup()
                        .addComponent(labelTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(reloj)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdministradorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonEmpezarPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        panelAdministradorLayout.setVerticalGroup(
            panelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTiempo)
                    .addComponent(reloj))
                .addGap(110, 110, 110)
                .addComponent(botonEmpezarPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(panelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        /*Asignamos los listeners a las posiciones del tablero*/
        asignarListenerPosiciones();

        /*Asignamos los listener de los botones restantes*/
        asignarListenerBotonesExtras();

    }//GEN-LAST:event_formWindowOpened

    private void botonEmpezarPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpezarPausarActionPerformed

        switch (ESTADO_JUEGO) {

            case JUEGO_INICIADO:
                pausarJuego();
                break;

            case JUEGO_PAUSADO:
                reanudarJuego();
                break;

            case JUEGO_FINALIZADO:
                reiniciarJuego();//Reestablece Elementos
                iniciarJuego();//Inicia Juego
                break;

            case JUEGO_NO_INICIADO:
                iniciarJuego();
                break;

        }

    }//GEN-LAST:event_botonEmpezarPausarActionPerformed

    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReiniciarActionPerformed

        int respuesta;

        if (ESTADO_JUEGO != JUEGO_NO_INICIADO) {

            respuesta = JOptionPane.showConfirmDialog(null, "¿Desea reiniciar el juego? Se perdera su avance actual.", "Advertencia", JOptionPane.WARNING_MESSAGE);

            if (respuesta == JOptionPane.YES_OPTION) {
                reiniciarJuego();
            }

        }

    }//GEN-LAST:event_botonReiniciarActionPerformed

    private void botonMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMusicaActionPerformed


    }//GEN-LAST:event_botonMusicaActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    /**
     * Estado del juego
     */
    private final int JUEGO_NO_INICIADO = 0;
    private final int JUEGO_INICIADO = 1;
    private final int JUEGO_PAUSADO = 2;
    private final int JUEGO_FINALIZADO = 3;
    private int ESTADO_JUEGO = JUEGO_NO_INICIADO;

    /**
     * Direcciones de movimiento
     */
    private static final int ARRIBA = 1;
    private static final int ABAJO = 2;
    private static final int IZQUIERDA = 3;
    private static final int DERECHA = 4;

    /**
     * Parametros de posicion
     */
    private static final int MAX_COLUMNAS = 3;
    private static final int MAX_FILAS = 3;

    /**
     * Prefijo nombre posicion
     */
    private static final String PREFIJO_POSICION = "posicion_";

    /**
     * Colores tablero
     */
    private static final Color COLOR_POSICION_NORMAL = Color.LIGHT_GRAY;
    private static final Color COLOR_POSICION_VACIA = Color.GRAY;

    /**
     * Numeros a mostrar en el tablero
     */
    private final ArrayList<String> listadoNumeros = new ArrayList<>();

    /**
     * Hilo de ejecucion del reloj del movimiento del reloj
     */
    private Thread hiloEjecucionReloj;

    /**
     * Tiempo para reloj
     */
    private int segundos = 0;

    /**
     * Posicion
     */
    private int fila = 0;
    private int columna = 0;

    /**
     * Musica
     */
    private boolean reproducirMusica = false;

    /**
     * Inicia el juego.
     */
    private void iniciarJuego() {

        Image imagen;
        ImageIcon icono;

        imagen = obtenerImagen("pause.png");
        icono = new ImageIcon(imagen);

        botonEmpezarPausar.setIcon(icono);
        reloj.setForeground(Color.BLUE);

        /*Numeros*/
        cargarListadoNumeros();

        /*Tablero*/
        llenarTablero();
        habilitarTablero();

        /*Reloj*/
        iniciarReloj();

        /*Boton Reiniciar*/
        habilitarBotonReiniciar();

        ESTADO_JUEGO = JUEGO_INICIADO;

    }

    /**
     * Reanuda el juego.
     */
    private void reanudarJuego() {

        Image imagen;
        ImageIcon icono;

        imagen = obtenerImagen("pause.png");
        icono = new ImageIcon(imagen);

        botonEmpezarPausar.setIcon(icono);
        reloj.setForeground(Color.BLUE);

        habilitarTablero();
        reanudarReloj();

        ESTADO_JUEGO = JUEGO_INICIADO;

    }

    /**
     * Pausa el juego.
     */
    private void pausarJuego() {

        Image imagen;
        ImageIcon icono;

        imagen = obtenerImagen("play.png");
        icono = new ImageIcon(imagen);

        botonEmpezarPausar.setIcon(icono);
        reloj.setForeground(Color.RED);

        deshabilitarTablero();
        detenerReloj();

        ESTADO_JUEGO = JUEGO_PAUSADO;

    }

    /**
     * Finaliza el juego
     */
    private void finalizarJuego() {

        pausarJuego();
        deshabilitarBotonReiniciar();

        JOptionPane.showMessageDialog(null, "Felicitaciones!!!\nHas ganado!!!", "Informacion", JOptionPane.INFORMATION_MESSAGE);

        ESTADO_JUEGO = JUEGO_FINALIZADO;
    }

    /**
     * Reinicia el juego a su estado inicial (Inicia un nuevo juego, con otra
     * aleatoriedad)
     */
    private void reiniciarJuego() {

        Image imagen;
        ImageIcon icono;

        //Reloj
        this.reloj.setForeground(Color.BLACK);
        this.segundos = 0;
        escribirReloj();
        detenerReloj();

        //Boton (Play / Pausa)
        imagen = obtenerImagen("play.png");
        icono = new ImageIcon(imagen);
        this.botonEmpezarPausar.setIcon(icono);

        //Tablero
        vaciarTablero();
        habilitarTablero();

        //Boton <reiniciar>
        deshabilitarBotonReiniciar();

        //Estado del Juego 
        ESTADO_JUEGO = JUEGO_NO_INICIADO;

    }

    /**
     * Carga el listado de numeros a poner en el tablero
     */
    private void cargarListadoNumeros() {

        this.listadoNumeros.add("1");
        this.listadoNumeros.add("2");
        this.listadoNumeros.add("3");
        this.listadoNumeros.add("4");
        this.listadoNumeros.add("5");
        this.listadoNumeros.add("6");
        this.listadoNumeros.add("7");
        this.listadoNumeros.add("8");

    }

    /**
     * Retorna un numero al azar de la lista <listadoNumeros>
     * Y elimina este de la lista
     */
    private String obtenerNumeroAleatorio() {

        int indice = (int) (Math.random() * listadoNumeros.size() + 0);
        String numero;

        numero = listadoNumeros.get(indice);
        listadoNumeros.remove(indice);

        return numero;
    }

    /**
     * Llena el tablero basado en los numero de <listadoNumeros> de modo
     * aleatorio.
     */
    private void llenarTablero() {

        Component[] componentes = this.panelContenedor.getComponents();
        int contador = 0;
        int posicionVacia;

        posicionVacia = (int) (Math.random() * componentes.length + 0);

        for (Component componente : componentes) {

            if (componente instanceof JButton) {

                if (contador != posicionVacia) {

                    ((JButton) componente).setText(obtenerNumeroAleatorio());
                    ((JButton) componente).setBackground(COLOR_POSICION_NORMAL);

                } else {

                    ((JButton) componente).requestFocus(true);
                    ((JButton) componente).setBackground(COLOR_POSICION_VACIA);

                    this.fila = obtenerNumeroFilaBoton(((JButton) componente).getName());
                    this.columna = obtenerNumeroColumnaBoton(((JButton) componente).getName());

                }

                contador++;
            }

        }

    }

    /**
     * Habilita todos los botones (posiciones) que se encuentran dentro del
     * <panelContenedor>
     */
    private void habilitarTablero() {

        Component[] componentes = this.panelContenedor.getComponents();

        for (Component componente : componentes) {

            if (componente instanceof JButton) {
                ((JButton) componente).setEnabled(true);
            }

        }

    }

    /**
     * Deshabilita todos los botones (posiciones) que se encuentran dentro del
     * <panelContenedor>
     */
    private void deshabilitarTablero() {

        Component[] componentes = this.panelContenedor.getComponents();

        for (Component componente : componentes) {

            if (componente instanceof JButton) {
                ((JButton) componente).setEnabled(false);
            }

        }

    }

    /**
     * Vacia el contenido del tablero
     */
    private void vaciarTablero() {

        Component[] componentes = this.panelContenedor.getComponents();

        for (Component componente : componentes) {

            if (componente instanceof JButton) {
                ((JButton) componente).setText("");
            }

        }

    }

    /**
     * Inicia hilo de ejecucion del movimiento del reloj
     */
    private void iniciarReloj() {

        hiloEjecucionReloj = new Thread() {

            @Override
            public void run() {

                try {

                    while (true) {

                        escribirReloj();

                        segundos++;
                        sleep(1000);
                    }

                } catch (Exception e) {
                    System.out.println("Excepcion Iniciando Reloj : " + e.getMessage());
                }

            }

        };

        hiloEjecucionReloj.start();
    }

    /**
     * Reanuda el hilo de ejecucion del movimiento del reloj
     */
    private void reanudarReloj() {

        if (this.hiloEjecucionReloj != null) {
            this.iniciarReloj();
        }

    }

    /**
     * Detiene el hilo de ejecucion del movimiento del reloj
     */
    private void detenerReloj() {

        if (this.hiloEjecucionReloj != null) {
            this.hiloEjecucionReloj.stop();
        }

    }

    /**
     * Escribe el tiempo de <segundos> en el reloj
     */
    private void escribirReloj() {

        String mensaje;
        int minuto;
        int segundo;

        minuto = (this.segundos / 60);
        segundo = (this.segundos % 60);

        mensaje = ((minuto < 10) ? "0" + minuto : minuto) + ":" + ((segundo < 10) ? "0" + segundo : segundo);

        this.reloj.setText(mensaje);
    }

    /**
     * Habilita boton <reiniciar>
     */
    private void habilitarBotonReiniciar() {
        this.botonReiniciar.setEnabled(true);
    }

    /**
     * Deshabilita boton <reiniciar>
     */
    private void deshabilitarBotonReiniciar() {
        this.botonReiniciar.setEnabled(false);
    }

    /**
     * Reproduce la musica.
     */
    private void reproducirMusica(String nombre) {

    }

    /**
     * Pausa la reproduccion de la musica.
     */
    private void pausarReproduccion() {

    }

    /**
     * Realiza el movimiento del cuadro blanco a la direccion que se le indique
     */
    private void moverCuadro(int direccion) {

        boolean mover = false;

        /* Posicion actual (Se guarda como la anterior en caso que haya cambios de posicion */
        int fila_anterior = fila;
        int columna_anterior = columna;

        /* Posicion nueva (En caso que haya cambios se guardara aca*/
        int fila_nueva;
        int columna_nueva;

        switch (direccion) {

            case ARRIBA:

                if (fila > 1) {
                    mover = true;
                    fila--;
                }

                break;

            case ABAJO:

                if (fila < MAX_FILAS) {
                    mover = true;
                    fila++;
                }

                break;

            case IZQUIERDA:

                if (columna > 1) {
                    mover = true;
                    columna--;
                }

                break;

            case DERECHA:

                if (columna < MAX_COLUMNAS) {
                    mover = true;
                    columna++;
                }

                break;

        }

        if (mover) {

            fila_nueva = fila;
            columna_nueva = columna;

            realizarCambioPosicion(fila_anterior, columna_anterior, fila_nueva, columna_nueva);
        }

    }

    /**
     * Realiza el intercambio de valores entre las dos casillas
     */
    private void realizarCambioPosicion(int fila_anterior, int columna_anterior, int fila_nueva, int columna_nueva) {

        /**
         * Listado de componentes
         */
        Component[] componentes = this.panelContenedor.getComponents();
        JButton posicion = null;

        /**
         * Nombre de las posiciones a intercambiar
         */
        String nombre_anterior = PREFIJO_POSICION + fila_anterior + "" + columna_anterior;
        String nombre_nueva = PREFIJO_POSICION + fila_nueva + "" + columna_nueva;

        /**
         * Posiciones a intercambiar
         */
        JButton posicion_anterior = null;
        JButton posicion_nueva = null;

        /**
         * Valores a intercambiar
         */
        String valor_anterior = null;
        String valor_nueva = null;

        for (Component componente : componentes) {

            if (componente instanceof JButton) {

                posicion = ((JButton) componente);

                if (posicion.getName().equals(nombre_anterior)) {
                    posicion_anterior = posicion;
                    valor_anterior = posicion.getText();
                }

                if (posicion.getName().equals(nombre_nueva)) {
                    posicion_nueva = posicion;
                    valor_nueva = posicion.getText();
                }

            }

        }

        /**
         * Intercambio de valores
         */
        if (posicion_anterior != null && posicion_nueva != null) {

            posicion_anterior.setText(valor_nueva);
            posicion_anterior.setBackground(COLOR_POSICION_NORMAL);

            posicion_nueva.setText(valor_anterior);
            posicion_nueva.setBackground(COLOR_POSICION_VACIA);

        }
    }

    /**
     * Verifica si el usuario ya gano Y si es asi entonces detiene el juego y
     * realiza la finalizacion del mismo
     */
    private void verificarTablero() {

        Component[] componentes = this.panelContenedor.getComponents();
        JButton posicion;
        int contador = 1;

        boolean usuarioGano = true;

        for (Component componente : componentes) {

            if (componente instanceof JButton) {

                posicion = ((JButton) componente);

                if (contador < (MAX_COLUMNAS * MAX_FILAS)) {

                    if (!posicion.getText().equals(String.valueOf(contador))) {
                        usuarioGano = false;
                        break;
                    }

                }
                contador++;
            }

        }

        if (usuarioGano) {
            finalizarJuego();
        }

    }

    /**
     * Obtiene el Objeto de una imagen del paquete de imagenes, basado en el
     * nombre de la misma.
     */
    private Image obtenerImagen(String nombre) {

        Image imagen = null;

        try {
            imagen = new ImageIcon(getClass().getResource("/imagenes/" + nombre)).getImage();
        } catch (Exception e) {
            System.out.println("Excepcion abriendo imagen : " + e.getMessage());
        }

        return imagen;
    }

    /**
     * Obtiene el numero de la fila basado en el nombre del boton
     */
    private int obtenerNumeroFilaBoton(String nombre) {

        int longitud = nombre.length();

        return Character.getNumericValue(nombre.charAt(longitud - 2));
    }

    /**
     * Obtiene el numero de la columna basado en el nombre del boton
     */
    private int obtenerNumeroColumnaBoton(String nombre) {

        int longitud = nombre.length();

        return Character.getNumericValue(nombre.charAt(longitud - 1));
    }

    /**
     * Asigna el KeyListener a los botones(posiciones) del teclado
     */
    private void asignarListenerPosiciones() {

        Component[] componentes = this.panelContenedor.getComponents();

        for (Component componente : componentes) {

            if (componente instanceof JButton) {
                ((JButton) componente).addKeyListener(this);
            }

        }

    }

    /**
     * Asigna el KeyListener a los botones(Play/Pause, Musica, Reiniciar) del
     * teclado
     */
    private void asignarListenerBotonesExtras() {

        /*Boton Iniciar/Pausar/Reanudar*/
        this.botonEmpezarPausar.addKeyListener(this);

        /*Boton Musica*/
        this.botonMusica.addKeyListener(this);

        /*Boton Reiniciar*/
        this.botonReiniciar.addKeyListener(this);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEmpezarPausar;
    private javax.swing.JButton botonMusica;
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JLabel labelTiempo;
    private javax.swing.JPanel panelAdministrador;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JButton posicion_11;
    private javax.swing.JButton posicion_12;
    private javax.swing.JButton posicion_13;
    private javax.swing.JButton posicion_21;
    private javax.swing.JButton posicion_22;
    private javax.swing.JButton posicion_23;
    private javax.swing.JButton posicion_31;
    private javax.swing.JButton posicion_32;
    private javax.swing.JButton posicion_33;
    private javax.swing.JLabel reloj;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent key) {
    }

    @Override
    public void keyPressed(KeyEvent key) {

        int tecla = key.getKeyCode();

        switch (tecla) {

            case KeyEvent.VK_UP:
                this.moverCuadro(ARRIBA);
                break;

            case KeyEvent.VK_DOWN:
                this.moverCuadro(ABAJO);
                break;

            case KeyEvent.VK_LEFT:
                this.moverCuadro(IZQUIERDA);
                break;

            case KeyEvent.VK_RIGHT:
                this.moverCuadro(DERECHA);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Presione solo teclas de movimiento.");
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent key) {

        int tecla = key.getKeyCode();

        switch (tecla) {

            case KeyEvent.VK_UP:
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_RIGHT:
                verificarTablero();
                break;

        }

    }
}
