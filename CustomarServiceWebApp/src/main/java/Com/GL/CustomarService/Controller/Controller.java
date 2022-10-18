package Com.GL.CustomarService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Com.GL.CustomarService.DAO.CustomarDao;
import Com.GL.CustomarService.Model.Customar;
import Com.GL.CustomarService.Model.Customar_LogIn;

@org.springframework.stereotype.Controller
@RequestMapping("Customar")
public class Controller {

	@Autowired
	CustomarDao customarDao;

	@GetMapping("LogIn")
	public String CustomarLogIn(Model model) {

		Customar_LogIn customar_LogIn = new Customar_LogIn();
		model.addAttribute("Authantication", customar_LogIn);
		return "Authanticate-Customar";

	}

	@GetMapping("List")
	public String CustomarList(Model model) {
		List<Customar> customars = customarDao.findAll();
		model.addAttribute("Customars", customars);
		return "Customar-List";
	}

	@GetMapping("CustomarForm")
	public String CustomarForm(Model model) {

		Customar customar = new Customar();
		model.addAttribute("Customar", customar);

		return "ADD-Form";
	}

	@PostMapping("saveCustomar")
	public String SaveCustomar(Model model, @ModelAttribute("Customar") Customar customar) {

		customarDao.saveCustomar(customar);
		return "redirect:/Customar/List";
	}

	@GetMapping("Update")
	public String Update(Model model, @RequestParam("id") int id) {
		System.out.println("Update Customar");
		Customar customar = customarDao.findbyid(id);
		model.addAttribute("Customar", customar);
		return "ADD-Form";
	}

	@GetMapping("Delete")
	public String Delete(Model model, @RequestParam("id") int id) {
		System.out.println("Delete Customar");
		Customar customar = customarDao.findbyid(id);
		customarDao.DeleteCustomar(id);

		return "redirect:/Customar/List";
	}
}
