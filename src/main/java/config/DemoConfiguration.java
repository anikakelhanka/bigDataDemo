package config;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;

public class DemoConfiguration extends Configuration {

	@NotEmpty
	private String connectionUrl;

	@JsonProperty
	public void setConnectionUrl(String connectionUrl) {
		this.connectionUrl = connectionUrl;
	}

	@JsonProperty
	public String getConnectionUrl() {
		return connectionUrl;
	}

}
