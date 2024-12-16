package config;

import beans.엔지니어;
import beans.노트북;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // `@Configuration` 어노테이션을 사용해서 스프링 설정 클래스임을 명시
// 자동으로 찾을 수 없는 빈(Bean)을 수동으로 등록
public class 기술지원구성 {

    // `노트북`를 빈(Bean)으로 등록
    // `@Configuration`과 `@Bean` 어노테이션을 사용해서 스프링 컨테이너에 빈(Bean)을 수동으로 등록
    @Bean
    public 노트북 laptop() {
        노트북 laptop = new 노트북("LG Gram"); // 빈(Bean) 생성
        return laptop;
    }

    // `엔지니어`를 빈(Bean)으로 등록
    // `@Configuration`과 `@Bean` 어노테이션을 사용해서 스프링 컨테이너에 빈(Bean)을 수동으로 등록
    @Bean
    public 엔지니어 작업자(노트북 laptop) {
        엔지니어 작업자 = new 엔지니어(laptop); // 다이렉트 와이어링 - 생성자를 통한 의존성 주입
        작업자.setName("Middleware솔루션 담당자");
        System.out.printf("""
                Direct Wiring 방식 중 생성자 주입을 사용해서
                작업자 %s에게 %s를 주입했습니다.
                """, 작업자.getName(), laptop.getType());
        return 작업자;
    }

}
