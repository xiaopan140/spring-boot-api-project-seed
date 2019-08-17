package com.it10086.university.model;

import javax.persistence.*;

@Table(name = "tb_university_current_date_hour")
public class CurrentData {
    @Id
    @Column(name = "statis_hour")
    private Long statisHour;

    @Column(name = "up_area_code")
    private String upAreaCode;

    @Column(name = "up_area_name")
    private String upAreaName;

    @Column(name = "school_code")
    private String schoolCode;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "cust_count")
    private Long custCount;

    @Column(name = "broadband_count")
    private Long broadbandCount;

    @Column(name = "renew_rate")
    private Double renewRate;

    @Column(name = "package_30_rate")
    private Double package30Rate;

    @Column(name = "package_20_rate")
    private Double package20Rate;

    @Column(name = "assistant_rate")
    private Double assistantRate;

    @Column(name = "front_rate")
    private Double frontRate;

    /**
     * @return statis_hour
     */
    public Long getStatisHour() {
        return statisHour;
    }

    /**
     * @param statisHour
     */
    public void setStatisHour(Long statisHour) {
        this.statisHour = statisHour;
    }

    /**
     * @return up_area_code
     */
    public String getUpAreaCode() {
        return upAreaCode;
    }

    /**
     * @param upAreaCode
     */
    public void setUpAreaCode(String upAreaCode) {
        this.upAreaCode = upAreaCode;
    }

    /**
     * @return up_area_name
     */
    public String getUpAreaName() {
        return upAreaName;
    }

    /**
     * @param upAreaName
     */
    public void setUpAreaName(String upAreaName) {
        this.upAreaName = upAreaName;
    }

    /**
     * @return school_code
     */
    public String getSchoolCode() {
        return schoolCode;
    }

    /**
     * @param schoolCode
     */
    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    /**
     * @return school_name
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * @param schoolName
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * @return cust_count
     */
    public Long getCustCount() {
        return custCount;
    }

    /**
     * @param custCount
     */
    public void setCustCount(Long custCount) {
        this.custCount = custCount;
    }

    /**
     * @return broadband_count
     */
    public Long getBroadbandCount() {
        return broadbandCount;
    }

    /**
     * @param broadbandCount
     */
    public void setBroadbandCount(Long broadbandCount) {
        this.broadbandCount = broadbandCount;
    }

    /**
     * @return renew_rate
     */
    public Double getRenewRate() {
        return renewRate;
    }

    /**
     * @param renewRate
     */
    public void setRenewRate(Double renewRate) {
        this.renewRate = renewRate;
    }

    /**
     * @return package_30_rate
     */
    public Double getPackage30Rate() {
        return package30Rate;
    }

    /**
     * @param package30Rate
     */
    public void setPackage30Rate(Double package30Rate) {
        this.package30Rate = package30Rate;
    }

    /**
     * @return package_20_rate
     */
    public Double getPackage20Rate() {
        return package20Rate;
    }

    /**
     * @param package20Rate
     */
    public void setPackage20Rate(Double package20Rate) {
        this.package20Rate = package20Rate;
    }

    /**
     * @return assistant_rate
     */
    public Double getAssistantRate() {
        return assistantRate;
    }

    /**
     * @param assistantRate
     */
    public void setAssistantRate(Double assistantRate) {
        this.assistantRate = assistantRate;
    }

    /**
     * @return front_rate
     */
    public Double getFrontRate() {
        return frontRate;
    }

    /**
     * @param frontRate
     */
    public void setFrontRate(Double frontRate) {
        this.frontRate = frontRate;
    }
}