package xinmiao.gdkm.weixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("xinmiao.gdkm")
public class WeiXinApplication implements CommonsConfig{

	public static void main(String[] args) {
		SpringApplication.run(WeiXinApplication.class, args);
	}

}
