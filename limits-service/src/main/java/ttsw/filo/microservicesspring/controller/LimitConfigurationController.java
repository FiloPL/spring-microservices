package ttsw.filo.microservicesspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ttsw.filo.microservicesspring.configuration.Configuration;
import ttsw.filo.microservicesspring.bean.LimitConfiguration;

/**
 * Created by T. Filo Zegarlicki on 14.06.2022
 **/

@RestController
public class LimitConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limitsComfiguration")
    public LimitConfiguration retrieveLimitsFromConfigurations() {
        return new LimitConfiguration(1,1000);
    }
}
