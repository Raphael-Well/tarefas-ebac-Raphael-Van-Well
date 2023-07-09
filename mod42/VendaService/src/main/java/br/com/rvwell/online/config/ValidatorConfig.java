/**
 * 
 */
package br.com.rvwell.online.config;




import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @author Raphael Van Well
 *
 */
@Configuration
public class ValidatorConfig {
	
//	@Autowired
//    ResourceBundleMessageSource messageSource;

	@Bean
	public LocalValidatorFactoryBean validatorFactory() {
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
//	    bean.setValidationMessageSource(messageSource);
	    return bean;
    }
}
