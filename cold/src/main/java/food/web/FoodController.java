package food.web;

import java.util.List;

import javax.servlet.http.HttpSession;

// import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import food.service.FoodDTO;
import food.service.FoodService;


@Controller
public class FoodController {
	
	@Autowired 
	private FoodService foodService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Model model, HttpSession session) {
		return "mainpage"; 
	}
	
	@RequestMapping("/food/List/1") 
	public String getFoodList(@PathVariable String page,@ModelAttribute("foodDTO") FoodDTO foodDTO, Model model, HttpSession session) {
		List<FoodDTO> list = foodService.list(foodDTO);
		model.addAttribute("resultList", list);
		return "food/List"; 	
	
	}
    @RequestMapping("food/List/login")
    public String showMyPage() {
        return "login"; 
    }
    @RequestMapping("food/List/join")
    public String showMyPage2() {
        return "join"; 
    }
    @RequestMapping("food/List/homepage") 
    public String showMyPage3() {
        return "homepage"; 
    }
    @RequestMapping("food/List/like")
    public String showMyPage4() {
        return "like"; 
    }
    @RequestMapping("food/List/myRefrigerator")
    public String showMyPage5() {
        return "myRefrigerator"; 
    }
    @RequestMapping("food/List/myStatistics")
    public String showMyPage6() {
        return "myStatistics"; 
    }
    @RequestMapping("food/List/bread")
    public String showMyPage7() {
        return "bread"; 
    }
    @RequestMapping("food/List/dobo")
    public String showMyPage8() {
        return "dobo"; 
    }
    @RequestMapping("food/List/gogi")
    public String showMyPage9() {
        return "gogi"; 
    }
    @RequestMapping("food/List/potato")
    public String showMyPage10() {
        return "potato"; 
    }
    @RequestMapping("food/List/strawberry")
    public String showMyPage11() {
        return "strawberry"; 
    }

}



