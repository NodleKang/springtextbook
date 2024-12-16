package config;

import beans.엔지니어;
import beans.노트북;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // `@Configuration` 어노테이션을 사용해서 스프링 설정 클래스임을 명시
// 자동으로 찾을 수 없는 빈(Bean)을 수동으로 등록
public class 기술지원구성 {

    // 다른 빈(Bean)에서 노트북을 주입해서 사용할 수 있도록 빈(Bean)으로 등록
    // `@Configuration`과 `@Bean` 어노테이션을 사용해서 스프링 컨테이너에 빈(Bean)을 수동으로 등록
    @Bean
    public 노트북 laptop() {
        노트북 laptop = new 노트북();
        laptop.setType("LG Gram");
        return laptop;
    }

    // `엔지니어`를 빈(Bean)으로 등록
    // `@Configuration`과 `@Bean` 어노테이션을 사용해서 스프링 컨테이너에 빈(Bean)을 수동으로 등록
    @Bean
    public 엔지니어 작업자() {
        엔지니어 작업자 = new 엔지니어();
        작업자.setName("Middleware솔루션 담당자");
        작업자.setLaptop(laptop()); // 다이렉트 와이어링 - 빈(Bean) 생성 메소드를 직접 호출
        System.out.printf("""
                Direct Wiring 방식 중 Method 주입을 사용해서
                작업자 %s에게 노트북 %s를 주입했습니다.
                """, 작업자.getName(), 작업자.getLaptop().getType());
        return 작업자;
    }

}
