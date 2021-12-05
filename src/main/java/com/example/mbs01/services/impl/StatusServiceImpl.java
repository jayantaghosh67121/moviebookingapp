package com.example.mbs01.services.impl;


import com.example.mbs01.daos.StatusDao;
import  com.example.mbs01.entities.Status;
import  com.example.mbs01.exceptions.StatusDetailsNotFoundException;
import  com.example.mbs01.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired  //Dependency injection
    private StatusDao statusDao ;

    /**
     * Given a status, I should be able to store it into the
     * database
     *
     * @param status
     * @return
     */
    @Override
    public Status acceptStatusDetails(Status status) {
        return statusDao.save(status);
    }

    /**
     * Based on the id, status should be returned
     *
     * If valid id -> proper status should be returned
     *
     * if invalid id -> StatusDetailsNotFoundException
     * @param id
     * @return
     */
    @Override
    public Status getStatusBasedOnId(int id) throws StatusDetailsNotFoundException {
        Status savedStatus = statusDao.findById(id).orElseThrow(() ->
                new StatusDetailsNotFoundException("Status not found for the provided status id : "+ id));
        return savedStatus ;
    }

    @Override
    public Status getStatusDetailsByStatusName(String statusName) throws StatusDetailsNotFoundException {
        Status savedStatus  = statusDao.findByStatusName(statusName);

        if(savedStatus ==null){
            throw new StatusDetailsNotFoundException("Status not found for the provided status name : "+ statusName);
        }
        return savedStatus ;
    }

    /**
     * Return true if able to successfully delete
     * @param id
     * @return
     */
    @Override
    public boolean deleteStatus(int id) {

        statusDao.deleteById(id);
        return true ;
    }

    @Override
    public List<Status> getAllStatuses() {
        List<Status> statuses = statusDao.findAll();
        return statuses;
    }
}
