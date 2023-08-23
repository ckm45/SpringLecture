package kr.ac.kopo.board.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.vo.BoardVO;

@Controller
public class BoardController {
    
    @Autowired
    private BoardService boardService;
    
    //http://localhost:8080/springboard/board 라는 url이 들어오면 여기로 온다 
    @GetMapping("/board")
    public ModelAndView getAllBoard() {
        
        ModelAndView mav = new ModelAndView("board/boardlist");
        
        //return 값으로 리스트를 줌 
        List<BoardVO> boardlist = boardService.getAllBoard();
        mav.addObject("boardlist",boardlist);
        
        
      //return을 board/boardlist.jsp로 할 것이다.
      //view resolver가 /WEB-INF/jsp/를 붙여줄 것이다.  
        return mav;
    }

}
