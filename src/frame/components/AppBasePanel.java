package frame.components;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import frame.AppFrame;
import utils.ButtonUtils;

import static constant.Constants.BASE_IMG;

public class AppBasePanel extends JPanel {
	
	private ButtonUtils buttonUtils;
	
	/**
	 * 생성자
	 * @param appFrame
	 */
	public AppBasePanel(AppFrame appFrame) {
		setLayout(null);
		buttonUtils = new ButtonUtils();
		
		// 앱 실행 버튼
		add(buttonUtils.runApp(appFrame));
	}
	
	/**
	 * 패널 배경 이미지 넣기
	 * background를 그려준다
	 * @param g
	 */
	@Override
	public void paintComponent(Graphics g) {
		Image image = new ImageIcon(BASE_IMG).getImage();
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}
	
	

}
