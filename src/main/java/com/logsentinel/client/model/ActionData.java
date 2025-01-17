package com.logsentinel.client.model;

import java.util.HashMap;
import java.util.Map;

import org.javers.core.diff.Diff;

/**
 * Details about actions performed
 *
 * @param <T> the type of the details (body)
 */
public class ActionData<T> {

    private String action;
    private String entityId;
    private String entityType;
    private T details;
    private Diff diffDetails;
    private byte[] encryptionKey;
    private boolean binaryContent;
    private Map<String, String> additionalParams = new HashMap<>();

    private AuditLogEntryType entryType;

    public ActionData(T details) {
        this.details = details;
    }

    public String getAction() {
        return action;
    }

    /**
     * Sets the action name, i.e. what action this entry represents
     *
     * @param action the name of the action
     * @return the current ActionData
     */
    public ActionData<T> setAction(String action) {
        this.action = action;
        return this;
    }

    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the entity ID (optional). If the event is about a particular model entity,
     * you can set its ID here.
     *
     * @param entityId the ID of the entity
     * @return the current ActionData
     */
    public ActionData<T> setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the entity type (optional). If the event is about a particular model entity,
     * you can set it here (e.g. via <code>entity.getClass().getSimpleName()</code>)
     *
     * @param entityType the type of the entity
     * @return the current ActionData
     */
    public ActionData<T> setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    public T getDetails() {
        return details;
    }

    /**
     * Sets the details (body) of the action. You can put any data in any form here.
     * It will get serialized with the serializer supplied to the client object
     *
     * @param details the details object
     * @return the current ActionData
     */
    public ActionData<T> setDetails(T details) {
        this.details = details;
        return this;
    }

    public AuditLogEntryType getEntryType() {
        return entryType;
    }

    /**
     * Sets the entry type. By default it's BUSINESS_LOGIC_ENTRY
     *
     * @param entryType the entry type
     * @return the current ActionData
     */
    public ActionData<T> setEntryType(AuditLogEntryType entryType) {
        this.entryType = entryType;
        return this;
    }

    public Diff getDiffDetails() {
        return diffDetails;
    }

    /**
     * Sets the diffDetails - you can use Javers to provide a diff which will be used as a body.
     * Diff details and details are mutually exclusive
     *
     * @param diffDetails Javers diff
     * @return the current ActionData
     */
    public ActionData<T> setDiffDetails(Diff diffDetails) {
        this.diffDetails = diffDetails;
        return this;
    }

    public byte[] getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Sets the encryption key in case the application wants to encrypt data with more granular keys, for example if
     * personal data is stored and crypto-erasure needs to be performed
     *
     * @param encryptionKey the AES encryption key
     * @return the current ActionData
     */
    public ActionData<T> setEncryptionKey(byte[] encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    public boolean isBinaryContent() {
        return binaryContent;
    }

    /**
     * Sets flag if details is in binary format.
     * If set to true, details won't be indexed on the server for searching purposes
     *
     * @param binaryContent details is binary
     * @return binary content
     */
    public ActionData<T> setBinaryContent(boolean binaryContent) {
        this.binaryContent = binaryContent;
        return this;
    }


    /**
     * Gets the additional params
     * @return map of params
     */
    public Map<String, String> getAdditionalParams() {
        return additionalParams;
    }
    
    /**
     * Adds an additional param
     * @param name the param name
     * @param value the param value
     */
    public ActionData<?> addAdditionalParam(String name, String value) {
       additionalParams.put(name, value);
       return this;
    }
}
