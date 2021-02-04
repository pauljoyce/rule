import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.clinical")
public class CrpRunPolypApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrpRunPolypApplication.class,args);
    }
}
