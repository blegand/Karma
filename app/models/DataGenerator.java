package models;
import java.util.Date;
import java.util.Random;

import play.jobs.Job;
import play.jobs.OnApplicationStart;
import siena.*;
//@OnApplicationStart
public class DataGenerator extends Job {
	public static String[] email = {"x@yahoo.com", "y@gmail.com", "z@hotmail.com"};
	public static String[] description = {"stole money from", "cursed out", "cheated on"};
	public static String[] gooddescription = {"give flowers to", "gave to a charity ", "did a good deed today for"};
	public static int[] type = {0, 1};
	public void doJob() {
		Random rand = new Random();
		for(int i = 0; i < 20; i++){
			Event evt = new Event();
			
			int x = rand.nextInt(email.length);
			int z = rand.nextInt(description.length);
			int y = rand.nextInt(gooddescription.length);
			int g = rand.nextInt(type.length);
			evt.ToEmail = email[x];
			int o = rand.nextInt(email.length);
			evt.FromEmail = email[o];
			evt.description = description[z];
			evt.gooddescription = gooddescription[y];
			evt.type = type[g];
			long d = new Date().getTime();
			d = d + rand.nextInt(Integer.MAX_VALUE);
			evt.EventTime = new Date(d);
			evt.save();
		}
	}

}
