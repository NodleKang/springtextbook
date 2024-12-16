package repository;

import manager.보고서저장소;

public class 파일보고서저장소 implements 보고서저장소 {

    @Override
    public void save(String report) {
        System.out.println("파일에 " + report + "를 저장합니다.");
    }
}
