package config;

import beans.엔지니어;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration // `@Configuration` 어노테이션을 사용해서 스프링 설정 클래스임을 명시
@ComponentScan(basePackages = "beans") // `@ComponentScan` 어노테이션을 사용해서 `beans` 패키지에 있는 빈(Bean)을 자동으로 등록
public class 기술지원구성 {

    // 빈(Bean)을 수동으로 등록
    // `@Configuration`과 `@Bean` 어노테이션을 사용해서 스프링 컨테이너에 빈(Bean)을 등록
    @Bean
    public 엔지니어 작업자() {
        엔지니어 작업자 = new 엔지니어();
        작업자.setName("Middleware솔루션 담당자");
        return 작업자;
    }

    // 빈(Bean)을 수동으로 등록
    // `@Configuration`과 `@Bean` 어노테이션을 사용해서 스프링 컨테이너에 빈(Bean)을 등록
    @Bean
    @Primary
    public 엔지니어 작업자2() {
        엔지니어 작업자 = new 엔지니어();
        작업자.setName("APM솔루션 담당자");
        return 작업자;
    }

    // 빈(Bean)을 수동으로 등록
    // `@Configuration`과 `@Bean` 어노테이션을 사용해서 스프링 컨테이너에 빈(Bean)을 등록
    @Bean
    public String 버전() {
        return "베타 1.0";
    }

}
