package com.cgi.uswest.chimpls.quicklinks.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.uswest.chimpls.quicklinks.objects.Quicklink;
import com.cgi.uswest.chimpls.quicklinks.objects.QuicklinkRepository;

@RefreshScope
@RestController
public class QuicklinksApplicationController {

	  @Autowired
	  private QuicklinkRepository repository;
	
	  @RequestMapping("/quicklinks/{county}")
	   public Set<Quicklink> findCountyQuicklinks(@PathVariable("county") String county) {
	       return repository.findCurrentQuicklinksForCounty(county);
	   }
}
