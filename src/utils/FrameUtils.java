package utils;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameUtils implements Frame {

	@Override
	public JFrame setFrameSettings(JFrame jFrame) {
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//윈도우창 종료시 프로그램 종료
		jFrame.setVisible(true);
		jFrame.setSize(410, 840);
		jFrame.setResizable(false);
		//프레임 사이즈 얻기
		Dimension frameSize = jFrame.getSize();
		//모니터 사이즈 얻기
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//화면 중앙에 위치 시키기
		jFrame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		return jFrame;
	}
	
	

}
