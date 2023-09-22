package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BoardTest {

	public static void main(String[] args) {
         
		
		
		List<Board> list = new ArrayList<>();
		//List<Board> list = new Vector<>();
         
         //board 객체
         Board b1 = new Board("제목1","내용1","SB");
         Board b2 = new Board("제목2","내용2","KSB");
         Board b3 = new Board("제목3","내용3","GSB");
         
         //board 객체를 Vector 리스트에 저장
         list.add(b1);
         list.add(b2);
         list.add(b3);
         
         //게시글1개삭제
         
         if(list.contains(b2)) {
        	 list.remove(1);
        	 //list.remove(b2);
         }
         
         
         //맨 앞에 있는 객체 가져오기
         
        System.out.println(list.get(0).getTitle());
        System.out.println(list.get(0).getContent());
        System.out.println(list.get(0).getWriter());
        
        //전체
        for(int i=0;i<list.size();i++) {
        	Board bb=list.get(i);
        	System.out.println(bb.getTitle()+","
        	       +bb.getContent()+ ","+bb.getWriter());
        }
	}

}
