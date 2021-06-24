package model2;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model1.BoardDAO;
import model1.BoardTO;

public class BoardModifyOkAction implements BoardAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println( "BoardModifyOkAction 호출" );
		
		String uploadPath = "C:/JSP/eclipse-workspace/AlbumModel2Ex01/src/main/webapp/upload";
		int maxFileSize = 1024 * 1024 * 10;
		String encoding = "utf-8";

		BoardTO to = new BoardTO();
		int flag = 2;
		
		MultipartRequest multi = null;
		
		try {
			multi = new MultipartRequest( request, uploadPath, maxFileSize, encoding, new DefaultFileRenamePolicy() );
			
			to.setSeq( multi.getParameter( "seq" ) );
			to.setSubject( multi.getParameter( "subject" ) );
			if( !multi.getParameter( "mail1" ).equals( "" ) && !multi.getParameter( "mail2" ).equals( "" ) ) {
				to.setMail( multi.getParameter( "mail1" ) + "@" + multi.getParameter( "mail2" ) );
			}
			to.setPassword( multi.getParameter( "password" ) );
			to.setContent( multi.getParameter( "content" ) );
			
			to.setFilename( multi.getFilesystemName( "upload" ) );
			File file = multi.getFile( "upload" ); 
			if( file != null ) {
				to.setFilesize( file.length() );
			}
			to.setLatitude( multi.getParameter( "latitude" ) );
			to.setLongitude( multi.getParameter( "longitude" ) );

			BoardDAO dao = new BoardDAO();
			flag = dao.boardModifyOk( to );
			
		} catch( IOException e ) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		}
		
		request.setAttribute( "cpage", multi.getParameter( "cpage" ) );
		request.setAttribute( "seq", to.getSeq() );
		request.setAttribute( "flag", flag );
	}
}
