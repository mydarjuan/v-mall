package com.darjuan.mall.web.controller; /**
 * <p></p>
 *
 * @author liujianbo
 * @version v1  com.darjuan.mall.web.controller.TestController.java
 * @since 2019-12-09 13:43
 */


import com.darjuan.mall.service.UserService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 刘建波
 * @date 2019-12-09
 */
@Controller
@RequestMapping("/test")
public class TestController {

  @Autowired
  private UserService userService;

  @GetMapping(value = "/user/list")
  public ModelAndView test(HttpServletRequest req) {
    ModelAndView mv = new ModelAndView();
    mv.addObject("user", userService.getUser().get(0));
    mv.setViewName("/user/show.html");
    return mv;
  }

  @GetMapping(value = "/user/detail")
  public ModelAndView detail(HttpServletRequest req) {
    int a= 1/0;
    ModelAndView mv = new ModelAndView();
    mv.addObject("user", userService.getUser().get(0));
    mv.setViewName("/user/show.html");
    return mv;
  }
}
