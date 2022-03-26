package com.cenfotec.componentes;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import com.cenfotec.componentes.beans.BeanPrueba;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cenfotec.componentes.beans.PrimerBean;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private PrimerBean primerBean;

	@Autowired
	private BeanPrueba beanPrueba;

	@RequestMapping(value = "/encriptacion", method = RequestMethod.GET)
	public String encriptacion() {
		return "encriptacion";
	}


	@RequestMapping(value = "/encriptar", method = RequestMethod.POST)
	public ModelAndView encriptar(@RequestParam(value = "fname") String fname, @RequestParam(value = "ffrase") String ffrase, Model model, HttpServletRequest request) {
		logger.info("Info: "+fname+" y "+ffrase);
		System.out.println("Ingresa a encriptar");

		//primerBean = new PrimerBean();
		beanPrueba.setNombre(request.getParameter("fname"));
		beanPrueba.setFrase(request.getParameter("ffrase"));

		ModelAndView mv = new ModelAndView("paginaEncriptada");
		model.addAttribute("encriptado", beanPrueba);

		return mv;
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		//primerBean = new PrimerBean();
		primerBean.setName("Cuco");
		primerBean.setNumero(777);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("nombre", primerBean);
		
		return "home";
	}
	
}
