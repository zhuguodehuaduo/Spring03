package com.lry.handler;

import com.lry.po.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liurenyi
 * @create 2019--11--23--14:41
 */
@Controller //标记当前类是控制器
public class Handler {
//    @RequestMapping(value = "/test",method = RequestMethod.GET)
//    @GetMapping("/test")
//    这两种是一样的 只是下面这个是简写

    @GetMapping("/test")
    public String test(){
        System.out.println("测试成功!");
        return "index";
    }

    @GetMapping("/selectOne")
    public String selectOne(Model model){
        Student stu = new Student(1, "张三", 20, "EN", '女', new String[]{"JAVA", "C#", "SQL"});
        Map<String, String> map = new HashMap<String, String>();
        map.put("CN", "China");
        map.put("EN", "English");
        map.put("US", "USA");

        model.addAttribute("stu", stu);
        model.addAttribute("ct", map);
        return "update";
    }

    @PutMapping("/update")
    public void update(Student student) {
        System.out.println("student = " + student);
    }

    @ModelAttribute("list")
    public List<String> getPlay(){
        List<String> list = new ArrayList<String>();
        list.add("C#");
        list.add("JAVA");
        list.add("SQL");
        list.add("C++");
        list.add("C");
        list.add("Python");
        list.add("PHP");
        list.add("GO");
        list.add("VB");
        list.add("R");
        return list;
    }

}
