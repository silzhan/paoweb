/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.ContextLoader;

import com.huiget.mall.common.util.ApplicationContextUtil;

/**
 * 
 * @author yaofang
 * @version $Id: InitApplicationListener.java, v 0.1 2014年9月18日 上午11:40:25 yaofang Exp $
 */
public class InitApplicationListener extends ContextLoader implements ServletContextListener {

    public InitApplicationListener() {
    }

    /** 
     * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        // 初始化Spring容器
        ApplicationContextUtil.applicationContext = initWebApplicationContext(sce.getServletContext());
    }

    /** 
     * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        closeWebApplicationContext(sce.getServletContext());

    }

}
