package com.kurfusy.interview;

import com.kurfusy.interview.common.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InterviewApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(StringUtils.geChar32UniqueKey());
    }

}
