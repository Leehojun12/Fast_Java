package com.example.study.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration // config
@EnableJpaAuditing // 감시를 활성화 시킨다(감시자)
public class JpaConfig {

}
