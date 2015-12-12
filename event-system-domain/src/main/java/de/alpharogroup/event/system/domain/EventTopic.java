package de.alpharogroup.event.system.domain;

import de.alpharogroup.domain.BaseDomainObject;
import de.alpharogroup.event.system.entities.EventTemplates;
import de.alpharogroup.event.system.entities.Topics;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class EventTopic extends BaseDomainObject<Integer> {
	/** The serial Version UID */
	private static final long serialVersionUID = 1L;
	/**
	 * The event attribute that references to the Entity class {@link EventTemplates}.
	 */
	private EventTemplate event;
	
	/**
	 * The topic attribute that references to the Entity class {@link Topics}.
	 */
	private Topic topic;
}
