package com.heima.practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GUI_GetYourComeDay extends Frame {

	
	public GUI_GetYourComeDay() {
		init();
		event();
		centerPanel();
	}
	
	
	public void centerPanel() {
		Panel center = new Panel();
		TextArea viewText = new TextArea();
		center.setLayout(new BorderLayout());
		center.add(viewText);
		
		viewText.setEditable(false);
		viewText.setBackground(Color.WHITE);
		viewText.setFont(new Font("xxx", Font.PLAIN, 15));
		this.add(center);
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		long l;
		while(true){
			try {
				l = (new Date().getTime() - sdf.parse("1992年5月18日 05:44:30").getTime())/1000;
				String str = "你来到这个世界" + l/60/60/24 + "天了-----" + "也就是" + l/60/60/24/365 + "年" +  + l/60/60/24%365 + "天" + l/60/60%24 + "小时" + l/60%60 + "分" + l%60 +"秒了";
				viewText.setText(str);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public void init() {
		this.setLocation(500, 50);
		this.setSize(492, 62);
		this.setVisible(true);
	}
	
	
	public void event() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new GUI_GetYourComeDay();
	}

}
