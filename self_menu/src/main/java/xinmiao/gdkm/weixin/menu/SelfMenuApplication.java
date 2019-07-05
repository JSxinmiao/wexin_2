package xinmiao.gdkm.weixin.menu;

import xinmiao.gdkm.weixin.CommonsConfig;
import xinmiao.gdkm.weixin.service.AccessTokenManager;
import xinmiao.gdkm.weixin.serviceImpl.AccessTokenManagerSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("xinmiao.gdkm")
@EntityScan("xinmiao.gdkm")
public class SelfMenuApplication implements CommonsConfig {

	public static void main(String[] args) {
		SpringApplication.run(SelfMenuApplication.class, args);
		AccessTokenManager access=new AccessTokenManagerSample();
	}
}
