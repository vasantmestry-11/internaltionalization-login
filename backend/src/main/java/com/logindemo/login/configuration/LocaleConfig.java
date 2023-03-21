package com.logindemo.login.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@Configuration
public class LocaleConfig {
	
	@Bean
	public AcceptHeaderLocaleResolver acceptHeaderLocaleResolver() {
		final AcceptHeaderLocaleResolver resolver = new AcceptHeaderLocaleResolver();
		resolver.setDefaultLocale(Locale.US);
		return resolver;
	}
	
//	@Bean
//    public ResourceBundleMessageSource messageSource() {
//        final ResourceBundleMessageSource source = new ResourceBundleMessageSource();
//        source.setBasename("internationalization/lang");
//        return source;
//    }

}
