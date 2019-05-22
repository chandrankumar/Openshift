package com.cloud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
