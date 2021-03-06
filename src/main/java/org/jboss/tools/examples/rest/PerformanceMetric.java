/*để đại diện cho cấu trúc của một Hiện tại số liệu API.*/
package org.jboss.tools.examples.rest;

import java.util.Date;

import org.jboss.tools.examples.model.Performance;

/**
 * Metric data for a Performance. Contains the datetime for the performance to
 * identify the performance, as well as the occupied count for the performance.
 * 
 * @author Vineet Reynolds
 * 
 */
class PerformanceMetric {

	private Date date;
	private Long occupiedCount;

	// Constructor to populate the instance with data
	public PerformanceMetric(Performance performance, Long occupiedCount) {
		this.date = performance.getDate();
		this.occupiedCount = (occupiedCount == null ? 0 : occupiedCount);
	}

	// Getters for Jackson
	// NOTE: No setters and default constructors are defined since
	// deserialization is not required.

	public Date getDate() {
		return date;
	}

	public Long getOccupiedCount() {
		return occupiedCount;
	}

}