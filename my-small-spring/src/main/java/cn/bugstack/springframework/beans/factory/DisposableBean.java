package cn.bugstack.springframework.beans.factory;

/**
 * 销毁方法
 */
public interface DisposableBean {
    void destroy() throws Exception;
}
