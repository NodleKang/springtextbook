package beans;

import org.springframework.stereotype.Component;

// `@Component` 애너테이션을 보고 스프링 컨테이너가 빈(Bean)으로 자동으로 등록
@Component
public class 노트북 {

    private String type;

    public 노트북() {
        this.type = "표준노트북";
    }

    public 노트북(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void turnOn() {
        System.out.println(this.type + " 을 켭니다.");
    }

    public void work() {
        System.out.println(this.type + " 으로 작업합니다.");
    }

}
