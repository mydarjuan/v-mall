package com.darjuan.mall.api.filter; /**
 * <p></p>
 *
 * @author liujianbo
 * @version v1  com.darjuan.mall.api.filter.ExceptionResolver.java
 * @since 2019-12-25 23:05
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 刘建波
 * @date 2019-12-25
 */
@Component
public class ExceptionResolver  implements HandlerExceptionResolver {

  @Override
  public ModelAndView resolveException(HttpServletRequest httpServletRequest,
      HttpServletResponse response, Object o, Exception ex) {
    System.out.println("发生全局异常!");
    ModelMap mmp=new ModelMap();
    mmp.addAttribute("ex",ex.getMessage());
    response.addHeader("Content-Type","application/json;charset=UTF-8");
    try {
      new ObjectMapper().writeValue(response.getWriter(),ex.getMessage());
      response.getWriter().flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return new ModelAndView();
  }
}
