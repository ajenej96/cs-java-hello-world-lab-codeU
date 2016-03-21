package com.flatironschool.javacs;
import java.util.Properties;
import java.lang.*;

public class HelloWorld {
    public static Double getVersion() {
	String version = System.getProperty("java.specification.version");
	return Double.parseDouble(version);
    }

    public static void main(String[] args) {
	    double javaVersion = getVersion();
	    System.out.println(javaVersion);
    }
}
