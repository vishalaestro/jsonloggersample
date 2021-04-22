package com.jsonlogger;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.contrib.json.classic.JsonLayout;

public class CustomJsonLayout extends JsonLayout {
	
	@Autowired
	HttpServletRequest httpServletRequest;
	
    @Override
    protected void addCustomDataToJsonMap(Map<String, Object> map, ILoggingEvent event) {
        map.put("application", "log-odyssey");
        
    }
}