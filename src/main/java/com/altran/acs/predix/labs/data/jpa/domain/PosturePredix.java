/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.altran.acs.predix.labs.data.jpa.domain;




import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
* Schema for posture predix
* <p>
* 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "timestamp",
    "right_arm",
    "left_arm",
    "right_elbow",
    "left_elbow"
})
public class PosturePredix {

    /**
     * Collect timestamp
     * <p>
     * timestamp since 1970 in ms
     * 
     */
    @JsonProperty("timestamp")
    private Long timestamp;
    /**
     * Right arm angle
     * <p>
     * Angle for right arm 
     * 
     */
    @JsonProperty("right_arm")
    private Double rightArm;
    /**
     * Left arm angle
     * <p>
     * Angle for left arm
     * 
     */
    @JsonProperty("left_arm")
    private Double leftArm;
    /**
     * Right elbow
     * <p>
     * Angle for right elbow
     * 
     */
    @JsonProperty("right_elbow")
    private Double rightElbow;
    /**
     * Left elbow
     * <p>
     * Angle for left elbow 
     * 
     */
    @JsonProperty("left_elbow")
    private Double leftElbow;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Collect timestamp
     * <p>
     * timestamp since 1970 in ms
     * 
     * @return
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Collect timestamp
     * <p>
     * timestamp since 1970 in ms
     * 
     * @param timestamp
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Right arm angle
     * <p>
     * Angle for right arm 
     * 
     * @return
     *     The rightArm
     */
    @JsonProperty("right_arm")
    public Double getRightArm() {
        return rightArm;
    }

    /**
     * Right arm angle
     * <p>
     * Angle for right arm 
     * 
     * @param rightArm
     *     The right_arm
     */
    @JsonProperty("right_arm")
    public void setRightArm(Double rightArm) {
        this.rightArm = rightArm;
    }

    /**
     * Left arm angle
     * <p>
     * Angle for left arm
     * 
     * @return
     *     The leftArm
     */
    @JsonProperty("left_arm")
    public Double getLeftArm() {
        return leftArm;
    }

    /**
     * Left arm angle
     * <p>
     * Angle for left arm
     * 
     * @param leftArm
     *     The left_arm
     */
    @JsonProperty("left_arm")
    public void setLeftArm(Double leftArm) {
        this.leftArm = leftArm;
    }

    /**
     * Right elbow
     * <p>
     * Angle for right elbow
     * 
     * @return
     *     The rightElbow
     */
    @JsonProperty("right_elbow")
    public Double getRightElbow() {
        return rightElbow;
    }

    /**
     * Right elbow
     * <p>
     * Angle for right elbow
     * 
     * @param rightElbow
     *     The right_elbow
     */
    @JsonProperty("right_elbow")
    public void setRightElbow(Double rightElbow) {
        this.rightElbow = rightElbow;
    }

    /**
     * Left elbow
     * <p>
     * Angle for left elbow 
     * 
     * @return
     *     The leftElbow
     */
    @JsonProperty("left_elbow")
    public Double getLeftElbow() {
        return leftElbow;
    }

    /**
     * Left elbow
     * <p>
     * Angle for left elbow 
     * 
     * @param leftElbow
     *     The left_elbow
     */
    @JsonProperty("left_elbow")
    public void setLeftElbow(Double leftElbow) {
        this.leftElbow = leftElbow;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(timestamp).append(rightArm).append(leftArm).append(rightElbow).append(leftElbow).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PosturePredix) == false) {
            return false;
        }
        PosturePredix rhs = ((PosturePredix) other);
        return new EqualsBuilder().append(timestamp, rhs.timestamp).append(rightArm, rhs.rightArm).append(leftArm, rhs.leftArm).append(rightElbow, rhs.rightElbow).append(leftElbow, rhs.leftElbow).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
