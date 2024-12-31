package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // `@Configuration` 애너테이션을 사용해서 스프링 설정 클래스임을 명시
@ComponentScan(basePackages = "beans") // `@ComponentScan` 애너테이션을 사용해서 `beans` 패키지에 있는 빈(Bean)을 자동으로 등록
public class 기술지원구성 {

}
