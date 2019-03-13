package com.model;

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

		for (Node content : contents)
			builder.append(content.asHTML());
		return builder.toString();
	}
	
	public int getSize() {
        return contents.stream().mapToInt(node->node.getSize()).sum();
	}

}
