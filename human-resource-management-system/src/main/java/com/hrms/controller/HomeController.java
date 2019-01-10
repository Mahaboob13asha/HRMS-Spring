package com.hrms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String Home() {
		
		return "index";
	}
	
	@RequestMapping("/employees.html")
	public String ShowAllEmployee(){
		
		return "employees";
	}
	
	@RequestMapping("/profile")
	public String profile(){
		
		return "profile";
	}
	
	@RequestMapping("/index")
	public String index(){
		
		return "index";
	}
	
	@RequestMapping("/holidays")
	public String holidays(){
		
		return "holidays";
	}
	
	
	@RequestMapping("/leaves")
	public String leaves(){
		
		return "leaves";
	}
	
	
	
	@RequestMapping("/client-profile")
	public String clientprofile(){
		
		return "client-profile";
	}
	
	
	
	
	@RequestMapping("/attendance")
	public String attendance(){
		
		return "attendance";
	}
	
////////////////////////////////////////////////////////////////////
		
	@RequestMapping("/edit-profile")
	public String editprofile(){
		
		return "edit-profile";
	}
	
	@RequestMapping("/clients")
	public String clients(){
		
		return "clients";
	}
	
	@RequestMapping("/projects")
	public String projects(){
		
		return "projects";
	}
	
	
	@RequestMapping("/tasks")
	public String tasks(){
		
		return "tasks";
	}

	
	@RequestMapping("/voice-call")
	public String voicecall(){
		
		return "voice-call";
	}
	
	@RequestMapping("/video-call")
	public String videocal(){
		
		return "video-call";
	}
	
	@RequestMapping("/incoming-call")
	public String incomingcall(){
		
		return "incoming-call";
	}
	
	@RequestMapping("/contacts")
	public String contacts(){
		
		return "contacts";
	}
	
	@RequestMapping("/leads")
	public String leads(){
		
		return "leads";
	}

	@RequestMapping("/estimates")
	public String estimates(){
		
		return "estimates";
	}
	@RequestMapping("/create-estimate")
	public String createestimate(){
		
		return "create-estimate";
	}
	
	@RequestMapping("/estimate-view")
	public String estimateview(){
		
		return "estimate-view";
	}
	
	@RequestMapping("/edit-estimate")
	public String editestimate(){
		
		return "edit-estimate";
	}
	
	
	@RequestMapping("/invoices")
	public String invoices(){
		
		return "invoices";
	}
	
	@RequestMapping("/payments")
	public String payments(){
		
		return "payments";
	}
	
	@RequestMapping("/expenses")
	public String expenses(){
		
		return "expenses";
	}
	
	@RequestMapping("/provident-fund")
	public String providentfund(){
		
		return "provident-fund";
	}
	
	@RequestMapping("/taxes")
	public String taxes(){
		
		return "taxes";
	}

	@RequestMapping("/salary")
	public String salary(){
		
		return "salary";
	}
	@RequestMapping("/salary-view")
	public String salaryview(){
		
		return "salary-view";
	}
	
	@RequestMapping("/worksheet")
	public String worksheet(){
		
		return "worksheet";
	}
	
	@RequestMapping("/jobs")
	public String jobs(){
		
		return "jobs";
	}
	
	@RequestMapping("/apply-job")
	public String applyjob(){
		
		return "apply-job";
	}
	
	@RequestMapping("/job-view")
	public String jobview(){
		
		return "job-view";
	}
	
	
	@RequestMapping("/job-applicants")
	public String jobapplicants(){
		
		return "job-applicants";
	}
	
	@RequestMapping("/tickets")
	public String tickets(){
		
		return "tickets";
	}

	@RequestMapping("/events")
	public String events(){
		
		return "events";
	}

	@RequestMapping("/inbox")
	public String inbox(){
		
		return "inbox";
	}

	@RequestMapping("/mail-view")
	public String mailview(){
		
		return "mail-view";
	}
	

	@RequestMapping("/chat")
	public String chat(){
		
		return "chat";
	}
	
	@RequestMapping("/assets")
	public String assets(){
		
		return "assets";
	}
	@RequestMapping("/activities")
	public String activities(){
		
		return "activities";
	}
	

	@RequestMapping("/users")
	public String users(){
		
		return "users";
	}
	
	@RequestMapping("/expense-reports")
	public String expensereports(){
		
		return "expense-reports";
	}
	
	@RequestMapping("/invoice-reports")
	public String invoicereports(){
		
		return "invoice-reports.";
	}
	
	@RequestMapping("/settings")
	public String settings(){
		
		return "settings";
	}
	
	@RequestMapping("/localization")
	public String localization(){
		
		return "localization";
	}
	
	
	@RequestMapping("/theme-settings")
	public String themesettings(){
		
		return "theme-settings";
	}
	
	@RequestMapping("/roles-permissions")
	public String rolespermissions(){
		
		return "roles-permissions";
	}
	
	
	@RequestMapping("/email-settings")
	public String emailsettings(){
		
		return "email-settings";
	}	
	
	@RequestMapping("/invoice-settings")
	public String invoicesettings(){
		
		return "invoice-settings";
	}	
	
	@RequestMapping("/salary-settings")
	public String salarysettings(){
		
		return "salary-settings";
	}
	
	@RequestMapping("/notifications-settings")
	public String notificationssettings(){
		
		return "notifications-settings";
	}
	
	@RequestMapping("/change-password")
	public String changepassword(){
		
		return "change-password";
	}
	
	@RequestMapping("/leave-type")
	public String leavetype(){
		
		return "leave-type";
	}
	
	
	@RequestMapping("/login")
	public String login(){
		
		return "login";
	}
	
	@RequestMapping("/job-list")
	public String joblist(){
		
		return "job-list";
	}
	
	@RequestMapping("/register")
	public String register(){
		
		return "register";
	}
	
	@RequestMapping("/forgot-password")
	public String forgotpassword(){
		
		return "forgot-password";
	}


	@RequestMapping("/project-view")
	public String projectview(){
		
		return "project-view";
	}
	
	@RequestMapping("/clients-list")
	public String clientslist(){
		
		return "clients-list";
	}
	
	@RequestMapping("/compose")
	public String compose(){
		
		return "compose";
	}
	
	
	
	@RequestMapping("/invoice-view")
	public String invoiceview(){
		
		return "invoice-view";
	}
	
	
	
	@RequestMapping("/edit-invoice")
	public String editinvoice(){
		
		return "edit-invoice";
	}
	
	
	@RequestMapping("/create-invoice")
	public String createinvoice(){
		
		return "create-invoice";
	}

	@RequestMapping("/add-contact")
	public String addcontact(){
		
		return "add-contact";
	}

/*	@RequestMapping("/departments.html")
	public String departments(){
		
		return "departments";
	}
	
	
	@RequestMapping("/designations.html")
	public String designations(){
		
		return "designations";
	}*/
}
