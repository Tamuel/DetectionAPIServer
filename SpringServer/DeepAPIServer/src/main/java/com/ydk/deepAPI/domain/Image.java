package com.ydk.deepAPI.domain;

public class Image {
	private final int width;
	private final int height;
	private short[][] data;
	
	public Image(int width, int height) {
		this.width = width;
		this.height = height;
		data = new short[this.height][this.width];
	}

	public short[][] getData() {
		return data;
	}

	public void setData(short[][] data) {
		this.data = data;
	}

	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
}
