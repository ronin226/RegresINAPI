package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

public class APIConfig {
    private static final APIConfigs CONFIG = ConfigFactory.create(APIConfigs.class, System.getProperties());
    public static final String
            BASEURL = CONFIG.baseURL();
    @Config.Sources({"classpath:config/user.properties", "system:properties"})
    public interface APIConfigs extends Config {

        @Config.Key("baseURL")
        @DefaultValue("https://reqres.in")
        String baseURL();
    }
}