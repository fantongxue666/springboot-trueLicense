package cn.zifangsky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ServletComponentScan
@EnableSwagger2
@PropertySource({"license-config.properties"}) //加载额外的配置
public class ServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerDemoApplication.class, args);
	}
}
