package au.andrew.controller;

import au.andrew.dbProc.DataProc;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.*;

public class IndexControllerTest {


    IndexController indexController = new IndexController(new DataProc());

    @Test
    public void login() {
        //ModelAndView modelAndView = indexController.login("liz", "");
        //System.out.println(modelAndView.getView());
        assertEquals("d", "d");
    }

    @Test
    public void newMatch() {
    }

    @Test
    public void saveMatch() {
    }
}