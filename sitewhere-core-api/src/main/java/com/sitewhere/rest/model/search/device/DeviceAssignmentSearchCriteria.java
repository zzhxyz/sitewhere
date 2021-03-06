/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.rest.model.search.device;

import java.util.List;
import java.util.UUID;

import com.sitewhere.rest.model.search.SearchCriteria;
import com.sitewhere.spi.device.DeviceAssignmentStatus;
import com.sitewhere.spi.search.device.IDeviceAssignmentSearchCriteria;

/**
 * Default implementation of {@link IDeviceAssignmentSearchCriteria}.
 * 
 * @author Derek
 */
public class DeviceAssignmentSearchCriteria extends SearchCriteria implements IDeviceAssignmentSearchCriteria {

    /** Only return results with the given status */
    private DeviceAssignmentStatus status;

    /** Limit search by device */
    private UUID deviceId;

    /** Limit search by areas */
    private List<UUID> areaIds;

    /** Limit search by asset */
    private UUID assetId;

    public DeviceAssignmentSearchCriteria(int pageNumber, int pageSize) {
	super(pageNumber, pageSize);
    }

    /*
     * @see
     * com.sitewhere.spi.search.device.IDeviceAssignmentSearchCriteria#getStatus()
     */
    @Override
    public DeviceAssignmentStatus getStatus() {
	return status;
    }

    public void setStatus(DeviceAssignmentStatus status) {
	this.status = status;
    }

    /*
     * @see
     * com.sitewhere.spi.search.device.IDeviceAssignmentSearchCriteria#getDeviceId()
     */
    @Override
    public UUID getDeviceId() {
	return deviceId;
    }

    public void setDeviceId(UUID deviceId) {
	this.deviceId = deviceId;
    }

    /*
     * @see
     * com.sitewhere.spi.search.device.IDeviceAssignmentSearchCriteria#getAreaIds()
     */
    @Override
    public List<UUID> getAreaIds() {
	return areaIds;
    }

    public void setAreaIds(List<UUID> areaIds) {
	this.areaIds = areaIds;
    }

    /*
     * @see
     * com.sitewhere.spi.search.device.IDeviceAssignmentSearchCriteria#getAssetId()
     */
    @Override
    public UUID getAssetId() {
	return assetId;
    }

    public void setAssetId(UUID assetId) {
	this.assetId = assetId;
    }
}