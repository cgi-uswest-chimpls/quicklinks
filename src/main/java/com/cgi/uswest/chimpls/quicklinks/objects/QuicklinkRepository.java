package com.cgi.uswest.chimpls.quicklinks.objects;

import java.util.Set;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface QuicklinkRepository extends PagingAndSortingRepository<Quicklink, UUID>{
	
	@Query("select q from Quicklink q where q.county = ?1 or q.county = 99")
	Set<Quicklink> findCurrentQuicklinksForCounty(@Param("county") String county);
	
}
