package service;

import manager.기술지원서비스;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Qualifier("tomcat")
public class 톰캣기술지원서비스 implements 기술지원서비스 {

    @Override
    public void provideSupport() {
        System.out.println("Tomcat 기술지원을 제공합니다.");
    }
}
