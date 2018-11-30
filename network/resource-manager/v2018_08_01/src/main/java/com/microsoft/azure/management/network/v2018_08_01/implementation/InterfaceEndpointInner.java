/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01.implementation;

import com.microsoft.azure.management.network.v2018_08_01.EndpointService;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Interface endpoint resource.
 */
@JsonFlatten
@SkipParentValidation
public class InterfaceEndpointInner extends Resource {
    /**
     * A first-party service's FQDN that is mapped to the private IP allocated
     * via this interface endpoint.
     */
    @JsonProperty(value = "properties.fqdn")
    private String fqdn;

    /**
     * A reference to the service being brought into the virtual network.
     */
    @JsonProperty(value = "properties.endpointService")
    private EndpointService endpointService;

    /**
     * The ID of the subnet from which the private IP will be allocated.
     */
    @JsonProperty(value = "properties.subnet")
    private SubnetInner subnet;

    /**
     * Gets an array of references to the network interfaces created for this
     * interface endpoint.
     */
    @JsonProperty(value = "properties.networkInterfaces", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceInner> networkInterfaces;

    /**
     * A read-only property that identifies who created this interface
     * endpoint.
     */
    @JsonProperty(value = "properties.owner", access = JsonProperty.Access.WRITE_ONLY)
    private String owner;

    /**
     * The provisioning state of the interface endpoint. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get a first-party service's FQDN that is mapped to the private IP allocated via this interface endpoint.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set a first-party service's FQDN that is mapped to the private IP allocated via this interface endpoint.
     *
     * @param fqdn the fqdn value to set
     * @return the InterfaceEndpointInner object itself.
     */
    public InterfaceEndpointInner withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get a reference to the service being brought into the virtual network.
     *
     * @return the endpointService value
     */
    public EndpointService endpointService() {
        return this.endpointService;
    }

    /**
     * Set a reference to the service being brought into the virtual network.
     *
     * @param endpointService the endpointService value to set
     * @return the InterfaceEndpointInner object itself.
     */
    public InterfaceEndpointInner withEndpointService(EndpointService endpointService) {
        this.endpointService = endpointService;
        return this;
    }

    /**
     * Get the ID of the subnet from which the private IP will be allocated.
     *
     * @return the subnet value
     */
    public SubnetInner subnet() {
        return this.subnet;
    }

    /**
     * Set the ID of the subnet from which the private IP will be allocated.
     *
     * @param subnet the subnet value to set
     * @return the InterfaceEndpointInner object itself.
     */
    public InterfaceEndpointInner withSubnet(SubnetInner subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get gets an array of references to the network interfaces created for this interface endpoint.
     *
     * @return the networkInterfaces value
     */
    public List<NetworkInterfaceInner> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Get a read-only property that identifies who created this interface endpoint.
     *
     * @return the owner value
     */
    public String owner() {
        return this.owner;
    }

    /**
     * Get the provisioning state of the interface endpoint. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set gets a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the InterfaceEndpointInner object itself.
     */
    public InterfaceEndpointInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the InterfaceEndpointInner object itself.
     */
    public InterfaceEndpointInner withId(String id) {
        this.id = id;
        return this;
    }

}