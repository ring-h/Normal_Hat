package lobby;

//import Login.Login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class lobby extends JFrame {
	private String readyState = "0";
	private JPanel contentPane;

	private JButton btnJoin;
	private JButton btnshop;
	private JButton btnsetting;
	private JButton btnexit;

	private JButton btnequipmentUp;
	private JButton btnequipmentCenter; // 직업선택 기본값
	private JButton btnequipmentLeft;
	private JButton btnequipmentRight;
	private JButton btnequipmentDown;

	private JLabel centerCharacter;
	private JLabel lobbyBackgroundImg;
	static String chatname;

	public lobby() {
		Color MyColor = new Color(200, 190, 230);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1110, 830); // 위치 배치
		setLocationRelativeTo(null); // 윈도우창 가운데 창 띄우기
		setResizable(false); // 창 크기 조절 불가

		// 대표 패널
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.BLACK, 5));
		contentPane.setBackground(MyColor);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// join 버튼

		ImageIcon join = new ImageIcon("images/lobby/button/join/join.png");
		ImageIcon join_click = new ImageIcon("images/lobby/button/join/join_click.png");
		ImageIcon join_mouse = new ImageIcon("images/lobby/button/join/join_mouse.png");
		btnJoin = new JButton(join);
		btnJoin.setBounds(600, 388, 112, 82);
		btnJoin.setContentAreaFilled(false);
		btnJoin.setBorderPainted(false);
		btnJoin.setFocusPainted(false);
		btnJoin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnJoin);

		// shop 버튼
		ImageIcon shop = new ImageIcon("images/lobby/button/shop/shop.png");
		ImageIcon shop_click = new ImageIcon("images/lobby/button/shop/shop_click.png");
		ImageIcon shop_mouse = new ImageIcon("images/lobby/button/shop/shop_mouse.png");
		btnshop = new JButton(shop);
		btnshop.setBounds(439, 388, 112, 82);
		btnshop.setContentAreaFilled(false);
		btnshop.setBorderPainted(false);
		btnshop.setFocusPainted(false);
		btnshop.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnshop);

		// setting 버튼
		ImageIcon setting = new ImageIcon("images/lobby/button/setting/setting.png");
		ImageIcon setting_click = new ImageIcon("images/lobby/button/setting/setting_click.png");
		ImageIcon setting_mouse = new ImageIcon("images/lobby/button/setting/setting_mouse.png");
		btnsetting = new JButton(setting);
		btnsetting.setBounds(784, 700, 112, 82);
		btnsetting.setContentAreaFilled(false);
		btnsetting.setBorderPainted(false);
		btnsetting.setFocusPainted(false);
		btnsetting.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnsetting);

		// exit 버튼
		ImageIcon exit = new ImageIcon("images/lobby/button/exit/exit.png");
		ImageIcon exit_click = new ImageIcon("images/lobby/button/exit/exit_click.png");
		ImageIcon exit_mouse = new ImageIcon("images/lobby/button/exit/exit_mouse.png");
		btnexit = new JButton(exit);
		btnexit.setBounds(936, 700, 143, 83);
		btnexit.setContentAreaFilled(false);
		btnexit.setBorderPainted(false);
		btnexit.setFocusPainted(false);
		btnexit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnexit);

		// equipment Up버튼
		ImageIcon equipmentUp_defalut = new ImageIcon("images/lobby/equipment/equipment_default.png");
		ImageIcon equipmentUp_select = new ImageIcon("images/lobby/equipment/equipment_select.png");

		btnequipmentUp = new JButton(equipmentUp_defalut);
		btnequipmentUp.setBounds(886, 385, 92, 91);
		btnequipmentUp.setContentAreaFilled(false);
		btnequipmentUp.setBorderPainted(false);
		btnequipmentUp.setFocusPainted(false);
		btnequipmentUp.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnequipmentUp);

		// equipment Left버튼
		ImageIcon equipmentLeft_defalut = new ImageIcon("images/lobby/equipment/equipment_default.png");
		ImageIcon equipmentLeft_select = new ImageIcon("images/lobby/equipment/equipment_select.png");
		btnequipmentLeft = new JButton(equipmentLeft_defalut);
		btnequipmentLeft.setBounds(794, 479, 92, 91);
		btnequipmentLeft.setContentAreaFilled(false);
		btnequipmentLeft.setBorderPainted(false);
		btnequipmentLeft.setFocusPainted(false);
		btnequipmentLeft.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnequipmentLeft);

		// equipment Center버튼
		ImageIcon equipmentCenter_defalut = new ImageIcon("images/lobby/equipment/equipment_default.png");
		ImageIcon equipmentCenter_select = new ImageIcon("images/lobby/equipment/equipment_select.png");
		btnequipmentCenter = new JButton(equipmentCenter_defalut);
		btnequipmentCenter.setBounds(886, 479, 92, 91);
		btnequipmentCenter.setContentAreaFilled(false);
		btnequipmentCenter.setBorderPainted(false);
		btnequipmentCenter.setFocusPainted(false);
		btnequipmentCenter.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnequipmentCenter);

		// equipment Right버튼
		ImageIcon equipmentRight_defalut = new ImageIcon("images/lobby/equipment/equipment_default.png");
		ImageIcon equipmentRight_select = new ImageIcon("images/lobby/equipment/equipment_select.png");
		btnequipmentRight = new JButton(equipmentRight_defalut);
		btnequipmentRight.setBounds(978, 479, 92, 91);
		btnequipmentRight.setContentAreaFilled(false);
		btnequipmentRight.setBorderPainted(false);
		btnequipmentRight.setFocusPainted(false);
		btnequipmentRight.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnequipmentRight);

		// equipment Down버튼
		ImageIcon equipmentDown_defalut = new ImageIcon("images/lobby/equipment/equipment_default.png");
		ImageIcon equipmentDown_select = new ImageIcon("images/lobby/equipment/equipment_select.png");
		btnequipmentDown = new JButton(equipmentDown_defalut);
		btnequipmentDown.setBounds(886, 573, 92, 91);
		btnequipmentDown.setContentAreaFilled(false);
		btnequipmentDown.setBorderPainted(false);
		btnequipmentDown.setFocusPainted(false);
		btnequipmentDown.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnequipmentDown);

		
		 //로비 캐릭터 
		ImageIcon charactericon = new ImageIcon("images/lobby/lobbyCharacter/lobbycharacter.png"); 
		Image character = charactericon.getImage(); 
		Image characterImg = character.getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
		ImageIcon changIcon = new ImageIcon(characterImg); 
		centerCharacter = new JLabel(changIcon); 
		centerCharacter.setBounds(830,100,200,200);
		contentPane.add(centerCharacter);
		  
		 
		// 로비배경
		ImageIcon lobbyBackground = new ImageIcon("images/lobby/lobbyBackground.png");
		Image lobbyBack = lobbyBackground.getImage();
		Image lobbyBackImg = lobbyBack.getScaledInstance(1100, 800, Image.SCALE_SMOOTH);
		ImageIcon lobbybackIcon = new ImageIcon(lobbyBackImg);
		lobbyBackgroundImg = new JLabel(lobbybackIcon);
		lobbyBackgroundImg.setBounds(0, 0, 1100, 800);
		contentPane.add(lobbyBackgroundImg);

		// =======================버튼 이벤트==============================

		btnJoin.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				btnJoin.setPressedIcon(join_click);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnJoin.setIcon(join_mouse);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnJoin.setIcon(join);
			}
		});

		btnshop.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
				btnshop.setPressedIcon(shop_click);
			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
				btnshop.setIcon(shop_mouse);
			}

			public void mouseExited(MouseEvent e) {
				btnshop.setIcon(shop);
			}
		});

		btnexit.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
				btnexit.setPressedIcon(exit_click);
			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
				btnexit.setIcon(exit_mouse);
			}

			public void mouseExited(MouseEvent e) {
				btnexit.setIcon(exit);
			}
		});

		btnsetting.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
				btnsetting.setPressedIcon(setting_click);
			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
				btnsetting.setIcon(setting_mouse);
			}

			public void mouseExited(MouseEvent e) {
				btnsetting.setIcon(setting);
			}
		});

		btnequipmentUp.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {

			}

			public void mousePressed(MouseEvent e) {
				btnequipmentUp.setIcon(equipmentUp_select);
				btnequipmentLeft.setIcon(equipmentUp_defalut);
				btnequipmentCenter.setIcon(equipmentUp_defalut);
				btnequipmentRight.setIcon(equipmentUp_defalut);
				btnequipmentDown.setIcon(equipmentUp_defalut);
			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {

			}

			public void mouseExited(MouseEvent e) {

			}
		});

		btnequipmentLeft.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
				btnequipmentUp.setIcon(equipmentUp_defalut);
				btnequipmentLeft.setIcon(equipmentUp_select);
				btnequipmentCenter.setIcon(equipmentUp_defalut);
				btnequipmentRight.setIcon(equipmentUp_defalut);
				btnequipmentDown.setIcon(equipmentUp_defalut);

			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}
		});

		btnequipmentCenter.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
				btnequipmentUp.setIcon(equipmentUp_defalut);
				btnequipmentLeft.setIcon(equipmentUp_defalut);
				btnequipmentCenter.setIcon(equipmentUp_select);
				btnequipmentRight.setIcon(equipmentUp_defalut);
				btnequipmentDown.setIcon(equipmentUp_defalut);
			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}
		});

		btnequipmentRight.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
				btnequipmentUp.setIcon(equipmentUp_defalut);
				btnequipmentLeft.setIcon(equipmentUp_defalut);
				btnequipmentCenter.setIcon(equipmentUp_defalut);
				btnequipmentRight.setIcon(equipmentUp_select);
				btnequipmentDown.setIcon(equipmentUp_defalut);
			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}
		});

		btnequipmentDown.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
				btnequipmentUp.setIcon(equipmentUp_defalut);
				btnequipmentLeft.setIcon(equipmentUp_defalut);
				btnequipmentCenter.setIcon(equipmentUp_defalut);
				btnequipmentRight.setIcon(equipmentUp_defalut);
				btnequipmentDown.setIcon(equipmentUp_select);
			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}
		});

		setVisible(true);
	}

	public static void setChatname(String chatname) {
		lobby.chatname = chatname;
	}

//	public static void nameinfo(String nickname) {
//		chatname = nickname;
//	}

	public static String getChatname() {
		return chatname;
	}
//	public static void main(String[] args) {
//		Login login = new Login();
//		//new lobby();
//	}
}
