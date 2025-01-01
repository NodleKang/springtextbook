package beans;

import manager.기술지원서비스;
import manager.보고서저장소;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class 엔지니어 {

    private String name;

    private final 노트북 laptop;
    private final 기술지원서비스 technicalSupport;
    private final 보고서저장소 reportRepository;

    // 자동 와이어링 - 생성자를 통한 의존성 주입
    @Autowired
    public 엔지니어(노트북 laptop, 기술지원서비스 technicalSupport, 보고서저장소 reportRepository) {
        this.laptop = laptop;
        this.technicalSupport = technicalSupport;
        this.reportRepository = reportRepository;
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
        technicalSupport.provideSupport(); // 기술 지원 서비스 사용
        System.out.println("== AOP 구현을 위한 프록시 패턴이 적용됐는지 확인하는 내용 찍어보기");
        System.out.println(technicalSupport.getClass().getName()+" 클래스가 사용됩니다.");
        System.out.println("==============");
        System.out.printf("%s 가 노트북으로 작업을 완료했습니다.\n", name);
        reportRepository.save(name + "의 작업 보고서"); // 보고서 저장소 사용
    }
}
