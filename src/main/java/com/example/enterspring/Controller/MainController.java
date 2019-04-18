package com.example.enterspring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

// use Annotation @Controller to inform that this class is a controller

public class MainController {


    @GetMapping("/")
    // Use Annotation @GetMapping  de xac dinh phuong thuc se xu ly cac request co HTTP method la GET va
    // URL Pattern la "/"
    public String test(Model model){

        model.addAttribute("msg","This is my first Spring Boot and ThymeLeaf Project ! ");


        return "test";

    }


//    Biến model truyền vào test có kiểu dữ liệu là Model. Model là một interface trong Spring MVC, có nhiệm vụ truyền dữ liệu từ controller cho view.
//    Ở đây mình sẽ truyền thuỘc tính msg có nội dung là "Hello World Spring" cho view test.html bằng cách sử dụng phương thức addAttribute của Model.
//    Ngoài cách dùng Model, ta cũng có thể dùng ModelMap hoặc ModelAndView để truyền dữ liệu từ controller cho view
//    Controller sẽ trả về một String tương ứng với tên của view: return "test" => view là test.html
//    (do mình dùng template engine là Thymeleaf nên file view là file html, một số template engine khác như Apache Tiles thì file view là file jsp...)

}

