package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class JSoupEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String html = "<html>"
				+ "<head><title>First parse</title></head>"
				  + "<body>"
				  + "<p id='p1' class='p1'>Parsed HTML into a doc 1</p>"
				  + "<p id='p2' class='p2'>Parsed HTML into a doc 2</p>"
				  + "<p id='p3' class='p1'>Parsed HTML into a doc 3</p>"
				  + "<p id='p4' class='p2'>Parsed HTML into a doc 4</p>"
				  + "</body></html>";
		
		Document doc = Jsoup.parse(html);
		//System.out.println(doc.toString());
		/*
		Element p = doc.getElementById("p1");
		System.out.println(p.toString());
		System.out.println(p.tagName());
		System.out.println(p.text());
		*/
		/*
		Elements plist = doc.getElementsByTag("p");
		System.out.println(plist.toString());
		System.out.println(plist.size());
		
		for(int i=0; i<plist.size(); i++) {
			Element e = plist.get(i);
			System.out.println(e.toString());
			System.out.println(e.text());
		}
		*/
		Elements elists = doc.getElementsByClass("p1");
		System.out.println(elists.toString());
		for(Element e : elists) {
			System.out.println(e.text());
		}
	}

}
