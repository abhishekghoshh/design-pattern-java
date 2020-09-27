package com.structural.bridge.shape;

import com.structural.bridge.border.Border;
import com.structural.bridge.color.Color;

public interface Shape {
	void setColor(Color color);
	Color getColor();
	void setBorder(Border border);
	Border getBorder();
	void description();
	String toString();
}
