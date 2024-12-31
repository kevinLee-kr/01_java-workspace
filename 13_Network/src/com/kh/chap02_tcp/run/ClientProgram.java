package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {

	// 클라이언트용 프로그램
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입출력을 할려면 통로가 필요함.
		BufferedReader br = null; // 널로 초기화.
		PrintWriter pw = null;

		Socket socket = null;

		// 통신을 할려면 , 요청하고자 하는 서버의 ip주소를 알아내자. 누구의 아이피? 현재 내 컴퓨터 아이피. cmd -> ipconfig
		// ip : 192.168.20.48
		// 포트번호 : 3000

		int port = 3000;

		String serverIP = null;

		// 1) 서버에 연결 요청 보내는 구문 (요청하고자 하는 서버의 ip주소와 지정된 포트번호를 제시하면서 소캣 객체 생성)
		// 소켓을 만들어보자.
		// 위에 소켓 에다가 = new socket.

//		socket = new Socket(서버의 아이피 주소, 포트번호);
		serverIP = "192.168.20.48";
		try {
			socket = new Socket(serverIP, port);
			// 만약에 서버가 꺼져있거나, 못 찾으면 통신에 실패한다. (네이버 호출 안되던거 기억함?)
			// 이러한 경우 socket 안에 null이 담긴다.

			if (socket != null) {
				// 만약에 socket 에 null 이 담기지 않았을 경우, (통신이 원활하게 되었을 경우)*통신에 성공한 경우)
				System.out.println("이야, 통신 성공");

				// 2) 서버와 입출력 기반 스트림 생성한다.

				// 3) 보조 스트림을 통한 성능 개선한다.

				// 입력용 스트림
				// 문자 기반 스트림이 와야 하는데 버퍼드리더에는 바이트기반 스트림으로만 넣을 수 있으니 . new inputstreamreader 를 통해
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				// 출력용 스트림
				pw = new PrintWriter(socket.getOutputStream());

				while (true) {
					// 4) 스트림을 통해서 읽고 써보자.

					System.out.println("서버에게 보낼 내용 : ");
					String sendMessage = sc.nextLine();

					// 다 썻다, 서버쪽으로 보내보자.

					pw.println(sendMessage);
					// 밀었다.
					pw.flush();

					String message = br.readLine();
					System.out.println(" 받았다. 읽었다. ");

				}

			}

		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			pw.close();
			try {
				br.close();
				socket.close();

				// 여기까지 통신 종료, 여기까지 tcp/ip 통신을 전체적으로 해보았다.

			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
