package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

	public static String[] email = {"x@yahoo.com", "y@gmail.com", "z@hotmail.com"};
	public static String[] description = {"stole money from", "cursed out", "cheated on"};
	public static String[] gooddescription = {"give flowers to", "gave to a charity ", "did a good deed today for"};
	public static int[] type = {0, 1};
	
    public static void index() {
    	DataGenerator d = new DataGenerator();
    	d.doJob();
    	List<Event> elist = EventManager.GetAllEventsByBadDescription("stole money from");
        renderJSON(elist);
    	//render();
    }
    public static void predictAll(){
    	
    }
}