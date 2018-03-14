package com.ou.mall.controller;

import com.ou.mall.bean.Msg;
import com.ou.mall.bean.User;
import com.ou.mall.exception.HasUsernameException;
import com.ou.mall.service.UserService;
import com.ou.mall.util.ResultUtils;
import com.ou.mall.util.SessionUtils;
import com.ou.mall.validtion.AddUserValidtion;
import com.ou.mall.validtion.UpdateProductValidtion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.regex.Pattern;

/**
 * UserController
 *
 * @author: kpkym
 * date: 2018/3/1
 * time: 0:40
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    /**
     * @param session
     * @param user
     * @param result
     * @return 成功 success 失败 failure
     */
    @ResponseBody
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Msg login(HttpSession session, @Validated(AddUserValidtion.class) User user, BindingResult result) {
        if (result.hasErrors()) {
            return ResultUtils.returnFaliure(result);
        }
        User userSession = userService.login(user);
        if (null == userSession) {
            return Msg.failure("账号或密码错误");
        }
        session.setAttribute("user", userSession.getUid());
        return Msg.success();
    }

    /**
     * @param session
     * @param user
     * @param result
     * @return 成功 success 失败 failure
     */
    @ResponseBody
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public Msg register(HttpSession session, @Validated(AddUserValidtion.class) User user, BindingResult result) throws HasUsernameException {
        if (result.hasErrors()) {
            return ResultUtils.returnFaliure(result);
        }
        // 注册成功 进入登录方法
        if (userService.register(user)) {
            return login(session, user, result);
        }
        return Msg.failure("failure");
    }

    @ResponseBody
    @RequestMapping(value = "users/{username}", method = RequestMethod.GET)
    public Msg checkUsernameAvailable(@PathVariable String username) {
        // 如果该用户名被注册
        if (null != userService.getUser(username)) {
            return Msg.failure("该用户名已被使用");
        }
        return Msg.success();
    }

    @ResponseBody
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public Msg logout(HttpSession session) {
        session.removeAttribute("user");
        return Msg.success();
    }


    /**
     * 获取用户信息通过session get id
     *
     * @param session
     * @return Msg
     */
    @ResponseBody
    @RequestMapping(value = "users", method = RequestMethod.GET)
    public Msg getUser(HttpSession session) {
        Integer uid = SessionUtils.getUserId(session);
        User user = userService.getUser(uid);
        return Msg.success().add("user", user);
    }

    /**
     * 修改密码
     *
     * @param
     * @return user
     */
    @ResponseBody
    @RequestMapping(value = "users", method = RequestMethod.PUT)
    public Msg updatePassword(@Validated(UpdateProductValidtion.class) User user, BindingResult result) {
        // 如果密码不符合规范
        if (result.hasErrors()) {
            return ResultUtils.returnFaliure(result);
        }
        return Msg.success();
    }


    //
    // /*
    //  * 上传用户头像
    //  */
    // @RequestMapping(value="avatar")
    // public String uploadavatar(UploadedImageFile image) throws IllegalStateException, IOException{
    // 	User user = (User)(session.getAttribute("userSession"));
    // 	Integer userID = user.getUserId();
    // 	String id = userID.toString();
    // 	String avatarPath = session.getServletContext().getRealPath("/data/img/userAvatar/");
    //    String newImageName = ImageUtil.transfer(image, avatarPath, id);
    //
    //    if (newImageName == null){
    //        return "redirect:home";
    //    }
    //    user.setUserAvatar("data/img/userAvatar/"+newImageName);
    //    update(user);
    //    return "redirect:home";
    // }
    //
}
