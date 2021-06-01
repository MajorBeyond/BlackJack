//Código hecho por Edwin 12/07/2018

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BlackJack extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	Button b1,b2,b3,b4,b5;
	JButton acerca;
	JLabel l1,l2,l3,l4;
	JLabel c1,c2,c3,c4,c5,c6,c7,c8,c9,c10; //Label de las cartas de Usuario y PC
	Label usr,ps;
	
	public int truco = 0, truc = 0;
	public String Victorias = "0";
	public String Derrotas = "0";
	public int Vic = 0;
	public int Der = 0;
	public int Usuario = 0;
	public int PC = 0;
	public int contado = 1; //Contador de cartas de la PC
	public boolean fin1 = false, fin2 = false; //Variables para Black Jack del PC
	public boolean end1 = false, end2 = false; //Variables para Black Jack del Usuario
	public boolean pslose = false;
	public boolean pc1 = false,pc2 = false,pc3 = false,pc4 = false,pc5 = false;
	public boolean u1 = false,u2 = false,u3 = false,u4 = false,u5 = false;
	public int contador = 1; //Contador de cartas del Usuario
	
	//Declaración de toda la baraja
	
	/* Nota: n+13 es la formula para encontrar un mismo valor pero con otro dibujo en el nombre de las cartas*/
	
	ImageIcon carta1 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/flecha1.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta2 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/flecha2.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta3 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/flecha3.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta4 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/flecha4.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta5 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/flecha5.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta6 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/flecha6.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta7 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/flecha7.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta8 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/flecha8.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta9 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/flecha9.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta10 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/flecha10.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta11 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/flechaK.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta12 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/flechaJ.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta13 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/flechaQ.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon carta14 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/corazon1.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta15 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/corazon2.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta16 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/corazon3.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta17 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/corazon4.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta18 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/corazon5.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta19 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/corazon6.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta20 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/corazon7.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta21 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/corazon8.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta22 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/corazon9.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta23 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/corazon10.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta24 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/corazonK.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta25 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/corazonJ.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta26 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/corazonQ.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon carta27 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/trebol1.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta28 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/trebol2.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta29 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/trebol3.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta30 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/trebol4.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta31 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/trebol5.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta32 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/trebol6.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta33 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/trebol7.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta34 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/trebol8.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta35 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/trebol9.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta36 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/trebol10.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta37 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/trebolK.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta38 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/trebolJ.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta39 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/trebolQ.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon carta40 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/diamante1.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta41 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/diamante2.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta42 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/diamante3.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta43 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/diamante4.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta44 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/diamante5.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta45 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/diamante6.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta46 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/diamante7.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta47 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/diamante8.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta48 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/diamante9.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta49 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/diamante10.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta50 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/diamanteK.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta51 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/diamanteJ.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	ImageIcon carta52 = new ImageIcon(new ImageIcon(getClass().getResource("/Baraja/diamanteQ.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon bac = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/back.png")).getImage().getScaledInstance(130,200, java.awt.Image.SCALE_DEFAULT));
	
	//Método constructor
	public BlackJack() {
		super("Black Jack v1.0");
		setLayout(null);
		
		//setUndecorated(true); /* Esta linea es para quitar el borde, pero se ve muy feo sin él, por esta razón se decidio no usarlo.*/
		this.getContentPane().setBackground(new Color(20,167,34));//Este color me encanto para el fondo :3
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/iconoapp.png")).getImage());
		
		Font fuente1 = new Font("Arial", Font.BOLD, 14);
		Font fuente2 = new Font("Arial", Font.ITALIC, 14);
		Font fuente3 = new Font("verdana", Font.CENTER_BASELINE, 12);
		String HostName = System.getProperty("user.name");
		
		c1 = new JLabel(bac);
		c1.setBounds(5,50,130,200);
		add(c1);
		c2 = new JLabel(bac);
		c2.setBounds(140,50,130,200);
		add(c2);
		c3 = new JLabel(bac);
		c3.setBounds(275,50,130,200);
		add(c3);
		c4 = new JLabel(bac);
		c4.setBounds(410,50,130,200);
		add(c4);
		c5 = new JLabel(bac);
		c5.setBounds(545,50,130,200);
		add(c5);
		
		c6 = new JLabel(bac);
		c6.setBounds(5,280,130,250);
		add(c6);
		c7 = new JLabel(bac);
		c7.setBounds(140,280,130,250);
		add(c7);
		c8 = new JLabel(bac);
		c8.setBounds(275,280,130,250);
		add(c8);
		c9 = new JLabel(bac);
		c9.setBounds(410,280,130,250);
		add(c9);
		c10 = new JLabel(bac);
		c10.setBounds(545,280,130,250);
		add(c10);
		
		l1 = new JLabel("");
		l1.setBounds(5,0,500,30);
		add(l1);
		l1.setText("Usuario: "+HostName);
		l1.setFont(fuente1);
		l1.setForeground(Color.BLACK);
		l2 = new JLabel("Victorias: 0");
		l2.setBounds(350, 5, 500, 30);
		add(l2);
		l2.setFont(fuente2);
		l2.setForeground(Color.CYAN);
		l3 = new JLabel("Derrotas: 0");
		l3.setBounds(500, 5, 500, 30);
		add(l3);
		l3.setFont(fuente2);
		l3.setForeground(Color.CYAN);
		usr = new Label("Usuario: 0");
		usr.setBounds(700,310,80,30);
		add(usr);
		usr.setFont(fuente3);
		usr.setBackground(Color.WHITE);
		usr.setVisible(false);
		ps = new Label("La banca: 0");
		ps.setBounds(700,270,80,30);
		add(ps);
		ps.setFont(fuente3);
		ps.setBackground(Color.WHITE);
		ps.setVisible(false);
		
		b1 = new Button("Cerrar");
		b1.setBounds(690,470,100,30);
		add(b1);
		b1.addActionListener(this);
		acerca = new JButton("Acerca de..");
		acerca.setBounds(690,420,100,30);
		add(acerca);
		acerca.addActionListener(this);
		b2 = new Button("Pedir");
		b2.setBounds(690,50,100,50);
		add(b2);
		b2.addActionListener(this);
		b3 = new Button("Jugar");
		b3.setBounds(690,125,100,50);
		add(b3);
		b3.addActionListener(this);
		b4 = new Button("Nuevo Juego");
		b4.setBounds(690,200,100,50);
		add(b4);
		b4.addActionListener(this);
		b5 = new Button("¿Como Jugar?");
		b5.setBounds(690,370,100,30);
		add(b5);
		b5.addActionListener(this);
		primercard();
		PCcard();
		
		}
	//PC
	public void PCcard() {
		int azar = (int) (Math.random()*10)+1;
		int azar2 = (int) (Math.random()*4)+1;
		
			if(azar==1) {
				PC += 11;
				pc1 = true;
				fin1 = true;
				if(azar2==1) {
					c1.setIcon(carta1);
				}else if(azar2==2) {
					c1.setIcon(carta14);
				}else if(azar2==3) {
					c1.setIcon(carta27);
				}else if(azar2==4) {
					c1.setIcon(carta40);
				}
			}else if(azar==2){
				PC += 2;
				if(azar2==1) {
					c1.setIcon(carta2);
				}else if(azar2==2) {
					c1.setIcon(carta15);
				}else if(azar2==3) {
					c1.setIcon(carta18);
				}else if(azar2==4) {
					c1.setIcon(carta41);
				}
			}else if(azar==3){
				PC += 3;
				if(azar2==1) {
					c1.setIcon(carta3);
				}else if(azar2==2) {
					c1.setIcon(carta16);
				}else if(azar2==3) {
					c1.setIcon(carta29);
				}else if(azar2==4) {
					c1.setIcon(carta42);
				}
			}else if(azar==4){
				PC += 4;
				if(azar2==1) {
					c1.setIcon(carta4);
				}else if(azar2==2) {
					c1.setIcon(carta17);
				}else if(azar2==3) {
					c1.setIcon(carta30);
				}else if(azar2==4) {
					c1.setIcon(carta43);
				}
			}else if(azar==5){
				PC += 5;
				if(azar2==1) {
					c1.setIcon(carta5);
				}else if(azar2==2) {
					c1.setIcon(carta18);
				}else if(azar2==3) {
					c1.setIcon(carta31);
				}else if(azar2==4) {
					c1.setIcon(carta44);
				}
			}else if(azar==6) {
				PC += 6;
				if(azar2==1) {
					c1.setIcon(carta6);
				}else if(azar2==2) {
					c1.setIcon(carta19);
				}else if(azar2==3) {
					c1.setIcon(carta32);
				}else if(azar2==4) {
					c1.setIcon(carta45);
				}
			}else if(azar==7){
				PC += 7;
				if(azar2==1) {
					c1.setIcon(carta7);
				}else if(azar2==2) {
					c1.setIcon(carta20);
				}else if(azar2==3) {
					c1.setIcon(carta33);
				}else if(azar2==4) {
					c1.setIcon(carta46);
				}
			}else if(azar==8){
				PC += 8;
				if(azar2==1) {
					c1.setIcon(carta8);
				}else if(azar2==2) {
					c1.setIcon(carta21);
				}else if(azar2==3) {
					c1.setIcon(carta34);
				}else if(azar2==4) {
					c1.setIcon(carta47);
				}
			}else if(azar==9) {
				PC += 9;
				if(azar2==1) {
					c1.setIcon(carta9);
				}else if(azar2==2) {
					c1.setIcon(carta22);
				}else if(azar2==3) {
					c1.setIcon(carta35);
				}else if(azar2==4) {
					c1.setIcon(carta48);
				}
			}else if(azar==10){
				int azar3 = (int) (Math.random()*16)+1;
				PC += 10;
				if(azar3==1) {
					c1.setIcon(carta10);
				}else if(azar3==2) {
					c1.setIcon(carta11);//Carta para black jack
					fin1 = true;
				}else if(azar3==3) {
					c1.setIcon(carta12);//Carta para black jack
					fin1 = true;
				}else if(azar3==4) {
					c1.setIcon(carta13);//Carta para black jack
					fin1 = true;
				}else if(azar3==5) {
					c1.setIcon(carta24);//Carta para black jack
					fin1 = true;
				}else if(azar3==6) {
					c1.setIcon(carta25);//Carta para black jack
					fin1 = true;
				}else if(azar3==7) {
					c1.setIcon(carta26);//Carta para black jack
					fin1 = true;
				}else if(azar3==8) {
					c1.setIcon(carta36);
				}else if(azar3==9) {
					c1.setIcon(carta37);//Carta para black jack
					fin1 = true;
				}else if(azar3==10) {
					c1.setIcon(carta38);//Carta para black jack
					fin1 = true;
				}else if(azar3==11) {
					c1.setIcon(carta39);//Carta para black jack
					fin1 = true;
				}else if(azar3==12) {
					c1.setIcon(carta49);
				}else if(azar3==13) {
					c1.setIcon(carta50);//Carta para black jack
					fin1 = true;
				}else if(azar3==14) {
					c1.setIcon(carta51);//Carta para black jack
					fin1 = true;
				}else if(azar3==15) {
					c1.setIcon(carta52);//Carta para black jack
					fin1 = true;
				}else if(azar3==16) {
					c1.setIcon(carta23);
				}
			}
			ps.setText("La banca: "+PC);
		}
	
	public void PCcards() {
		while(PC<15) {
			
			int yolo = (int) (Math.random()*30)+1;
			if(yolo==3||yolo==21) {
				pslose = true;
				break;
			}else {
			
			int azar = (int) (Math.random()*10)+1;
			int azar2 = (int) (Math.random()*4)+1;
			
			if(contado<5) {
				if(PC <16){
				contado += 1;
			if(contado==2){//Carta numero 2
				if(azar==1) {
					PC += 11;
					pc2 = true;
					fin2 = true;
					if(azar2==1) {
						c2.setIcon(carta1);
					}else if(azar2==2) {
						c2.setIcon(carta14);
					}else if(azar2==3) {
						c2.setIcon(carta27);
					}else if(azar2==4) {
						c2.setIcon(carta40);
					}
				}else if(azar==2){
					PC += 2;
					if(azar2==1) {
						c2.setIcon(carta2);
					}else if(azar2==2) {
						c2.setIcon(carta15);
					}else if(azar2==3) {
						c2.setIcon(carta28);
					}else if(azar2==4) {
						c2.setIcon(carta41);
					}
				}else if(azar==3){
					PC += 3;
					if(azar2==1) {
						c2.setIcon(carta3);
					}else if(azar2==2) {
						c2.setIcon(carta16);
					}else if(azar2==3) {
						c2.setIcon(carta29);
					}else if(azar2==4) {
						c2.setIcon(carta42);
					}
				}else if(azar==4){
					PC += 1;
					if(azar2==1) {
						c2.setIcon(carta4);
					}else if(azar2==2) {
						c2.setIcon(carta17);
					}else if(azar2==3) {
						c2.setIcon(carta30);
					}else if(azar2==4) {
						c2.setIcon(carta43);
					}
				}else if(azar==5){
					PC += 5;
					if(azar2==1) {
						c2.setIcon(carta5);
					}else if(azar2==2) {
						c2.setIcon(carta18);
					}else if(azar2==3) {
						c2.setIcon(carta31);
					}else if(azar2==4) {
						c2.setIcon(carta44);
					}
				}else if(azar==6) {
					PC += 6;
					if(azar2==1) {
						c2.setIcon(carta6);
					}else if(azar2==2) {
						c2.setIcon(carta19);
					}else if(azar2==3) {
						c2.setIcon(carta32);
					}else if(azar2==4) {
						c2.setIcon(carta45);
					}
				}else if(azar==7){
					PC += 7;
					if(azar2==1) {
						c2.setIcon(carta7);
					}else if(azar2==2) {
						c2.setIcon(carta20);
					}else if(azar2==3) {
						c2.setIcon(carta33);
					}else if(azar2==4) {
						c2.setIcon(carta46);
					}
				}else if(azar==8){
					PC += 8;
					if(azar2==1) {
						c2.setIcon(carta8);
					}else if(azar2==2) {
						c2.setIcon(carta21);
					}else if(azar2==3) {
						c2.setIcon(carta34);
					}else if(azar2==4) {
						c2.setIcon(carta47);
					}
				}else if(azar==9) {
					PC += 9;
					if(azar2==1) {
						c2.setIcon(carta9);
					}else if(azar2==2) {
						c2.setIcon(carta22);
					}else if(azar2==3) {
						c2.setIcon(carta35);
					}else if(azar2==4) {
						c2.setIcon(carta48);
					}
				}else if(azar==10){
					int azar3 = (int) (Math.random()*16)+1;
					PC += 10;
					if(azar3==1) {
						c2.setIcon(carta10);
					}else if(azar3==2) {
						c2.setIcon(carta11);//Carta para Black Jack
						fin2 = true;
					}else if(azar3==3) {
						c2.setIcon(carta12);//Carta para Black Jack
						fin2 = true;
					}else if(azar3==4) {
						c2.setIcon(carta13);//Carta para Black Jack
						fin2 = true;
					}else if(azar3==5) {
						c2.setIcon(carta24);//Carta para Black Jack
						fin2 = true;
					}else if(azar3==6) {
						c2.setIcon(carta25);//Carta para Black Jack
						fin2 = true;
					}else if(azar3==7) {
						c2.setIcon(carta26);//Carta para Black Jack
						fin2 = true;
					}else if(azar3==8) {
						c2.setIcon(carta36);
					}else if(azar3==9) {
						c2.setIcon(carta37);//Carta para Black Jack
						fin2 = true;
					}else if(azar3==10) {
						c2.setIcon(carta38);//Carta para Black Jack
						fin2 = true;
					}else if(azar3==11) {
						c2.setIcon(carta39);//Carta para Black Jack
						fin2 = true;
					}else if(azar3==12) {
						c2.setIcon(carta49);
					}else if(azar3==13) {
						c2.setIcon(carta50);//Carta para Black Jack
						fin2 = true;
					}else if(azar3==14) {
						c2.setIcon(carta51);//Carta para Black Jack
						fin2 = true;
					}else if(azar3==15) {
						c2.setIcon(carta52);//Carta para Black Jack
						fin2 = true;
					}else if(azar3==16) {
						c2.setIcon(carta23);
					}
				}
			}else if(contado==3){//Carta numero 3
				if(azar==1) {
				PC += 11;
				pc3 = true;
				if(azar2==1) {
					c3.setIcon(carta1);
				}else if(azar2==2) {
					c3.setIcon(carta14);
				}else if(azar2==3) {
					c3.setIcon(carta27);
				}else if(azar2==4) {
					c3.setIcon(carta40);
				}
			}else if(azar==2){
				PC += 2;
				if(azar2==1) {
					c3.setIcon(carta2);
				}else if(azar2==2) {
					c3.setIcon(carta15);
				}else if(azar2==3) {
					c3.setIcon(carta28);
				}else if(azar2==4) {
					c3.setIcon(carta41);
				}
			}else if(azar==3){
				PC += 3;
				if(azar2==1) {
					c3.setIcon(carta3);
				}else if(azar2==2) {
					c3.setIcon(carta16);
				}else if(azar2==3) {
					c3.setIcon(carta29);
				}else if(azar2==4) {
					c3.setIcon(carta42);
				}
			}else if(azar==4){
				PC += 4;
				if(azar2==1) {
					c3.setIcon(carta4);
				}else if(azar2==2) {
					c3.setIcon(carta17);
				}else if(azar2==3) {
					c3.setIcon(carta30);
				}else if(azar2==4) {
					c3.setIcon(carta43);
				}
			}else if(azar==5){
				PC += 5;
				if(azar2==1) {
					c3.setIcon(carta5);
				}else if(azar2==2) {
					c3.setIcon(carta18);
				}else if(azar2==3) {
					c3.setIcon(carta31);
				}else if(azar2==4) {
					c3.setIcon(carta44);
				}
			}else if(azar==6) {
				PC += 6;
				if(azar2==1) {
					c3.setIcon(carta6);
				}else if(azar2==2) {
					c3.setIcon(carta19);
				}else if(azar2==3) {
					c3.setIcon(carta32);
				}else if(azar2==4) {
					c3.setIcon(carta45);
				}
			}else if(azar==7){
				PC += 7;
				if(azar2==1) {
					c3.setIcon(carta7);
				}else if(azar2==2) {
					c3.setIcon(carta20);
				}else if(azar2==3) {
					c3.setIcon(carta33);
				}else if(azar2==4) {
					c3.setIcon(carta46);
				}
			}else if(azar==8){
				PC += 8;
				if(azar2==1) {
					c3.setIcon(carta8);
				}else if(azar2==2) {
					c3.setIcon(carta21);
				}else if(azar2==3) {
					c3.setIcon(carta34);
				}else if(azar2==4) {
					c3.setIcon(carta47);
				}
			}else if(azar==9) {
				PC += 9;
				if(azar2==1) {
					c3.setIcon(carta9);
				}else if(azar2==2) {
					c3.setIcon(carta22);
				}else if(azar2==3) {
					c3.setIcon(carta35);
				}else if(azar2==4) {
					c3.setIcon(carta48);
				}
			}else if(azar==10){
				int azar3 = (int) (Math.random()*16)+1;
				PC += 10;
				if(azar3==1) {
					c3.setIcon(carta10);
				}else if(azar3==2) {
					c3.setIcon(carta11);
				}else if(azar3==3) {
					c3.setIcon(carta12);
				}else if(azar3==4) {
					c3.setIcon(carta13);
				}else if(azar3==5) {
					c3.setIcon(carta24);
				}else if(azar3==6) {
					c3.setIcon(carta25);
				}else if(azar3==7) {
					c3.setIcon(carta26);
				}else if(azar3==8) {
					c3.setIcon(carta36);
				}else if(azar3==9) {
					c3.setIcon(carta37);
				}else if(azar3==10) {
					c3.setIcon(carta38);
				}else if(azar3==11) {
					c3.setIcon(carta39);
				}else if(azar3==12) {
					c3.setIcon(carta49);
				}else if(azar3==13) {
					c3.setIcon(carta50);
				}else if(azar3==14) {
					c3.setIcon(carta51);
				}else if(azar3==15) {
					c3.setIcon(carta52);
				}else if(azar3==16) {
					c3.setIcon(carta23);
						}
					}
				}else if(contado==4){//Carta numero 4
				if(azar==1) {
				PC += 11;
				pc4 = true;
				if(azar2==1) {
					c4.setIcon(carta1);
				}else if(azar2==2) {
					c4.setIcon(carta14);
				}else if(azar2==3) {
					c4.setIcon(carta27);
				}else if(azar2==4) {
					c4.setIcon(carta40);
				}
			}else if(azar==2){
				PC += 2;
				if(azar2==1) {
					c4.setIcon(carta2);
				}else if(azar2==2) {
					c4.setIcon(carta15);
				}else if(azar2==3) {
					c4.setIcon(carta28);
				}else if(azar2==4) {
					c4.setIcon(carta41);
				}
			}else if(azar==3){
				PC += 3;
				if(azar2==1) {
					c4.setIcon(carta3);
				}else if(azar2==2) {
					c4.setIcon(carta16);
				}else if(azar2==3) {
					c4.setIcon(carta29);
				}else if(azar2==4) {
					c4.setIcon(carta42);
				}
			}else if(azar==4){
				PC += 4;
				if(azar2==1) {
					c4.setIcon(carta4);
				}else if(azar2==2) {
					c4.setIcon(carta17);
				}else if(azar2==3) {
					c4.setIcon(carta30);
				}else if(azar2==4) {
					c4.setIcon(carta43);
				}
			}else if(azar==5){
				PC += 5;
				if(azar2==1) {
					c4.setIcon(carta5);
				}else if(azar2==2) {
					c4.setIcon(carta18);
				}else if(azar2==3) {
					c4.setIcon(carta31);
				}else if(azar2==4) {
					c4.setIcon(carta44);
				}
			}else if(azar==6) {
				PC += 6;
				if(azar2==1) {
					c4.setIcon(carta6);
				}else if(azar2==2) {
					c4.setIcon(carta19);
				}else if(azar2==3) {
					c4.setIcon(carta32);
				}else if(azar2==4) {
					c4.setIcon(carta45);
				}
			}else if(azar==7){
				PC += 7;
				if(azar2==1) {
					c4.setIcon(carta7);
				}else if(azar2==2) {
					c4.setIcon(carta20);
				}else if(azar2==3) {
					c4.setIcon(carta33);
				}else if(azar2==4) {
					c4.setIcon(carta46);
				}
			}else if(azar==8){
				PC += 8;
				if(azar2==1) {
					c4.setIcon(carta8);
				}else if(azar2==2) {
					c4.setIcon(carta21);
				}else if(azar2==3) {
					c4.setIcon(carta34);
				}else if(azar2==4) {
					c4.setIcon(carta47);
				}
			}else if(azar==9) {
				PC += 9;
				if(azar2==1) {
					c4.setIcon(carta9);
				}else if(azar2==2) {
					c4.setIcon(carta22);
				}else if(azar2==3) {
					c4.setIcon(carta35);
				}else if(azar2==4) {
					c4.setIcon(carta48);
				}
			}else if(azar==10){
				int azar3 = (int) (Math.random()*16)+1;
				PC += 10;
				if(azar3==1) {
					c4.setIcon(carta10);
				}else if(azar3==2) {
					c4.setIcon(carta11);
				}else if(azar3==3) {
					c4.setIcon(carta12);
				}else if(azar3==4) {
					c4.setIcon(carta13);
				}else if(azar3==5) {
					c4.setIcon(carta24);
				}else if(azar3==6) {
					c4.setIcon(carta25);
				}else if(azar3==7) {
					c4.setIcon(carta26);
				}else if(azar3==8) {
					c4.setIcon(carta36);
				}else if(azar3==9) {
					c4.setIcon(carta37);
				}else if(azar3==10) {
					c4.setIcon(carta38);
				}else if(azar3==11) {
					c4.setIcon(carta39);
				}else if(azar3==12) {
					c4.setIcon(carta49);
				}else if(azar3==13) {
					c4.setIcon(carta50);
				}else if(azar3==14) {
					c4.setIcon(carta51);
				}else if(azar3==15) {
					c4.setIcon(carta52);
				}else if(azar3==16) {
					c4.setIcon(carta23);
						}
					}
				}else if(contado==5){//Carta numero 5
				if(azar==1) {
				PC += 1;
				pc5 = true;
				if(azar2==1) {
					c5.setIcon(carta1);
				}else if(azar2==2) {
					c5.setIcon(carta14);
				}else if(azar2==3) {
					c5.setIcon(carta27);
				}else if(azar2==4) {
					c5.setIcon(carta40);
				}
			}else if(azar==2){
				PC += 2;
				if(azar2==1) {
					c5.setIcon(carta2);
				}else if(azar2==2) {
					c5.setIcon(carta15);
				}else if(azar2==3) {
					c5.setIcon(carta28);
				}else if(azar2==4) {
					c5.setIcon(carta41);
				}
			}else if(azar==3){
				PC += 3;
				if(azar2==1) {
					c5.setIcon(carta3);
				}else if(azar2==2) {
					c5.setIcon(carta16);
				}else if(azar2==3) {
					c5.setIcon(carta29);
				}else if(azar2==4) {
					c5.setIcon(carta42);
				}
			}else if(azar==4){
				PC += 4;
				if(azar2==1) {
					c5.setIcon(carta4);
				}else if(azar2==2) {
					c5.setIcon(carta17);
				}else if(azar2==3) {
					c5.setIcon(carta30);
				}else if(azar2==4) {
					c5.setIcon(carta43);
				}
			}else if(azar==5){
				PC += 5;
				if(azar2==1) {
					c5.setIcon(carta5);
				}else if(azar2==2) {
					c5.setIcon(carta18);
				}else if(azar2==3) {
					c5.setIcon(carta31);
				}else if(azar2==4) {
					c5.setIcon(carta44);
				}
			}else if(azar==6) {
				PC += 6;
				if(azar2==1) {
					c5.setIcon(carta6);
				}else if(azar2==2) {
					c5.setIcon(carta19);
				}else if(azar2==3) {
					c5.setIcon(carta32);
				}else if(azar2==4) {
					c5.setIcon(carta45);
				}
			}else if(azar==7){
				PC += 7;
				if(azar2==1) {
					c5.setIcon(carta7);
				}else if(azar2==2) {
					c5.setIcon(carta20);
				}else if(azar2==3) {
					c5.setIcon(carta33);
				}else if(azar2==4) {
					c5.setIcon(carta46);
				}
			}else if(azar==8){
				PC += 8;
				if(azar2==1) {
					c5.setIcon(carta8);
				}else if(azar2==2) {
					c5.setIcon(carta21);
				}else if(azar2==3) {
					c5.setIcon(carta34);
				}else if(azar2==4) {
					c5.setIcon(carta47);
				}
			}else if(azar==9) {
				PC += 9;
				if(azar2==1) {
					c5.setIcon(carta9);
				}else if(azar2==2) {
					c5.setIcon(carta22);
				}else if(azar2==3) {
					c5.setIcon(carta35);
				}else if(azar2==4) {
					c5.setIcon(carta48);
				}
			}else if(azar==10){
				int azar3 = (int) (Math.random()*16)+1;
				PC += 10;
				if(azar3==1) {
					c5.setIcon(carta10);
				}else if(azar3==2) {
					c5.setIcon(carta11);
				}else if(azar3==3) {
					c5.setIcon(carta12);
				}else if(azar3==4) {
					c5.setIcon(carta13);
				}else if(azar3==5) {
					c5.setIcon(carta24);
				}else if(azar3==6) {
					c5.setIcon(carta25);
				}else if(azar3==7) {
					c5.setIcon(carta26);
				}else if(azar3==8) {
					c5.setIcon(carta36);
				}else if(azar3==9) {
					c5.setIcon(carta37);
				}else if(azar3==10) {
					c5.setIcon(carta38);
				}else if(azar3==11) {
					c5.setIcon(carta39);
				}else if(azar3==12) {
					c5.setIcon(carta49);
				}else if(azar3==13) {
					c5.setIcon(carta50);
				}else if(azar3==14) {
					c5.setIcon(carta51);
				}else if(azar3==15) {
					c5.setIcon(carta52);
				}else if(azar3==16) {
					c5.setIcon(carta23);
								}
							}
						}
					}
				}
			}
		}
		
		if(PC>21 && pc1 == true){
			PC -= 10;
		}if(PC>21 && pc2 == true){
			PC -= 10;
		}if(PC>21 && pc3 == true){
			PC -= 10;
		}if(PC>21 && pc4 == true){
			PC -= 10;
		}if(PC>21 && pc5 == true){
			PC -= 10;
		}
		
		ps.setText("La banca"+PC);
	}
	
	//Primer carta del Usuario
	public void primercard() {
		int azar = (int) (Math.random()*10)+1;
		int azar2 = (int) (Math.random()*4)+1;
		
			if(azar==1) {
				Usuario += 11;
				end1 = true;
				u1 = true;
				if(azar2==1) {
					c6.setIcon(carta1);
				}else if(azar2==2) {
					c6.setIcon(carta14);
				}else if(azar2==3) {
					c6.setIcon(carta27);
				}else if(azar2==4) {
					c6.setIcon(carta40);
				}
			}else if(azar==2){
				Usuario += 2;
				if(azar2==1) {
					c6.setIcon(carta2);
				}else if(azar2==2) {
					c6.setIcon(carta15);
				}else if(azar2==3) {
					c6.setIcon(carta28);
				}else if(azar2==4) {
					c6.setIcon(carta41);
				}
			}else if(azar==3){
				Usuario += 3;
				if(azar2==1) {
					c6.setIcon(carta3);
				}else if(azar2==2) {
					c6.setIcon(carta16);
				}else if(azar2==3) {
					c6.setIcon(carta29);
				}else if(azar2==4) {
					c6.setIcon(carta42);
				}
			}else if(azar==4){
				Usuario += 4;
				if(azar2==1) {
					c6.setIcon(carta4);
				}else if(azar2==2) {
					c6.setIcon(carta17);
				}else if(azar2==3) {
					c6.setIcon(carta30);
				}else if(azar2==4) {
					c6.setIcon(carta43);
				}
			}else if(azar==5){
				Usuario += 5;
				if(azar2==1) {
					c6.setIcon(carta5);
				}else if(azar2==2) {
					c6.setIcon(carta18);
				}else if(azar2==3) {
					c6.setIcon(carta31);
				}else if(azar2==4) {
					c6.setIcon(carta44);
				}
			}else if(azar==6) {
				Usuario += 6;
				if(azar2==1) {
					c6.setIcon(carta6);
				}else if(azar2==2) {
					c6.setIcon(carta19);
				}else if(azar2==3) {
					c6.setIcon(carta32);
				}else if(azar2==4) {
					c6.setIcon(carta45);
				}
			}else if(azar==7){
				Usuario += 7;
				if(azar2==1) {
					c6.setIcon(carta7);
				}else if(azar2==2) {
					c6.setIcon(carta20);
				}else if(azar2==3) {
					c6.setIcon(carta33);
				}else if(azar2==4) {
					c6.setIcon(carta46);
				}
			}else if(azar==8){
				Usuario += 8;
				if(azar2==1) {
					c6.setIcon(carta8);
				}else if(azar2==2) {
					c6.setIcon(carta21);
				}else if(azar2==3) {
					c6.setIcon(carta34);
				}else if(azar2==4) {
					c6.setIcon(carta47);
				}
			}else if(azar==9) {
				Usuario += 9;
				if(azar2==1) {
					c6.setIcon(carta9);
				}else if(azar2==2) {
					c6.setIcon(carta22);
				}else if(azar2==3) {
					c6.setIcon(carta35);
				}else if(azar2==4) {
					c6.setIcon(carta48);
				}
			}else if(azar==10){
				int azar3 = (int) (Math.random()*16)+1;
				Usuario += 10;
				if(azar3==1) {
					c6.setIcon(carta10);
				}else if(azar3==2) {
					c6.setIcon(carta11);//Carta para black jack
					end2 = true;
				}else if(azar3==3) {
					c6.setIcon(carta12);//Carta para black jack
					end2 = true;
				}else if(azar3==4) {
					c6.setIcon(carta13);//Carta para black jack
					end2 = true;
				}else if(azar3==5) {
					c6.setIcon(carta24);//Carta para black jack
					end2 = true;
				}else if(azar3==6) {
					c6.setIcon(carta25);//Carta para black jack
					end2 = true;
				}else if(azar3==7) {
					c6.setIcon(carta26);//Carta para black jack
					end2 = true;
				}else if(azar3==8) {
					c6.setIcon(carta36);//Carta para black jack
					end2 = true;
				}else if(azar3==9) {
					c6.setIcon(carta37);//Carta para black jack
					end2 = true;
				}else if(azar3==10) {
					c6.setIcon(carta38);//Carta para black jack
					end2 = true;
				}else if(azar3==11) {
					c6.setIcon(carta39);
				}else if(azar3==12) {
					c6.setIcon(carta49);//Carta para black jack
					end2 = true;
				}else if(azar3==13) {
					c6.setIcon(carta50);//Carta para black jack
					end2 = true;
				}else if(azar3==14) {
					c6.setIcon(carta51);//Carta para black jack
					end2 = true;
				}else if(azar3==15) {
					c6.setIcon(carta52);//Carta para black jack
					end2 = true;
				}else if(azar3==16) {
					c6.setIcon(carta23);
				}
			}
		truco = Usuario;
		usr.setText("Usuario: "+truco);
	}
	
	//Dibujado de linea
	public void paint(Graphics g) {
		super.paint(g);
        g.drawLine(10,300,680,300);
        g.setColor(Color.BLUE);
        g.dispose();
	}
	
	//Metodo principal
	public static void main(String[] args) {
		frame();
	}

	//Ventana
	public static void frame(){
		BlackJack frame = new BlackJack();
		frame.setBounds(10,10,810,550);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	//Eventos de los botonoes
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
			int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Alerta!", JOptionPane.YES_NO_OPTION);
			if(resp==JOptionPane.YES_OPTION) {
				System.exit(0);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		}else if(e.getSource()==acerca){
			truc += 1;
			JOptionPane.showMessageDialog(null, "Aplicación desarrollada por:\nEd Alfred\nJulio de 2018\n\nPD: El juego esta hecho de la forma en que lo entendí XD", "Acerca de la Aplicacipon", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/infome.jpg")).getImage().getScaledInstance(100,100, java.awt.Image.SCALE_DEFAULT)));
			if(truc>3) {
				usr.setVisible(true);
				ps.setVisible(true);
				usr.setText("Usuario: "+Usuario);
			}
			if(truc > 10) {
				if(truc>10 && truc <13)
					Usuario += 1;
			}
			if(truc > 15) {
				end1 = true;
				end2 = true;
			}
		}else if(e.getSource()==b2) {
			pedir();
		}else if(e.getSource()==b3) {
			jugar();
		}else if(e.getSource()==b4) {
			nuevojuego();
		}else if(e.getSource()==b5) {
			JOptionPane.showMessageDialog(null, "En el BlackJack se juega ¡contra la banca!. El objetivo del juego es conseguir sumar 21 puntos\n o al menos conseguir sin pasarse un valor más cercano a 21 que el crupier. Los valores de\nlas cartas en el BlackJack son los siguientes: las cartas del 2 al 10 valen su valor, las figuras\nvalen 10 y el AS vale 1 u 11 dependiendo de lo que le convenga al jugador para la partida.", "Instrucciones", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/Imagenes/quest.png")));
		}
	}
	//Método para Dar una cara de la baraja.
	public void pedir() {
		
		int azar = (int) (Math.random()*14)+1;
		int azar2 = (int) (Math.random()*4)+1;
		
		if(contador<5) {
			if(Usuario <21){
			contador += 1;
		if(contador==2){//Carta numero 2
			if(azar==1) {
				end1 = true;
				u2 = true;
				Usuario += 11;
				if(azar2==1) {
					c7.setIcon(carta1);
				}else if(azar2==2) {
					c7.setIcon(carta14);
				}else if(azar2==3) {
					c7.setIcon(carta27);
				}else if(azar2==4) {
					c7.setIcon(carta40);
				}
			}else if(azar==2){
				Usuario += 2;
				if(azar2==1) {
					c7.setIcon(carta2);
				}else if(azar2==2) {
					c7.setIcon(carta15);
				}else if(azar2==3) {
					c7.setIcon(carta28);
				}else if(azar2==4) {
					c7.setIcon(carta41);
				}
			}else if(azar==3){
				Usuario += 3;
				if(azar2==1) {
					c7.setIcon(carta3);
				}else if(azar2==2) {
					c7.setIcon(carta16);
				}else if(azar2==3) {
					c7.setIcon(carta29);
				}else if(azar2==4) {
					c7.setIcon(carta42);
				}
			}else if(azar==4){
				Usuario += 4;
				if(azar2==1) {
					c7.setIcon(carta4);
				}else if(azar2==2) {
					c7.setIcon(carta17);
				}else if(azar2==3) {
					c7.setIcon(carta30);
				}else if(azar2==4) {
					c7.setIcon(carta43);
				}
			}else if(azar==5){
				Usuario += 5;
				if(azar2==1) {
					c7.setIcon(carta5);
				}else if(azar2==2) {
					c7.setIcon(carta18);
				}else if(azar2==3) {
					c7.setIcon(carta31);
				}else if(azar2==4) {
					c7.setIcon(carta44);
				}
			}else if(azar==6) {
				Usuario += 6;
				if(azar2==1) {
					c7.setIcon(carta6);
				}else if(azar2==2) {
					c7.setIcon(carta19);
				}else if(azar2==3) {
					c7.setIcon(carta32);
				}else if(azar2==4) {
					c7.setIcon(carta45);
				}
			}else if(azar==7){
				Usuario += 7;
				if(azar2==1) {
					c7.setIcon(carta7);
				}else if(azar2==2) {
					c7.setIcon(carta20);
				}else if(azar2==3) {
					c7.setIcon(carta33);
				}else if(azar2==4) {
					c7.setIcon(carta46);
				}
			}else if(azar==8){
				Usuario += 8;
				if(azar2==1) {
					c7.setIcon(carta8);
				}else if(azar2==2) {
					c7.setIcon(carta21);
				}else if(azar2==3) {
					c7.setIcon(carta34);
				}else if(azar2==4) {
					c7.setIcon(carta47);
				}
			}else if(azar==9) {
				Usuario += 9;
				if(azar2==1) {
					c7.setIcon(carta9);
				}else if(azar2==2) {
					c7.setIcon(carta22);
				}else if(azar2==3) {
					c7.setIcon(carta35);
				}else if(azar2==4) {
					c7.setIcon(carta48);
				}
			}else if(azar==10){//Comienzo del desmadre :'v
				int azar3 = (int) (Math.random()*4)+1;
				Usuario += 10;
				
				if(azar3==1) {
					c7.setIcon(carta10);//10
				}else if(azar3==2) {
					c7.setIcon(carta23);//10
				}else if(azar3==3) {
					c7.setIcon(carta36);//10
				}else if(azar3==4) {
					c7.setIcon(carta49);//10
				}
			}else if(azar==11) {
				Usuario += 10;
				int azar3 = (int) (Math.random()*3)+1;
				if(azar3==1) {
					c7.setIcon(carta11);//carta para black jack
					end2 = true;
				}else if(azar3==2) {
					c7.setIcon(carta12);//carta para black jack
					end2 = true;
				}else if(azar3==3) {
					c7.setIcon(carta13);//carta para black jack
					end2 = true;
				}
			}else if(azar==12) {
				Usuario += 10;
				int azar3 = (int) (Math.random()*3)+1;
				if(azar3==1) {
					c7.setIcon(carta24);//carta para black jack
					end2 = true;
				}else if(azar3==2) {
					c7.setIcon(carta25);//carta para black jack
					end2 = true;
				}else if(azar3==3) {
					c7.setIcon(carta26);//carta para black jack
					end2 = true;
				}
			}else if(azar==13) {
				Usuario += 10;
				int azar3 = (int) (Math.random()*3)+1;
				if(azar3==1) {
					c7.setIcon(carta37);//carta para black jack
					end2 = true;
				}else if(azar3==2) {
					c7.setIcon(carta38);//carta para black jack
					end2 = true;
				}else if(azar3==3) {
					c7.setIcon(carta39);//carta para black jack
					end2 = true;
				}
			}else if(azar==14) {
				Usuario += 10;
				int azar3 = (int) (Math.random()*3)+1;
				if(azar3==1) {
					c7.setIcon(carta50);//carta para black jack
					end2 = true;
				}else if(azar3==2) {
					c7.setIcon(carta51);//carta para black jack
					end2 = true;
				}else if(azar3==3) {
					c7.setIcon(carta52);//carta para black jack
					end2 = true;
				}
			}
		}else if(contador==3){//Carta numero 3
			if(azar==1) {
			Usuario += 11;
			if(azar2==1) {
				u3 = true;
				c8.setIcon(carta1);
			}else if(azar2==2) {
				c8.setIcon(carta14);
			}else if(azar2==3) {
				c8.setIcon(carta27);
			}else if(azar2==4) {
				c8.setIcon(carta40);
			}
		}else if(azar==2){
			Usuario += 2;
			if(azar2==1) {
				c8.setIcon(carta2);
			}else if(azar2==2) {
				c8.setIcon(carta15);
			}else if(azar2==3) {
				c8.setIcon(carta28);
			}else if(azar2==4) {
				c8.setIcon(carta41);
			}
		}else if(azar==3){
			Usuario += 3;
			if(azar2==1) {
				c8.setIcon(carta3);
			}else if(azar2==2) {
				c8.setIcon(carta16);
			}else if(azar2==3) {
				c8.setIcon(carta29);
			}else if(azar2==4) {
				c8.setIcon(carta42);
			}
		}else if(azar==4){
			Usuario += 4;
			if(azar2==1) {
				c8.setIcon(carta4);
			}else if(azar2==2) {
				c8.setIcon(carta17);
			}else if(azar2==3) {
				c8.setIcon(carta30);
			}else if(azar2==4) {
				c8.setIcon(carta43);
			}
		}else if(azar==5){
			Usuario += 5;
			if(azar2==1) {
				c8.setIcon(carta5);
			}else if(azar2==2) {
				c8.setIcon(carta18);
			}else if(azar2==3) {
				c8.setIcon(carta31);
			}else if(azar2==4) {
				c8.setIcon(carta44);
			}
		}else if(azar==6) {
			Usuario += 6;
			if(azar2==1) {
				c8.setIcon(carta6);
			}else if(azar2==2) {
				c8.setIcon(carta19);
			}else if(azar2==3) {
				c8.setIcon(carta32);
			}else if(azar2==4) {
				c8.setIcon(carta45);
			}
		}else if(azar==7){
			Usuario += 7;
			if(azar2==1) {
				c8.setIcon(carta7);
			}else if(azar2==2) {
				c8.setIcon(carta20);
			}else if(azar2==3) {
				c8.setIcon(carta33);
			}else if(azar2==4) {
				c8.setIcon(carta46);
			}
		}else if(azar==8){
			Usuario += 8;
			if(azar2==1) {
				c8.setIcon(carta8);
			}else if(azar2==2) {
				c8.setIcon(carta21);
			}else if(azar2==3) {
				c8.setIcon(carta34);
			}else if(azar2==4) {
				c8.setIcon(carta47);
			}
		}else if(azar==9) {
			Usuario += 9;
			if(azar2==1) {
				c8.setIcon(carta9);
			}else if(azar2==2) {
				c8.setIcon(carta22);
			}else if(azar2==3) {
				c8.setIcon(carta35);
			}else if(azar2==4) {
				c8.setIcon(carta48);
			}
		}else if(azar==10){
			int azar3 = (int) (Math.random()*4)+1;
			Usuario += 10;
			
			if(azar3==1) {
				c8.setIcon(carta10);//10
			}else if(azar3==2) {
				c8.setIcon(carta23);//10
			}else if(azar3==3) {
				c8.setIcon(carta36);//10
			}else if(azar3==4) {
				c8.setIcon(carta49);//10
			}
		}else if(azar==11) {
			Usuario += 10;
			int azar3 = (int) (Math.random()*3)+1;
			if(azar3==1) {
				c8.setIcon(carta11);//carta para black jack
				end2 = true;
			}else if(azar3==2) {
				c8.setIcon(carta12);//carta para black jack
				end2 = true;
			}else if(azar3==3) {
				c8.setIcon(carta13);//carta para black jack
				end2 = true;
			}
		}else if(azar==12) {
			Usuario += 10;
			int azar3 = (int) (Math.random()*3)+1;
			if(azar3==1) {
				c8.setIcon(carta24);//carta para black jack
				end2 = true;
			}else if(azar3==2) {
				c8.setIcon(carta25);//carta para black jack
				end2 = true;
			}else if(azar3==3) {
				c8.setIcon(carta26);//carta para black jack
				end2 = true;
			}
		}else if(azar==13) {
			Usuario += 10;
			int azar3 = (int) (Math.random()*3)+1;
			if(azar3==1) {
				c8.setIcon(carta37);//carta para black jack
				end2 = true;
			}else if(azar3==2) {
				c8.setIcon(carta38);//carta para black jack
				end2 = true;
			}else if(azar3==3) {
				c8.setIcon(carta39);//carta para black jack
				end2 = true;
			}
		}else if(azar==14) {
			Usuario += 10;
			int azar3 = (int) (Math.random()*3)+1;
			if(azar3==1) {
				c8.setIcon(carta50);//carta para black jack
				end2 = true;
			}else if(azar3==2) {
				c8.setIcon(carta51);//carta para black jack
				end2 = true;
			}else if(azar3==3) {
				c8.setIcon(carta52);//carta para black jack
				end2 = true;
			}
		}
	}else if(contador==4){//Carta numero 4
			if(azar==1) {
			Usuario += 11;
			if(azar2==1) {
				u4 = true;
				c9.setIcon(carta1);
			}else if(azar2==2) {
				c9.setIcon(carta14);
			}else if(azar2==3) {
				c9.setIcon(carta27);
			}else if(azar2==4) {
				c9.setIcon(carta40);
			}
		}else if(azar==2){
			Usuario += 2;
			if(azar2==1) {
				c9.setIcon(carta2);
			}else if(azar2==2) {
				c9.setIcon(carta15);
			}else if(azar2==3) {
				c9.setIcon(carta28);
			}else if(azar2==4) {
				c9.setIcon(carta41);
			}
		}else if(azar==3){
			Usuario += 3;
			if(azar2==1) {
				c9.setIcon(carta3);
			}else if(azar2==2) {
				c9.setIcon(carta16);
			}else if(azar2==3) {
				c9.setIcon(carta29);
			}else if(azar2==4) {
				c9.setIcon(carta42);
			}
		}else if(azar==4){
			Usuario += 4;
			if(azar2==1) {
				c9.setIcon(carta4);
			}else if(azar2==2) {
				c9.setIcon(carta17);
			}else if(azar2==3) {
				c9.setIcon(carta30);
			}else if(azar2==4) {
				c9.setIcon(carta43);
			}
		}else if(azar==5){
			Usuario += 5;
			if(azar2==1) {
				c9.setIcon(carta5);
			}else if(azar2==2) {
				c9.setIcon(carta18);
			}else if(azar2==3) {
				c9.setIcon(carta31);
			}else if(azar2==4) {
				c9.setIcon(carta44);
			}
		}else if(azar==6) {
			Usuario += 6;
			if(azar2==1) {
				c9.setIcon(carta6);
			}else if(azar2==2) {
				c9.setIcon(carta19);
			}else if(azar2==3) {
				c9.setIcon(carta32);
			}else if(azar2==4) {
				c9.setIcon(carta45);
			}
		}else if(azar==7){
			Usuario += 7;
			if(azar2==1) {
				c9.setIcon(carta7);
			}else if(azar2==2) {
				c9.setIcon(carta20);
			}else if(azar2==3) {
				c9.setIcon(carta33);
			}else if(azar2==4) {
				c9.setIcon(carta46);
			}
		}else if(azar==8){
			Usuario += 8;
			if(azar2==1) {
				c9.setIcon(carta8);
			}else if(azar2==2) {
				c9.setIcon(carta21);
			}else if(azar2==3) {
				c9.setIcon(carta34);
			}else if(azar2==4) {
				c9.setIcon(carta47);
			}
		}else if(azar==9) {
			Usuario += 9;
			if(azar2==1) {
				c9.setIcon(carta9);
			}else if(azar2==2) {
				c9.setIcon(carta22);
			}else if(azar2==3) {
				c9.setIcon(carta35);
			}else if(azar2==4) {
				c9.setIcon(carta48);
			}
		}else if(azar==10){//Comienzo del desmadre :'v
			int azar3 = (int) (Math.random()*4)+1;
			Usuario += 10;
			
			if(azar3==1) {
				c9.setIcon(carta10);//10
			}else if(azar3==2) {
				c9.setIcon(carta23);//10
			}else if(azar3==3) {
				c9.setIcon(carta36);//10
			}else if(azar3==4) {
				c9.setIcon(carta49);//10
			}
		}else if(azar==11) {
			Usuario += 10;
			int azar3 = (int) (Math.random()*3)+1;
			if(azar3==1) {
				c9.setIcon(carta11);//carta para black jack
				end2 = true;
			}else if(azar3==2) {
				c9.setIcon(carta12);//carta para black jack
				end2 = true;
			}else if(azar3==3) {
				c9.setIcon(carta13);//carta para black jack
				end2 = true;
			}
		}else if(azar==12) {
			Usuario += 10;
			int azar3 = (int) (Math.random()*3)+1;
			if(azar3==1) {
				c9.setIcon(carta24);//carta para black jack
				end2 = true;
			}else if(azar3==2) {
				c9.setIcon(carta25);//carta para black jack
				end2 = true;
			}else if(azar3==3) {
				c9.setIcon(carta26);//carta para black jack
				end2 = true;
			}
		}else if(azar==13) {
			Usuario += 10;
			int azar3 = (int) (Math.random()*3)+1;
			if(azar3==1) {
				c9.setIcon(carta37);//carta para black jack
				end2 = true;
			}else if(azar3==2) {
				c9.setIcon(carta38);//carta para black jack
				end2 = true;
			}else if(azar3==3) {
				c9.setIcon(carta39);//carta para black jack
				end2 = true;
			}
		}else if(azar==14) {
			Usuario += 10;
			int azar3 = (int) (Math.random()*3)+1;
			if(azar3==1) {
				c9.setIcon(carta50);//carta para black jack
				end2 = true;
			}else if(azar3==2) {
				c9.setIcon(carta51);//carta para black jack
				end2 = true;
			}else if(azar3==3) {
				c9.setIcon(carta52);//carta para black jack
				end2 = true;
			}
		}
	}else if(contador==5){//Carta numero 5
			if(azar==1) {
			Usuario += 11;
			if(azar2==1) {
				u5 = true;
				c10.setIcon(carta1);
			}else if(azar2==2) {
				c10.setIcon(carta14);
			}else if(azar2==3) {
				c10.setIcon(carta27);
			}else if(azar2==4) {
				c10.setIcon(carta40);
			}
		}else if(azar==2){
			Usuario += 2;
			if(azar2==1) {
				c10.setIcon(carta2);
			}else if(azar2==2) {
				c10.setIcon(carta15);
			}else if(azar2==3) {
				c10.setIcon(carta28);
			}else if(azar2==4) {
				c10.setIcon(carta41);
			}
		}else if(azar==3){
			Usuario += 3;
			if(azar2==1) {
				c10.setIcon(carta3);
			}else if(azar2==2) {
				c10.setIcon(carta16);
			}else if(azar2==3) {
				c10.setIcon(carta29);
			}else if(azar2==4) {
				c10.setIcon(carta42);
			}
		}else if(azar==4){
			Usuario += 4;
			if(azar2==1) {
				c10.setIcon(carta4);
			}else if(azar2==2) {
				c10.setIcon(carta17);
			}else if(azar2==3) {
				c10.setIcon(carta30);
			}else if(azar2==4) {
				c10.setIcon(carta43);
			}
		}else if(azar==5){
			Usuario += 5;
			if(azar2==1) {
				c10.setIcon(carta5);
			}else if(azar2==2) {
				c10.setIcon(carta18);
			}else if(azar2==3) {
				c10.setIcon(carta31);
			}else if(azar2==4) {
				c10.setIcon(carta44);
			}
		}else if(azar==6) {
			Usuario += 6;
			if(azar2==1) {
				c10.setIcon(carta6);
			}else if(azar2==2) {
				c10.setIcon(carta19);
			}else if(azar2==3) {
				c10.setIcon(carta32);
			}else if(azar2==4) {
				c10.setIcon(carta45);
			}
		}else if(azar==7){
			Usuario += 7;
			if(azar2==1) {
				c10.setIcon(carta7);
			}else if(azar2==2) {
				c10.setIcon(carta20);
			}else if(azar2==3) {
				c10.setIcon(carta33);
			}else if(azar2==4) {
				c10.setIcon(carta46);
			}
		}else if(azar==8){
			Usuario += 8;
			if(azar2==1) {
				c10.setIcon(carta8);
			}else if(azar2==2) {
				c10.setIcon(carta21);
			}else if(azar2==3) {
				c10.setIcon(carta34);
			}else if(azar2==4) {
				c10.setIcon(carta47);
			}
		}else if(azar==9) {
			Usuario += 9;
			if(azar2==1) {
				c10.setIcon(carta9);
			}else if(azar2==2) {
				c10.setIcon(carta22);
			}else if(azar2==3) {
				c10.setIcon(carta35);
			}else if(azar2==4) {
				c10.setIcon(carta48);
			}
		}else if(azar==10){//Comienzo del desmadre :'v
			int azar3 = (int) (Math.random()*4)+1;
			Usuario += 10;
			
			if(azar3==1) {
				c10.setIcon(carta10);//10
			}else if(azar3==2) {
				c10.setIcon(carta23);//10
			}else if(azar3==3) {
				c10.setIcon(carta36);//10
			}else if(azar3==4) {
				c10.setIcon(carta49);//10
			}
		}else if(azar==11) {
			Usuario += 10;
			int azar3 = (int) (Math.random()*3)+1;
			if(azar3==1) {
				c10.setIcon(carta11);//carta para black jack
				end2 = true;
			}else if(azar3==2) {
				c10.setIcon(carta12);//carta para black jack
				end2 = true;
			}else if(azar3==3) {
				c10.setIcon(carta13);//carta para black jack
				end2 = true;
			}
		}else if(azar==12) {
			Usuario += 10;
			int azar3 = (int) (Math.random()*3)+1;
			if(azar3==1) {
				c10.setIcon(carta24);//carta para black jack
				end2 = true;
			}else if(azar3==2) {
				c10.setIcon(carta25);//carta para black jack
				end2 = true;
			}else if(azar3==3) {
				c10.setIcon(carta26);//carta para black jack
				end2 = true;
			}
		}else if(azar==13) {
			Usuario += 10;
			int azar3 = (int) (Math.random()*3)+1;
			if(azar3==1) {
				c10.setIcon(carta37);//carta para black jack
				end2 = true;
			}else if(azar3==2) {
				c10.setIcon(carta38);//carta para black jack
				end2 = true;
			}else if(azar3==3) {
				c10.setIcon(carta39);//carta para black jack
				end2 = true;
			}
		}else if(azar==14) {
			Usuario += 10;
			int azar3 = (int) (Math.random()*3)+1;
			if(azar3==1) {
				c10.setIcon(carta50);//carta para black jack
				end2 = true;
			}else if(azar3==2) {
				c10.setIcon(carta51);//carta para black jack
				end2 = true;
			}else if(azar3==3) {
				c10.setIcon(carta52);//carta para black jack
				end2 = true;
						}
					}
				}
			}else {
				pierdes();
			}
		}//Fin de Deciciones de Cartas
		if(Usuario>21 && u1 == true){
			Usuario -= 10;
		}else if(Usuario>21 && u2 == true){
			Usuario -= 10;
		}else if(Usuario>21 && u3 == true){
			Usuario -= 10;
		}else if(Usuario>21 && u4 == true){
			Usuario -= 10;
		}else if(Usuario>21 && u5 == true){
			Usuario -= 10;
		}
		if(Usuario>21) {
			JOptionPane.showMessageDialog(null, "Pierdes");
			Der += 1;
			Derrotas = "Derrotas: "+Der;
			l3.setText(Derrotas);
			b2.setEnabled(false);
			b3.setEnabled(false);
			}else if(contador==5){
				JOptionPane.showMessageDialog(null, "Ganas");
				Vic += 1;
				Victorias = "Victorias: "+Vic;
				l2.setText(Victorias);
			}
		 usr.setText("Usuario: "+Usuario);
	}
	
	public void nuevojuego(){
		Usuario = 0;
		PC = 0;
		PCcard();
		primercard();
		c2.setIcon(bac);
		c3.setIcon(bac);
		c4.setIcon(bac);
		c5.setIcon(bac);
		c7.setIcon(bac);
		c8.setIcon(bac);
		c9.setIcon(bac);
		c10.setIcon(bac);
		b2.setEnabled(true);//Habilitar botón
		b3.setEnabled(true);//Habiliar botón
		contador = 1;
		contado = 1;
		truco = 0;
		l4.setVisible(false);
		fin1 = false;
		fin2 = false;
		end1 = false;
		end2 = false;
		pc1 = false;
		pc2 = false;
		pc3 = false;
		pc4 = false;
		pc5 = false;
		u1 = false;
		u2 = false;
		u3 = false;
		u4 = false;
		u5 = false;
	}
	public void jugar(){
		
		PCcards();
		
		if((fin1 == true && fin2 == true) && PC == 21){
			JOptionPane.showMessageDialog(null, "¡Black Jack\nPierdes!","Black Jack",JOptionPane.INFORMATION_MESSAGE);
			Derrotas += 1;
			Der += 1;
			Derrotas = "Derrotas: "+Der;
			l3.setText(Derrotas);
		}else if((end1 == true && end2 == true) && Usuario == 21) {
			JOptionPane.showMessageDialog(null, "¡Black Jack\nGanas :D!");
			Vic += 1;
			Victorias = "Victorias: "+Vic;
			l2.setText(Victorias);
		}else if(contado==5) {
			pierdes();
			Derrotas += 1;
			Der += 1;
			Derrotas = "Derrotas: "+Der;
			l3.setText(Derrotas);
		}
			else if(PC>21){
				ganas();
			Vic += 1;
			Victorias = "Victorias: "+Vic;
			l2.setText(Victorias);
		}else if(Usuario==PC){
			pierdes();
			Derrotas += 1;
			Der += 1;
			Derrotas = "Derrotas: "+Der;
			l3.setText(Derrotas);
		}else if(Usuario>PC || pslose == true){
			ganas();
			Vic += 1;
			Victorias = "Victorias: "+Vic;
			l2.setText(Victorias);
		}else {
			pierdes();
			Derrotas += 1;
			Der += 1;
			Derrotas = "Derrotas: "+Der;
			l3.setText(Derrotas);
		}
		b2.setEnabled(false);
		b3.setEnabled(false);
	}
	
	public void pierdes() {
		JOptionPane.showMessageDialog(null, "Pierdes","Loser",JOptionPane.INFORMATION_MESSAGE);
		b2.setEnabled(false);
		b3.setEnabled(false);
	}
	
	public void ganas() {
		JOptionPane.showMessageDialog(null, "Ganas","Winer",JOptionPane.INFORMATION_MESSAGE);
		b2.setEnabled(false);
		b3.setEnabled(false);
	}
}