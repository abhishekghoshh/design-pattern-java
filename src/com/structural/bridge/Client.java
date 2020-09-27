package com.structural.bridge;

import com.structural.bridge.border.Border;
import com.structural.bridge.border.DashedBorder;
import com.structural.bridge.border.SolidBorder;
import com.structural.bridge.color.BlueColor;
import com.structural.bridge.color.Color;
import com.structural.bridge.color.RedColor;
import com.structural.bridge.shape.CircleShape;
import com.structural.bridge.shape.RectangleShape;
import com.structural.bridge.shape.Shape;

public class Client {
	
	public static void main(String args[]) {
		Shape shape =null;
		Color color =null;
		Border border=null;
		
		color = new RedColor(5);
		border = new DashedBorder(9);
		shape = new CircleShape(color,border);
		shape.description();
		
		color = new BlueColor(10);
		border = new SolidBorder(10);
		shape = new RectangleShape(color,border);
		shape.description();
	}
}
