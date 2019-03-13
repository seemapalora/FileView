package com.utils;

import com.model.File;
import com.model.Folder;
import com.model.Node;

public class DisplayHelper {

	public static String getDisplayHtML(Node node) {
		StringBuilder builder = new StringBuilder();
		switch (node.getClass().getSimpleName()) {

		case "File":
		case "HiddenFile":
			builder.append(FileConstants.P_STYLE_PADDING_LEFT_60PX_STRONG_START).append(FileConstants.STRONG_START).
			append(node.getName()).append(FileConstants.STRONG_END).append(FileConstants.OPEN_BRACKET).append(((File) node).getSize()).append(FileConstants.BYTES)
			.append(((File) node).getLastModifiedDate()).append(FileConstants.CLOSE_BRACKET).append(FileConstants.BREAK).append(FileConstants.SPAN_END).append(FileConstants.P_CLOSE);

			break;
		case "Folder":
			builder.append(FileConstants.P_OPEN).append(FileConstants.STRONG_START).append(node.getName()).append(FileConstants.OPEN_BRACKET).
			append(((Folder) node).getSize()).append(FileConstants.BYTES).append(FileConstants.STRONG_END).append(FileConstants.BREAK).append(FileConstants.P_CLOSE);
			break;
		case "RemoteFolder":
			builder.append(FileConstants.P_OPEN).append(FileConstants.STRONG_START).append(node.getName()).append(FileConstants.OPEN_BRACKET).
			append(((Folder) node).getSize()).append(FileConstants.BYTES).append(FileConstants.STRONG_END).append(FileConstants.BREAK).append(FileConstants.P_CLOSE);
			break;
		default:
			break;

		}
		return builder.toString();
	}
}
