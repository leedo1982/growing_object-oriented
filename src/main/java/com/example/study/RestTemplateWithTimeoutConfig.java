package com.example.study;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;


@Configurable
public class RestTemplateWithTimeoutConfig {

    static final int TIMEOUT = 1000;
    static final int TIMEOUT2 = 500;
    static final int TIMEOUT3 = 2000;

    @Bean
    RestTemplate restTemplateWithConnectReadTimeout() {
        return new RestTemplateBuilder()
                .setConnectTimeout(Duration.ofMillis(TIMEOUT))
                .setReadTimeout(Duration.ofMillis(TIMEOUT2))
                .build();
    }

    @Bean
    RestTemplate restTemplateTimeoutConfigWithRequestFactory() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(TIMEOUT);
        requestFactory.setReadTimeout(TIMEOUT2);

        return new RestTemplate(requestFactory);
    }

    @Bean
    RestTemplate restTemplateWithConnectTimeout() {
        return new RestTemplateBuilder()
                .setConnectTimeout(Duration.ofMillis(TIMEOUT3))
                .build();
    }
}
