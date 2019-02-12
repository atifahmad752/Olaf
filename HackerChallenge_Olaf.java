/*
 * Ahmad, Atif
 * CS A170
 * September 5, 2015
 * 
 * Project: HackerChallenge_Olaf
 */

import java.awt.Graphics;

import java.awt.Graphics2D;

import javax.swing.JApplet;

import java.awt.BasicStroke;

public class HackerChallenge_Olaf extends JApplet {
	
	public void init()
	{
		setSize(800,800);
	}
	
	public void paint (Graphics canvas)
	{
		super.paint(canvas);
		//Eyes Outline
		canvas.drawOval(400, 275, 50, 50);
		canvas.drawOval(450, 275, 50, 50);
		//Top of nose and side of nose
		canvas.drawArc(440, 325, 50, 50, 0, 110);
		canvas.drawArc(480, 350, 20, 20, 0, 90);
		//Eyes Pupils
		canvas.fillOval(410, 285, 30, 30);
		canvas.fillOval(460, 285, 30, 30);
		//Bottom of nose
		canvas.drawArc(450, 310, 100, 50, -90, -90);
		canvas.drawArc(449, 326, 14, 20, 90, 90);
		//Adjust thickness for eyebrows
		Graphics2D canvas2D = (Graphics2D) canvas;
		float strokeThickness = 5.0f;

	    BasicStroke stroke = new BasicStroke(strokeThickness);
	    canvas2D.setStroke(stroke);

	    //Left Eyebrow
	    canvas2D.drawLine(390,280,400,260);
	    canvas2D.drawLine(400, 260, 440, 230);
	    
	    //Right Eyebrow
	    canvas2D.drawLine(500, 280, 490, 260);
	    canvas2D.drawLine(490, 260, 460, 230);
	    
	    //Change thickness back to normal
		float strokeThickness2 = 0.0f;

	    BasicStroke stroke2 = new BasicStroke(strokeThickness2);
	    canvas2D.setStroke(stroke2);
	    //Head
	    canvas.drawLine(510, 350, 520, 370);
	    canvas.drawArc(420, 365, 100, 10, 0, -180);
	    canvas.drawLine(420, 370, 400, 345);
	    canvas.drawLine(400,345, 410, 340);
	    canvas.drawLine(390, 350, 400, 345);
	    canvas.drawArc (367, 310, 50, 70, 45, 180);
	    canvas.drawLine (370, 330, 380, 215);
	    canvas.drawArc(380, 205, 120, 20, 0, 180);
	    canvas.drawLine(510, 300, 500, 215);
	    canvas.drawLine(525, 350, 510, 300);
	    canvas.drawArc(505, 310, 20, 80, -90, 90);
	    
	    //Teeth
		canvas.drawLine(440, 375, 450, 390);
		canvas.drawLine(450, 390, 500, 390);
		canvas.drawLine(500, 390, 510, 374);
		
		//Bottom of Head and Neck
		canvas.drawLine(375,370, 405, 450);
		canvas.drawLine(515,390, 495, 450);
		canvas.drawArc(405, 445, 90, 10, 0, -180);
		
		//Carrot Design
		canvas.drawArc(455, 330, 10, 20, 90, 90);
		canvas.drawArc(460, 333, 10, 20, -90, -90);
		canvas.drawArc(472, 330, 10, 20, 90, 90);
		canvas.drawArc(478, 336, 10, 21, -90, -90);
		
		//Body
		//Middle Body
		canvas.drawArc(365, 435, 70, 120, 90, 90);
		canvas.drawArc(465, 435, 70, 120, 0, 90);
		canvas.drawArc(365, 435, 70, 120, -90, -90);
		canvas.drawArc(465, 435, 70, 120, -90, 90);
		canvas.drawArc(395, 543, 110, 20, 0, -180);
		
		//Bottom Body
		canvas.drawArc(485, 530, 90, 120, 0, 90);
		canvas.drawArc(328, 532, 90, 120, 90,90);
		canvas.drawArc(485, 530, 90, 120, -90, 90);
		canvas.drawArc(328, 532, 90, 120, -90, -90);
		canvas.drawArc(370, 639, 160, 20, 0, -180);
		
		//Feet
		canvas.drawArc(390, 655, 10, 70, 90, 90);
		canvas.drawArc(449, 658, 10, 70, 90, 90);
		canvas.drawArc(504, 655, 10, 70, 0, 90);
		canvas.drawArc(391, 680, 58, 20, 0, -180);
		canvas.drawArc(449, 680, 65, 20, 0, -180);
		
		//Buttons
		canvas.fillOval(400,  480,  40, 40);
		canvas.fillOval(385, 565, 40, 40);
		canvas.fillOval(385, 610, 40, 40);
		
		//Hair
		float strokeThickness3 = 4.0f;

	    BasicStroke stroke3 = new BasicStroke(strokeThickness3);
	    canvas2D.setStroke(stroke3);
	    
	    canvas.drawLine(450, 205, 457, 160);
	    canvas.drawArc(455, 170, 30, 10, 0, 180);
	    canvas.drawLine(445, 205, 442, 135);
	    canvas.drawLine(440, 205, 433, 175);
	    canvas.drawArc(419, 178, 15, 10, 0, 180);
	    
	    //Arms and Hands
	    float strokeThickness4 = 9.0f;

	    BasicStroke stroke4 = new BasicStroke(strokeThickness4);
	    canvas2D.setStroke(stroke4);
	    
	    canvas.drawLine(491, 485, 510, 600);
	    canvas.drawLine(510,600, 508, 620);
	    canvas.drawLine(510, 600, 498, 612);
	    canvas.drawLine(510, 600,  520, 616);
	    canvas.drawLine(510, 594, 496, 598);
	    
	    canvas.drawLine(370, 460, 340, 420);
	    canvas.drawLine(340,420,305,390);
	    canvas.drawLine(310, 390, 315, 370);
	    canvas.drawLine(305, 390, 302, 365);
	    canvas.drawLine(305,390, 288, 368);
	    canvas.drawLine(305, 390, 280, 385);
	    
	    

		
	}

}
