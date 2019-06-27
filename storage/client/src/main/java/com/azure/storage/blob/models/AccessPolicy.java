// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * An Access policy.
 */
@JacksonXmlRootElement(localName = "AccessPolicy")
public final class AccessPolicy {
    /*
     * the date-time the policy is active
     */
    @JsonProperty(value = "Start", required = true)
    private OffsetDateTime start;

    /*
     * the date-time the policy expires
     */
    @JsonProperty(value = "Expiry", required = true)
    private OffsetDateTime expiry;

    /*
     * the permissions for the acl policy
     */
    @JsonProperty(value = "Permission", required = true)
    private String permission;

    /**
     * Get the start property: the date-time the policy is active.
     *
     * @return the start value.
     */
    public OffsetDateTime start() {
        return this.start;
    }

    /**
     * Set the start property: the date-time the policy is active.
     *
     * @param start the start value to set.
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy start(OffsetDateTime start) {
        this.start = start;
        return this;
    }

    /**
     * Get the expiry property: the date-time the policy expires.
     *
     * @return the expiry value.
     */
    public OffsetDateTime expiry() {
        return this.expiry;
    }

    /**
     * Set the expiry property: the date-time the policy expires.
     *
     * @param expiry the expiry value to set.
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy expiry(OffsetDateTime expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Get the permission property: the permissions for the acl policy.
     *
     * @return the permission value.
     */
    public String permission() {
        return this.permission;
    }

    /**
     * Set the permission property: the permissions for the acl policy.
     *
     * @param permission the permission value to set.
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy permission(String permission) {
        this.permission = permission;
        return this;
    }
}