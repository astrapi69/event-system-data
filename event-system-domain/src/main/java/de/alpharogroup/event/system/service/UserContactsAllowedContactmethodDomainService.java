package de.alpharogroup.event.system.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.event.system.daos.UserContactsAllowedContactmethodsDao;
import de.alpharogroup.event.system.domain.UserContactsAllowedContactmethod;
import de.alpharogroup.event.system.entities.UserContactsAllowedContactmethods;
import de.alpharogroup.event.system.mapper.UserContactsAllowedContactmethodsMapper;
import de.alpharogroup.event.system.service.api.UserContactsAllowedContactmethodService;
import de.alpharogroup.service.domain.AbstractDomainService;

@Transactional
@Service("userContactsAllowedContactmethodDomainService")
public class UserContactsAllowedContactmethodDomainService
extends
AbstractDomainService<Integer,
UserContactsAllowedContactmethod,
UserContactsAllowedContactmethods,
UserContactsAllowedContactmethodsDao,
UserContactsAllowedContactmethodsMapper>
implements
UserContactsAllowedContactmethodService
{

}
