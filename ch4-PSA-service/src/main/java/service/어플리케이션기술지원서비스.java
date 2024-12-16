package service;

import manager.기술지원서비스;

public class 어플리케이션기술지원서비스 implements 기술지원서비스 {

    @Override
    public void provideSupport() {
        System.out.println("Applicaton 기술지원을 제공합니다.");
    }
}
