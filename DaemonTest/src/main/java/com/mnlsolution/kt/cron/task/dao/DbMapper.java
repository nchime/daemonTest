/**
 * COPYRIGHT(c) KT  2015
 * This software is the proprietary information of KT Corp.
 */
package com.mnlsolution.kt.cron.task.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mnlsolution.kt.cron.task.dto.CampTargetDto;

/**
 * @author byeong-soo kim
 */
@Repository
public class DbMapper
{
	@Autowired
	private SqlSessionTemplate	session;
	
	
	public DbMapper( )
	{}
	
	
	public int selectSvcMgmtNum( String svcMgmtNum )
	{
		return ( Integer ) session.selectOne( "camp.DbMapper.selectSvcMgmtNum" , svcMgmtNum );
	}
	
	
	public int insertCampTarget( CampTargetDto campTarget )
	{
		return session.insert( "camp.DbMapper.insertCampTarget" , campTarget );
	}
	
	
	public int selectCount( )
	{
		return session.selectOne( "camp.DbMapper.selectCount" );
	}
}
