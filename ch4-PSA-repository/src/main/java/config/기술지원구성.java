package config;

import manager.기술지원서비스;
import manager.보고서저장소;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import repository.파일보고서저장소;
import repository.DB보고서저장소;
import service.어플리케이션기술지원서비스;
import service.톰캣기술지원서비스;

@Configuration // `@Configuration` 어노테이션을 사용해서 스프링 설정 클래스임을 명시
@ComponentScan(basePackages = {"beans", "service"}) // `@ComponentScan` 어노테이션을 사용해서 `beans` 패키지에 있는 빈(Bean)을 자동으로 등록
public class 기술지원구성 {

    @Bean
    @Primary // `@Primary` 어노테이션을 사용해서 `보고서저장소` 빈(Bean)을 자동 와이어링할 때 `파일보고서저장소`를 우선적으로 사용하게 지정
    public 보고서저장소 파일보고서저장소() {
        return new 파일보고서저장소();
    }

    @Bean
    @Qualifier("DB") // `@Qualifier` 어노테이션을 사용해서 톰캣기술지원 빈(Bean)을 구분하는 이름을 지정
    public 보고서저장소 DB보고서저장소() {
        return new DB보고서저장소();
    }

}
