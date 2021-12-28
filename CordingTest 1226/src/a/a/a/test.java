package a.a.a;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
//게임의 이벤트가 진행된다고 할때 오늘 어떤 이벤트가 진행되고 있는지 알아보는 class구현
//이벤트 번호		시작 요일		종요 요일
//	1			일			월
//	2			화			목
//	3			월			일
//	4			수			수
//	5			월			금
public class test {
	
	public static void main(String[] args) {
	
		Date today = new Date();
		SimpleDateFormat dayFormat;
					
		dayFormat = new SimpleDateFormat("E");
				System.out.println(dayFormat.format(today));
				
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				 String whatDay = dayFormat.format(today);
					
				 switch(whatDay) {
				 case "일"
				 : System.out.println("이벤트 1,3 실행");
				 break;
				 case "월"
				 : System.out.println("이벤트 1,3,5번 실행");
				 break;
				 case "화"
				 : System.out.println("이벤트 2,3,5번 실행");
				 break;
				 case "수"
				 : System.out.println("이벤트 2,3,4,5 실행");
				 break;
				 case "목"
				 : System.out.println("이벤트 2,3,5 실행");
				 break;
				 case "금"
				 : System.out.println("이벤트 3,5 실행");
				 break;
				 case "토"
				 : System.out.println("이벤트 3 실행");
				 break;
				
				 }
							
				timer.cancel();
			}
		};
		timer.schedule(task, today);
		
	}
	

}
