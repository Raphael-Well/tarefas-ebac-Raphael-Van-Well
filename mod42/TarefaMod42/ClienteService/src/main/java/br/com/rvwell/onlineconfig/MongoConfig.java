/**
 * 
 */
package br.com.rvwell.onlineconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author Raphael Van Well
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.rvwell.online.repository")
public class MongoConfig {

}
