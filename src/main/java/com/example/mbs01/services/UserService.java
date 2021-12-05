package com.example.mbs01.services;

import com.example.mbs01.entities.User;
import com.example.mbs01.exceptions.UserDetailsNotFoundException;
import com.example.mbs01.exceptions.UserNameAlreadyExistsException;
import com.example.mbs01.exceptions.UserTypeDetailsNotFoundException;

public interface UserService {

    public User acceptUserDetails(User user)
            throws UserNameAlreadyExistsException, UserTypeDetailsNotFoundException;

    public User getUserDetails(int id) throws UserDetailsNotFoundException;

    public User getUserDetailsByUsername(String username) throws UserDetailsNotFoundException;

    public User updateUserDetails(int id, User user)
            throws UserNameAlreadyExistsException, UserDetailsNotFoundException, UserTypeDetailsNotFoundException;

}
