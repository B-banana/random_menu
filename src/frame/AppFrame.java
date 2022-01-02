package frame;

import java.awt.CardLayout;

import javax.swing.JFrame;

import constant.PanelCode;
import utils.FrameUtils;

public class AppFrame extends JFrame {

	private final CardLayout cards;
	private FrameUtils frameUtils;
	private static AppFrame instance;
	
	public AppFrame() {
		cards = new CardLayout();
		frameUtils = new FrameUtils();
		
		getContentPane().setLayout(cards);
		getContentPane().add(PanelCode.APP_BASE.getValue(), new AppBasePanel(this));
		getContentPane().add(PanelCode.APP_START.getValue(), new AppStartPanel(this));
		getContentPane().add(PanelCode.APP_MAIN.getValue(), new AppMainPanel(this));
		//Component	add (String  name, Component  comp)
		//지정된 컴퍼넌트를 이 컨테이너에 추가합니다.
		
		//기본 셋팅 설정
		frameUtils.setFrameSettings(this);
	}
	
	public CardLayout getCardLayout() {	//각각의 버튼에 따른 패널을 불러옴
		return cards;
	}
	
	// 싱글톤을 사용
	// 싱글톤 종류에 관해서는 이전 예제에서 진행했었음.
	// static으로 선언했으므로 해당 메서드가 생성자보다 먼저 호출 됨.
	
	public static void getInstance() {
		
		//생성자를 통해 기본 프레임 정의
		instance = new AppFrame();
		//레이아웃 관리자에게 레이아웃정보를 다시 계산 지시
		instance.revalidate();
		// 레이아웃 새로 그림
		instance.repaint();
	}

}
