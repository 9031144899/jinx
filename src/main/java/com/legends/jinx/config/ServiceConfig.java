package com.legends.jinx.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
@Slf4j
public class ServiceConfig implements ApplicationListener<WebServerInitializedEvent> {

    /**
     * 当前服务的名称
     */
    @Value("${spring.application.name}")
    private String appName;

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        // 项目启动获取启动的端口号
        ServiceConfig.serverPort = event.getWebServer().getPort();
        log.info(getBaseUrl());
        log.info("appName：" + appName);
        log.info(getBaseUrl() + "/doc.html" );
    }

    /**
     * 当前服务使用的端口号
     */
    private static int serverPort;

    public static int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        ServiceConfig.serverPort = serverPort;
    }

    /**
     * 获取请求基地址
     *
     * @return String 请求基地址
     * @date 2021/11/15
     **/
    public static String getBaseUrl() {
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "http://" + address.getHostAddress() + ":" + getServerPort();
    }

}
