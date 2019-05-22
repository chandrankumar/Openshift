package com.cloud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenShiftController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String display()  {

	return "Welcome to UPS Openshift Cloud Environment";
    }

}
