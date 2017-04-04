import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main{
	public static void main(String args[]) throws Exception{
		String username;
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));	

		System.out.println("Enter username: ");
		username = stdin.readLine();

		CrawlCodechef crawler = new CrawlCodechef(username);
		crawler.Crawl();
	}
}