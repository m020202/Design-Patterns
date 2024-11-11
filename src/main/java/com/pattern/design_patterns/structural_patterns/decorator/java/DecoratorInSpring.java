package com.pattern.design_patterns.structural_patterns.decorator.java;

import org.springframework.beans.factory.xml.BeanDefinitionDecorator;
import org.springframework.http.server.reactive.ServerHttpRequestDecorator;
import org.springframework.http.server.reactive.ServerHttpResponseDecorator;

public class DecoratorInSpring {
    // 빈 설정 데코레이터
    BeanDefinitionDecorator decorator;

    // 웹플럭스 HTTP 요청 / 응답 데코레이터
    ServerHttpRequestDecorator serverHttpRequestDecorator;
    ServerHttpResponseDecorator serverHttpResponseDecorator;
}
