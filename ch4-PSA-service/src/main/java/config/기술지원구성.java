package config;

import manager.기술지원서비스;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import service.어플리케이션기술지원서비스;
import service.톰캣기술지원서비스;

@Configuration // `@Configuration` 애너테이션을 사용해서 스프링 설정 클래스임을 명시
@ComponentScan(basePackages = "beans") // `@ComponentScan` 애너테이션을 사용해서 `beans` 패키지에 있는 빈(Bean)을 자동으로 등록
public class 기술지원구성 {

    @Bean
    @Primary // `@Primary` 애너테이션을 사용해서 `기술지원` 빈(Bean)을 자동 와이어링할 때 우선적으로 사용하게 지정
    @Qualifier("tomcat") // `@Qualifier` 애너테이션을 사용해서 톰캣기술지원 빈(Bean)을 구분하는 이름을 지정
    public 기술지원서비스 톰캣기술지원() {
        return new 톰캣기술지원서비스();
    }

    @Bean
    @Qualifier("application") // `@Qualifier` 애너테이션을 사용해서 어플리케이션기술지원서비스 빈(Bean)을 구분하는 이름을 지정
    public 기술지원서비스 어플리케이션기술지원서비스() {
        return new 어플리케이션기술지원서비스();
    }

}
