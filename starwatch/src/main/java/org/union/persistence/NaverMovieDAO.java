package org.union.persistence;

import java.sql.SQLException;
import java.util.List;

import org.union.domain.NaverMovieVO;
import org.union.domain.SearchCriteria;

public interface NaverMovieDAO {

	
	public void create(NaverMovieVO vo) throws SQLException;
	
	public NaverMovieVO read(Integer NM_idx) throws SQLException;

	public List<NaverMovieVO> searchAllList(SearchCriteria cri) throws SQLException;
	
	public List<NaverMovieVO> showSearchAllList(SearchCriteria cri) throws SQLException;
	
	public List<NaverMovieVO> searchList(SearchCriteria cri) throws SQLException;
	
	public List<NaverMovieVO> showSearchList(SearchCriteria cri) throws SQLException;
	
	public Integer getSearchCount(SearchCriteria cri) throws SQLException;
	
}
