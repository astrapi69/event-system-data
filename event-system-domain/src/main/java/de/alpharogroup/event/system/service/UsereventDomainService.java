package de.alpharogroup.event.system.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.event.system.daos.UsereventsDao;
import de.alpharogroup.event.system.domain.Userevent;
import de.alpharogroup.event.system.entities.Userevents;
import de.alpharogroup.event.system.mapper.UsereventsMapper;
import de.alpharogroup.event.system.service.api.UsereventService;
import de.alpharogroup.service.domain.AbstractDomainService;

@Transactional
@Service("usereventDomainService")
public class UsereventDomainService
extends
AbstractDomainService<Integer,
Userevent,
Userevents,
UsereventsDao,
UsereventsMapper>
implements
UsereventService
{

}