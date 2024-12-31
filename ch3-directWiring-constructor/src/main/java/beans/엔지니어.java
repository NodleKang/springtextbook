package beans;

// 엔지니어 클래스는 Component 애너테이션을 사용하지 않았으므로 수동으로 빈(Bean)을 등록해야 함
public class 엔지니어 {

    private String name;

    private 노트북 laptop;

    // 생성자를 통한 의존성 주입
    public 엔지니어(노트북 laptop) {
        this.laptop = laptop;
    }

    public String getName() {
        return name;
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
