package beans;

import org.springframework.stereotype.Component;

// `@Component` 어노테이션을 보고 스프링 컨테이너가 빈(Bean)으로 자동으로 등록
@Component
public class 노트북 {

    private String type;

    public 노트북() {
        this.type = "타입 미정";
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

}
