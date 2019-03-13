package com.model;

import com.utils.DisplayHelper;

public class File extends Node {

	private String lastModifiedDate;
	private int size;

	public File(String name,int size,String lastModifiedDate) {
		super(name);
		this.size = size;
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public String asHTML() {
		return DisplayHelper.getDisplayHtML(this);
	}

	@Override
	public int getSize() {
		return size;
	}

}
