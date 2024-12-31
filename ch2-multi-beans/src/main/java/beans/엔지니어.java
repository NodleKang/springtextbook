package beans;

// 엔지니어 클래스는 Component 애너테이션을 사용하지 않았으므로 수동으로 빈(Bean)을 등록해야 함
public class 엔지니어 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
