package com.kh.chap01_list.part02_mvc.controller;
//이건 왜 만들었냐, 사용자가 요청을 계속한다. , 수정해달라는 등, 추가 입력 해달라는등 , 등을 처리하기 위해서. 

// musicmenu 에서 초반에 강조를 많이 했는데, 출력문은 저기서만 써야 한다. 
//musiccontroller 에서는 출력문이 있어서는 안된다. 

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicController {

	// 필드부

	private ArrayList<Music> list = new ArrayList<Music>();
	{// list 를 만들긴 했는데, 아무것도 없으면 쓸쓸하니까 3개정도 추가해주자. 이럴떄, 초기화블럭 or 이중 블럭을 만들어주자 { }
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		list.add(new Music("거짓말", "빅뱅"));
	}

	/**
	 * @param title  - 추가하려는 제목
	 * @param artist - 추가하려는 가수.
	 */
	public void insertMusic(String title, String artist) {

		list.add(new Music(title, artist));
	}

	public ArrayList<Music> selectMusic() {
		return list;
	}

	public int deletMusic(String title) {
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1;
				break;
			}
		} // return 값이 0이면, for > if 문이 작동하지 않은 것 이므로, 검색된 타이틀과 매칭되는 것이 없어, 삭제되지 않았다는 것이다.
			// 1이면, 삭제됨거임.
		return result;
	}

	public ArrayList<Music> searchMusic(String keyword) {

		ArrayList<Music> searchList = new ArrayList<Music>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		return searchList;
	}

	public ArrayList<Music> searchMusic(int menu, String keyword) {

		ArrayList<Music> searchList = new ArrayList<Music>();

		if (menu == 1) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} else if (menu == 2) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} else {

		}

		return searchList;
	}

	public int updateMusic(String title, String upArtist, String upTitle) {
		int result = 0;
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				result = 1;
				break;
			}
		}
		return result;
	}
}
