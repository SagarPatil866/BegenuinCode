package Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.io.*;

public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath = "src/test/java/Config/config.properties";

    /**
     * Initializes the ConfigFileReader by loading properties from the configuration file.
     * <p>
     * Reads the properties file specified by `propertyFilePath` and loads the key-value pairs
     * into a Properties object.
     *
     * @throws RuntimeException if the configuration file is not found.
     */
    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    /**
     * Retrieves the OnePark application URL from the configuration file.
     * <p>
     * Fetches the property value associated with the key "URL". If the key is not found,
     * a default value of "URL" is returned. If the retrieved value is null, an exception is thrown.
     *
     * @return The OnePark URL as a String.
     * @throws RuntimeException if the URL is not specified in the Configuration.properties file.
     */
    public String getOneParkURL() {
        String url = properties.getProperty("URL", "URL");
        if (url != null)
            return url;
        else
            throw new RuntimeException("front url not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the Lead URL from the configuration file.
     * <p>
     * This method fetches the property value associated with the key "LeadURL".
     * If the key is not found, it returns the default value "LeadURL".
     * If the retrieved value is null, an exception is thrown.
     *
     * @return The Lead URL as a String.
     * @throws RuntimeException if the Lead URL is not specified in the Configuration.properties file.
     */
    public String getLeadURL() {
        String url = properties.getProperty("LeadURL", "LeadURL");
        if (url != null)
            return url;
        else
            throw new RuntimeException(" url not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the System Dashboard URL from the configuration file.
     * <p>
     * This method fetches the property value associated with the key "SystemDashboardURL".
     * If the key is not found, it returns the default value "SystemDashboardURL".
     * If the retrieved value is null, an exception is thrown.
     *
     * @return The System Dashboard URL as a String.
     * @throws RuntimeException if the System Dashboard URL is not specified in the Configuration.properties file.
     */
    public String getSystemURL() {
        String url = properties.getProperty("SystemDashboardURL", "SystemDashboardURL");
        if (url != null)
            return url;
        else
            throw new RuntimeException(" url not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the OPF Success URL from the configuration file.
     * <p>
     * This method attempts to fetch the value associated with the key "OPFSuccessURL".
     * If the key is not found, it returns the default value "OPFSuccessURL".
     * If the retrieved value is null, an exception is thrown to prevent unexpected behavior.
     *
     * @return The OPF Success URL as a String.
     * @throws RuntimeException if the OPF Success URL is not specified in the Configuration.properties file.
     */
    public String getOPFSuccessURL() {
        String url = properties.getProperty("OPFSuccessURL", "OPFSuccessURL");
        if (url != null)
            return url;
        else
            throw new RuntimeException(" url not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the Username1 value from the configuration file.
     * <p>
     * This method attempts to fetch the value associated with the key "Username1".
     * If the key is present, it returns the corresponding value.
     * If the key is missing or its value is null, a RuntimeException is thrown.
     *
     * @return The Username1 value as a String.
     * @throws RuntimeException if "Username1" is not specified in the Configuration.properties file.
     */
    public String getUsername1() {
        String username = properties.getProperty("Username1");
        if (username != null)
            return username;
        else
            throw new RuntimeException(" Username1 not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the Password value from the configuration file.
     * <p>
     * This method attempts to fetch the value associated with the key "Password".
     * If the key is present, it returns the corresponding value.
     * If the key is missing or its value is null, a RuntimeException is thrown.
     *
     * @return The Password value as a String.
     * @throws RuntimeException if "Password" is not specified in the Configuration.properties file.
     */
    public String getPassword() {
        String password = properties.getProperty("Password");
        if (password != null)
            return password;
        else
            throw new RuntimeException(" Password not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the main password from the configuration file.
     * <p>
     * This method fetches the value associated with the key "PassMain" from the properties file.
     * If the key is found, it returns the corresponding password.
     * If the key is missing or its value is null, a RuntimeException is thrown.
     *
     * @return The main password as a String.
     * @throws RuntimeException if "PassMain" is not specified in the Configuration.properties file.
     */
    public String getPassMain() {
        String password = properties.getProperty("PassMain");
        if (password != null)
            return password;
        else
            throw new RuntimeException(" Password not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the second username from the configuration file.
     * <p>
     * This method fetches the value associated with the key "Username2" from the properties file.
     * If the key exists, it returns the corresponding username.
     * If the key is missing or its value is null, a RuntimeException is thrown.
     *
     * @return The second username as a String.
     * @throws RuntimeException if "Username2" is not specified in the Configuration.properties file.
     */
    public String getUsername2() {
        String username = properties.getProperty("Username2");
        if (username != null)
            return username;
        else
            throw new RuntimeException(" Username2 not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the third username from the configuration file.
     * <p>
     * This method fetches the value associated with the key "Username3" from the properties file.
     * If the key exists, it returns the corresponding username.
     * If the key is missing or its value is null, a RuntimeException is thrown.
     *
     * @return The third username as a String.
     * @throws RuntimeException if "Username3" is not specified in the Configuration.properties file.
     */
    public String getUsername3() {
        String username = properties.getProperty("Username3");
        if (username != null)
            return username;
        else
            throw new RuntimeException(" Username3 not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the third username from the configuration file.
     * <p>
     * This method fetches the value associated with the key "Username3" from the properties file.
     * If the key exists, it returns the corresponding username.
     * If the key is missing or its value is null, a RuntimeException is thrown.
     *
     * @return The third username as a String.
     * @throws RuntimeException if "Username4" is not specified in the Configuration.properties file.
     */
    public String getUsername4() {
        String username = properties.getProperty("Username4");
        if (username != null)
            return username;
        else
            throw new RuntimeException(" Username4 not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the first opportunity value from the configuration file.
     * <p>
     * This method fetches the value associated with the key "Opportunity1" from the properties file.
     * If the key exists, it returns the corresponding opportunity value.
     * If the key is missing or its value is null, a RuntimeException is thrown.
     *
     * @return The first opportunity value as a String.
     * @throws RuntimeException if "Opportunity1" is not specified in the Configuration.properties file.
     */
    public String opportunity1() {
        String opportunity1 = properties.getProperty("Opportunity1");
        if (opportunity1 != null)
            return opportunity1;
        else
            throw new RuntimeException(" opportunity1 not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the second opportunity value from the configuration file.
     * <p>
     * This method fetches the value associated with the key "Opportunity2" from the properties file.
     * If the key exists, it returns the corresponding opportunity value.
     * If the key is missing or its value is null, a RuntimeException is thrown.
     *
     * @return The second opportunity value as a String.
     * @throws RuntimeException if "Opportunity2" is not specified in the Configuration.properties file.
     */
    public String opportunity2() {
        String opportunity2 = properties.getProperty("Opportunity2");
        if (opportunity2 != null)
            return opportunity2;
        else
            throw new RuntimeException(" opportunity2 not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the second opportunity value from the configuration file.
     * <p>
     * This method fetches the value associated with the key "Opportunity2" from the properties file.
     * If the key exists, it returns the corresponding opportunity value.
     * If the key is missing or its value is null, a RuntimeException is thrown.
     *
     * @return The second opportunity value as a String.
     * @throws RuntimeException if "Opportunity3" is not specified in the Configuration.properties file.
     */
    public String opportunity3() {
        String opportunity3 = properties.getProperty("Opportunity3");
        if (opportunity3 != null)
            return opportunity3;
        else
            throw new RuntimeException(" opportunity3 not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the second opportunity value from the configuration file.
     * <p>
     * This method fetches the value associated with the key "Opportunity2" from the properties file.
     * If the key exists, it returns the corresponding opportunity value.
     * If the key is missing or its value is null, a RuntimeException is thrown.
     *
     * @return The second opportunity value as a String.
     * @throws RuntimeException if "Opportunity4" is not specified in the Configuration.properties file.
     */
    public String opportunity4() {
        String opportunity4 = properties.getProperty("Opportunity4");
        if (opportunity4 != null)
            return opportunity4;
        else
            throw new RuntimeException(" opportunity4 not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the second opportunity value from the configuration file.
     * <p>
     * This method fetches the value associated with the key "Opportunity2" from the properties file.
     * If the key exists, it returns the corresponding opportunity value.
     * If the key is missing or its value is null, a RuntimeException is thrown.
     *
     * @return The second opportunity value as a String.
     * @throws RuntimeException if "Opportunity5" is not specified in the Configuration.properties file.
     */
    public String opportunity5() {
        String opportunity5 = properties.getProperty("Opportunity5");
        if (opportunity5 != null)
            return opportunity5;
        else
            throw new RuntimeException(" opportunity5 not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the Lead Amount from the configuration file.
     * <p>
     * This method fetches the value associated with the key "LeadAmount" from the properties file.
     * If the key exists, it returns the corresponding value.
     * If the key is missing or its value is null, a RuntimeException is thrown.
     *
     * @return The lead amount as a String.
     * @throws RuntimeException if "LeadAmount" is not specified in the Configuration.properties file.
     */
    public String getLeadAmount() {
        String username = properties.getProperty("LeadAmount");
        if (username != null)
            return username;
        else
            throw new RuntimeException(" LeadAmount not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the Revenue Starting Range from the configuration file.
     * <p>
     * This method fetches the value associated with the key "RevenueStartingRange" from the properties file.
     * If the key exists, it returns the corresponding value.
     * If the key is missing or its value is null, a RuntimeException is thrown.
     *
     * @return The revenue starting range as a String.
     * @throws RuntimeException if "RevenueStartingRange" is not specified in the Configuration.properties file.
     */
    public String getRevenueStartingRange() {
        String username = properties.getProperty("RevenueStartingRange");
        if (username != null)
            return username;
        else
            throw new RuntimeException(" LeadAmount not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the Revenue Ending Range from the configuration file.
     * <p>
     * This method fetches the value associated with the key "RevenueEndingRange" from the properties file.
     * If the key exists, it returns the corresponding value.
     * If the key is missing or its value is null, a RuntimeException is thrown.
     *
     * @return The revenue ending range as a String.
     * @throws RuntimeException if "RevenueEndingRange" is not specified in the Configuration.properties file.
     */
    public String getRevenueEndingRange() {
        String username = properties.getProperty("RevenueEndingRange");
        if (username != null)
            return username;
        else
            throw new RuntimeException(" LeadAmount not specified in the Configuration.properties file.");
    }


}
