package com.it10086.university.model;

import javax.persistence.*;

@Table(name = "tb_university_accumulate_current_date_hour")
public class AccumulateCurrentData {
    @Id
    @Column(name = "data_time")
    private Long dataTime;

    @Column(name = "area_code")
    private String areaCode;

    @Column(name = "university_code")
    private String universityCode;

    @Column(name = "area_name")
    private String areaName;

    @Column(name = "university_name")
    private String universityName;

    @Column(name = "plan_count")
    private Long planCount;

    @Column(name = "add_count")
    private Long addCount;

    @Column(name = "broadboad_count")
    private Long broadboadCount;

    @Column(name = "renewal_count")
    private Double renewalCount;

    @Column(name = "flow_30_count")
    private Double flow30Count;

    @Column(name = "flow_20_count")
    private Double flow20Count;

    @Column(name = "new_rate")
    private Double newRate;

    @Column(name = "assistant_count")
    private Double assistantCount;

    @Column(name = "crm_count")
    private Double crmCount;

    @Column(name = "current_is_open")
    private String currentIsOpen;

    /**
     * @return data_time
     */
    public Long getDataTime() {
        return dataTime;
    }

    /**
     * @param dataTime
     */
    public void setDataTime(Long dataTime) {
        this.dataTime = dataTime;
    }

    /**
     * @return area_code
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * @param areaCode
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * @return university_code
     */
    public String getUniversityCode() {
        return universityCode;
    }

    /**
     * @param universityCode
     */
    public void setUniversityCode(String universityCode) {
        this.universityCode = universityCode;
    }

    /**
     * @return area_name
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * @param areaName
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * @return university_name
     */
    public String getUniversityName() {
        return universityName;
    }

    /**
     * @param universityName
     */
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    /**
     * @return plan_count
     */
    public Long getPlanCount() {
        return planCount;
    }

    /**
     * @param planCount
     */
    public void setPlanCount(Long planCount) {
        this.planCount = planCount;
    }

    /**
     * @return add_count
     */
    public Long getAddCount() {
        return addCount;
    }

    /**
     * @param addCount
     */
    public void setAddCount(Long addCount) {
        this.addCount = addCount;
    }

    /**
     * @return broadboad_count
     */
    public Long getBroadboadCount() {
        return broadboadCount;
    }

    /**
     * @param broadboadCount
     */
    public void setBroadboadCount(Long broadboadCount) {
        this.broadboadCount = broadboadCount;
    }

    /**
     * @return renewal_count
     */
    public Double getRenewalCount() {
        return renewalCount;
    }

    /**
     * @param renewalCount
     */
    public void setRenewalCount(Double renewalCount) {
        this.renewalCount = renewalCount;
    }

    /**
     * @return flow_30_count
     */
    public Double getFlow30Count() {
        return flow30Count;
    }

    /**
     * @param flow30Count
     */
    public void setFlow30Count(Double flow30Count) {
        this.flow30Count = flow30Count;
    }

    /**
     * @return flow_20_count
     */
    public Double getFlow20Count() {
        return flow20Count;
    }

    /**
     * @param flow20Count
     */
    public void setFlow20Count(Double flow20Count) {
        this.flow20Count = flow20Count;
    }

    /**
     * @return new_rate
     */
    public Double getNewRate() {
        return newRate;
    }

    /**
     * @param newRate
     */
    public void setNewRate(Double newRate) {
        this.newRate = newRate;
    }

    /**
     * @return assistant_count
     */
    public Double getAssistantCount() {
        return assistantCount;
    }

    /**
     * @param assistantCount
     */
    public void setAssistantCount(Double assistantCount) {
        this.assistantCount = assistantCount;
    }

    /**
     * @return crm_count
     */
    public Double getCrmCount() {
        return crmCount;
    }

    /**
     * @param crmCount
     */
    public void setCrmCount(Double crmCount) {
        this.crmCount = crmCount;
    }

    /**
     * @return current_is_open
     */
    public String getCurrentIsOpen() {
        return currentIsOpen;
    }

    /**
     * @param currentIsOpen
     */
    public void setCurrentIsOpen(String currentIsOpen) {
        this.currentIsOpen = currentIsOpen;
    }
}