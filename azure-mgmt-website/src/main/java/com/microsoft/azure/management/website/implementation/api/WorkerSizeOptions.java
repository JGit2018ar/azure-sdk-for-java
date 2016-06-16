/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.implementation.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for WorkerSizeOptions.
 */
public enum WorkerSizeOptions {
    /** Enum value Default. */
    DEFAULT("Default"),

    /** Enum value Small. */
    SMALL("Small"),

    /** Enum value Medium. */
    MEDIUM("Medium"),

    /** Enum value Large. */
    LARGE("Large");

    /** The actual serialized value for a WorkerSizeOptions instance. */
    private String value;

    WorkerSizeOptions(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a WorkerSizeOptions instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed WorkerSizeOptions object, or null if unable to parse.
     */
    @JsonCreator
    public static WorkerSizeOptions fromString(String value) {
        WorkerSizeOptions[] items = WorkerSizeOptions.values();
        for (WorkerSizeOptions item : items) {
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
