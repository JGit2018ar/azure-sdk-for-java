/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.storage.implementation.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AccessTier.
 */
public enum AccessTier {
    /** Enum value Hot. */
    HOT("Hot"),

    /** Enum value Cool. */
    COOL("Cool");

    /** The actual serialized value for a AccessTier instance. */
    private String value;

    AccessTier(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AccessTier instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AccessTier object, or null if unable to parse.
     */
    @JsonCreator
    public static AccessTier fromString(String value) {
        AccessTier[] items = AccessTier.values();
        for (AccessTier item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
