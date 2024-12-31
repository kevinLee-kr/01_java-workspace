package com.kh.chap01_inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {

	public static void main(String[] args) {

		/*
		 * 네크워크 (network) : 여러대 컴퓨터들이 연결되어있는 통신망 같은것 -> 이런 네크워크를 통해 서로간의 데이터 교환 가능
		 * 
		 * ip 주소 : 네크워크 상에 각 컴퓨터들을 식별해줄 수 있는 번호.(컴퓨터 주민번호)
		 * 
		 * what is 서버 -> 클라이언트(고객)에게 서비스를 제공해주는 프로그램(클라이언트의 요청을 처리해서 응답해주는) what is
		 * 클라이언트 -> 서버의 요청하는 컴퓨터. (서비스를 제공받는 고객)
		 * 
		 * - 서버에 요청하기 위해서 그 요청하고자 하는 서버의ip 주소(또는 도메인명), 포트번호를 알아야함.
		 */
		// InetAddress : 네트워크 정보(ip주소 관련)를 확인할 수 있는 클래스.

		try {
			InetAddress localHost = InetAddress.getLocalHost(); // 내 pc에 대한 정보를 반환한다.
			System.out.println(localHost); // 내 pc명 / 내 ip주소
			// DESKTOP-U5H11SC/192.168.20.48
			// 내 pc 이름만 갖고 오고 싶어.
			System.out.println("내 pc명 : " + localHost.getHostName());
			// 내 pc명 : DESKTOP-U5H11SC
			// ----------------------------------------------
			// 내 pc ip주소만 갖고 오고 싶어.
			System.out.println("내 ip 주소 : " + localHost.getHostAddress());
			// 내 ip 주소 : 192.168.20.48
			System.out.println("===================================");

			// 내가 알고 있는 도메인을 통해서 그 서버 관련된 정보얻기.
			// 도메인을 통해서 서버관련한 것들을 배열로 받을 수 있음.
			InetAddress googleHost = InetAddress.getByName("WWW.GOOGLE.COM");
			// 도메인명을 통해서 해당 호스트에 대한 정보 반환.
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");

			for (InetAddress n : naverHost) { // n = naverHost[0] -> n=naverHost[1]
				System.out.println("네이버 서버명 : " + n.getHostName());
				System.out.println("네이버 IP주소  : " + n.getHostAddress());
			}

			System.out.println("구글 서버명 : " + googleHost.getHostName());
			System.out.println("구글 ip주소 : " + googleHost.getHostAddress());

		} catch (UnknownHostException e) {

			e.printStackTrace();
		}

		/*
		 * 현재 구동중인 서버가 있으면 . 클라이언트는 그서버로 요청을 보낼 수 있음 ! -> 응답 결과 돌아온다.
		 * 
		 * 요청과 응답에 의해서 프로그램은 돌아간다. (통신한다 라고 표현을 한다. ) 웹에서의 통신 방식 : HTTP 프로토콜 통신
		 * 
		 * 여기 파트에서는 무엇을 하거냐며ㅑㄴ 자바만을 가지고 서버와 클라이언트간에 간단한 통신을 해보자.
		 * 
		 * 데이터를 입출력 하고자 한다면 서버와 클라이언트가에 스트림(연결통로)이 필요함.!!!
		 * 
		 * 소켓 : 프로세스 간의 통신을 담당하는 것이다. (스트림을 연결하기 위한 문이다. )
		 * 
		 * 소켓 프로그래밍 방식 1. TCP 방식 -> 클라이언트 호출, 서버 응답, 클라이언트 요청, 서버 응답, -> 호출이 있을때까지 기다렸다가
		 * 서버가 응답을 해주는 방식이다. -> 소통이 조금 느리지만, 안정적으로 통신이 가능하다. -> 데이터의 전송속도가 느리지만, 정확도가
		 * 높고, 안정적으로 전달이 가능하다. 신뢰성이 요구되는 프로그램에서 채택한다. 2. UDP 방식. -> 데이터의 전송속도가 빠르다, 신뢰성이
		 * 없는 데이터가 전달 될 수 있다. (데이터를 빠른 속도로 전송해야 하는 프로그램)(실시간 동영상 서비스)
		 */

	}

}
