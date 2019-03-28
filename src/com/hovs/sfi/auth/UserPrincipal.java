package com.hovs.sfi.auth;

import org.springframework.security.core.userdetails.UserDetails;

import com.hovs.sfi.model.User;
/**
 * Copyright (c) 2016 BancTec TPS India Pvt. Ltd.
 * All Rights Reserved.This file is a part of eFile web solution.
 * 
 * @author Sangramsing H. Patil.
 *         Contact : Sangramsing.Patil@banctec.in,
 * @version 1.0
 * @since 08-Mar-2016
 */
public interface UserPrincipal extends UserDetails {

	 public User getUser();

}
