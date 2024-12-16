package repository;

import manager.보고서저장소;

public class DB보고서저장소 implements 보고서저장소 {

    @Override
    public void save(String report) {
        System.out.println("DB에 " + report + "를 저장합니다.");
    }
}
