package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {

		/*
		 * 크기가 2인 circle, rectangle 각각 객체 배열 할당 
		 * 위의 사용 데이터를 참고 각각 초기화
		 *  각 도형의 draw 메소드 실행.
		 */
		Circle[] c = new Circle[2];
		Rectangle[] r = new Rectangle[2];
		c[0] = new Circle(1, 2, 3);
		c[1] = new Circle(3, 3, 4);
		
		r[0] = new Rectangle(-1, -2, 5, 2);
		r[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("이호석");
		// 각 도형의 draw 메소드 실행
		c[0].draw(); System.out.println(" ");
		c[1].draw(); System.out.println(" ");
		
		//
		r[0].draw(); System.out.println(" ");
		r[1].draw(); System.out.println(" ");
		}

	}
