package com.kiyotakeshi.applicationContextExperiment;

import com.kiyotakeshi.applicationContextExperiment.beans.Car;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = Car.class)
public class ApplicationConfiguration {
}
