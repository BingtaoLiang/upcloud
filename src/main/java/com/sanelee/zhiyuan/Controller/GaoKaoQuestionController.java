package com.sanelee.zhiyuan.Controller;

import com.sanelee.zhiyuan.DTO.PaginationDTO;
import com.sanelee.zhiyuan.Mapper.GaoKaoQuestionMapper;
import com.sanelee.zhiyuan.Model.GaoKaoQuestion;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GaoKaoQuestionController {
    @Autowired
    private GaoKaoQuestionMapper gaoKaoQuestionMapper;


    @GetMapping("/gaokaoQuestion")
    public String gaokaoQuestion(Model model){
        List<GaoKaoQuestion> questionType = gaoKaoQuestionMapper.findQuestionType();
        model.addAttribute("questionType",questionType);

        List<GaoKaoQuestion> allQuestions = gaoKaoQuestionMapper.findAllQuestions();
        model.addAttribute("allquestion",allQuestions);


//        PaginationDTO questionList = gaoKaoQuestionService.listQuestions(page, size);
//        model.addAttribute("questionList",questionList);

        return "gaokaoQuestion";
    }

    @GetMapping("/questionDetail/{id}")
    public String questionDetail(@PathVariable("id") Integer id, Model model){
        GaoKaoQuestion questionById = gaoKaoQuestionMapper.findQuestionById(id);
        model.addAttribute("questionById",questionById);
        return "questionDetail";
    }
}
