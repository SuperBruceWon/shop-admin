package shopadmin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shopadmin.model.Cellphone;
import shopadmin.service.CellphoneServie;

@Controller
public class CellphoneController {
    private CellphoneServie cellphoneServie;
    
    @Autowired
    public CellphoneController(CellphoneServie cellphoneServie) {
        this.cellphoneServie = cellphoneServie;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/cellphones/add")
    public String add(@ModelAttribute Cellphone cellphone) {
        return "cellphone-add";
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/cellphones/add")
    public String create(@ModelAttribute @Valid Cellphone cellphone,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "cellphone-add";
        }
        cellphoneServie.create(cellphone);
        return "redirect:/cellphones/";
    }
}
