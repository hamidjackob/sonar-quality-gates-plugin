package org.quality.gates.sonar.api8x;

import org.quality.gates.jenkins.plugin.GlobalConfigDataForSonarInstance;
import org.quality.gates.jenkins.plugin.JobConfigData;
import org.quality.gates.sonar.api.SonarHttpRequester;

/**
 * @author KC Baltz
 * @since 1.0.1
 */
public class SonarHttpRequester8x extends SonarHttpRequester {

    private static final String SONAR_API_LOGIN = "/api/authentication/login";

    private static final String SONAR_API_QUALITY_GATES_STATUS = "/api/qualitygates/project_status?projectKey=%s";

    private static final String SONAR_API_TASK_INFO = "/api/ce/component?component=%s";

    private static final String SONAR_API_COMPONENT_SHOW = "/api/components/show?component=%s";
    
    public SonarHttpRequester8x() {
    }

    @Override
    protected String getSonarApiLogin() {
        return SONAR_API_LOGIN;
    }

    @Override
    protected String getSonarApiTaskInfoUrl() {
        return SONAR_API_TASK_INFO;
    }

    @Override
    protected String getSonarApiQualityGatesStatusUrl() {
        return SONAR_API_QUALITY_GATES_STATUS;
    }

    @Override
    protected String getSonarApiComponentShow() {
        return SONAR_API_COMPONENT_SHOW;
    }
    
    @Override
    protected String getSonarApiTaskInfoParameter(JobConfigData jobConfigData, GlobalConfigDataForSonarInstance globalConfigDataForSonarInstance) {
        return jobConfigData.getProjectKey();
    }


}

