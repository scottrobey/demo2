package com.brainspace.codepair;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Using the JDK classes and the GSON library, fill in the implementation below
 * using information from the API: https://launchlibrary.net/docs/1.3/api.html
 *
 * JDK Javadocs: https://docs.oracle.com/en/java/javase/11/docs/api/index.html
 * GSON: https://javadoc.io/doc/com.google.code.gson/gson/latest/com.google.gson/module-summary.html
 */
public class Solution {

    static class RocketInfo {
        int rocketId;
        String rocketName;
        String rocketImageUrl;
    }

    /**
     * Returns a list of the next launches.
     * hint: https://launchlibrary.net/docs/1.3/api.html#launch
     */
    List<String> getLaunchNames(int next) throws Exception {
        // TODO: Implement!
        return null;
    }

    /**
     * Returns the number of launches that took place in the given year
     */
    int getNumberOfLaunchesIn(int year) {
        // TODO: implement!
        return -1;
    }

    /**
     * Returns the unique 'description' of the launch statuses for the given launch name
     * hint: https://launchlibrary.net/docs/1.3/api.html#launch
     *       https://launchlibrary.net/docs/1.3/api.html#launchstatus
     */
    Collection<String> getLaunchStatusesForName(String launchName) {
        // TODO: Implement!
        return null;
    }

    /**
     * Returns information about the rocket for the given Launch ID
     */
    RocketInfo getRocketInfoForLaunch(int launchId) {
        // TODO: Implement!
        return null;
    }
}
