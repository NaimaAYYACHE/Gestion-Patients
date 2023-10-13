package com.emsi.thym.web;

import com.emsi.thym.entities.Patient;
import com.emsi.thym.repositories.PatientRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;

    @GetMapping("/user/index")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String allPatient(Model model,
                             @RequestParam(defaultValue = "0")int page,
                             @RequestParam(defaultValue = "7")int size,
                             @RequestParam(defaultValue = "")String keyword){
        Page<Patient> patientList = patientRepository.findByNomContains(PageRequest.of(page, size),keyword);
        model.addAttribute("listPatient",patientList.getContent());
        model.addAttribute("pages",new int[patientList.getTotalPages()]);
        model.addAttribute("currentPage",page);
        model.addAttribute("keyword",keyword);
        return "patients";
    }

    @GetMapping("/")
    @PreAuthorize("hasRole('ROLE_USER')")

    public String home(){
        return "redirect:/user/index";
    }

    @GetMapping("/admin/delete")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String delete(Long id , int page , String keyword){
        patientRepository.deleteById(id);
        return "redirect:/user/index?page="+page+"&keyword="+keyword;
    }

    //formPatient
    @GetMapping("/admin/formPatient")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String formPatient(Model model){
        model.addAttribute("patient",new Patient());
        return "formPatient";
    }

    @PostMapping("/admin/save")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String save(@Valid Patient p, BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return "formPatient";
        patientRepository.save(p);
        return "redirect:/user/index";
    }
    @GetMapping("/admin/editPatient")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String editPatient(Model m ,Long id,String keyword,int page){
        Patient patient = patientRepository.findById(id).orElse(null);
        if(patient==null) throw new RuntimeException("ff");
        m.addAttribute("patient",patient);
        m.addAttribute("currentPage",page);
        m.addAttribute("keyword",keyword);
        return "editPatient";
    }


    @PostMapping("/admin/edit")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String edit(Model model,@Valid Patient p, BindingResult bindingResult,
                       @RequestParam(defaultValue = "0")int page,
                       @RequestParam(defaultValue = "")String keyword){
        if (bindingResult.hasErrors())
            return "editPatient";
        patientRepository.save(p);
        return "redirect:/user/index?page="+page+"&keyword="+keyword;
    }
    @GetMapping("/not")
    public String error(){
        return "404";
    }
}
