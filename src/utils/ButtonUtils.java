package utils;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import constant.PanelCode;
import frame.AppFrame;

import static constant.Constants.*;
import static constant.PanelCode.*;

public class ButtonUtils implements Button{
	
	private String globalStatus;

	@Override
	public JButton setTransparencyButton(String btnName, String imgPath, int x, int y, int width, int height) {
		JButton jButton = new JButton();
		if(!imgPath.isEmpty()) {
		Image image = new ImageIcon(imgPath).getImage();
		ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(width, height, Image.SCALE_SMOOTH));
		jButton.setIcon(imageIcon);
		}
		jButton.setActionCommand(btnName); //btnName의 액션을 일으킴
		jButton.setBounds(x, y, width, height);
		jButton.setBorderPainted(false);
		jButton.setFocusPainted(false);
		jButton.setContentAreaFilled(false);	//내용영역채우기 않함.
		jButton.setOpaque(false);	//JLabel의 배경색
		return jButton;
	}

	@Override
	public JButton runApp(AppFrame appFrame) {
		JButton runApp = this.setTransparencyButton(RUN_APP, APP_ICON_BTN, 30, 455, 95, 95);
		runApp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				appFrame.getCardLayout().show(appFrame.getContentPane(), APP_START.getValue());
			}
		});
		return runApp;
	}

	@Override
	public JButton start(AppFrame appFrame) {
		JButton start = this.setTransparencyButton(START, APP_START_BTN, 75, 550, 250, 60);
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				appFrame.getCardLayout().show(appFrame.getContentPane(), APP_MAIN.getValue());
			}
		});
		return start;
	}

	@Override
	public JButton close(AppFrame appFrame) {
		JButton close = this.setTransparencyButton(CLOSE, APP_CLOSE_BTN, 75, 620, 250, 60);
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				appFrame.getCardLayout().show(appFrame.getContentPane(), APP_BASE.getValue());
			}
		});
		return close;
	}

	@Override
	public JButton goBack(AppFrame appFrame, PanelCode panelCode, String status) {
		JButton back = this.setTransparencyButton(GO_BACK, APP_GO_BACK_BTN, 50, 100, 80, 35);
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch (panelCode) {	//현재 버튼위 위치 판별
				// case 현재위치
				// 위치에 따른 뒤로 갔을떄 나타내줄 화면 불러옴.
				// show(불러올 패널, 패널 이름)
				case APP_MAIN :
					appFrame.getCardLayout().show(appFrame.getContentPane(), APP_START.getValue());
					break;
				case APP_RANDOM, APP_CATEGORY :
					appFrame.getCardLayout().show(appFrame.getContentPane(), APP_MAIN.getValue());
					break;	
				case APP_RANDOM_RESULT :
					// status 값에 따라 패널들의 설정을 다르게 보여줌
					// 랜덤을 실행하기 전이라면 랜덤과 카테고리 선택화면
					// 랜덤을 실행 후라면, 랜덤을 실행하기 직전 상태로
					if(!status.isEmpty()) {
						appFrame.add(APP_RANDOM.getValue(), new AppRandomPanel(appFrame, status));
						appFrame.getCardLayout().show(appFrame.getContentPane(), APP_RANDOM.getValue());
					}
					break;
				}
			}
		});
		
		return back;
	}

	@Override
	public JButton goRandom(AppFrame appFrame) {
		JButton random = this.setTransparencyButton(GO_RANDOM, APP_RANDOM_BTN, 45, 200, 300, 255);
		random.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				globalStatus = RANDOM_STATUS;
				appFrame.add(APP_RANDOM.getValue(), new AppRandomPanel(appFrame, globalStatus));
				appFrame.getCardLayout().show(appFrame.getContentPane(), APP_RANDOM.getValue());
			}
		});
		return random;
	}

	@Override
	public JButton goCategory(AppFrame appFrame) {
		JButton category = this.setTransparencyButton(GO_CATEGORY, APP_CATEGORY_BTN, 45, 435, 300, 225);
		category.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				appFrame.add(APP_CATEGORY.getValue(), new AppCategoryPanel(appFrame));
				appFrame.getCardLayout().show(appFrame.getContentPane(), APP_BASE.getValue());
			}
		});
		return category;
	}

	@Override
	public ArrayList<JButton> getCategoryBtnBtn(AppFrame appFrame) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JButton startRandom(AppFrame appFrame) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void interruptRandomImgThread(Thread thread, JButton jButton, JLabel jLabel, AppFrame appFrame, String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JButton openkakaomap(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JButton openGit(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JButton goBack(AppFrame appFrame, PanelCode panelCode, String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
