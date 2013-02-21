package controllers;

import java.util.List;

import siena.Model;
import models.Event;

public class EventManager {

	public boolean CreateEvent(Event newEvent) {
		newEvent.insert();
		newEvent.save();
		return true;
	}

	public Event GetEvent(Long EventID) {
		return Model.all(Event.class).filter("id", EventID).get();
	}

	public Event UpdateEvent(Event Event) {
		Event.update();
		return null;
	}

	public boolean DeleteEvent(Long EventID) {
		Event mj = Model.all(Event.class).filter("id", EventID).get();
		mj.delete();
		return false;
	}

	public static List<Event> GetAllEvents() {

		List<Event> Events = Model.all(Event.class).order("EventTime").fetch();

		return Events;
	}

	public static List<Event> GetAllEventsByType(int type) {

		List<Event> Events = Model.all(Event.class).filter("type", type)
				.order("EventTime").fetch();

		return Events;
	}

	public static List<Event> GetAllEventsByBadDescription(String description) {
		List<Event> Events = Model.all(Event.class)
				.filter("description", description).order("EventTime").fetch();
		return Events;
	}

	public static List<Event> GetAllEventsByGoodDescription(
			String gooddescription) {
		List<Event> Events = Model.all(Event.class)
				.filter("gooddescription", gooddescription).order("EventTime")
				.fetch();

		return Events;
	}

	public static List<Event> GetAllEventsByToEmail(String ToEmail) {

		List<Event> Events = Model.all(Event.class).filter("ToEmail", ToEmail)
				.order("EventTime").fetch();

		return Events;
	}

	public static List<Event> GetAllEventsByFromEmail(String FromEmail) {

		List<Event> Events = Model.all(Event.class)
				.filter("FromEmail", FromEmail).order("EventTime").fetch();

		return Events;
	}

	public static List<Event> GetAllEventsToEmailByType(String ToEmail, int type) {

		List<Event> Events = Model.all(Event.class).filter("ToEmail", ToEmail)
				.filter("type", type).order("EventTime").fetch();

		return Events;
	}

	public static List<Event> GetAllEventsFromEmailByType(String FromEmail,
			int type) {

		List<Event> Events = Model.all(Event.class)
				.filter("FromEmail", FromEmail).filter("type", type)
				.order("EventTime").fetch();

		return Events;
	}

	public static List<Event> GetAllEventsToEmailByDescription(String ToEmail,
			String description) {

		List<Event> Events = Model.all(Event.class).filter("ToEmail", ToEmail)
				.filter("description", description).order("EventTime").fetch();

		return Events;
	}

	public static List<Event> GetAllEventsFromEmailByDescription(
			String FromEmail, String description) {

		List<Event> Events = Model.all(Event.class)
				.filter("FromEmail", FromEmail)
				.filter("description", description).order("EventTime").fetch();

		return Events;
	}

	public static List<Event> GetAllEventsFromEmailByDescriptionAndType(
			String FromEmail, String description, int type) {

		List<Event> Events = Model.all(Event.class)
				.filter("FromEmail", FromEmail)
				.filter("description", description).filter("type", type)
				.order("EventTime").fetch();

		return Events;
	}

	public static List<Event> GetAllEventsToEmailByDescriptionAndType(
			String ToEmail, String description, int type) {

		List<Event> Events = Model.all(Event.class).filter("ToEmail", ToEmail)
				.filter("description", description).filter("type", type)
				.order("EventTime").fetch();

		return Events;
	}
}