package beans;

// 노트북 클래스는 Component 애너테이션을 사용하지 않았으므로 수동으로 빈(Bean)을 등록해야 함
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
        System.out.println("노트북을 켭니다.");
    }

    public void work() {
        System.out.println("노트북으로 작업합니다.");
    }

}
