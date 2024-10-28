package com.labs.spring.application.services.dependentservice;

import com.labs.spring.application.services.messageservice.MessageService;

public class DependentService {
    private final MessageService messageService;

    public DependentService(MessageService messageService){
        this.messageService = messageService;
    }
}
