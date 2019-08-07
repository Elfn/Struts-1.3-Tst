package com.demo.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.demo.forms.HelloForm;

public class HelloAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
		HelloForm helloForm = (HelloForm) form;
		ActionForward fw = mapping.getInputForward();
		
		if(helloForm != null && helloForm.getMessage().equalsIgnoreCase("john"))
				{
					fw = mapping.findForward("success");
				}
		else
				{
					ActionErrors errs = new ActionErrors();
					errs.add("",new ActionMessage("hello.msg.err"));
					saveErrors(request, errs);
				}
		
		
		// TODO Auto-generated method stub
		return fw;
	}
	
}
