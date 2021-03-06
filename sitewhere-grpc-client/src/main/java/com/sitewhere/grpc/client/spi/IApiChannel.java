/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.grpc.client.spi;

import java.util.concurrent.TimeUnit;

import com.sitewhere.grpc.client.GrpcChannel;
import com.sitewhere.spi.microservice.IMicroservice;
import com.sitewhere.spi.server.lifecycle.ITenantEngineLifecycleComponent;
import com.sitewhere.spi.tracing.ITracerProvider;

/**
 * Common interface for GRPC channels that handle API calls.
 * 
 * @author Derek
 */
public interface IApiChannel<T extends GrpcChannel<?, ?>> extends ITenantEngineLifecycleComponent {

    /**
     * Get target hostname .
     * 
     * @return
     */
    public String getHostname();

    /**
     * Get target port.
     * 
     * @return
     */
    public int getPort();

    /**
     * Create underlying GRPC channel.
     * 
     * @param tracerProvider
     * @param host
     * @param port
     * @return
     */
    public T createGrpcChannel(ITracerProvider tracerProvider, String host, int port);

    /**
     * Get underlying GRPC channel.
     * 
     * @return
     */
    public T getGrpcChannel();

    /**
     * Wait the default amount of time for API to become available.
     * 
     * @throws ApiNotAvailableException
     */
    public void waitForApiAvailable() throws ApiNotAvailableException;

    /**
     * Wait for a maximum amount of time for the API to become available. Displays
     * 'waiting' messages to log after a specified delay.
     * 
     * @param duration
     * @param unit
     * @param logMessageDelay
     * @throws ApiNotAvailableException
     */
    public void waitForApiAvailable(long duration, TimeUnit unit, long logMessageDelay) throws ApiNotAvailableException;

    /**
     * Get parent demulitplexer.
     * 
     * @return
     */
    public IApiDemux<?> getDemux();

    /**
     * Get parent microservice.
     * 
     * @return
     */
    public IMicroservice getMicroservice();
}