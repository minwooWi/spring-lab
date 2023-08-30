package com.example.springlab.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//@Component
class BeanViewer {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @EventListener
    public void showBeansRegistered(ApplicationReadyEvent event) {
        String[] beanNames = event.getApplicationContext()
                .getBeanDefinitionNames();

        int index=0;

        for(String beanName: beanNames) {
            LOG.info("START INDEX"+index+" {}", beanName);
            index++;
        }
    }
}
