package config;

import org.aeonbits.owner.Config;

//@Config.Sources("classpath:config.french.properties")
@Config.Sources("classpath:config.properties")
public interface Configuration extends Config{ // Config library from aeonbits.owner
	
	@Key("timeout")
	int getTimeOut();
	
	@Key("username")
	String getUserName();
	
	@Key("password")
	String getPassword();
	
	@Key("verifylogin")
	String getVerifyLogin();
	
	@Key("leadslink")
	String getLeadsLink();
	
	@Key("createleadlink")
	String getCreateLeadLink();

}
