package ch12;

import java.text.MessageFormat;
import java.util.Date;

public class MessageFormatExample {
	public static void main(String[] args) {
		new MessageFormatExample();
	}
	
	public MessageFormatExample() {
		Object[] args = {"foo","bar",new Long(99)};
		MessageFormat mf = 	new	MessageFormat("1:{0} 2:{1} 3:{2}");
		System.out.println(mf.format(args));
		
		int meetingTime = 10;
		String event = "대회의실에서 면접 심사 진행";
		
		String result = MessageFormat.format("오늘({0,date})	{1,number,integer}시에	{2}가있습니다.",new	Date(),meetingTime,event);
		System.out.println(result);
	}

}
