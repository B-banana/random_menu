package utils;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

import constant.PanelCode;
import frame.AppFrame;

public interface Button {

	/**
     * 배경, 테두리가 없는 버튼을 설정합니다.
     * @param btnName : 버튼 텍스트
     * @param imgPath : 이미지 경로
     * @param x : x 좌표
     * @param y : y 좌표
     * @param width : 길이
     * @param height : 높이
     * @return
     */
	JButton setTransparencyButton(String btnName, String imgPath, int x, int y, int width, int height);
	
	/**
	 * 앱 실행 버튼 
	 * @param appFrame
	 * @return
	 */
	JButton runApp(AppFrame appFrame);
	
	/**
	 * 진행 시작 버튼 
	 * @param appFrame
	 * @return
	 */
	JButton start(AppFrame appFrame);
	
	/**
	 * 종료 버튼
	 * @param appFrame
	 * @return
	 */
	JButton close(AppFrame appFrame);
	
	/**
	 * 뒤로가기 버튼
	 * @param appFrame
	 * @param panelCode
	 * @return
	 */
	JButton goBack(AppFrame appFrame, PanelCode panelCode, String status);
	
	/**
	 * 랜덤 패널 진입 버튼
	 * @param appFrame
	 * @return
	 */
	JButton goRandom(AppFrame appFrame);
	
	/**
	 * 카테고리 패널 진입 버튼
	 * @param appFrame
	 * @return
	 */
	JButton goCategory(AppFrame appFrame);
	
	/**
	 * 한식, 중식, 일식, 양식, 아시안 버튼 리스트
	 * @param appFrame
	 * @return
	 */
	ArrayList<JButton> getCategoryBtnBtn(AppFrame appFrame);
	
	/**
     * 랜덤 추천 시작 버튼
     * @param appFrame
     * @return
     */
    JButton startRandom(AppFrame appFrame);
    
	/**
	 * 버튼 이벤트로 작동되는 쓰레드에 
	 * interrupt를 발생시켜 중지시키고 
	 * 버튼을 재설정 하고 랜덤 결과값을 보여주는 패널로 이동
	 * @param thread
	 * @param jButton
	 */
    void interruptRandomImgThread(Thread thread, JButton jButton, JLabel jLabel, AppFrame appFrame, String s);
	
    /**
     * 카카오맵 브라우져 호출
     * @param url
     * @return
     */
    JButton openkakaomap(String url);
    
    /**
     * 깃 연결
     * @param url
     * @return
     */
    JButton openGit(String url);

}
