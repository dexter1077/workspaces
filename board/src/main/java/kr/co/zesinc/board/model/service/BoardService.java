package kr.co.zesinc.board.model.service;

import java.util.ArrayList;

import kr.co.zesinc.board.common.model.vo.PageInfo;
import kr.co.zesinc.board.model.vo.Board;

public interface BoardService {

    int selectBoardListcount();
    
    ArrayList<Board> selectBoardList(PageInfo pi);

    Board selectBoard(int sn);

    int deleteBoard(Board board);

    int updateBoard(Board board);

    int insertBoard(Board board);

    
}
