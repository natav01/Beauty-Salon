package ua.training.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogOut implements Command {
	private static final Logger log = LogManager.getLogger(LogOut.class);
    @Override
    public String execute(HttpServletRequest request) {
    	CommandUtility.logOut(request);
    	
         return "redirect:/index.jsp";
    }
}
