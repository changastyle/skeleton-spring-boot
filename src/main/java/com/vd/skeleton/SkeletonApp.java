package com.vd.skeleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.RedirectView;

@SpringBootApplication
@EnableWebMvc
@RestController
public class SkeletonApp
{
	public static ApplicationContext appContext;
	public static Environment environment;

	public static void main(String[] args)
	{
		SpringApplication.run(SkeletonApp.class, args);

		String puertoServer = environment.getProperty("local.server.port");
		System.out.println("CORRIENDO SKELETON EN : http://localhost:"+puertoServer);
	}

	@GetMapping(value = "/")
	public static RedirectView swagger()
	{
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("swagger-ui.html");

		return redirectView;
	}

	@Autowired
	public void setearEnvironment(Environment environment)
	{
		SkeletonApp.environment = environment;
	}
	public static ApplicationContext dameAppContext()
	{
		return appContext;
	}

}
