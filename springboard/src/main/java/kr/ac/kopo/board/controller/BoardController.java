package kr.ac.kopo.board.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.vo.BoardVO;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    //http://localhost:8080/springboard/board/new
    @GetMapping("/board/new")
    public String newPost(Model model) {
       
        //값을 만들어서 jsp에 보내줄 수 있다 
        BoardVO boardVO = new BoardVO();
        //boardVO.setTitle("기본제목");
        
        model.addAttribute("boardVO",boardVO);
        
        return "board/writeForm";
    }
    
    //http://localhost:8080/springboard/board/new
    @PostMapping("/board/new")
    public String newPostProcess(@Valid BoardVO boardVO, BindingResult br) {
        
        if(br.hasErrors()){
            System.out.println(" Error!!! ");
            return "board/writeForm"; //boardlist.jsp
        }
        
        boardService.writeNewPost(boardVO);
        return "redirect:/board";
        //http://localhost:8080/springboard/board
    }
    
    
    
    // http://localhost:8080/springboard/board/10
    @GetMapping("/board/{no}")
    public String getPostbyNo2(@PathVariable("no") int no, Model model) {
        // service에 요청해서 데이터 얻어와야함
        BoardVO boardVO = boardService.getPostbyNo(no);
        model.addAttribute("boardVO", boardVO);
        return "board/detail";
    }


    // post?no=10 이라는 요청을 보내려 한다
    // 요청에 reqeustParam으로 no에 넣어주자
    // 그렇다면 어떻게 맵핑 해줘야하나
    // @GetMapping("/post")
    public String getPostbyNo(@RequestParam("no") int no, Model model) {
        // service에 요청해서 데이터 얻어와야함
        BoardVO boardVO = boardService.getPostbyNo(no);
        model.addAttribute("boardVO", boardVO);
        return "board/detail";

    }



    // http://localhost:8080/springboard/board 라는 url이 들어오면 여기로 온다
    @GetMapping("/board")
    public ModelAndView getAllBoard() {

        ModelAndView mav = new ModelAndView("board/boardlist");

        // return 값으로 리스트를 줌
        List<BoardVO> boardlist = boardService.getAllBoard();
        mav.addObject("boardlist", boardlist);


        // return을 board/boardlist.jsp로 할 것이다.
        // view resolver가 /WEB-INF/jsp/를 붙여줄 것이다.
        return mav;
    }

}
