package  com.govinda.polaki.demo;
import java.net.InetAddress;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		String ip = InetAddress.getLoopbackAddress().getHostAddress();
		System.out.println(ip+" -----------------");
	}

}
