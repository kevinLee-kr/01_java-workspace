package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

	/*
	 * TCP(Transmission Control Protocol) - 서버, 클라이언트 간의 1:1 소켓 통신을 한다. - 데이터를 교환하기에
	 * 앞서, 서버, 클라이언트가 연결 되어 있어야 한다. (서버가 먼저 실행이 되어 클라이언트의 요청을 기다린다. ) - 신뢰성있는 데이터 전달
	 * 가능. 소켓(Socket) - 프로세스간의 통신을 담당한다. - Input/OutputStream을 가지고 있다. (이 스트림을 통해
	 * 입출력이 이루어진다. )
	 * 
	 * server socket - 포트와 연결되어 (bind) 외부의 요청을 기다리다가 연결 요청이 들어오면 수락해줄 용도로 서브 소켓이
	 * 존재한다.
	 * 
	 * 만일, 수락을 한다면, 통신을 할 수 있는 소켓이 생성된다. (client socket)
	 * 
	 */

	// 서버용 프로그램.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BufferedReader br = null; // 입력용 보조 스트리밍
		PrintWriter pw = null; // 한줄씩 읽어오는 출력용 보조스트림.

		// 1)포트번호 지정 ( 서버측에서 몇번 포트로 통로를 열것입니까)
		int port = 3000;

		// 2)server socket 을 생성해야 하는데 포트 를 결합을 한다. (bind) (ㅠ포트 번호로 결합을 해야한다.)
		// serversocket 은 클라이언트의 연결 요청을 받아줄 용도의 소캣이다.

		// 만들어보자.
		ServerSocket server = null; // 서버 소켓이라는 것을 null 로 초기화 했다.

		try {
			server = new ServerSocket(port);

			// 3) 클라이언트로부터 접속 요청이 올떄까지 대기를 한다. 클라이언트의 연결 요청을 받아줄 용도로 소캣을 만들었다.
			System.out.println("클라이언트야 언제올거니..");

			// 4) 연결 요청이 오면 요청을 수락한다.
			// 해당 클라이언트와 통신을 할 수 있는 서버 소켓이 생성된다.(클라이언트 소켓)
			// 수락을 해보자
			// server.accept(); //수락했다.

			Socket socket = server.accept(); // 클라이언트와 통신할 수 있는 소켓 객체가 저기 소켓 객체 변수에 들어가 있따.
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함..");
			// 5) 클라이언트와 입출력 스트림을 생성한다. (바이트 스트림으로밖에 생성이 되는데 (1byte) -> 성능이 구림
			// 6) 보조스트림을 통해서 성능 개선을 해볼려고 한다. 바이트 스트림이 구리기 때문에.

			// 입력용 스트림을 먼저 만들어보도록 해보겠다.
			// 클라이언트로부터 전달된 값을 한 주 ㄹ단위로 읽어드리이기 위한 입력용 스트림.
			// 입력용 스트림 -> 1byte이라고 했죠?
			// 이것을 문자 스트림으로 변경 하고 싶다.

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// br 이 문자 기반 스트림이다.
			// bufferedreader 안에 있는 것도 문자 기반 스트림이 되어야 한다.
			// gkwlaks 하지만 안에 있는것은 현재 바이트 스트림이기 때문에, 문자 기반 스트림으로 바꿔주고
			// 그리고 진행 되어야 한다.
			// 젠더를 기운다. 라고 한다.

			// cnffur출력용 스트림을 만들어보자.
			// 클라이언트에게 값을 한 줄 단위로 출력 할 수 있는 출력용 스트림
			pw = new PrintWriter(socket.getOutputStream());

			// pw, printwriter 라는 건데 데이터 출력시 print(), println() 메소드를 가지고 있는 보조 스트림이다.

//			연결을 수락을 했고, 소캣을 연결을 입출력 할 준비를 마쳤다. 
//			
//			while 문 돌려서 계속 얘랑 왓다갓다 할거다. 
//			무한히 뭘 할거냠냠읽고 쓰기를 해보자. 
//			
//			//7) 스트림을 통해 릭고 쓰기
//			//클라이언트로부터 전달된 메세지가 있을 경우 서버측 읽어드리일꺼임(입력하자)
//			
//			
			while (true) {
				String message = br.readLine();
				System.out.println("클라이언트로부터 전달받은 메세지 : " + message);

				// 반대로 출력을 해줘야한다. 클라이언트에게 데이터를 전달해줘야ㅕ 한다. (출력)
				// 들어오는건 입력 나가는 건 출력.
				System.out.println(socket.getInetAddress().getHostAddress() + "클라이언트에게 보낼 내용 : ");

				String sendMessage = sc.nextLine();

				pw.println(sendMessage); // 클라이언트에게 보낸다. -> 출력한다.
				pw.flush(); // 현재 스트림에 있는 데이터를 강제로 내보내주는 메소드. 이렇게 되면 끝, 이렇게 되면 왓다갓다 한다.

			}

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			// 8) 통신 종료
			// 위에 try 문의 while 을 통해 통신을 했고, 끝낼때가 왔다.
			try {
				pw.close();
				br.close();
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
				// 이상, 서버 소켓을 만드는 법을 마친다.

			}

		}

	}

}
