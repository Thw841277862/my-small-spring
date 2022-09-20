package cn.bugstack.springframework.beans.factory;

public interface InitializingBean {
    /**
     * Bean处理熟悉填充后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;
}
