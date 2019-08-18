package com.it10086.university.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_university_qa_day")
public class AccumulateQA {
    @Id
    @Column(name = "statis_day")
    private Date statisDay;

    @Column(name = "area_code")
    private String areaCode;

    @Column(name = "area_name")
    private String areaName;

    @Column(name = "university_code")
    private String universityCode;

    @Column(name = "university_name")
    private String universityName;

    @Column(name = "plan_count")
    private Long planCount;

    @Column(name = "add_count")
    private Long addCount;

    @Column(name = "prepose_count")
    private Long preposeCount;

    @Column(name = "carry_number_count")
    private Long carryNumberCount;

    @Column(name = "communicate_count")
    private Long communicateCount;

    @Column(name = "circle_count")
    private Long circleCount;

    @Column(name = "new_count")
    private Long newCount;

    @Column(name = "current_is_open")
    private String currentIsOpen;

    /**
     * @return statis_day
     */
    public Date getStatisDay() {
        return statisDay;
    }

    /**
     * @param statisDay
     */
    public void setStatisDay(Date statisDay) {
        this.statisDay = statisDay;
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
     * @return prepose_count
     */
    public Long getPreposeCount() {
        return preposeCount;
    }

    /**
     * @param preposeCount
     */
    public void setPreposeCount(Long preposeCount) {
        this.preposeCount = preposeCount;
    }

    /**
     * @return carry_number_count
     */
    public Long getCarryNumberCount() {
        return carryNumberCount;
    }

    /**
     * @param carryNumberCount
     */
    public void setCarryNumberCount(Long carryNumberCount) {
        this.carryNumberCount = carryNumberCount;
    }

    /**
     * @return communicate_count
     */
    public Long getCommunicateCount() {
        return communicateCount;
    }

    /**
     * @param communicateCount
     */
    public void setCommunicateCount(Long communicateCount) {
        this.communicateCount = communicateCount;
    }

    /**
     * @return circle_count
     */
    public Long getCircleCount() {
        return circleCount;
    }

    /**
     * @param circleCount
     */
    public void setCircleCount(Long circleCount) {
        this.circleCount = circleCount;
    }

    /**
     * @return new_count
     */
    public Long getNewCount() {
        return newCount;
    }

    /**
     * @param newCount
     */
    public void setNewCount(Long newCount) {
        this.newCount = newCount;
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