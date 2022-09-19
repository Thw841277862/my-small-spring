package cn.bugstack.springframework.context.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.context.ConfigurableApplicationContext;
import cn.bugstack.springframework.core.io.DefaultResourceLoader;

public abstract class AbstractApplicationContext extends DefaultResourceLoader implements ConfigurableApplicationContext {
    @Override
    public void refresh() throws BeansException {
        //1.创建BeanFactory，并加载BeanDefinition

        //2 获取BeanFactory

        //3.在Bean实例化之前，执行BeanFactoryPostProcessor

        //4.BeanPostProcessor需要提前于其他Bean对象实例化之前执行注册操作

        //5.提前实例化单例Bean对象

    }

}
