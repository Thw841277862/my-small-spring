package cn.bugstack.springframework.context;

import cn.bugstack.springframework.context.event.ApplicationEvent;

import java.util.EventListener;

public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

}
