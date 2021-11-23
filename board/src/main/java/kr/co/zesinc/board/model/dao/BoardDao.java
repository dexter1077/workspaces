package kr.co.zesinc.board.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.zesinc.board.common.model.vo.PageInfo;
import kr.co.zesinc.board.model.vo.Board;

@Repository
public class BoardDao {

    public int selectBoardListCount(SqlSessionTemplate sqlSession) {
        
        return sqlSession.selectOne("boardMapper.selectBoardListCount");
    }
    
    public ArrayList<Board> selectBoardList(SqlSessionTemplate sqlSession, PageInfo pi) {
        int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
        RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
        return (ArrayList)sqlSession.selectList("boardMapper.selectBoardList", null,rowBounds);
    }

    public Board selectBoard(SqlSessionTemplate sqlSession, int sn) {
        return sqlSession.selectOne("boardMapper.selectBoard", sn);
    }

    public int insertBoard(SqlSessionTemplate sqlSession, Board board) {
        return sqlSession.insert("boardMapper.insertBoard", board);
    }

    public int updateBoard(SqlSessionTemplate sqlSession, Board board) {
        return sqlSession.update("boardMapper.updateBoard", board);
    }

    public int deleteBoard(SqlSessionTemplate sqlSession, Board board) {
        return sqlSession.update("boardMapper.deleteBoard", board);
    }

}
