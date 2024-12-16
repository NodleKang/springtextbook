package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // `@Component` 어노테이션을 사용해서 스프링 컨테이너에 빈(Bean)으로 등록
public class 엔지니어 {

    private String name;

    private final 노트북 laptop;

    @Autowired
    public 엔지니어(노트북 laptop) {
        this.laptop = laptop;
        System.out.printf("Auto Wiring 방식 중 생성자 주입 방식을 사용해서 %s 이 주입되었습니다.\n"
                , laptop.getType());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doWork() {
        laptop.turnOn();
        laptop.work();
        System.out.println("엔지니어가 노트북으로 작업을 완료했습니다.");
    }
}
