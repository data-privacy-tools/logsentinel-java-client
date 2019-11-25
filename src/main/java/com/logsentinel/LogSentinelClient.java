package com.logsentinel;

import com.logsentinel.client.*;

/**
 * Main entry point for interacting with LogSentinel APIs
 */
public class LogSentinelClient {

    private AuditLogControllerApi auditLogActions;
    private HashControllerApi hashActions;
    private OrganizationUsersControllerApi userActions;
    private ManageApplicationControllerApi applicationActions;
    private AuditLogSearchControllerApi searchActions;
    private ApiVerificationControllerApi verificationActions;
    private PartnerControllerApi partnerActions;

    public LogSentinelClient(AuditLogControllerApi auditLogActions, HashControllerApi hashActions,
                             OrganizationUsersControllerApi userActions, ManageApplicationControllerApi applicationActions,
                             AuditLogSearchControllerApi searchActions, ApiVerificationControllerApi verificationActions,PartnerControllerApi partnerActions) {
        this.auditLogActions = auditLogActions;
        this.hashActions = hashActions;
        this.userActions = userActions;
        this.applicationActions = applicationActions;
        this.searchActions = searchActions;
        this.verificationActions = verificationActions;
        this.partnerActions=partnerActions;
    }

    public AuditLogControllerApi getAuditLogActions() {
        return auditLogActions;
    }

    public HashControllerApi getHashActions() {
        return hashActions;
    }

    public OrganizationUsersControllerApi getUserActions() {
        return userActions;
    }

    public ManageApplicationControllerApi getApplicationActions() {
        return applicationActions;
    }

    public AuditLogSearchControllerApi getSearchActions() {
        return searchActions;
    }

    public ApiVerificationControllerApi getVerificationActions() {
        return verificationActions;
    }

    public PartnerControllerApi getPartnerActions() {
        return partnerActions;
    }
    
    
}
