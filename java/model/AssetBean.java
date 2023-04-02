/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author salkayali
 */
public class AssetBean implements Serializable {
    
    private String title;
    private String code;
    private String requestType;
    private Date requestDateFrom;
    private Date requestDateTo;
    private String requester;
    private String budget;
    private String[] role;
    private String description;
    private String hardReq;
    private String addReq;
    private String os;
    private String otherOs;
    private String machineType;
    private String host;
    private String domain;
    private String criticality;
    private String backup;
    private String availability;

    /**
     * Get the value of availability
     *
     * @return the value of availability
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Set the value of availability
     *
     * @param availability new value of availability
     */
    public void setAvailability(String availability) {
        this.availability = availability;
    }


    /**
     * Get the value of backup
     *
     * @return the value of backup
     */
    public String getBackup() {
        return backup;
    }

    /**
     * Set the value of backup
     *
     * @param backup new value of backup
     */
    public void setBackup(String backup) {
        this.backup = backup;
    }


    /**
     * Get the value of criticality
     *
     * @return the value of criticality
     */
    public String getCriticality() {
        return criticality;
    }

    /**
     * Set the value of criticality
     *
     * @param criticality new value of criticality
     */
    public void setCriticality(String criticality) {
        this.criticality = criticality;
    }

    

    /**
     * Get the value of domain
     *
     * @return the value of domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Set the value of domain
     *
     * @param domain new value of domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * Get the value of host
     *
     * @return the value of host
     */
    public String getHost() {
        return host;
    }

    /**
     * Set the value of host
     *
     * @param host new value of host
     */
    public void setHost(String host) {
        this.host = host;
    }


    /**
     * Get the value of machineType
     *
     * @return the value of machineType
     */
    public String getMachineType() {
        return machineType;
    }

    /**
     * Set the value of machineType
     *
     * @param machineType new value of machineType
     */
    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }


    /**
     * Get the value of otherOs
     *
     * @return the value of otherOs
     */
    public String getOtherOs() {
        return otherOs;
    }

    /**
     * Set the value of otherOs
     *
     * @param otherOs new value of otherOs
     */
    public void setOtherOs(String otherOs) {
        this.otherOs = otherOs;
    }


    /**
     * Get the value of os
     *
     * @return the value of os
     */
    public String getOs() {
        return os;
    }

    /**
     * Set the value of os
     *
     * @param os new value of os
     */
    public void setOs(String os) {
        this.os = os;
    }


    /**
     * Get the value of addReq
     *
     * @return the value of addReq
     */
    public String getAddReq() {
        return addReq;
    }

    /**
     * Set the value of addReq
     *
     * @param addReq new value of addReq
     */
    public void setAddReq(String addReq) {
        this.addReq = addReq;
    }

    
    /**
     * Get the value of hardReq
     *
     * @return the value of hardReq
     */
    public String getHardReq() {
        return hardReq;
    }

    /**
     * Set the value of hardReq
     *
     * @param hardReq new value of hardReq
     */
    public void setHardReq(String hardReq) {
        this.hardReq = hardReq;
    }


    /**
     * Get the value of description
     *
     * @return the value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the value of description
     *
     * @param description new value of description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the value of role
     *
     * @return the value of role
     */
    public String[] getRole() {
        return role;
    }

    /**
     * Set the value of role
     *
     * @param role new value of role
     */
    public void setRole(String[] role) {
        this.role = role;
    }

    /**
     * Get the value of budget
     *
     * @return the value of budget
     */
    public String getBudget() {
        return budget;
    }

    /**
     * Set the value of budget
     *
     * @param budget new value of budget
     */
    public void setBudget(String budget) {
        this.budget = budget;
    }

    
    /**
     * Get the value of requester
     *
     * @return the value of requester
     */
    public String getRequester() {
        return requester;
    }

    /**
     * Set the value of requester
     *
     * @param requester new value of requester
     */
    public void setRequester(String requester) {
        this.requester = requester;
    }

    /**
     * Get the value of requestDateTo
     *
     * @return the value of requestDateTo
     */
    public Date getRequestDateTo() {
        return requestDateTo;
    }

    /**
     * Set the value of requestDateTo
     *
     * @param requestDateTo new value of requestDateTo
     */
    public void setRequestDateTo(Date requestDateTo) {
        this.requestDateTo = requestDateTo;
    }


    /**
     * Get the value of requestDateFrom
     *
     * @return the value of requestDateFrom
     */
    public Date getRequestDateFrom() {
        return requestDateFrom;
    }

    /**
     * Set the value of requestDateFrom
     *
     * @param requestDateFrom new value of requestDateFrom
     */
    public void setRequestDateFrom(Date requestDateFrom) {
        this.requestDateFrom = requestDateFrom;
    }

    /**
     * Get the value of requestType
     *
     * @return the value of requestType
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Set the value of requestType
     *
     * @param requestType new value of requestType
     */
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    /**
     * Get the value of code
     *
     * @return the value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Set the value of code
     *
     * @param code new value of code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title) {
        this.title = title;
    }

  
    }

   
    
    

