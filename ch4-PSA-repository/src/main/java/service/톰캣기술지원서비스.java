package service;

import manager.기술지원서비스;
import org.springframework.stereotype.Component;

@Component
public class 톰캣기술지원서비스 implements 기술지원서비스 {

    @Override
    public void provideSupport() {
        System.out.println("Tomcat 기술지원을 제공합니다.");
    }
}
