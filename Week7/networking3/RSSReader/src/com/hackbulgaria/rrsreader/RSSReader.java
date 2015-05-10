package com.hackbulgaria.rrsreader;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

/**
 * Servlet implementation class RSSReader
 */
@WebServlet("/RSSReader")
public class RSSReader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RSSReader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		URL url = new URL("http://www.sportal.bg/uploads/rss_category_0.xml");
		List listOfNews = null;
		try {
			listOfNews = RSSFeed(url);
		} catch (IllegalArgumentException | FeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator itEntries = listOfNews.iterator();
		while (itEntries.hasNext()) {
            SyndEntry entry =  (SyndEntry) itEntries.next();
            response.getWriter().println("<a href=" + entry.getLink() + ">");
            response.getWriter().println("<h1>" + entry.getTitle() + "</h1></a>");
            response.getWriter().println("<h4>" + entry.getAuthor() + "</h4>");
            response.getWriter().println("<p>"+entry.getPublishedDate() + "</p>");
            response.getWriter().println("<p>"+entry.getDescription().getValue() + "</p>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	public List RSSFeed(URL url) throws IllegalArgumentException, FeedException, IOException{
	        //HttpURLConnection httpcon = (HttpURLConnection)url.openConnection();
	        // Reading the feed
	        SyndFeedInput input = new SyndFeedInput();
	        //SyndFeed feed = input.build(new XmlReader(httpcon));
        	SyndFeed feed = new SyndFeedInput().build(new XmlReader(url));
	        List entries = feed.getEntries();
	        return entries;
	      
	}

}
