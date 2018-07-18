package shopadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shopadmin.model.Cellphone;

@Controller
public class CellphoneController {

    @RequestMapping(method = RequestMethod.GET, value = "/cellphones/add")
    public String add(@ModelAttribute Cellphone cellphone) {
        return "cellphone-add";
    }
}
