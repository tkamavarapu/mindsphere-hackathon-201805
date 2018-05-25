package com.siemens.mindsphere.hackathon.team02;

public class Filter {

	private FilterTimestamp timestamp;

	private String entityId;

	private Boolean acknowledged;

	private String typeId;

	public FilterTimestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(FilterTimestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public Boolean getAcknowledged() {
		return acknowledged;
	}

	public void setAcknowledged(Boolean acknowledged) {
		this.acknowledged = acknowledged;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

}
