package com.model;

import com.utils.DisplayHelper;
import static  com.utils.FileConstants.*;

public class RemoteFolder extends Folder {
	
	int size;

	public RemoteFolder(String name) {
		super(name);
		this.size = zeroFileSize;
	}
	
	@Override
	public String asHTML() {
		StringBuilder builder = new StringBuilder(DisplayHelper.getDisplayHtML(this));
		builder.append(UL);
		for (Node content : contents) {
			builder.append(LI);
			builder.append(content.asHTML());
			builder.append(LI2);
		}
		builder.append(UL2);
		return builder.toString();
	}

}
