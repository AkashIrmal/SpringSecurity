/**
* Copyright (c) 2016 BancTec TPS India Pvt. Ltd.
* All Rights Reserved.This file is a part of eFile web solution.
*/
package com.hovs.sfi.model;

import java.util.Date;

/**
 * @author Sangramsing H. Patil.
 *         Contact : Sangramsing.Patil@banctec.in,
 * @version 1.0
 * @since 29-Mar-2016
 */
public class UserRole {
	private int id;
	private String name;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
