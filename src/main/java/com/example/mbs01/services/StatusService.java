package com.example.mbs01.services;

import com.example.mbs01.entities.Status;
import com.example.mbs01.exceptions.StatusDetailsNotFoundException;

import java.util.List;

public interface StatusService {
    /**
     *  Add a new status in the system
     */
    public Status acceptStatusDetails(Status status);

    /**
     * Fetch the status object based on the id
     */
    public Status getStatusBasedOnId(int id) throws StatusDetailsNotFoundException;

    /**
     * Fetch the status object based on the Status Name
     */
    public Status getStatusDetailsByStatusName(String statusName) throws StatusDetailsNotFoundException;

    /**
     * Delete a status based on id
     *
     * return true if deleted successfully
     */
    public boolean deleteStatus(int id);

    /**
     * Get all the statuses
     */
    public List<Status> getAllStatuses();


}