package org.csu.struts1demo.web;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.csu.struts1demo.domain.Account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends Action {

    @Override
    public ActionForward execute(
            ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Account account = (Account) form;
        if(account.getUsername() == null && account.getPassword() == null){
            return mapping.findForward("input");
        }
        if(account.getUsername().equals("abc") && account.getPassword().equals("123")){
            return mapping.findForward("success");
        }
        return mapping.findForward("input");
    }
}
