package models;
import siena.*;
import java.util.Date;

import siena.Generator;
import siena.Model;

public class Event extends Model{
	@Id(Generator.AUTO_INCREMENT)
	public Long id;
	
	@Index("FromEmail_index")
	public String FromEmail;
	
	@Index("ToEmail_index")
	public String ToEmail;
	
	@Index("type_index")
	public int type;
	
	@Index("EventTime_index")
    public Date EventTime;
	
	@Index("description_index")
	public String description;
	
	@Index("gooddescription_index")
	public String gooddescription;
	
	public static final int GOOD = 1;
	public static final int BAD = 0;
	
}
