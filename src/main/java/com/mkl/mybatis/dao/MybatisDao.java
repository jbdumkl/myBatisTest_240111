package com.mkl.mybatis.dao;

import java.util.ArrayList;

import com.mkl.mybatis.dto.MybatisDto;

public interface MybatisDao {

	public ArrayList<MybatisDto> listDao();//게시판 모든 글목록 가져오기
	public void writeDao(String fbname, String fbtitle, String fbcontent); //게시판 글쓰기
	public MybatisDto contentDao(String fbnum);// 게시판 글 내용 가져오기
	public void modifyDao(String fbtitle, String fbname, String fbcontent, String fbnum);//게시판 글 수정하기
	public ArrayList<MybatisDto> searchDao(String searchKey);//제목 또는 내용에 특정단어 포함 결과 검색
	public void deleteDao(String fbnum);//게시판 글 삭제
	public void uphitDao(String fbnum);//게시판 글 조회수 증가
}
