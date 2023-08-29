package kr.ac.kopo.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduler {
    public void crontest() {
        System.out.println("cron test입니다.");
        // 금일 회원 가입한 회원 수를 통계 db 테이블에 저장해라 라는 작업을 줄 수 있다.
    }


    @Scheduled(cron = "0/10 * * * * *")
    public void crontest2() {
        System.out.println("10초에 한번 crontest입니다.");
    }

}
