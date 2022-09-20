package cn.bugstack.springframework.context.support;

import cn.bugstack.springframework.beans.BeansException;

public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext {
    private String[] configLocations;

    public ClassPathXmlApplicationContext() {

    }

    /**
     * 从XML中加载BeanDefinition并刷新上下文
     *
     * @param configLocation
     * @throws BeansException
     */
    public ClassPathXmlApplicationContext(String configLocation) throws BeansException {
        this(new String[]{configLocation});
    }

    /**
     * 从XML中加载BeanDefinition 并刷新上下文
     *
     * @param configLocations
     * @throws BeansException
     */
    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException {
        this.configLocations = configLocations;
        refresh();
    }

    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }
}
