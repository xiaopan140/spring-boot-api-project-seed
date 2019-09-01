package com.it10086.university.model;

import javax.persistence.*;

@Table(name = "tb_university_real_hour")
public class UnivesityRealHour {
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

    @Column(name = "add_count")
    private Long addCount;

    @Column(name = "broadband_count")
    private Long broadbandCount;

    @Column(name = "renewal_count")
    private Long renewalCount;

    @Column(name = "package_count")
    private Long packageCount;

    @Column(name = "yung_card_count")
    private Long yungCardCount;

    @Column(name = "assistant_count")
    private Long assistantCount;

    @Column(name = "crm_count")
    private Long crmCount;

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
     * @return renewal_count
     */
    public Long getRenewalCount() {
        return renewalCount;
    }

    /**
     * @param renewalCount
     */
    public void setRenewalCount(Long renewalCount) {
        this.renewalCount = renewalCount;
    }

    /**
     * @return package_count
     */
    public Long getPackageCount() {
        return packageCount;
    }

    /**
     * @param packageCount
     */
    public void setPackageCount(Long packageCount) {
        this.packageCount = packageCount;
    }

    /**
     * @return yung_card_count
     */
    public Long getYungCardCount() {
        return yungCardCount;
    }

    /**
     * @param yungCardCount
     */
    public void setYungCardCount(Long yungCardCount) {
        this.yungCardCount = yungCardCount;
    }

    /**
     * @return assistant_count
     */
    public Long getAssistantCount() {
        return assistantCount;
    }

    /**
     * @param assistantCount
     */
    public void setAssistantCount(Long assistantCount) {
        this.assistantCount = assistantCount;
    }

    /**
     * @return crm_count
     */
    public Long getCrmCount() {
        return crmCount;
    }

    /**
     * @param crmCount
     */
    public void setCrmCount(Long crmCount) {
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