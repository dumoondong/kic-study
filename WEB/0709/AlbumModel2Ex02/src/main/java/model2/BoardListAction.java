package model2;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model1.BoardDAO;
import model1.BoardListTO;
import model1.BoardTO;

public class BoardListAction implements BoardAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println( "BoardListAction 호출" );
		
		int cpage = 1;
		if(request.getParameter( "cpage" ) != null && !request.getParameter( "cpage" ).equals( "" ) ) {
			cpage = Integer.parseInt( request.getParameter( "cpage" ) );
		}

		BoardListTO listTO = new BoardListTO();
		listTO.setCpage( cpage );
		
		BoardDAO dao = new BoardDAO();
		listTO = dao.boardList(listTO);
		
		request.setAttribute( "cpage", listTO.getCpage() );
		
		request.setAttribute( "recordPerPage", listTO.getRecordPerPage() );
		
		request.setAttribute( "totalRecord", listTO.getTotalRecord() );;
		request.setAttribute( "totalPage", listTO.getTotalPage() );
		
		request.setAttribute( "blockPerPage", listTO.getBlockPerPage() );
		request.setAttribute( "startBlock", listTO.getStartBlock() );
		request.setAttribute( "endBlock", listTO.getEndBlock() );
		
		request.setAttribute( "boardLists", listTO.getBoardLists() );
	}
}
