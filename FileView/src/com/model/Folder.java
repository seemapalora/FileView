package com.model;

import static com.utils.FileConstants.LI;
import static com.utils.FileConstants.LI2;
import static com.utils.FileConstants.UL;
import static com.utils.FileConstants.UL2;

import java.util.ArrayList;
import java.util.List;

import com.utils.DisplayHelper;

public class Folder extends Node {
	
	public Folder(String name) {
		super(name);
	}

	protected List<Node> contents = new ArrayList<Node>();

	public List<Node> getContents() {
		return contents;
	}

	public void add(Node content) {
		this.contents.add(content);
	}

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

	public int getSize() {
        return contents.stream().mapToInt(node->node.getSize()).sum();
	}

}
