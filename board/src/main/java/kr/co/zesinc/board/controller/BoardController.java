package kr.co.zesinc.board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.zesinc.board.common.model.vo.PageInfo;
import kr.co.zesinc.board.common.template.Pagination;
import kr.co.zesinc.board.model.service.BoardService;
import kr.co.zesinc.board.model.vo.Board;

/**
 * 게시판기능 Controller
 * @author HeeRak
 *
 */
@Controller
public class BoardController {
    
    @Autowired
    private BoardService boardService;
    
    /**
     * 게시글 목록 보기
     * @param request
     * @param mv
     */
    @RequestMapping(value="selectBoardList.do")
    public ModelAndView selectBoardList(HttpServletRequest request, ModelAndView mv, 
                                Board board, @RequestParam(value="currentPage", defaultValue = "1")int currentPage) {
        
        int listCount = boardService.selectBoardListcount();
        
        PageInfo pi = Pagination.getPageInfo(listCount, currentPage, 5, 10);
        
        ArrayList<Board> boardList = boardService.selectBoardList(pi);
       
        mv.addObject("boardList", boardList)
          .addObject("boardListCount", listCount)
          .setViewName("board/boardListView");
        
        return mv;
    }
    
    /**
     * 게시글 상세보기
     * @param request
     * @param mv
     */
    @RequestMapping(value="selectBoardDetailView.do")
    public ModelAndView selectBoardDetailView(HttpServletRequest request, ModelAndView mv, Board board) {
        
        Board detailBoard = boardService.selectBoard(board.getSn());
        
        mv.addObject("board", detailBoard)
          .setViewName("board/boardDetailView");
        
        return mv;
    }
    
    /**
     * 게시글 등록
     * @param request
     * @param mv
     * @param board
     * @return
     */
    @RequestMapping(value="insertBoard.do")
    public ModelAndView insertBoard(HttpServletRequest request, ModelAndView mv, Board board) {
        
        int result = boardService.insertBoard(board);
        
        return mv;
    }
    
    /**
     * 게시글 수정
     * @param request
     * @param mv
     * @param board
     * @return
     */
    @RequestMapping(value="insertBoard.do")
    public ModelAndView updateBoard(HttpServletRequest request, ModelAndView mv, Board board) {
        
        int result = boardService.updateBoard(board);
        
        return mv;
    }
    
    /**
     * 게시글 삭제
     * @param request
     * @param mv
     * @param board
     * @return
     */
    @RequestMapping(value="deleteBoard.do")
    public ModelAndView deleteBoard(HttpServletRequest request, ModelAndView mv, Board board) {
        
        int result = boardService.deleteBoard(board);
        
        return mv;
    }
}
