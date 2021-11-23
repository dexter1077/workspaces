package kr.co.zesinc.board.model.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.zesinc.board.common.model.vo.PageInfo;
import kr.co.zesinc.board.model.dao.BoardDao;
import kr.co.zesinc.board.model.vo.Board;

@Service
public class BoardServiceImpl implements BoardService{
    
    @Autowired
    private BoardDao boardDao;
    
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public int selectBoardListcount() {
        return boardDao.selectBoardListCount(sqlSession);
    }
    @Override
    public ArrayList<Board> selectBoardList(PageInfo pi) {
        return boardDao.selectBoardList(sqlSession, pi);
    }
    @Override
    public Board selectBoard(int sn) {
        return boardDao.selectBoard(sqlSession, sn);
    }
    @Override
    public int insertBoard(Board board) {
        return boardDao.insertBoard(sqlSession, board);
    }
    @Override
    public int updateBoard(Board board) {
        return boardDao.updateBoard(sqlSession, board);
    }
    @Override
    public int deleteBoard(Board board) {
        return boardDao.deleteBoard(sqlSession, board);
    }

    
}
