package config;

import org.aeonbits.owner.ConfigFactory;
import utils.Platform;

import java.net.URL;

public class ConfigHelper {

    private static MobileConfig config = ConfigFactory.newInstance().create(MobileConfig.class, System.getProperties());

    public static String getUsername() {
        return config.username();
    }

    public static String getKey() {
        return config.key();
    }

    public static String getApp() {
        return config.app();
    }

    public static Platform getPlatform() {
        return config.platform();
    }

    public static String getBrowserstackURL() {
        return config.browserstackURL();
    }
}