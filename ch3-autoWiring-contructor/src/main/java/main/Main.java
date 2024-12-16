package main;

import beans.엔지니어;
import config.기술지원구성;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // `기술지원구성` 클래스를 사용해서 spring context 초기화
        var context = new AnnotationConfigApplicationContext(기술지원구성.class);

        System.out.printf("스프링 컨텍스트 초기화가 완료되었습니다.\n");

        // spring context 에서 `엔지니어` 클래스의 빈(Bean)을 가져옴
        엔지니어 작업자 = context.getBean(엔지니어.class);
        작업자.setName("Middleware솔루션 담당자");

        작업자.doWork();

        context.close();
    }

}
