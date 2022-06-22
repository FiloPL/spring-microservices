package ttsw.filo.microservicesspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ttsw.filo.microservicesspring.bean.Limits;
import ttsw.filo.microservicesspring.configuration.Configuration;

/**
 * Created by T. Filo Zegarlicki on 22.06.2022
 **/

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(),
                configuration.getMaximum());
    }
}