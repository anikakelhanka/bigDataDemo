package bootstrap;

import java.sql.Connection;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

import config.DemoConfiguration;
import dao.DBConnectionManager;

public class DemoApplicationService extends Service<DemoConfiguration> {

	public static void main(String[] args) throws Exception {
		new DemoApplicationService().run(args);
	}

	@Override
	public void initialize(Bootstrap<DemoConfiguration> config) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(DemoConfiguration config, Environment env) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = new DBConnectionManager().getConnection(config
				.getConnectionUrl());
	}

}
