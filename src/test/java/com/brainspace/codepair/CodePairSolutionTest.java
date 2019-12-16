package com.brainspace.codepair;

import java.util.Collection;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CodePairSolutionTest {
    Solution solution = new Solution();

    @Test
    public void testGetNameOfNextLaunch() throws Exception {
        List<String> launchNames = solution.getLaunchNames(1);

        assertThat( launchNames.size(), is(1));
        //assertThat( launchNames.get(0), is("Falcon 9 Block 5 | JCSAT-18/KACIFIC-1"));
        assertThat( launchNames.get(0), is("Long March 3B/YZ-1 | Beidou-3 M19 & M20"));
    }

    @Test
    public void testNumberOfLaunchesIn2018() throws Exception {
        assertThat( solution.getNumberOfLaunchesIn(2018), is(114) );
    }

    @Test
    public void testGetFalconLaunchStatuses() throws Exception {
        Collection<String> launchStatuses = solution.getLaunchStatusesForName("spacex");
        assertThat(launchStatuses.size(), is(1));
        assertThat(launchStatuses.stream().findFirst().get(), is("Launch was a success"));
    }

    @Test
    public void testGetSpaceXRocketInfo() throws Exception {
        Solution.RocketInfo rocketInfo = solution.getRocketInfoForLaunch(855);
        assertThat( rocketInfo.rocketId, is(90));
        assertThat( rocketInfo.rocketName, is("Falcon 9 v1.0"));
        assertThat( rocketInfo.rocketImageUrl, is("https://s3.amazonaws.com/launchlibrary/RocketImages/Falcon+9+v1.0_1920.jpg"));
    }

    @Test
    public void testFailureCase_GetNumberOfLaunchesIn2020() throws Exception {
        // TODO: Implement
    }

}