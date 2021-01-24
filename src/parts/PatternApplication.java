package parts;

import java.io.FileInputStream;
import java.io.IOException;

import parts.templateMethod.study.AbstractDisplay;
import parts.templateMethod.study.CharDisplay;
import parts.templateMethod.study.StringDisplay;

public class PatternApplication {

	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("hello, word.");
		AbstractDisplay d3 = new StringDisplay("안녕하세요.");

		d1.display();
		d2.display();
		d3.display();
		
		FileInputStream in = null; // 파일객체 선언
		
		try {
			in = new FileInputStream("test.txt"); // 같은 폴더안에 있으니 명만 적으면된다.
            int cnt = 0;
            int n;
            while((n = in.read())!= -1){
                               
            System.out.print((char)n); //형변환을 해줘야 아스키값이 문자로 바뀔 수 가 있다
            	cnt++;
            }
            in.close(); // 할 거 다 했으니까 이제는 파일의 stream 을 닫아준다.
            System.out.print("\ncnt:" +cnt+"바이트를 읽었습니다"); 
        } catch (IOException e) { 
        	System.out.println("Exception" + e);
        }
	}

}
