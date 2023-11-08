package org.example.springCourse;

import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("org.example.springCourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public List<Music> genre() {
        return Arrays.asList(classicalMusic(), rockMusic(), popMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(genre());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
//    <?xml version="1.0" encoding="UTF-8" ?>
//<beans xmlns="http://www.springframework.org/schema/beans"
//        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//        xmlns:context="http://www.springframework.org/schema/context"
//        xsi:schemaLocation="http://www.springframework.org/schema/beans
//        http://www.springframework.org/schema/beans/spring-beans.xsd
//        http://www.springframework.org/schema/context
//        http://www.springframework.org/schema/context/spring-context.xsd">
//
//<context:component-scan base-package="org.example.springCourse"/>
//
//<context:property-placeholder location="musicPlayer.properties"/>
//<!--    <bean id="musicBean"-->
//<!--          class="org.example.springCourse.ClassicalMusic"-->
//<!--          init-method="doMyInit"-->
//<!--          destroy-method="doMyDestroy"-->
//<!--          factory-method="getClassicalMusic">-->
//<!--    </bean>-->
//<!--    <bean id="musicBean2"-->
//<!--          class="org.example.springCourse.PopMusic">-->
//<!--    </bean>-->
//<!--    <bean id="musicBean3"-->
//<!--          class="org.example.springCourse.RockMusic">-->
//<!--    </bean>-->
//
//<!--    <bean id="musicPlayer"-->
//<!--          class="org.example.springCourse.MusicPlayer"-->
//<!--          scope="prototype"> -->
//<!--        <property name="musicList">-->
//<!--            <list>-->
//<!--                <ref bean="musicBean"/>-->
//<!--                <ref bean="musicBean2"/>-->
//<!--                <ref bean="musicBean3"/>-->
//<!--            </list>-->
//<!--        </property>-->
//<!--        <property name="name" value="${musicPlayer.name}"/>-->
//<!--        <property name="volume" value="${musicPlayer.volume}"/>-->
//<!--    </bean>-->
//
//</beans>
