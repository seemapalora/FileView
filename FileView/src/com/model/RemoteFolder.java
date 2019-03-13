package com.model;

import com.utils.DisplayHelper;
import com.utils.FileConstants;

public class RemoteFolder extends Folder {
	
	int size;

	public RemoteFolder(String name) {
		super(name);
		this.size = FileConstants.zeroFileSize;
	}
	
	@Override
	public String asHTML() {
		StringBuilder builder = new StringBuilder(DisplayHelper.getDisplayHtML(this));

		for (Node content : contents)
			builder.append(content.asHTML());
		return builder.toString();
	}

}
