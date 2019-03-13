package com.model;

import java.util.Date;

import com.utils.DisplayHelper;

public class HiddenFile extends File {

	public HiddenFile(String name, int size, String lastModifiedDate) {
		super(name, size, lastModifiedDate);
	}
	
	@Override
	public String asHTML() {
		return DisplayHelper.getDisplayHtML(this);
	}

}
