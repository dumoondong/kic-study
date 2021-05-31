package jsoup;

import java.util.ArrayList;

public class NewsDAO {
	
	public NewsDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<NewsTO> newsLists() {
		ArrayList<NewsTO> newsLists = new ArrayList<NewsTO>();
		
		//가상 데이터
		NewsTO to1 = new NewsTO();
		to1.setSource( "출처 1" );
		to1.setSubject( "제목 1" );
		to1.setContent( "내용 1" );
		
		NewsTO to2 = new NewsTO();
		to2.setSource( "출처 2" );
		to2.setSubject( "제목 2" );
		to2.setContent( "내용 2" );
		
		newsLists.add( to1 );
		newsLists.add( to2 );
		
		return newsLists;
	}
}
