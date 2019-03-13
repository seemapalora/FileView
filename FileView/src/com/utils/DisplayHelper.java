package com.utils;

import com.model.File;
import com.model.Folder;
import com.model.Node;
import com.model.RemoteFolder;

import static com.utils.FileConstants.*;

public class DisplayHelper {

	public static String getDisplayHtML(Node node) {
		StringBuilder builder = new StringBuilder();
		switch (node.getClass().getSimpleName()) {

		case "File":
			builder.append(P_STYLE_PADDING_LEFT_60PX_STRONG_START).append(STRONG_START).
			append(node.getName()).append(STRONG_END).append(OPEN_BRACKET).append(((File) node).getSize()).append(BYTES).append(COMMA).append(LAST_MODIFIED_DATE)
			.append(((File) node).getLastModifiedDate()).append(CLOSE_BRACKET).append(BREAK).append(SPAN_END).append(P_CLOSE);
			break;
		case "HiddenFile":
			builder.append(P_STYLE_PADDING_LEFT_60PX_STRONG_HIDDEN_START).append(STRONG_START).
			append(node.getName()).append(STRONG_END).append(OPEN_BRACKET).append(((File) node).getSize()).append(BYTES).append(COMMA).append(LAST_MODIFIED_DATE)
			.append(((File) node).getLastModifiedDate()).append(CLOSE_BRACKET).append(HIDDEN).append(BREAK).append(SPAN_END).append(P_CLOSE);

			break;
		case "Folder":
			builder.append(P_OPEN).append(STRONG_START).append(node.getName()).append(OPEN_BRACKET).
			append(((Folder) node).getSize()).append(BYTES).append(CLOSE_BRACKET).append(STRONG_END).append(BREAK).append(P_CLOSE);
			break;
		case "RemoteFolder":
			builder.append(P_STYLE_PADDING_LEFT_60PX_STRONG_START).append(EM_START).append(STRONG_START).append(node.getName()).append(OPEN_BRACKET).
			append(0).append(BYTES).append(CLOSE_BRACKET).append(EM_END).append(STRONG_END).append(BREAK).append(P_CLOSE);
			break;
		default:
			break;

		}
		return builder.toString();
	}
}
