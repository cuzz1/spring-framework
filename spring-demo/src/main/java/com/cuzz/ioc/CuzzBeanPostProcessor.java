package com.cuzz.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * @author cuzz@douyu.tv
 * @date 2019/12/10 13:45
 */
@Component
public class CuzzBeanPostProcessor implements BeanPostProcessor {


	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {


		if (Objects.equals(beanName, "person")) {
			bean = Proxy.newProxyInstance(this.getClass().getClassLoader(), bean.getClass().getInterfaces(), new ProxyInvocationHandler(bean) );
		}

		return bean;
	}

	static class ProxyInvocationHandler implements InvocationHandler {

		private Object o;

		public ProxyInvocationHandler(Object o) {
			this.o = o;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("before--------");
			Object invoke = method.invoke(o);
			System.out.println("after---------");
			return invoke;
		}
	}
}
