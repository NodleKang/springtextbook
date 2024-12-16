package beans;

import manager.기술지원서비스;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class 엔지니어 {

    private String name;

    private final 노트북 laptop;
    private final 기술지원서비스 technicalSupport; // 기능이 정의되어 있는 인터페이스

    // 자동 와이어링 - 생성자를 통한 의존성 주입
    @Autowired
    public 엔지니어(노트북 laptop, 기술지원서비스 technicalSupport) {
        this.laptop = laptop;
        this.technicalSupport = technicalSupport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public 노트북 getLaptop() {
        return laptop;
    }

    public void doWork() {
        laptop.turnOn();
        laptop.work();
        technicalSupport.provideSupport();
        System.out.printf("%s 가 노트북으로 작업을 완료했습니다.", name);
    }
}
