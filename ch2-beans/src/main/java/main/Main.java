package main;

import beans.노트북;
import beans.엔지니어;
import config.기술지원구성;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // `기술지원구성` 클래스를 사용해서 spring context 초기화
        var context = new AnnotationConfigApplicationContext(기술지원구성.class);

        // spring context 에서 `엔지니어` 클래스의 빈(Bean)을 가져옴
        엔지니어 작업자 = context.getBean(엔지니어.class);
        System.out.println("작업자: " + 작업자.getName());

        // spring context 에서 `String` 클래스의 빈(Bean)을 가져옴
        String 버전 = context.getBean(String.class);
        System.out.println("프로그램 버전: " + 버전);

        // spring context 에서 `노트북` 클래스의 빈(Bean)을 가져옴
        노트북 유휴노트북 = context.getBean(노트북.class);
        System.out.println("유휴노트북: " + 유휴노트북.getType());

        context.close();
    }
}
