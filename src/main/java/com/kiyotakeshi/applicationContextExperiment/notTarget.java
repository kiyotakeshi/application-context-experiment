package com.kiyotakeshi.applicationContextExperiment;

import org.springframework.stereotype.Component;

/**
 *  This class is Not managed by Application Context
 *  {@link ApplicationConfiguration} basePackageClasses target is beans package
 */
@Component
public class notTarget {
}
