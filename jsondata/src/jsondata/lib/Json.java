package jsondata.lib;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class Json {

	public static void main(String[] args) {
		//json 객체 생성
        JSONObject member = new JSONObject();

		
		//속성 및 속성값(문자열,숫자,객체) 추가
		member.put("id","sky123");
		member.put("name","이하늘");
		member.put("age", 22);
		
		
		
		//객체속성추가
		JSONObject tel=  new JSONObject();
		tel.put("home", "123-456-7890");
		tel.put("home2", "010-456-7890");
		member.put("tel", tel);//member 객체에 객체추가
		
		//배열 속성추가
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("C++");
		skill.put("c");
		
		member.put("skill", skill);//member객체에 배열추가
		
	
		//문자열로 얻기
		String json = member.toString();
		//System.out.println(json);
		
		System.out.println(member);
		
		//파일에 쓰기
		try {
			Writer writer = new FileWriter("C:/File/member.json",
					Charset.forName("utf-8"));
			writer.write(json);//json데이터를 문자열로 쓰기
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
