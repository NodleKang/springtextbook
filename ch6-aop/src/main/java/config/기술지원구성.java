package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"beans", "service", "repository", "aspects"})
@EnableAspectJAutoProxy
public class 기술지원구성 {

}
