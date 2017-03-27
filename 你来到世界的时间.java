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
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		long l;
		while(true){
			try {
				l = (new Date().getTime() - sdf.parse("1992��5��18�� 05:44:30").getTime())/1000;
				String str = "�������������" + l/60/60/24 + "����-----" + "Ҳ����" + l/60/60/24/365 + "��" +  + l/60/60/24%365 + "��" + l/60/60%24 + "Сʱ" + l/60%60 + "��" + l%60 +"����";
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
