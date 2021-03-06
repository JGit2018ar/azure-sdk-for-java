// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.management.compute.UpgradeOperationHistoricalStatusInfoProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UpgradeOperationHistoricalStatusInfo model. */
@Immutable
public final class UpgradeOperationHistoricalStatusInfoInner {
    /*
     * Information about the properties of the upgrade operation.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private UpgradeOperationHistoricalStatusInfoProperties properties;

    /*
     * Resource type
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Resource location
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Get the properties property: Information about the properties of the upgrade operation.
     *
     * @return the properties value.
     */
    public UpgradeOperationHistoricalStatusInfoProperties properties() {
        return this.properties;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }
}
