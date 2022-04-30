package com.javaex.ex03;

import java.util.Objects;

public class Point {
	private int x;
	private int y;
	
	public Point() { }
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj; 
		if(this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
