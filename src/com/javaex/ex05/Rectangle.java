package com.javaex.ex05;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() { }
	public Rectangle(int width, int height) {
		this.width =  width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle[width=" + width + ", height =" + height + "]";
	}
	
	public boolean equals(Rectangle r) {
		int area1 = this.width * this.height;
		int area2 = r.getWidth() * r.getHeight();
		if(area1 == area2) {
			return true;
		} else {
			return false;
		}
	}
}
