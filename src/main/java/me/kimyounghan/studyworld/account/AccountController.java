package me.kimyounghan.studyworld.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/sign-up")
    public String signUpForm(Model model) {
        // 회원 가입 뷰에 사용될 폼
        model.addAttribute(new SignUpForm());
        return "account/sign-up";
    }

}
